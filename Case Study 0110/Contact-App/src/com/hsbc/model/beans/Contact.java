package com.hsbc.model.beans;

public class Contact {
	private int contactId;
	private String contactName;
	private long contactNo;
	private static int countId = 1;
	
	public Contact() {
		super();
		this.contactId = countId++;
	}
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	
	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", contactName=" + contactName + ", contactNo=" + contactNo + "]";
	}
	
	
}
