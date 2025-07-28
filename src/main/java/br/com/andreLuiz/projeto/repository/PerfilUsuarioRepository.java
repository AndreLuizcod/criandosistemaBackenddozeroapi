package br.com.andreLuiz.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.andreLuiz.projeto.entity.PerfilUsuarioEntity;

public interface PerfilUsuarioRepository extends JpaRepository<PerfilUsuarioEntity, Long> {

}
