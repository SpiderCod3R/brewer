package com.reobotnet.brewer.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reobotnet.brewer.model.Cidade;
import com.reobotnet.brewer.model.Estado;

public interface Cidades extends JpaRepository<Cidade, Long> {

	public List<Cidade> findByEstadoCodigo(Long codigoEstado);

	public Optional<Cidade> findByNomeAndEstado(String nome, Estado estado);
	
}