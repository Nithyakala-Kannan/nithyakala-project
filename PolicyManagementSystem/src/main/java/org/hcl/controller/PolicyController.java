package org.hcl.controller;

import java.sql.Date;

import org.hcl.entities.Policy;
import org.hcl.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PolicyController {
	@Autowired
	PolicyService service;
	
	@RequestMapping(value="/policyCreation")
	public String showForm(@RequestParam(required=false,name="policyType") String policyType,@RequestParam(required=false,name="policyName") String policyName, @RequestParam(required=false,name="policyDuration") Integer policyDuration,
			@RequestParam(required=false,name="policyDueDate") Date policyDueDate,@RequestParam(required=false,name="companyName") String companyName, @RequestParam(required=false,name="policyAmount") Integer policyAmount, Model model)
	{
		Policy policy=new Policy();
		policy.setPolicyName(policyName);
		policy.setPolicyType(policyType);
		policy.setPolicyDuration(policyDuration);
		policy.setPolicyDueDate(policyDueDate);
		policy.setPolicyProvider(companyName);
		policy.setPolicyAmount(policyAmount);
		service.insert(policy);
		service.savePolicy(policy);
		if (policy.getPolicyId()==0||policy.getPolicyName().equals(null) ||policy.getPolicyType().equals(null) || policy.getPolicyDuration() == 0
				|| policy.getPolicyProvider().equals(null) ||policy.getPolicyAmount()==0||policy.getPolicyDueDate().equals(null)) {
			model.addAttribute("error", "Please fill out all the fields");
			return "policyCreation";
		}

		model.addAttribute("message", "Successfully Created");
		return "policyEdit";

	}
	@RequestMapping(value="/policyEdit/{id}")
	public String getById(@PathVariable("id") Integer pid,ModelMap map) {
    	 Policy policyregister=service.getById(pid);
    	 map.addAttribute("policyEdit",policyregister);
		return "policyUpdate";
		
	}
	
	@GetMapping("/searchPolicy")
	public String showSearch()
	{
		return "searchPolicy";
	}

	

}
     