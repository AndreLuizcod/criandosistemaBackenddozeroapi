package br.com.andreLuiz.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.andreLuiz.projeto.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

}
