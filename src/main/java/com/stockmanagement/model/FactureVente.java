package com.stockmanagement.model;


import lombok.*;
import lombok.experimental.Accessors;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "Facture_de_Vente")
public class FactureVente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(generator = "uuid")
    //@GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "ID_Fact_Vente")
    private Long id;
    @Column(name = "Date")
    private Date date;
    @Column(name = "Total_HT")
    private double totalHT;
    @Column(name = "Total_TVA")
    private double totalTVA;
    @Column(name = "Total_TTC")
    private double totalTTC;

}
