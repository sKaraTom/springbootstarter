package com.capgemini.springbootstarter.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/serviceStatus")
public class ServiceStatus {

	private static final Logger log = LoggerFactory.getLogger(ServiceStatus.class);
	
	@GetMapping
	public ResponseEntity<String> pingSbsApi() {
		log.info("ServiceStatus start OK...");
		return ResponseEntity.ok("REST API is up: " + (new Date()).toString());
	}
	
}
