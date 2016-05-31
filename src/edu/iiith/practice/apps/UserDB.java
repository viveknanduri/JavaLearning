package edu.iiith.practice.apps;

public class UserDB {
	private static final int MAX_USERS = 100;
	
	private String name;
	private User[] users;
	private int count;
	
	public UserDB(String name) {
		this.name = name;
		users = new User[MAX_USERS];
	}
	
	public boolean addUser(User user) {
		if(count >= MAX_USERS) {
			return false;
		}
		users[count++] = user;
		return true;
	}
	
	public void printDB() {
		System.out.println(name + " Details\n-----------------");
		for(User user : users) {
			if(user != null) {
				System.out.println(user);
			}
		}
		System.out.println("-----------------\nTotalUsers = " + count + "\n-----------------");
	}

}
