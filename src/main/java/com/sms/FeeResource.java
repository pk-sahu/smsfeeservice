package com.sms;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeeResource {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(FeeResource.class);
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private FeeRepository repository;
	
	@GetMapping("/studentFee/studentId/{studentId}")
	public ResponseEntity<Fee> getStudentFee(@PathVariable Integer studentId){
		
		Optional<Fee> fee = repository.findByStudentId(studentId);
		/*if(!fee.isPresent())
			throw new UserNotFoundException("Fee is not found with studentId-"+ studentId);*/
		Fee feeValue = fee.get();
		feeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		LOGGER.info("{}",feeValue.getPort());
		return new ResponseEntity<Fee>(feeValue, HttpStatus.OK);
	}
}
