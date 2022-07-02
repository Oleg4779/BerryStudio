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
			System.out.println("������� ��� �������:");
			firstName = scanner.next();
			statement.setString(1, firstName);
			System.out.println("������� ������� �������:");
			lastName = scanner.next();
			statement.setString(2, lastName);
			System.out.println("������� �������� ���������:");
			procedureType = scanner.next();
			statement.setString(3, procedureType);
			System.out.println("������� ���� ������:");
			date = scanner.next();
			statement.setString(4, date);
			System.out.println("������� ����� ������:");
			time = scanner.next();
			statement.setString(5, time);
			statement.executeUpdate();
			System.out.println("������ ���������");
		} catch (SQLException e) {
			e.printStackTrace();
		};
	}
}
