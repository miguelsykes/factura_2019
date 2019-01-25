package com.felitv.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felitv.dao.IPersonaDAO;
import com.felitv.model.Persona;
import com.felitv.service.IPersonaService;

@Service
public class PersonaServiceImpl implements IPersonaService{

	@Autowired
	private IPersonaDAO dao;
	
	@Override
	public Persona registrar(Persona t) {
		return dao.save(t);
	}

	@Override
	public Persona modificar(Persona t) {
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		dao.delete(id);
		
	}

	@Override
	public Persona listarId(int id) {
		
		return dao.findOne(id);
	}

	@Override
	public List<Persona> listar() {
		
		return dao.findAll();
	}

}
