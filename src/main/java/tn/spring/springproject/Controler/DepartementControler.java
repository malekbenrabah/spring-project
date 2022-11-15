package tn.spring.springproject.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.springproject.Entity.Contrat;
import tn.spring.springproject.Entity.Departement;
import tn.spring.springproject.Service.IContratService;
import tn.spring.springproject.Service.IDepartementService;

import java.util.List;

@RestController
@RequestMapping("/departements")
public class DepartementControler {

    @Autowired
    IDepartementService departementService;

    @GetMapping("/GetAllDepartement")
    public List<Departement> getAllDepartements(){
        List<Departement> listDepartements = departementService.getAll();
        return listDepartements;
    }

    @GetMapping("/{c}")
    public Departement getDepartement(@PathVariable("c") int c){
        return departementService.getById(c);
    }

    @PostMapping("/addDepartement")
    public int addDepartement(@RequestBody Departement c){
        return departementService.addDepartement(c);
    }

    @PutMapping("/updateDepartement")
    public boolean updateDepartement(@RequestBody Departement c){
        return departementService.updateDepartement(c);
    }

    @DeleteMapping("/deleteDepartement/{c}")
    public boolean deleteDepartement(@PathVariable("c") int c){
        return departementService.deleteDepartement(c);
    }

    @DeleteMapping("/deleteDepartement")
    public boolean deleteDepartements(@RequestParam("idDepartement") int c){
        return departementService.deleteDepartement(c);
    }

    @DeleteMapping("/deleteDepartements")
    public boolean deleteDepartements(@RequestBody Departement c){
        return departementService.deleteDepartement(c.getIdDepart());
    }

}
