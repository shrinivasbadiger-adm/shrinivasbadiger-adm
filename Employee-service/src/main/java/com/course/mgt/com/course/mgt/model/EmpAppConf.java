package com.course.mgt.com.course.mgt.model;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpAppConf {

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
