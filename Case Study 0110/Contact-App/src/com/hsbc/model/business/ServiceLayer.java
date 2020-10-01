package com.hsbc.model.business;

import java.util.ArrayList;

import com.hsbc.model.beans.Contact;
import com.hsbc.model.beans.Profile;
import com.hsbc.model.exception.AuthenticationException;
import com.hsbc.model.exception.ContactNotFoundException;
import com.hsbc.model.exception.ProfileNotFoundException;

public interface ServiceLayer {
	public Profile login(int profileId, String password) throws AuthenticationException;
	public Profile storeProfile(Profile profile);
	public Profile updatePhone(int profileId, long phone) throws ProfileNotFoundException;
	public Profile updatePassword(int profileId, String password) throws ProfileNotFoundException;
	public String deleteProfile();
	public Contact addContact(int profileId, Contact contact);
	public Contact updateContactName(int contactId, String contactName) throws ContactNotFoundException;
	public Contact updateContactPhone(int contactId, long phone) throws ContactNotFoundException;
	public ArrayList<Contact> getAll(int profileId) throws ContactNotFoundException;
	public String deleteContact(int contactId) throws ContactNotFoundException;
	
}