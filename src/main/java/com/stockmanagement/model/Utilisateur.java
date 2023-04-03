package com.stockmanagement.model;

import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "User")
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_User")
    private Long id;
    @Column(name = "Nom")
    private String nom;
    @Column(name = "Prenom")
    private String prenom;
    @Column(name = "Username",nullable=false)
    @Size(min  =4,max = 100)
    private String username;
    @Column(name = "Poste")
    private String poste;
    @Column(name = "Identifiant")
    private String identifiant;
    @Column(name = "MotDePasse")
    private String motDePasse;
    @Column(name = "Active",nullable=false)
    private boolean active = false;
}
