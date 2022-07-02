package com.berryStudio.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.berryStudio.connector.ConnectionCreator;
import com.berryStudio.constants.SQLConstants;

public class EditController {
	private int id;
	private String firstName;
	private String lastName;
	private String procedureType;
	private String date;
	private String time;
	private String sql = SQLConstants.UPDATE_ROW;
	
	public void editRow() {
		System.out.println("�������� ����� ������, ������� �� ������ ��������:");
		
		ShowAllController showAll = new ShowAllController();
		showAll.showAllRows();
		
		try (Connection connection = ConnectionCreator.createConnection();
				PreparedStatement updateRow = connection.prepareStatement(sql)) {
			Scanner scanner = new Scanner(System.in);
			id = scanner.nextInt();
			System.out.println("���� ����� ������.");
			System.out.println("������� ����� ���:");
			firstName = scanner.next();
			System.out.println("������� ����� �������:");
			lastName = scanner.next();
			System.out.println("������� ����� �������� ���������:");
			procedureType = scanner.next();
			System.out.println("������� ����� ����:");
			date = scanner.next();
			System.out.println("������� ����� �����:");
			time = scanner.next();

			updateRow.setString(1, firstName);
			updateRow.setString(2, lastName);
			updateRow.setString(3, procedureType);
			updateRow.setString(4, date);
			updateRow.setString(5, time);
			updateRow.setInt(6, id);
			updateRow.executeUpdate();

			System.out.println("������ ��������");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
