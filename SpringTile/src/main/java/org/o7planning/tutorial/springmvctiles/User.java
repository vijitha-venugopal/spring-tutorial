package org.o7planning.tutorial.springmvctiles;

public class User {

	private String userName;
	private String userDob;

	String getUserName() {
        return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	String getUserDob() {
		return userDob;
	}

	public void setUserDob(String userDob) {
		this.userDob = userDob;
	}
}