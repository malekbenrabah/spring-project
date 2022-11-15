package tn.spring.springproject.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import tn.spring.springproject.Entity.Contrat;
import tn.spring.springproject.Repository.ContratRepository;

import java.util.List;

import static org.hibernate.loader.Loader.SELECT;

@Service
public class ContratService implements IContratService {

    @Autowired
    ContratRepository contratRepository;

    @Override
    public int addContrat(Contrat c){

        return contratRepository.save(c).getIdContrat();
    }

    @Override
    public boolean updateContrat(Contrat c){

        if(contratRepository.existsById(c.getIdContrat())){
            contratRepository.save(c).equals(c);
            return true;
        }else {
            return false;
        }

    }

    @Override
    public boolean deleteContrat(int id){
       if(contratRepository.existsById(id)){
           contratRepository.deleteById(id);
           return true;
       }else{
           return  false;
       }

    }

    //get : ken fama contrat rajouu kenech taamel instance taa contrat wahadha les attributs teeou null
    //orelse : tasnaa enti instance wahdek; .orElse(new Contrat(1,new Date(),new Date(), Specialite.CLOUD,false, new Etudiant()) )
    // orelsethrow : ken l'objet aamal exception trajaa l'objet en parametres
    @Override
    public  Contrat getById(int id){
        return contratRepository.findById(id).get();
    }

    @Override
    public List<Contrat> getAll(){
        return contratRepository.findAll();
    }

    @Override
    public List<Contrat> getContratsBythematique(String thematique) {
        return contratRepository.X(thematique);
    }


}
