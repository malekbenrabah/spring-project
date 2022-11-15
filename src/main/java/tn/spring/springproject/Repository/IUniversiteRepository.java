package tn.spring.springproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.springproject.Entity.Universite;

@Repository
public interface IUniversiteRepository extends JpaRepository<Universite, Integer> {
}
