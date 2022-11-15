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
public class Etudiant {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idEtudiant;
    @NonNull
    private String prenomE;
    @NonNull
    private String nomE;

    @NonNull
    @Enumerated(EnumType.STRING)
    private Option option;

    @ManyToOne
    private Departement departement;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "etudiant")
    private Set<Contrat> Contrats;

    @ManyToMany(cascade= CascadeType.ALL, mappedBy = "Etudiants")
    private Set<Equipe> Equipes;


}
