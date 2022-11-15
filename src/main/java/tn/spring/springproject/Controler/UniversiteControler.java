package tn.spring.springproject.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import tn.spring.springproject.Entity.Universite;
import tn.spring.springproject.Service.IUniversiteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/universites")
public class UniversiteControler {
    @Autowired
    IUniversiteService universiteService;

    @GetMapping("/GetAllUniversite")
    public List<Universite> getAllUniversites(){
        List<Universite> listUniversites = universiteService.getAll();
        return listUniversites;
    }

    @GetMapping("/{c}")
    public Universite getUniversite(@PathVariable("c") int c){
        return universiteService.getById(c);
    }

    @PostMapping("/addUniversite")
    public int addUniversite(@RequestBody Universite c){
        return universiteService.addUniversite(c);
    }

    @PutMapping("/updateUniversite")
    public boolean updateUniversite(@RequestBody Universite c){
        return universiteService.updateUniversite(c);
    }

    @DeleteMapping("/deleteUniversite/{c}")
    public boolean deleteUniversite(@PathVariable("c") int c){
        return universiteService.deleteUniversite(c);
    }

    @DeleteMapping("/deleteUniversite")
    public boolean deleteUniversites(@RequestParam("idUniversite") int c){
        return universiteService.deleteUniversite(c);
    }

    @DeleteMapping("/deleteUniversites")
    public boolean deleteUniversites(@RequestBody Universite c){
        return universiteService.deleteUniversite(c.getIdUniv());
    }



}
