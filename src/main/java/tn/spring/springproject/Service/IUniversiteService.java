package tn.spring.springproject.Service;

import tn.spring.springproject.Entity.Universite;

import java.util.List;

public interface IUniversiteService {

    int addUniversite(Universite u);
    boolean updateUniversite(Universite u);
    boolean deleteUniversite(int id);
    Universite getById(int id);
    List<Universite> getAll();

}
