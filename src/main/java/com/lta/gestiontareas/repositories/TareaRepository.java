package com.lta.gestiontareas.repositories;
import com.lta.gestiontareas.entities.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TareaRepository extends JpaRepository<Tarea,Long> {
}
