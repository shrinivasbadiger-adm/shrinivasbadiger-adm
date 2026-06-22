package com.course.mgt.com.course.mgt.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.course.mgt.com.course.mgt.entity.EmployeeEntity;
import com.course.mgt.com.course.mgt.model.EmployeeResponse;
import com.course.mgt.com.course.mgt.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private final EmployeeRepo employeeRepo;
	
	@Autowired
	public ModelMapper modelMapper;

	EmployeeService(EmployeeRepo employeeRepo) {
		this.employeeRepo = employeeRepo;
	}

	public EmployeeResponse getEmployeeById(int id) {

		EmployeeEntity emp = employeeRepo.findById(id).get();
		EmployeeResponse empRes =  modelMapper.map(emp, EmployeeResponse.class);
		return empRes;
	}
}
