package br.com.java_webflux.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import br.com.java_webflux.document.Tech;

public interface TechRepository extends ReactiveMongoRepository<Tech, String>{

}
