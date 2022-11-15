package tn.spring.springproject.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import tn.spring.springproject.Entity.Etudiant;
import tn.spring.springproject.Service.IEtudiantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/etudiants")
public class EtudiantControler {
    @Autowired
    IEtudiantService etudiantService;

    @GetMapping("/GetAllEtudiant")
    public List<Etudiant> getAllEtudiants(){
        List<Etudiant> listEtudiants = etudiantService.getAll();
        return listEtudiants;
    }

    @GetMapping("/{c}")
    public Etudiant getEtudiant(@PathVariable("c") int c){
        return etudiantService.getById(c);
    }

    @PostMapping("/addEtudiant")
    public int addEtudiant(@RequestBody Etudiant c){
        return etudiantService.addEtudiant(c);
    }

    @PutMapping("/updateEtudiant")
    public boolean updateEtudiant(@RequestBody Etudiant c){
        return etudiantService.updateEtudiant(c);
    }

    @DeleteMapping("/deleteEtudiant/{c}")
    public boolean deleteEtudiant(@PathVariable("c") int c){
        return etudiantService.deleteEtudiant(c);
    }

    @DeleteMapping("/deleteEtudiant")
    public boolean deleteEtudiants(@RequestParam("idEtudiant") int c){
        return etudiantService.deleteEtudiant(c);
    }

    @DeleteMapping("/deleteEtudiants")
    public boolean deleteEtudiants(@RequestBody Etudiant c){
        return etudiantService.deleteEtudiant(c.getIdEtudiant());
    }
}
