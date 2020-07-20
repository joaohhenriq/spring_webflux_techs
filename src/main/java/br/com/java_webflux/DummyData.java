package br.com.java_webflux;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.java_webflux.document.Tech;
import br.com.java_webflux.repository.TechRepository;
import reactor.core.publisher.Flux;
import java.util.UUID;

//@Component
//public class DummyData implements CommandLineRunner {
//	
//	private final TechRepository techRepository;
//	
//	public DummyData(TechRepository techRepository) {
//		this.techRepository = techRepository;
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		
//		techRepository.deleteAll()
//			.thenMany(
//					Flux.just("Java", "JavaScript", "Flutter", "React", "React Native", "MongoDB")
//						.map(name -> new Tech(UUID.randomUUID().toString(), name))
//						.flatMap(techRepository::save))
//			.subscribe(System.out::println);
//	}
//
//}
