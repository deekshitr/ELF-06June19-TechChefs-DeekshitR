package com.techchefs.springcore.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.techchefs.springcore.beans.DepartmentInfoBean;

@Import({EmployeeInfoConfig.class, DepartmentInfoConfig.class})
@Configuration
public class ImportAllConfig {
}
