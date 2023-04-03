package com.stockmanagement.model;

import lombok.*;
import lombok.experimental.Accessors;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Collection;
import java.util.Date;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "Commande")
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Size(min = 3, max = 100)
    @Column(name = "ID_Commande",nullable=false)
    private Long id;
    @Column(name = "Numero")
    private Long numero;
    @Column(name = "Date_Commande")
    private Date dateCmd;

    @Column(name = "total")
    private double total;
    @Column(name = "Valide",nullable=false)
    private Boolean isValide;
    @ManyToOne
    @JoinColumn(name="CODE_CLIENT",nullable=true)
    @NotFound(action = NotFoundAction.IGNORE)
    private Client client;

    @ManyToOne(optional=false)
    @JoinColumn(name = "CODE_FOURNISSEUR")
    @Nullable
    @NotFound(action = NotFoundAction.IGNORE)
    private Fournisseur fournisseur;

    @OneToMany(mappedBy = "commande",fetch = FetchType.LAZY)
    private Collection<LigneCommande> ligneCommandes;
}
