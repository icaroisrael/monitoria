package com.modelo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.convert.WritingConverter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.modelo.model.Produto; 
@Controller
public class ControllerCadastro {
	@Autowired
	com.modelo.repository.CrudRepository crud;
	
	@GetMapping("/cadastro")
	public String home() {
		return "cadastro";
	}
	
	//@PostMapping("/cadastro")
	//public String cadastro(Produto produto) {
		//crud.save(produto);
		//return "/cadastro";
		
	//}

}
