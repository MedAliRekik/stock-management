package com.stockmanagement.model;

import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "Dossier")
public class Dossier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    @Column(name = "ID_Dossier")
    private Long id;
    @Column(name = "numero")
    private int num;
    @Column(name = "Nom")
    @Size(min = 3, max = 50)
    private String nom;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "Date_Ouverture")
    private Date dateOuverture;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Nullable
    @Column(name = "Date_Fermeture")
    private Date dateFermeture;
//    private FactureAchat factureAchat;
//    private FactureVente factureVente;
}
