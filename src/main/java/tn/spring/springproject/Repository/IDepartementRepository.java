package tn.spring.springproject.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.springproject.Entity.Contrat;
import tn.spring.springproject.Entity.Departement;

@Repository
public interface IDepartementRepository extends JpaRepository<Departement, Integer> {

}
