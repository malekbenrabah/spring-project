package tn.spring.springproject.Entity;

import lombok.*;
import org.springframework.context.annotation.Bean;


import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class Contrat {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idContrat;
    @NonNull
    private Date dateDebutContrat;
    @NonNull
    private Date dateFinContrat;

    @NonNull
    @Enumerated(EnumType.STRING)
    private Specialite specialite;

    @NonNull
    private boolean archive;

    @ManyToOne
    private Etudiant etudiant;

}
