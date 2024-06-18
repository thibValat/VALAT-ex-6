package com.exo2.Exercice2.repository;

import com.exo2.Exercice2.entity.Adresse;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface AdresseRepository extends JpaRepository<Adresse, Long> {
    List<Adresse> findAdresseByVille(String ville);

    Page<Adresse> findAll(Pageable pageable);
}
