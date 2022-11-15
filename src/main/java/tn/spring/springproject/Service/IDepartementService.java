package tn.spring.springproject.Service;

import tn.spring.springproject.Entity.Departement;

import java.util.List;

public interface IDepartementService {

    int addDepartement(Departement d);
    boolean updateDepartement(Departement d);
    boolean deleteDepartement(int id);
    Departement getById(int id);
    List<Departement> getAll();
}
