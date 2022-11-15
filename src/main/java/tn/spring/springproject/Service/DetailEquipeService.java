package tn.spring.springproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springproject.Entity.DetailEquipe;
import tn.spring.springproject.Repository.IDetailEquipeRepository;

import java.util.List;

@Service
public class DetailEquipeService implements  IDetailEquipeService{
    @Autowired
    IDetailEquipeRepository detailEquipeRepository;

    @Override
    public int addDetailEquipe(DetailEquipe d){

        return detailEquipeRepository.save(d).getSalle();
    }

    @Override
    public boolean updateDetailEquipe(DetailEquipe d){

        if(detailEquipeRepository.existsById(d.getSalle())){
            detailEquipeRepository.save(d).equals(d);
            return true;
        }else {
            return false;
        }

    }

    @Override
    public boolean deleteDetailEquipe(int id){
        if(detailEquipeRepository.existsById(id)){
            detailEquipeRepository.deleteById(id);
            return true;
        }else{
            return  false;
        }

    }

    @Override
    public  DetailEquipe getById(int id){
        return detailEquipeRepository.findById(id).get();
    }

    @Override
    public List<DetailEquipe> getAll(){
        return detailEquipeRepository.findAll();
    }





}
