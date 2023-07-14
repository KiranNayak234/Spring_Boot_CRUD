package com.jsp.spring_boot_crud.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.spring_boot_crud.dto.Admin;
import com.jsp.spring_boot_crud.repository.AdminRepository;

@Repository
public class AdminDao {
  @Autowired
  AdminRepository adminRepository;
  public Admin saveAdmin(Admin admin) {
	  return adminRepository.save(admin);
  }
  
  public List<Admin> getAllAdmin(){
	  return adminRepository.findAll();
  }
  
  public Admin updateAdmin(Admin admin) {
	  Optional<Admin> optional=adminRepository.findById(admin.getId());
	  if(optional.isPresent()) {
		  return adminRepository.save(admin);
	  }
	  return null;
  }
  
  public Admin deleteAdmin(int id) {
	  Optional<Admin> optional=adminRepository.findById(id);
	  if(optional.isPresent()) {
		  adminRepository.delete(optional.get());
	  }
	  return optional.get();
  }
  
  public Admin getAdminById(int id) {
	  Optional<Admin> optional=adminRepository.findById(id);
	  if(optional.isPresent()) {
		  return optional.get();
	  }
	  return null;
  }
}
