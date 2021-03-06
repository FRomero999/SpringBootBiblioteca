package com.app;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author paco
 */
public interface LibroRepository extends JpaRepository<models.Libro, Integer> {
    
}
