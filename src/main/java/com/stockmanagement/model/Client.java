package com.stockmanagement.model;


import lombok.*;
import lombok.experimental.Accessors;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;


@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "Client")
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Size(min = 3,max = 100)
    @Column(name = "Code_Client")
    private Long code;
    @Column(name = "Nom")
    private String nom;
    @Column(name = "Prenom")
    private String prenom;
    @Column(name = "Matricule_fiscale")
    private Long matriculeFiscale;
    @Column(name = "Societe")
    private String societe;
    @Column(name = "Tel")
    private String telephone;
    @Column(name = "Fax")
    private String fax;
    @Column(name = "Mobile")
    private String mobile;
    @Column(name = "Email")
    private String email;
    @Column(name = "Adresse")
    private String adresse;
}
