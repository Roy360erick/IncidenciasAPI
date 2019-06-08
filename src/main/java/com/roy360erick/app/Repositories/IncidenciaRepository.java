package com.roy360erick.app.Repositories;

import com.roy360erick.app.Models.Incidencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface IncidenciaRepository extends JpaRepository<Incidencia, Serializable> {

    public  Incidencia  findById(Long id);

}
