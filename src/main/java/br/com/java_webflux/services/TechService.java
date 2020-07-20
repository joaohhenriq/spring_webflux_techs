package br.com.java_webflux.services;

import br.com.java_webflux.document.Tech;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TechService {

	Flux<Tech> findAll(); // returns the data with type flux, and not a list as we're used to
	Mono<Tech> findById(String id); // returns only one data, that's why we use mono
	Mono<Tech> save(Tech tech);
	
}
