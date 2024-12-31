package com.realone.realonemodel.model.users;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="user")
public class User {

	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;
	@Column(name="userId")
	private String userId;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	@Column(name="phone")
	private String phone;
	@Column(name="password")
	private String password;
	@Column(name="address")
	private String address;
	@Column(name="registrationDate")
	private Date registrationDate;
	@Column(name="uploadImage")
	private String uploadImage;
	private String roles;
	
	public User() {
		super();
	}
	public User(Long id, String userId, String name, String email, String phone, String password, String address,
			Date registrationDate, String uploadImage, String roles) {
		super();
		this.id = id;
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.address = address;
		this.registrationDate = registrationDate;
		this.uploadImage = uploadImage;
		this.roles = roles;	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userId=" + userId + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", password=" + password + ", address=" + address + ", registrationDate=" + registrationDate
				+ ", uploadImage=" + uploadImage + ", roles=" +roles+ "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	public String getUploadImage() {
		return uploadImage;
	}
	public void setUploadImage(String uploadImage) {
		this.uploadImage = uploadImage;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	
}
