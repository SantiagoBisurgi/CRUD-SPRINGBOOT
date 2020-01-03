package com.example.apptareascrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apptareascrud.interfaceServices.ITareaService;
import com.example.apptareascrud.interfaces.ITarea;
import com.example.apptareascrud.modelo.Tarea;

@Service
public class TareaService implements ITareaService {
	
	@Autowired
	private  ITarea data;
	
	@Override
	public List<Tarea> listar() {
		return (List<Tarea>)data.findAll();
	}

	@Override
	public Optional<Tarea> listarId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Tarea p) {
		int res=0;
		Tarea tarea=data.save(p);
		if(!tarea.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);	
	}
	

}
