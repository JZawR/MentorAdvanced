package com.example.gateway.configuration;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableDiscoveryClient
public class GatewayConfiguration {

//    @Bean
//    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("book-service", r -> r.path("/api/book-service/**")
//                        //   .filters(f -> f.filter(filter))
//                        .filters(f -> f.rewritePath("/api/book-service/(?<remains>.*)", "/${remains}")
//                                .addRequestHeader("X-book-Header", "book-service-header"))
//                        .uri("lb://book-service/"))
//                .build();
//    }

}
