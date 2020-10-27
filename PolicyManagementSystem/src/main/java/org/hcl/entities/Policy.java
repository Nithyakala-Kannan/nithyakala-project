package org.hcl.entities;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Entity
public class Policy {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer policyId;
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String policyName;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String policyType;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String policyProvider;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private Integer policyDuration;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private Date policyDueDate;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private Integer policyAmount;

	@ManyToMany(mappedBy = "policy")
	private Set< User> users=new HashSet<User>();
	
	public Policy() {
		// TODO Auto-generated constructor stub
	}

	public Policy(Integer policyId,
			@NotNull(message = "is required") @Size(min = 1, message = "is required") String policyName,
			@NotNull(message = "is required") @Size(min = 1, message = "is required") String policyType,
			@NotNull(message = "is required") @Size(min = 1, message = "is required") String policyProvider,
			@NotNull(message = "is required") @Size(min = 1, message = "is required") Integer policyDuration,
			@NotNull(message = "is required") @Size(min = 1, message = "is required") Date policyDueDate,
			@NotNull(message = "is required") @Size(min = 1, message = "is required") Integer policyAmount,
			Set<User> users) {
		super();
		this.policyId = policyId;
		this.policyName = policyName;
		this.policyType = policyType;
		this.policyProvider = policyProvider;
		this.policyDuration = policyDuration;
		this.policyDueDate = policyDueDate;
		this.policyAmount = policyAmount;
		this.users = users;
	}

	public Integer getPolicyId() {
		return policyId;
	}

	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public String getPolicyProvider() {
		return policyProvider;
	}

	public void setPolicyProvider(String policyProvider) {
		this.policyProvider = policyProvider;
	}

	public Integer getPolicyDuration() {
		return policyDuration;
	}

	public void setPolicyDuration(Integer policyDuration) {
		this.policyDuration = policyDuration;
	}

	public Date getPolicyDueDate() {
		return policyDueDate;
	}

	public void setPolicyDueDate(Date policyDueDate) {
		this.policyDueDate = policyDueDate;
	}

	public Integer getPolicyAmount() {
		return policyAmount;
	}

	public void setPolicyAmount(Integer policyAmount) {
		this.policyAmount = policyAmount;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}
	
	public void add(User user) {
		users.add(user);
	}


	

}
