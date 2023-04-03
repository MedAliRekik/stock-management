package com.stockmanagement.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "Facture_De_Achat")
public class FactureAchat {

    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Fact_Achat")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "ID_Fournisseur")
    private Fournisseur fournisseur;
    @Column(name = "Date")
    private Date date;
    @Column(name = "Total_HT")
    private double totalHT;
    @Column(name = "Total_TVA")
    private double totalTVA;
    @Column(name = "Total_TTC")
    private double totalTTC;

    //private Collection<FactureAchat> factureAchats;


}
