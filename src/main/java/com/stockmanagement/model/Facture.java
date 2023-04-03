package com.stockmanagement.model;

import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.Date;
@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "Facture")
public abstract class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Facture")
    private Long id;
    @Column(name = "DateFacture")
    private Date dateFacture;
    @Column(name = "Numero")
    private Long numero;
    @Column(name = "Total")
    private double total;
}
