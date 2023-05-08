package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserModel {
@Id
	private int id;
	private String Email;
	private String Password;
	private String Username;
	private String MobeileNumber;
	private String UserRole;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getMobeileNumber() {
		return MobeileNumber;
	}
	public void setMobeileNumber(String mobeileNumber) {
		MobeileNumber = mobeileNumber;
	}
	public String getUserRole() {
		return UserRole;
	}
	public void setUserRole(String userRole) {
		UserRole = userRole;
	}
	@Override
	public String toString() {
		return "UserModel [id=" + id + ", Email=" + Email + ", Password=" + Password + ", Username=" + Username
				+ ", MobeileNumber=" + MobeileNumber + ", UserRole=" + UserRole + "]";
	}
	

}
