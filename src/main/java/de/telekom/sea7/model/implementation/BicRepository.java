package de.telekom.sea7.model.implementation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BicRepository extends JpaRepository<BicE, Long>{

}