package com.jsp.spring_boot_crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.spring_boot_crud.dto.Admin;
import com.jsp.spring_boot_crud.service.AdminService;

@RestController
public class AdminController {
   @Autowired
   AdminService adminService;
   @PostMapping("/save")
   public Admin save(@RequestBody Admin admin) {
	   return adminService.save(admin);
   }
   
   @GetMapping("/getAll")
   public List<Admin> getAll(){
	   return adminService.getAll();
   }
   @PutMapping("/update")
   public Admin update(@RequestBody Admin admin) {
	   return adminService.update(admin);
   }
   
   @DeleteMapping("/delete/{id}")
   public Admin delete(@PathVariable int id) {
	   return adminService.delete(id);
   }
   
   @GetMapping("/getById/{id}")
   public Admin getById(@PathVariable int id) {
	   return adminService.getById(id);
   }
}
