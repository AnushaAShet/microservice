package com.stackroute.springbootzuulgatwayproxymicroservice;

import com.stackroute.springbootzuulgatwayproxymicroservice.filters.ErrorFilter;
import com.stackroute.springbootzuulgatwayproxymicroservice.filters.PostFilter;
import com.stackroute.springbootzuulgatwayproxymicroservice.filters.PreFilter;
import com.stackroute.springbootzuulgatwayproxymicroservice.filters.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class SpringBootZuulgatwayproxyMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootZuulgatwayproxyMicroServiceApplication.class, args);
	}

	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}
	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}

}
