package com.involucionados.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.involucionados.modelo.entidades.Capacitacion;
import com.involucionados.modelo.servicio.interfaces.ICapacitacionServicio;

@Controller
public class CapacitacionControlador {

	@Autowired
	ICapacitacionServicio capacitacion;

	@GetMapping(value = "/crearcapacitacion")
	public String crearCapacitacion(Model m) {
		m.addAttribute("command", new Capacitacion());
		return "CrearCapacitacion";

	}

	@PostMapping(value = "/guardarcapacitacion")
	public String guardarCapacitacion(Capacitacion c) {
		System.out.println(c.toString());
		//capacitacion.agregarCapacitacion(c);
		return "index";

	}

	@RequestMapping("listaCapacitacion")
	public String listaCapacitacion(Model m) {
		m.addAttribute("lista", capacitacion.listarCapacitacion());

		return "ListaCapacitacion";
	}

	@RequestMapping("elimnarCapacitacion/{id}")
	public String eliminarCapacitacion(@PathVariable int id) {

		System.out.println(id);
		capacitacion.eliminarCapacitacion(id);

		return "redirect:/listaCapacitacion";
	}

	@RequestMapping("editarCapacitacion/{id}")
	public String editarCapacitacion(@PathVariable int id, Model m) {

		
		
		Capacitacion cp = capacitacion.obtenerCapacitacion(id);
		

		
		System.out.println(cp);
		
		m.addAttribute("command", cp);
		

		return "editarCapacitacion";

	}
	
	
	
	
	@PostMapping(value = "/editarcapacitacion")
	public String guaedarEdicionCapacitacion(Capacitacion c) {
		System.out.println(c.toString());
		//capacitacion.agregarCapacitacion(c);
		return "index";

	}

	

}
