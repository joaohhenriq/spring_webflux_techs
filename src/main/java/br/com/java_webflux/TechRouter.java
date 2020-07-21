package br.com.java_webflux;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;

@Configuration
public class TechRouter {
	
	@Bean
	public RouterFunction<ServerResponse> route(TechHandler handler){
		return RouterFunctions
				.route(GET("/tech").and(accept(MediaType.APPLICATION_JSON)), handler::findAll)
				.andRoute(GET("/tech/{id}").and(accept(MediaType.APPLICATION_JSON)), handler::findById)
				.andRoute(POST("/tech").and(accept(MediaType.APPLICATION_JSON)), handler::save);
	}

}
