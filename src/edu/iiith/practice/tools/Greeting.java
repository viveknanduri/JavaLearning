package edu.iiith.practice.tools;

public class Greeting {
	
	private String message;
	
	public Greeting(String msg) {
		this.message = msg;
	}
	
	public void greet() {
		System.out.println(message);
	}
}
