package dev.mohecompare.dev.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.mohecompare.dev.modelo.Usuario;

public interface UsuarioRepo extends JpaRepository<Usuario,Long>{
    
}
