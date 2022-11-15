package tn.spring.springproject.Entity;

import lombok.*;
import tn.spring.springproject.Entity.Departement;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class Universite {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idUniv;
    @NonNull
    private String nomUniv;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Departement> Departements;


}
