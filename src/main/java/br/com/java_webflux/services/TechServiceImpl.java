package br.com.java_webflux.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.java_webflux.document.Tech;
import br.com.java_webflux.repository.TechRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TechServiceImpl implements TechService {
	
	@Autowired
	TechRepository techRepository;

	@Override
	public Flux<Tech> findAll() {
		return techRepository.findAll();
	}

	@Override
	public Mono<Tech> findById(String id) {
		return techRepository.findById(id);
	}

	@Override
	public Mono<Tech> save(Tech tech) {
		return techRepository.save(tech);
	}

}
