package com.practice.entites;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity (name = "USER_ENTITY")
public class User {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String address;
	private String mobile;
	private String gender;
	
	@Column (name = "isActive")
	private String isActive;
	
	/*
	public User() { }
	public User(Integer id, String name, String address, String mobile, String gender, Double isActive) {
		super();
		this.id = id;
		this.name = name;
		this.adderss = address;
		this.mobile = mobile;
		this.department = gender;
		this.salary= isActive;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdderss() {
		return address;
	}
	public void setAdderss(String address) {
		this.adderss = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getDepartment() {
		return gender;
	}
	public void setDepartment(String gender) {
		this.department = gender;
	}
	public Double getSalary() {
		return isActive;
	}
	public void setSalary(Double isActive) {
		this.salary = isActive;
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, gender, id, mobile, name, isActive);
	}
	*/
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(address, other.address) && Objects.equals(gender, other.gender)
				&& Objects.equals(id, other.id) && Objects.equals(mobile, other.mobile)
				&& Objects.equals(name, other.name) && Objects.equals(isActive, other.isActive);
	}
	@Override
	public String toString() {
		return "{\"id\" : " + id 
				+ ", \"name\" : \"" + name 
				+ "\", \"address\" : \"" + address 
				+ "\", \"mobile\" : \"" + mobile
				+ "\", \"gender\" : \"" + gender 
				+ "\", \"isActive\" : \"" + isActive + "\"}";
	}
	
}
