package com.felitv.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felitv.model.DetalleVenta;

public interface IDetalleVentaDAO extends JpaRepository <DetalleVenta, Integer>{

}
