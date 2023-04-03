package com.stockmanagement.model;

import lombok.*;
import lombok.experimental.Accessors;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.validation.constraints.Min;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "Stock")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Stock")
    private Long id;
    @Column(name = "Date")
    private Date date;
    @Min(0)
    @Column(name = "Quantite")
    private int quantite;

    @ManyToOne
    @JoinColumn(name = "REF_PRODUIT")
    @NotFound(action = NotFoundAction.IGNORE)
    private Produit produit;

}
