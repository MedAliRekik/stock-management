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
@Table(name = "LigneFacture")
public class LigneFacture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    @Column(name = "ID")
    private Long id;
    @Column(name = "Prix_Vente")
    private double prixVente;
    @Column(name = "Quantite")
    private int quantite;
    @Column(name = "Total")
    private double total;
}
