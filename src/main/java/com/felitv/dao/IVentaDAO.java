package com.felitv.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felitv.model.Venta;

public interface IVentaDAO extends JpaRepository <Venta, Integer> {

}
