package tn.spring.springproject.Service;

import tn.spring.springproject.Entity.Etudiant;

import java.util.List;

public interface IEtudiantService {

    int addEtudiant(Etudiant c);
    boolean updateEtudiant(Etudiant c);
    boolean deleteEtudiant(int id);
    Etudiant getById(int id);
    List<Etudiant> getAll();
}
