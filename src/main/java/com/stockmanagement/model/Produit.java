package com.stockmanagement.model;


import lombok.*;
import lombok.experimental.Accessors;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Blob;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "Produit")
public class Produit implements Serializable {

  //  private static final long serialVersionUID = 1L;

    //@GeneratedValue(generator = "uuid")
    //@GenericGenerator(name = "uuid", strategy = "uuid2")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_Produit")
    private Long id;
    @Column(name = "Reference_Produit")
    private String reference;
    @Column(name = "Libelle_Produit")
    private String libelle;
    @Column(name = "Description")
    private String description;
    @Column(name = "PrixHT")
    private double prixHT;
    @Column(name = "Quantite")
    private int quantite;
    @Column(name = "Quantite_d'alerte")
    private int quantiteAlerte;
    @Lob
    @Column(name = "Image")
    private Blob image;
}
