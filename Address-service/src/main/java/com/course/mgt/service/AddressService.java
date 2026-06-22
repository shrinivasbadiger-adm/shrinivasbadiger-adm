package com.course.mgt.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.mgt.Response.AddressResponse;
import com.course.mgt.entity.AddressEntity;
import com.course.mgt.repo.AddressRepo;

@Service
public class AddressService {

	@Autowired
	AddressRepo addressRepo;

	@Autowired
	ModelMapper modelMapper;

	public AddressResponse findAddressByEmplyId(int empId) {
		AddressEntity address = addressRepo.findAddressByEmpId(empId);
		AddressResponse ar = modelMapper.map(address, AddressResponse.class);
		return ar;

	}
}
