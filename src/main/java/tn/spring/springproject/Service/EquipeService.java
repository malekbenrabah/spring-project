package tn.spring.springproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springproject.Entity.Equipe;
import tn.spring.springproject.Repository.IEquipeRepository;

import java.util.List;

@Service
public class EquipeService implements  IEquipeService{
    @Autowired
    IEquipeRepository equipeRepository;

    @Override
    public int addEquipe(Equipe e){

        return equipeRepository.save(e).getIdEquipe();
    }

    @Override
    public boolean updateEquipe(Equipe e){

        if(equipeRepository.existsById(e.getIdEquipe())){
            equipeRepository.save(e).equals(e);
            return true;
        }else {
            return false;
        }

    }

    @Override
    public boolean deleteEquipe(int id){
        if(equipeRepository.existsById(id)){
            equipeRepository.deleteById(id);
            return true;
        }else{
            return  false;
        }

    }

    @Override
    public  Equipe getById(int id){

        return equipeRepository.findById(id).get();
    }

    @Override
    public List<Equipe> getAll(){
        return equipeRepository.findAll();
    }
}
