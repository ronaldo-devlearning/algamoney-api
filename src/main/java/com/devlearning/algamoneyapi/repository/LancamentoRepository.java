package com.devlearning.algamoneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlearning.algamoneyapi.model.Lancamento;
import com.devlearning.algamoneyapi.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}