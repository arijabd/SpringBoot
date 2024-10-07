package tn.esprit.foyersae9.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Reservation {
    @Id

    private String idReservation;
    private Date anneeUniversitaire;
    private boolean estValide;

    @ManyToMany(mappedBy = "Reservation")
    private List<Etudiant> etudiant;

}
