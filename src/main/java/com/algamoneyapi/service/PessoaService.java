package com.algamoneyapi.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.algamoneyapi.model.Pessoa;
import com.algamoneyapi.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	public Pessoa atualizar(Long codigo, Pessoa pessoa) {
		Pessoa pessoaSalva = pessoaRepository.findById(codigo).orElseThrow(() -> new EmptyResultDataAccessException(1));

		BeanUtils.copyProperties(pessoa, pessoaSalva, "codigo");
		pessoaRepository.save(pessoaSalva);

		return pessoaSalva;
	}
}
