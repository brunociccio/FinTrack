package br.com.fiap.fintrack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.fiap.fintrack.model.*;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    
}
