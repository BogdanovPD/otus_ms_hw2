package ru.otus.microservices.hw2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

	@Value("${spring.datasource.url}")
	private String dbUri;

	@GetMapping("/health")
	public String check()
	{
		return dbUri;
	}
}
