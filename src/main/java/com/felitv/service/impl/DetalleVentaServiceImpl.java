package com.felitv.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felitv.dao.IDetalleVentaDAO;
import com.felitv.model.DetalleVenta;
import com.felitv.service.IDetalleVentaService;

@Service
public class DetalleVentaServiceImpl implements IDetalleVentaService {

	@Autowired
	private IDetalleVentaDAO dao;

	@Override
	public DetalleVenta registrar(DetalleVenta venta) {
		return dao.save(venta);
	}

	@Override
	public DetalleVenta modificar(DetalleVenta t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public DetalleVenta listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DetalleVenta> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
