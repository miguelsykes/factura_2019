package com.felitv.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felitv.dao.IProductoDAO;
import com.felitv.model.Producto;
import com.felitv.service.IProductoService;

@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	private IProductoDAO dao;

	@Override
	public Producto registrar(Producto t) {
		return dao.save(t);
	}

	@Override
	public Producto modificar(Producto t) {
		// TODO Auto-generated method stub
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		dao.delete(id);

	}

	@Override
	public Producto listarId(int id) {

		return dao.findOne(id);
	}

	@Override
	public List<Producto> listar() {

		return dao.findAll();
	}

}
