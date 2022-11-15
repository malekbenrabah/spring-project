package tn.spring.springproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.springproject.Entity.DetailEquipe;

@Repository
public interface IDetailEquipeRepository extends JpaRepository<DetailEquipe, Integer> {
}
