package tn.spring.springproject.Service;

import tn.spring.springproject.Entity.DetailEquipe;

import java.util.List;

public interface IDetailEquipeService {
    int addDetailEquipe(DetailEquipe d);
    boolean updateDetailEquipe(DetailEquipe d);
    boolean deleteDetailEquipe(int id);
    DetailEquipe getById(int id);
    List<DetailEquipe> getAll();

}
