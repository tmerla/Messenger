/**
 * 
 */
package com.WebApp.Locket.Messenger.Database;

import java.util.HashMap;
import java.util.Map;

import com.WebApp.Locket.Messenger.Model.Message;
import com.WebApp.Locket.Messenger.Model.Profile;

/**
 * @author tharun
 *
 */
public class DatabaseClass {
	
	private static Map<Long,Message> messages = new HashMap<>();
	private static Map<Long,Profile> profiles = new HashMap<>();
	
	public static Map<Long, Message>getAllMessages(){
		
		return messages;
	}
    public static Map<Long, Profile>getAllProfiles(){
		
		return profiles;
	}

}
