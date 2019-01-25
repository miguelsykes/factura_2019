package com.felitv.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felitv.model.Persona;

public interface IPersonaDAO extends JpaRepository <Persona, Integer>{

}
