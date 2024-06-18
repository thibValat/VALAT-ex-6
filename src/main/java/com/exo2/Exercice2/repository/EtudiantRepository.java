package com.exo2.Exercice2.repository;

import com.exo2.Exercice2.entity.Adresse;
import com.exo2.Exercice2.entity.Ecole;
import com.exo2.Exercice2.entity.Etudiant;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    Optional<Etudiant> findOneEtudiantByNomAndPrenom(String nom, String prenom);
    Page<Etudiant> findByNomContainingIgnoreCase(String nom, Pageable pageable);
    Page<Etudiant> findAll(Pageable pageable);



}
