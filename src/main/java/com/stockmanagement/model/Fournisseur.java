package com.stockmanagement.model;

import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "Fournisseur")
public class Fournisseur implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Fournisseur")
    private Long idFournisseur;
    @Column(name = "Nom")
    private String nom;
    @Column(name = "Prenom")
    private String prenom;
    @Column(name = "Matricule_Fiscale")
    private String matFiscale;
    @Column(name = "Tel")
    private String tel;
    @Column(name = "Fax")
    private String fax;
    @Column(name = "Mobile")
    private String mobile;
    @Column(name = "Email")
    private String email;
    @Column(name = "Adresse")
    private String adresse;

}
