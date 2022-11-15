package tn.spring.springproject.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.springproject.Entity.Equipe;
import tn.spring.springproject.Service.IEquipeService;

import java.util.List;

@RestController
@RequestMapping("/equipes")
public class EquipeControler {
    @Autowired
    IEquipeService equipeService;

    @GetMapping("/GetAllEquipe")
    public List<Equipe> getAllEquipes(){
        List<Equipe> listEquipes = equipeService.getAll();
        return listEquipes;
    }

    @GetMapping("/{c}")
    public Equipe getEquipe(@PathVariable("c") int c){
        return equipeService.getById(c);
    }

    @PostMapping("/addEquipe")
    public int addEquipe(@RequestBody Equipe c){
        return equipeService.addEquipe(c);
    }

    @PutMapping("/updateEquipe")
    public boolean updateEquipe(@RequestBody Equipe c){
        return equipeService.updateEquipe(c);
    }

    @DeleteMapping("/deleteEquipe/{c}")
    public boolean deleteEquipe(@PathVariable("c") int c){
        return equipeService.deleteEquipe(c);
    }

    @DeleteMapping("/deleteEquipe")
    public boolean deleteEquipes(@RequestParam("idEquipe") int c){
        return equipeService.deleteEquipe(c);
    }

    @DeleteMapping("/deleteEquipes")
    public boolean deleteEquipes(@RequestBody Equipe c){
        return equipeService.deleteEquipe(c.getIdEquipe());
    }
}
