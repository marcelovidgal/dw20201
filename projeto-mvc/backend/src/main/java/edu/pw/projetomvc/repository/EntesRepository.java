package edu.pw.projetomvc.repository;

import edu.pw.projetomvc.entity.Entes;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntesRepository extends JpaRepository<Entes, Long> {
    
}