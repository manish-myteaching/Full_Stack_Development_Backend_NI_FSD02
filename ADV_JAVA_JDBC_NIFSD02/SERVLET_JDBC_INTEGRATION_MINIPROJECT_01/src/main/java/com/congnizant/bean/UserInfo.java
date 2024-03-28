package com.congnizant.bean;

public class UserInfo {
	private String firstName;
	private String lastName;
	private String user;
	private String password;

	public UserInfo(String firstName, String lastName, String user, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.user = user;
		this.password = password;
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

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserInfo [firstName=" + firstName + ", lastName=" + lastName + ", user=" + user + ", password="
				+ password + "]";
	}


}
