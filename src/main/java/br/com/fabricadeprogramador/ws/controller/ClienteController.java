package br.com.fabricadeprogramador.ws.controller;


import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.PUT;

import org.springframework.http.MediaType;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




import br.com.fabricadeprogramador.ws.model.Cliente;

@RestController
public class ClienteController {
	
	Map<Integer, Cliente> clientes;
	Integer proximoId=1;
	
	//NEGOCIOS
	private Cliente cadastrar(Cliente cliente) {
		
		if (clientes == null) {
			clientes = new HashMap<>();
		}
		
		cliente.setId(proximoId);
	// CRIAR UM ID
		proximoId++;
	
		clientes.put(cliente.getId(), cliente);
		
		return cliente;
	}
	
	
	//END POINTS
	
	@RequestMapping(method = RequestMethod.POST, value="/Clientes", consumes=MediaType.APPLICATION_JSON_VALUE)
	public void cadastrarCliente(@RequestBody Cliente cliente) {
		System.out.println("chamou /clientes");
		}
}
