package tn.spring.springproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springproject.Entity.Departement;
import tn.spring.springproject.Repository.IDepartementRepository;

import java.util.List;

@Service
public class DepartementService implements IDepartementService{

    @Autowired
    IDepartementRepository departementRepository;

    @Override
    public int addDepartement(Departement d){

        return departementRepository.save(d).getIdDepart();
    }

    @Override
    public boolean updateDepartement(Departement d){

        if(departementRepository.existsById(d.getIdDepart())){
            departementRepository.save(d).equals(d);
            return true;
        }else {
            return false;
        }

    }

    @Override
    public boolean deleteDepartement(int id){
        if(departementRepository.existsById(id)){
            departementRepository.deleteById(id);
            return true;
        }else{
            return  false;
        }

    }

    @Override
    public  Departement getById(int id){
        return departementRepository.findById(id).get();
    }

    @Override
    public List<Departement> getAll(){
        return departementRepository.findAll();
    }




}
