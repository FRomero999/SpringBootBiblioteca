package com.app;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author paco
 */
public interface LibroRepository extends JpaRepository<models.Libro, Integer> {
    
    // Método que realiza un filtrado
    // Si se usan los nombres correctamente, no hace falta implementar el método
    // ya que por reflexión SpringBoot lo crea https://www.baeldung.com/spring-data-sorting
    
    List<models.Libro> findByEstado(String estado);
    
}
