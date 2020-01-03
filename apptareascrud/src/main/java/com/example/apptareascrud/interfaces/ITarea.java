package com.example.apptareascrud.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.apptareascrud.modelo.Tarea;

@Repository
public interface ITarea extends CrudRepository<Tarea, Integer> {

}
