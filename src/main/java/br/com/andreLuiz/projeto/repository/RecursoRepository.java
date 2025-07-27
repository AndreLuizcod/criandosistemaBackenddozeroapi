package br.com.andreLuiz.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.andreLuiz.projeto.entity.RecursoEntity;


public interface RecursoRepository extends JpaRepository<RecursoEntity, Long> {

}
