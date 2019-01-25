package com.felitv.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felitv.model.Producto;

public interface IProductoDAO extends JpaRepository <Producto, Integer>{

}
