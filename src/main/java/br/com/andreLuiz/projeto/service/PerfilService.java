package br.com.andreLuiz.projeto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.andreLuiz.projeto.dto.PerfilDTO;
import br.com.andreLuiz.projeto.entity.PerfilEntity;
import br.com.andreLuiz.projeto.repository.PerfilRepository;

@Service
public class PerfilService {


		@Autowired
		private PerfilRepository perfilRepository;
		
		public List<PerfilDTO> listarTodos(){
			List<PerfilEntity> perfil = perfilRepository.findAll();
			return perfil.stream().map(PerfilDTO::new).toList();
		}
		
		public void inserir(PerfilDTO perfil) {
			PerfilEntity perfilEntity = new PerfilEntity(perfil);
			perfilRepository.save(perfilEntity);
		}
		
		public PerfilDTO alterar(PerfilDTO perfil) {
			PerfilEntity perfilEntity = new PerfilEntity(perfil);
			return new PerfilDTO(perfilRepository.save(perfilEntity));
		}
		
		public void excluir(Long id) {
			PerfilEntity perfil = perfilRepository.findById(id).get();
			perfilRepository.delete(perfil);
		}
		
		public PerfilDTO buscarPorId(Long id) {
			
			return new PerfilDTO(perfilRepository.findById(id).get());
		}
}
