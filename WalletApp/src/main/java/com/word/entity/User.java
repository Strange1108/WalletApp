package com.word.entity;

import java.util.UUID;

public class User {
	private String UName;
	private String UID;
	
	public String getUName() {
		return UName;
	}
	public void setUName(String uName) {
		UName = uName;
	}
	public String getUID() {
		return UID;
	}
	public void setUID(String uID) {
		UID = uID;
	}
	public User(String uName) {
		super();
		UName = uName;
		UID = UUID.randomUUID().toString();
	}
	
	
}
