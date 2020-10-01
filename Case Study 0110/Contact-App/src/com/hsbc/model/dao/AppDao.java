package com.hsbc.model.dao;

import java.util.ArrayList;

import com.hsbc.model.beans.Contact;
import com.hsbc.model.beans.Profile;
import com.hsbc.model.exception.AuthenticationException;
import com.hsbc.model.exception.ContactNotFoundException;
import com.hsbc.model.exception.ProfileNotFoundException;

public interface AppDao {
	public Profile authenticate(int profileId, String password) throws AuthenticationException;
	public Profile storeProfile(Profile profile);
	public Profile getProfile(int profileId) throws ProfileNotFoundException;
	public Profile updateProfile(int profileId, Profile profile) throws ProfileNotFoundException;
	public String deleteProfile();
	public Contact addContact(int profileId, Contact contact);
	public Contact updateContact(int contactId, Contact contact) throws ContactNotFoundException;
	public ArrayList<Contact> fetchAll(int profileId) throws ContactNotFoundException;
	public String deleteContact(int contactId) throws ContactNotFoundException;
	public Contact getContact(int contactId) throws ContactNotFoundException;
}
