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
@Table(name = "LigneCommande")
public class LigneCommande implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private int quantite;
    private double total;
    @ManyToOne
    @JoinColumn(name = "NUM_COMMANDE")
    private Commande commande;
}
