package com.datastructuresalgo.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.datastructuresalgo.demo.services.AnalysisAlgos;

@RestController
@RequestMapping("/api/samples")

public class SamplesController {
	@Autowired
	AnalysisAlgos analysisAlgos;
	
	@GetMapping("/helloworld")
	public ResponseEntity<String> get(){
		return ResponseEntity.ok("Hello World!");
	}
	
	@RequestMapping(value = "/GetSumTillNthNumber/{number}", method = RequestMethod.GET)
	public ResponseEntity<String> getSumTillNthNumber(@PathVariable("number") String number){
		String result = analysisAlgos.getSumTillNthNumber(number);
		
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
}
