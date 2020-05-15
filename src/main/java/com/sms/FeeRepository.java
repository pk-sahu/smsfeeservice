package com.sms;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface FeeRepository extends CrudRepository<Fee, Integer>{

	Optional<Fee> findByStudentId(Integer studentId);
	
}
