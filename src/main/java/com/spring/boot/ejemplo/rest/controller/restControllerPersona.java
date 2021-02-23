package com.spring.boot.ejemplo.rest.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.ejemplo.rest.entity.*;

@RestController
public class restControllerPersona {
	
	//se define una lista de personas
	@GetMapping("/listaPersonas")
	public List<persona> listaPersonas()
	{
		 List<persona> listadoPersonas = new ArrayList<persona>();
		 
		 for(int i=0;i<4;i++)
		 {
			 persona person = new persona();
			 person.setNombre("Cristian");
			 person.setApellido("Calle");
			 person.setEdad(28);
			 person.setDomicilio("Machala");
			 listadoPersonas.add(person);
			 
			 
		 }
		System.out.println(listadoPersonas.size());
		return listadoPersonas;
	}
}
