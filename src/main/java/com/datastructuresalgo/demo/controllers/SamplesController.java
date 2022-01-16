package com.datastructuresalgo.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/samples")

public class SamplesController {

	@GetMapping("/helloworld")
	public ResponseEntity<String> get(){
		return ResponseEntity.ok("Hello World!");
	}
}
