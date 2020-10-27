package org.hcl.controller;

import javax.annotation.Resource;

import org.hcl.entities.Admin;
import org.hcl.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {
	@Resource
	AdminService service;

	@GetMapping("/adminLogin")
	public String showAdminLogin(Model model) {
		return "adminLogin";
	}

	@GetMapping("/adminRegistration")
	public String showAdminContact(Model model) {
		return "adminRegistration";
	}

	@RequestMapping(value="/adminRegister",method=RequestMethod.POST)
	public String showAdminForm(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName,
			@RequestParam("age") int age, @RequestParam("gender") String gender,
			@RequestParam("contactNumber") String contactNumber, @RequestParam("userName") String userName,
			@RequestParam("password") String password, Model model) {
		Admin admin = new Admin();
		admin.setFirstName(firstName);
		admin.setLastName(lastName);
		admin.setAge(age);
		admin.setGender(gender);
		admin.setContactNumber(contactNumber);
		admin.setUserName(userName);
		admin.setPassword(password);
		service.insert(admin);

		if (admin.getFirstName().equals(null) || admin.getLastName().equals(null) || admin.getAge() == 0
				|| admin.getGender().equals(null) || admin.getContactNumber().equals(null)
				|| admin.getUserName().equals(null) || admin.getPassword().equals(null)) {
			model.addAttribute("error", "Please fill all the fields");
			return "adminRegistration";
		}

		model.addAttribute("message", "Successfully Registered");
		return "adminLogin";

	}

}
