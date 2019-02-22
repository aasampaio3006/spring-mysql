package org.com.eventos.repository;

import org.com.eventos.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EventoRepository extends JpaRepository<Evento, Long>{

}
