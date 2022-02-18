package com.naveen.api.gateway;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import lombok.extern.java.Log;
import reactor.core.publisher.Mono;

@Component
@Log
public class LoggingFilter  implements GlobalFilter{@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		log.info("Logging path of request ->  " +  exchange.getRequest().getPath());
		
		return chain.filter(exchange); 
	}
	
}
