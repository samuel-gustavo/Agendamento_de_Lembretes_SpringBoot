package com.devsamuel.agenda_lembretes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LembreteController {

	@GetMapping("/")
	public String abrirTelalembretes() {
		return "index";
	}
}
