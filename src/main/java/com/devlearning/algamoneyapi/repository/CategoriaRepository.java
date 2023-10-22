package com.devlearning.algamoneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlearning.algamoneyapi.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
