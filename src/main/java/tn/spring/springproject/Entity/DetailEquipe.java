package tn.spring.springproject.Entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class DetailEquipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int salle;

    @NonNull
    private String thermatique;

    @OneToOne(cascade = CascadeType.ALL, mappedBy ="detailEquipe")
    private Equipe equipe;

}
