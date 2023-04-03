package com.stockmanagement.model;

import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.sql.Blob;
@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "Matiere_Premiere")
public class MatierePremiere {
    private static final long serialVersionUID = 1L;

    //@GeneratedValue(generator = "uuid")
    //@GenericGenerator(name = "uuid", strategy = "uuid2")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_MP")
    private Long id;
    @Column(name = "Reference_MP")
    private String refMP;
    @Column(name = "Mibelle_MP")
    private String libelleMP;
    @Column(name = "Description")
    private String description;
    @Column(name = "Prix_HT")
    private Float prixHT;
    @Column(name = "Quantite")
    private int quantite;
    @Column(name = "Quantite_Alerte")
    private int quantiteAlerte;
    @Lob
    @Column(name = "Image")
    private Blob image;
}
