package mx.com.chavon.empleados.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.chavon.empleados.service.EmpleadosServices;
import mx.com.lobo.utils.ConvierteObjetos;
import mx.com.lobo.utils.ResponseApi;

@RestController
public class EmpleadosController {

	@Autowired
	private EmpleadosServices empleadosService;
	
	
	@GetMapping("/listarTuple")
	public ResponseApi listar() {
		return ConvierteObjetos.convierte(empleadosService.getEmpleados());
		
	}
	
	@GetMapping("/listarQuery")
	public ResponseApi listarQuery() {
		return ConvierteObjetos.convierte(empleadosService.getEmpleadosQuery());
		
	}

	@GetMapping("/nulo")
	public ResponseApi nulo() {
		return ConvierteObjetos.convierte(false, "Ocurrrio un error", null);
		
	}
	
	@GetMapping("/cadena")
	public ResponseApi cadena() {
		return ConvierteObjetos.convierte(true, "Ejemplo del proceso de una cadena", "Ok esto esta saliendo muy bien");
		
	}
	
	@GetMapping("/listaString")
	public ResponseApi lista() {
		List<String> lista = new ArrayList<String>();
		lista.add("Valor 1");
		lista.add("Valor 2");
		return ConvierteObjetos.convierte(true, "Ejemplo del proceso de una lista de string", lista);
		
	}
	
	@GetMapping("/hashmap")
	public ResponseApi hashmap() {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("valor", "chavon");
		hm.put("valor2", "chavon");
		return ConvierteObjetos.convierte(true, "Ejemplo del proceso de una lista de string", hm);
		
	}
}
