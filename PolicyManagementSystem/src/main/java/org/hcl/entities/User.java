package org.hcl.entities;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String firstName;
	
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String lastName;

	@NotNull(message = "is required")
	private Integer age;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String gender;
	
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String contactNumber;
	
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String userName;
	
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String password;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="User Policy", joinColumns= {@JoinColumn(name="id")},inverseJoinColumns= {@JoinColumn(name="policyId")})
	private Set<Policy> policy=new HashSet<Policy>();
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	

	public User(Integer id,
			@NotNull(message = "is required") @Size(min = 1, message = "is required") String firstName,
			@NotNull(message = "is required") @Size(min = 1, message = "is required") String lastName,
			@NotNull(message = "is required") Integer age,
			@NotNull(message = "is required") @Size(min = 1, message = "is required") String gender,
			@NotNull(message = "is required") @Size(min = 1, message = "is required") String contactNumber,
			@NotNull(message = "is required") @Size(min = 1, message = "is required") String userName,
			@NotNull(message = "is required") @Size(min = 1, message = "is required") String password,
			Set<Policy> policy) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.contactNumber = contactNumber;
		this.userName = userName;
		this.password = password;
		this.policy = policy;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Policy> getPolicy() {
		return policy;
	}

	public void setPolicy(Set<Policy> policy) {
		this.policy = policy;
	}
	public void add(Policy policyvalues) {
		policy.add(policyvalues);
	}
	

}
