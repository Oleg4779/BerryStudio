package com.berryStudio.objects;

public class Client {
	private final int id;
	private final String firstName;
	private final String lastName;
	private final String procedureType;
	private final String date;
	private final String time;
	
	public Client(int id, String firstName, String lastName, String procedureType, String date, String time) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.procedureType = procedureType;
		this.date = date;
		this.time = time;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getProcedureType() {
		return procedureType;
	}

	public String getDate() {
		return date;
	}

	public String getTime() {
		return time;
	}
	
	@Override
	public String toString() {
		return id + ". " + firstName + " " + lastName + ", процедура - "
				+ procedureType + ", дата: " + date + ", время: " + time;
	}
}
