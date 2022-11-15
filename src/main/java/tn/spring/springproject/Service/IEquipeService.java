package tn.spring.springproject.Service;

import tn.spring.springproject.Entity.Equipe;

import java.util.List;

public interface IEquipeService {
    int addEquipe(Equipe e);
    boolean updateEquipe(Equipe e);
    boolean deleteEquipe(int id);
    Equipe getById(int id);
    List<Equipe> getAll();
}
