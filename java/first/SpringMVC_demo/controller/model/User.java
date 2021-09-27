package first.SpringMVC_demo.controller.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



public class User {
	@NotNull
	@Size(min = 1, message = "You can't leave this empty.")
	private String fullName;
	
	@NotNull
	@Email
	private String userName;
	
	@NotNull
	@Size()
	private String password;
	
	@NotNull
	private String phoneNumber;
	
	public String getFullName() {
		return userName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	

}
