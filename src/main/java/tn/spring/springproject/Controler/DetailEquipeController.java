package tn.spring.springproject.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import tn.spring.springproject.Entity.DetailEquipe;
import tn.spring.springproject.Repository.IDetailEquipeRepository;
import tn.spring.springproject.Service.IDetailEquipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detailsEquipes")
public class DetailEquipeController {
    @Autowired
    IDetailEquipeService detailEquipeService;

    @GetMapping("/GetAllDetailEquipe")
    public List<DetailEquipe> getAllDetailEquipes(){
        List<DetailEquipe> listDetailEquipes = detailEquipeService.getAll();
        return listDetailEquipes;
    }

    @GetMapping("/{c}")
    public DetailEquipe getDetailEquipe(@PathVariable("c") int c){
        return detailEquipeService.getById(c);
    }

    @PostMapping("/addDetailEquipe")
    public int addDetailEquipe(@RequestBody DetailEquipe c){
        return detailEquipeService.addDetailEquipe(c);
    }

    @PutMapping("/updateDetailEquipe")
    public boolean updateDetailEquipe(@RequestBody DetailEquipe c){
        return detailEquipeService.updateDetailEquipe(c);
    }

    @DeleteMapping("/deleteDetailEquipe/{c}")
    public boolean deleteDetailEquipe(@PathVariable("c") int c){
        return detailEquipeService.deleteDetailEquipe(c);
    }

    @DeleteMapping("/deleteDetailEquipe")
    public boolean deleteDetailEquipes(@RequestParam("idDetailEquipe") int c){
        return detailEquipeService.deleteDetailEquipe(c);
    }

    @DeleteMapping("/deleteDetailEquipes")
    public boolean deleteDetailEquipes(@RequestBody DetailEquipe c){
        return detailEquipeService.deleteDetailEquipe(c.getSalle());
    }
}
