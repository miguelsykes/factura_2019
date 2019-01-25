package com.felitv.controller;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.felitv.exception.ModeloNotFoundException;
import com.felitv.model.Venta;
import com.felitv.service.IVentaService;

@RestController
@RequestMapping("/ventas")
public class VentaController {
	
	@Autowired
	private IVentaService service;

	@GetMapping (produces = "application/json")
	public ResponseEntity <List<Venta>> listar(){
		return new ResponseEntity<List<Venta>>(service.listar(), HttpStatus.OK);	
	}
	
	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Resource<Venta> listarPorId(@PathVariable("id") Integer id) {
		Venta ven = service.listarId(id);
		if(ven == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO: " + id);
		}
		
		Resource<Venta> resource = new Resource<Venta>(ven);
		//  /Venta/1
		ControllerLinkBuilder linkTo = linkTo(methodOn(this.getClass()).listarPorId(id));
		resource.add(linkTo.withRel("Venta-resource"));
		
		return resource;
	}
	
	
	@PostMapping(produces = "application/json", consumes = "application/json")
	public ResponseEntity<Object> registrar(@RequestBody Venta ven) {
		Venta Venta = new Venta();
		Venta = service.registrar(ven);
		// /Ventas/2
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(Venta.getIdVenta()).toUri();
		return ResponseEntity.created(location).build();
	}
	
	@PutMapping(produces = "application/json", consumes = "application/json")
	public ResponseEntity<Object> modificar(@RequestBody Venta ven) {
		service.modificar(ven);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	
	
}
