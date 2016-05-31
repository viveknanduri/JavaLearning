package edu.iiith.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import edu.iiith.practice.apps.User;
import edu.iiith.practice.apps.UserDB;

public class TestDriver {
	public static void main(String[] args) {
		UserDB students = new UserDB("Students");
		
		System.out.println("Please add users (name, email). Type 'exit!' when finished");

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			while (true) {
				String line = reader.readLine();
				if (line.equals("exit!")) {
					break;
				}
				String[] data = line.split(",");
				students.addUser(new User(data[0], data[1]));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		students.printDB();
	}
}
