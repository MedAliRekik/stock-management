package com.stockmanagement.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.Accessors;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "UserRole")
public class UserRoles implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "username")
    @JsonIgnore
    private Utilisateur utilisateur;
    @ManyToOne
    @JoinColumn(name="ROLE_ID")
    @NotFound(action = NotFoundAction.IGNORE)
    private Role role;
}
