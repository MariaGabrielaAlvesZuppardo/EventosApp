package com.example.EventoApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventoController {
	
	// Método para retornar o cadastro do evento
	
	@RequestMapping("/cadastrarEvento")
	public String form() {
		return "evento/formEvento";
	}

}
