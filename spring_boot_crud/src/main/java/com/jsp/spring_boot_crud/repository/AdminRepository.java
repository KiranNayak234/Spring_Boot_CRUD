package com.jsp.spring_boot_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.spring_boot_crud.dto.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer>{

}
