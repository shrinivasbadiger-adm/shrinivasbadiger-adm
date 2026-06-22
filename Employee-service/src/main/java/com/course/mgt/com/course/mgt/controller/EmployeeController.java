package com.course.mgt.com.course.mgt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.course.mgt.com.course.mgt.model.EmployeeResponse;
import com.course.mgt.com.course.mgt.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employees/{id}")
	ResponseEntity<EmployeeResponse> getEmployeeDetails(@PathVariable("id") int id) {
		
		EmployeeResponse empResponse = employeeService.getEmployeeById(id);
		return ResponseEntity.status(HttpStatus.OK).body(empResponse);

	}

}
