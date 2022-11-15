package tn.spring.springproject.Service;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.data.repository.query.Param;
import tn.spring.springproject.Entity.Contrat;

import java.util.List;

public interface IContratService {

    int addContrat(Contrat c);
    boolean updateContrat(Contrat c);
    boolean deleteContrat(int id);
    Contrat getById(int id);
    List<Contrat> getAll();

    List<Contrat> getContratsBythematique(String thematique);
}
