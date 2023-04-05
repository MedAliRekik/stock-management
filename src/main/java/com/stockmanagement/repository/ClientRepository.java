package com.stockmanagement.repository;


import com.stockmanagement.model.Client;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    @Query("select c from Client c where c.code = :x")
    Client findByCode(@Param("x") Long code);

    Optional<Client> findByEmail (String email);

    @Query("select c from Client c where c.nom like :x or c.prenom like :x  or c.adresse like :x or c.email like :x or c.telephone like :x ")
    Page<Client> findAllByMotCle(@Param("x") String mc, Pageable pageable);
}
