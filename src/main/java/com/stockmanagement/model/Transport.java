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
@Table(name = "Transport")
public class Transport implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;
    @Column(name = "Type")
    private String type;
}
