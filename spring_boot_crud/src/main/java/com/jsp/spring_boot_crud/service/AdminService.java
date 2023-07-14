package com.jsp.spring_boot_crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.spring_boot_crud.dao.AdminDao;
import com.jsp.spring_boot_crud.dto.Admin;

@Service
public class AdminService {
  @Autowired
  AdminDao adminDao;
  public Admin save(Admin admin) {
	  return adminDao.saveAdmin(admin);
  }
  
  public List<Admin> getAll(){
	  return adminDao.getAllAdmin();
  }
  
  public Admin update(Admin admin) {
	  return adminDao.updateAdmin(admin);
  }
  
  public Admin delete(int id) {
	  return adminDao.deleteAdmin(id);
  }
  public Admin getById(int id) {
	  return adminDao.getAdminById(id);
  }
  
  
}
