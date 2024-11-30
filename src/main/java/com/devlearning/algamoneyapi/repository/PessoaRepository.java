package com.devlearning.algamoneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlearning.algamoneyapi.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}