package com.berryStudio.constants;

public class SQLConstants {
	public static final String INSERT_ROW = "INSERT INTO clients(firstname, lastname, procedure_type, date, time) VALUES (?, ?, ?, ?, ?)";
	public static final String SEARCH_ROW = "SELECT * FROM clients WHERE id = ?";
	public static final String SHOW_ALL = "SELECT * FROM clients";
	public static final String SELECT_ROW = "SELECT * FROM clients WHERE id = ?";
	public static final String UPDATE_ROW = "UPDATE clients SET firstname = ?, lastname = ?, procedure_type = ?, date = ?, time = ? WHERE id = ?";
	public static final String DELETE_ROW = "DELETE FROM clients WHERE id = ?";
}
