package tn.spring.springproject.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class Departement {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idDepart;
    @NonNull
    private String nomDepart;

    @OneToMany(cascade = CascadeType.ALL,mappedBy ="departement" )
    private Set<Etudiant> Etudiants;


}
