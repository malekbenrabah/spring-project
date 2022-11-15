package tn.spring.springproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springproject.Entity.Etudiant;
import tn.spring.springproject.Repository.IEtudiantRepository;

import java.util.List;

@Service
public class EtudiantService implements IEtudiantService{
    @Autowired
    IEtudiantRepository etudiantRepository;

    @Override
    public int addEtudiant(Etudiant c){

        return etudiantRepository.save(c).getIdEtudiant();
    }

    @Override
    public boolean updateEtudiant(Etudiant c){

        if(etudiantRepository.existsById(c.getIdEtudiant())){
            etudiantRepository.save(c).equals(c);
            return true;
        }else {
            return false;
        }

    }

    @Override
    public boolean deleteEtudiant(int id){
        if(etudiantRepository.existsById(id)){
            etudiantRepository.deleteById(id);
            return true;
        }else{
            return  false;
        }

    }

    @Override
    public  Etudiant getById(int id){
        return etudiantRepository.findById(id).get();
    }

    @Override
    public List<Etudiant> getAll(){
        return etudiantRepository.findAll();
    }

}
