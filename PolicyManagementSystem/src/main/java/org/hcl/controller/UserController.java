package org.hcl.controller;

import javax.annotation.Resource;

import org.hcl.entities.Admin;
import org.hcl.entities.User;
import org.hcl.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class UserController {
	@Resource
	UserService service;

	
	@GetMapping("/userRegistration")
	public String showUserReg(Model model) {
		return "userRegistration";
	}
	
	@GetMapping("/userLogin")
	public String showLogin(Model model) {
		return "userLogin";
	}

	@RequestMapping(value="/userRegister",method = RequestMethod.POST)
	public String showRegister(@RequestParam("firstName") String firstname, @RequestParam("lastName") String lastname,
			@RequestParam("age") int age, @RequestParam("gender") String gender,
			@RequestParam("contactNumber") String contactNumber, @RequestParam("userName") String userName,
			@RequestParam("password") String password, Model model) {
		User user = new User();
		user.setFirstName(firstname);
		user.setLastName(lastname);
		user.setAge(age);
		user.setGender(gender);
		user.setContactNumber(contactNumber);;
		user.setUserName(userName);
		user.setPassword(password);
		service.insert(user);

		if (user.getFirstName().equals(null) || user.getLastName().equals(null) || user.getAge() == 0
				|| user.getGender().equals(null) || user.getContactNumber().equals(null) || user.getUserName().equals(null)
				|| user.getPassword().equals(null)) {
			model.addAttribute("error", "Please fill required fields");
			return "userRegistration";
		}

		model.addAttribute("message", "successful Registeration");
		return "userLogin";

	}

}
