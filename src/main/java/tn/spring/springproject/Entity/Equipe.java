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
public class Equipe {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idEquipe;
    @NonNull
    private String nomEquipe;

    @NonNull
    @Enumerated(EnumType.STRING)
    private Niveau niveau;

    @OneToOne(cascade = CascadeType.ALL)
    private DetailEquipe detailEquipe;

    @ManyToMany(cascade= CascadeType.ALL)
    private Set<Etudiant> Etudiants;



}
