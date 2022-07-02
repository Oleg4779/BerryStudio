package com.berryStudio.controllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.berryStudio.connector.ConnectionCreator;
import com.berryStudio.constants.SQLConstants;
import com.berryStudio.objects.Client;

public class ShowAllController {
	ArrayList<Client> clients = new ArrayList<>();
	private int id;
	private String firstName;
	private String lastName;
	private String procedureType;
	private String date;
	private String time;
	
	private String sql = SQLConstants.SHOW_ALL;
	
	public void showAllRows() {
		try(Connection connection = ConnectionCreator.createConnection();
				Statement statement = connection.createStatement()) {
			ResultSet resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				id = resultSet.getInt(1);
				firstName = resultSet.getString(2);
				lastName = resultSet.getString(3);
				procedureType = resultSet.getString(4);
				date = resultSet.getString(5);
				time = resultSet.getString(6);
				clients.add(new Client(id, firstName, lastName, procedureType, date, time));
			}
			
			for(Client client : clients) {
				System.out.println(client.toString());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
