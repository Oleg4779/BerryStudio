package com.berryStudio.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.berryStudio.connector.ConnectionCreator;
import com.berryStudio.constants.SQLConstants;

public class DeleteController {
	private int id;
	private String sql = SQLConstants.DELETE_ROW;

	public void deleteRow() {
		System.out.println("Выберите номер записи, которую вы хотите удалить:");
		
		ShowAllController showAll = new ShowAllController();
		showAll.showAllRows();
		
		try (Connection connection = ConnectionCreator.createConnection();
				PreparedStatement deleteRow = connection.prepareStatement(sql)) {
			Scanner scanner = new Scanner(System.in);
			id = scanner.nextInt();
			
			deleteRow.setInt(1, id);
			deleteRow.executeUpdate();
			System.out.println("Запись удалена");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
