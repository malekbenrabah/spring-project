package tn.spring.springproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springproject.Entity.Universite;
import tn.spring.springproject.Repository.IUniversiteRepository;

import java.util.List;

@Service
public class UniversiteService implements  IUniversiteService{
    @Autowired
    IUniversiteRepository universiteRepository;

    @Override
    public int addUniversite(Universite u){

        return universiteRepository.save(u).getIdUniv();
    }

    @Override
    public boolean updateUniversite(Universite u){

        if(universiteRepository.existsById(u.getIdUniv())){
            universiteRepository.save(u).equals(u);
            return true;
        }else {
            return false;
        }

    }

    @Override
    public boolean deleteUniversite(int id){
        if(universiteRepository.existsById(id)){
            universiteRepository.deleteById(id);
            return true;
        }else{
            return  false;
        }

    }

    @Override
    public Universite getById(int id){

        return universiteRepository.findById(id).get();
    }

    @Override
    public List<Universite> getAll(){
        return universiteRepository.findAll();
    }
}
