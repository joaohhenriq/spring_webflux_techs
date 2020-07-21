package br.com.java_webflux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.java_webflux.document.Tech;
import br.com.java_webflux.services.TechService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

//@RestController
public class TechController {

	@Autowired
	TechService techService;
	
	@GetMapping(value = "/tech")
	public Flux<Tech> getTech(){
		return techService.findAll();
	}
	
	@GetMapping(value = "/tech/{id}")
	public Mono<Tech> getTechId(@PathVariable String id){
		return techService.findById(id);
	}
	
	@PostMapping(value = "/tech")
	public Mono<Tech> saveTech(@RequestBody Tech tech){
		return techService.save(tech);
	}
}
