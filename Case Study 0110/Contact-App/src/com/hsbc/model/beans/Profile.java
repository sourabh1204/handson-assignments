package com.hsbc.model.beans;

public class Profile {
	private int profileId;
	private String name;
	private long phone;
	private String password;
	private String dob;
	
	public Profile() {
		super();
	}
	
	public Profile(int profileId, String name, long phone, String password, String dob) {
		super();
		this.profileId = profileId;
		this.name = name;
		this.phone = phone;
		this.password = password;
		this.dob = dob;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}
	public int getProfileId() {
		return profileId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	@Override
	public String toString() {
		return "Profile [profileId=" + profileId + ", name=" + name + ", phone=" + phone + ", password=" + password
				+ ", dob=" + dob + "]";
	}
	
}
