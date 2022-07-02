package com.berryStudio.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.berryStudio.connector.ConnectionCreator;
import com.berryStudio.constants.SQLConstants;

public class InsertController {
	private String sql = SQLConstants.INSERT_ROW;
	private String firstName;
	private String lastName;
	private String procedureType;
	private String date;
	private String time;

	public void insertRow() {
		try (Connection connection = ConnectionCreator.createConnection();
				PreparedStatement statement = connection.prepareStatement(sql)) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Введите имя клиента:");
			firstName = scanner.next();
			statement.setString(1, firstName);
			System.out.println("Введите фамилию клиента:");
			lastName = scanner.next();
			statement.setString(2, lastName);
			System.out.println("Введите название процедуры:");
			procedureType = scanner.next();
			statement.setString(3, procedureType);
			System.out.println("Введите дату записи:");
			date = scanner.next();
			statement.setString(4, date);
			System.out.println("Введите время записи:");
			time = scanner.next();
			statement.setString(5, time);
			statement.executeUpdate();
			System.out.println("Запись добавлена");
		} catch (SQLException e) {
			e.printStackTrace();
		};
	}
}
