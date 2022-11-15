package tn.spring.springproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.springproject.Entity.Equipe;

@Repository
public interface IEquipeRepository extends JpaRepository<Equipe, Integer> {
}
