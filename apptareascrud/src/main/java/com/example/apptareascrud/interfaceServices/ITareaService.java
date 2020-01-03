package com.example.apptareascrud.interfaceServices;

import java.util.List;
import java.util.Optional;

import com.example.apptareascrud.modelo.Tarea;

public interface ITareaService {
	public List<Tarea>listar();
	public Optional<Tarea>listarId(int id);
	public int save(Tarea p);
	public void delete(int id);
}
