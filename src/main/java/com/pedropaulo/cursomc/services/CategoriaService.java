package com.pedropaulo.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedropaulo.cursomc.domain.Categoria;
import com.pedropaulo.cursomc.repository.CategoriaRepository;
import com.pedropaulo.cursomc.services.exceptions.ObjectNotFoundException;

@Service 
public class CategoriaService {
	
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
		}

}
