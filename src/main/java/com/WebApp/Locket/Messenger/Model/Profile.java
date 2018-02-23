package com.WebApp.Locket.Messenger.Model;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Profile {
	
	private long Id;
	private String ProfileName;
	private String FirstName;
	private String LastName;
	private Date created;
	
	
	public Profile(long id, String profileName, String firstName, String lastName) {
		super();
		this.Id = id;
		this.ProfileName = profileName;
		this.FirstName = firstName;
		this.LastName = lastName;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		this.Id = id;
	}
	public String getProfileName() {
		return ProfileName;
	}
	public void setProfileName(String profileName) {
		this.ProfileName = profileName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		this.LastName = lastName;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
    
	
}

