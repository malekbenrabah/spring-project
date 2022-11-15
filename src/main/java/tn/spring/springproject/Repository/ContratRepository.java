package tn.spring.springproject.Repository;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.spring.springproject.Entity.Contrat;

import java.util.List;
import java.util.function.Function;


@Repository
public interface ContratRepository extends JpaRepository<Contrat, Integer> {


    @Query("SELECT  c from Contrat c join Equipe eq"+
            " on eq member c.etudiant.Equipes "+"" +
            "where eq.detailEquipe.thermatique=:s")
    public List<Contrat> X(String s);

    @Query("SELECT  c from Contrat c join Universite u"+
            " on c.etudiant.departement member u.Departements"+
            " where u.idUniv=:s ")
    public List<Contrat> X1(int s);

    
}
