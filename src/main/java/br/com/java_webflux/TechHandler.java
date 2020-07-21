package br.com.java_webflux;

import static org.springframework.web.reactive.function.server.ServerResponse.ok;
import static org.springframework.web.reactive.function.BodyInserters.fromPublisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import br.com.java_webflux.document.Tech;
import br.com.java_webflux.services.TechService;
import reactor.core.publisher.Mono;

@Component
public class TechHandler {

	@Autowired
	TechService techService;
	
	public Mono<ServerResponse> findAll(ServerRequest request){
		return ok()
				.contentType(MediaType.APPLICATION_JSON)
				.body(techService.findAll(), Tech.class);
	}
	
	public Mono<ServerResponse> findById(ServerRequest request){
		
		String id = request.pathVariable("id");
		
		return ok()
				.contentType(MediaType.APPLICATION_JSON)
				.body(techService.findById(id), Tech.class);
	}
	
	public Mono<ServerResponse> save(ServerRequest request){
		final Mono<Tech> tech = request.bodyToMono(Tech.class);
		return ok()
				.contentType(MediaType.APPLICATION_JSON)
				.body(fromPublisher(tech.flatMap(techService::save), Tech.class));
	}

}
