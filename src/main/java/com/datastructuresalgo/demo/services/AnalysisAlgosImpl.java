package com.datastructuresalgo.demo.services;

import org.springframework.stereotype.Service;

@Service
public class AnalysisAlgosImpl implements AnalysisAlgos {

	@Override
	public String getSumTillNthNumber(String n) {
		int i = Integer.parseInt(n);
		
		
		String result = String.valueOf(i);	
		return result;
	}
}
