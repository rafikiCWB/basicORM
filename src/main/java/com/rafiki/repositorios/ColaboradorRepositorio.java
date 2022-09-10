package com.rafiki.repositorios;

import com.rafiki.entidades.Colaborador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColaboradorRepositorio extends JpaRepository<Colaborador, Long> {
}
