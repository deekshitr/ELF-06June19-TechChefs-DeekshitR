package com.techchefs.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.techchefs.springboot.beans.EmployeeInfoBean;
import com.techchefs.springboot.beans.EmployeeOtherInfoBean;

public interface EmployeeRepository extends CrudRepository<EmployeeInfoBean, Integer> {
	
	@Query("select e from EmployeeOtherInfoBean e where e.infoBean =:infoBean")
	public EmployeeOtherInfoBean findByEmpId(@Param("infoBean") EmployeeInfoBean infoBean);
	
	@Query("select e from EmployeeInfoBean e where str(e.id) like ?1%") 
	public List<EmployeeInfoBean> findAllEmpById(@Param("empSearchValue") String empSearchValue);
	 
	
	@Query("select e from EmployeeInfoBean e") 
	public List<EmployeeInfoBean> findAllEmp();
}
