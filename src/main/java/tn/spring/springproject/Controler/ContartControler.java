package tn.spring.springproject.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.springproject.Entity.Contrat;
import tn.spring.springproject.Service.IContratService;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/contrats")
public class ContartControler {

    @Autowired
    IContratService contratService;

    @GetMapping("/GetAllContrat")
   public List<Contrat> getAllContrats(){
        List<Contrat> listContrats = contratService.getAll();
        return listContrats;
    }

    @GetMapping("/{c}")
    public Contrat getContrat(@PathVariable("c") int c){
        return contratService.getById(c);
    }

    @PostMapping("/addContrat")
    public int addContrat(@RequestBody Contrat c){
        return contratService.addContrat(c);
    }

    @PutMapping("/updateContrat")
    public boolean updateContrat(@RequestBody Contrat c){
        return contratService.updateContrat(c);
    }

    @DeleteMapping("/deleteContrat/{c}")
    public boolean deleteContrat(@PathVariable("c") int c){
        return contratService.deleteContrat(c);
    }

    @DeleteMapping("/deleteContrat")
    public boolean deleteContrats(@RequestParam("idContrat") int c){
        return contratService.deleteContrat(c);
    }

    @DeleteMapping("/deleteContrats")
    public boolean deleteContrats(@RequestBody Contrat c){
        return contratService.deleteContrat(c.getIdContrat());
    }



   /*
    @DeleteMapping("/deleteContrat/{c}")
    public boolean deleteContrat(@PathVariable("c") String c){
        return contratService.deleteContrat(Integer.valueOf(c));
    }*/







}
