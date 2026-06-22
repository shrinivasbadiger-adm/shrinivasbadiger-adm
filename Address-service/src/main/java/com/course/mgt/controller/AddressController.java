package com.course.mgt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.course.mgt.Response.AddressResponse;
import com.course.mgt.entity.AddressEntity;
import com.course.mgt.service.AddressService;

@RestController
public class AddressController {

	@Autowired
	AddressService addressService;
	
	@GetMapping("/address/{empId}")
	ResponseEntity<AddressResponse> getAddressByEmployeeId(@PathVariable("empId") int id) {
		AddressResponse addressResponse = null;
		addressResponse = addressService.findAddressByEmplyId(id);
		return ResponseEntity.status(HttpStatus.OK).body(addressResponse);
	}
}
