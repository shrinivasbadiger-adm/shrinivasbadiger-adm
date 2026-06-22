package com.course.mgt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.course.mgt.entity.AddressEntity;

public interface AddressRepo extends JpaRepository<AddressEntity, Integer> {

	// find id
	@Query(nativeQuery = true, value = "SELECT ea.id,ea.lane1,ea.lane2,ea.state,ea.zip FROM employee.add ea join employee.emp ep on ep.id=ea.id where ea.id=:employeeId;")
	AddressEntity findAddressByEmpId(@Param("employeeId") int empId);
}
