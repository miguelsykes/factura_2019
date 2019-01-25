package com.felitv.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felitv.dao.IVentaDAO;
import com.felitv.model.Venta;
import com.felitv.service.IVentaService;

@Service
public class VentaServiceImpl implements IVentaService {

	@Autowired
	private IVentaDAO dao;
	
	@Override
	public Venta registrar(Venta t) {
		return dao.save(t);
	}
	
	@Override
	public Venta listarId(int id) {
		
		return dao.findOne(id);
	}

	@Override
	public List<Venta> listar() {
		
		return dao.findAll();
	}

	@Override
	public Venta modificar(Venta t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		
	}

	

	
}
