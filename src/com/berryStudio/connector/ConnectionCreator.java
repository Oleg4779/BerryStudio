package com.berryStudio.connector;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionCreator {
	private static final Properties properties = new Properties();
	private static final String DATABASE_URL;
	
	static {
		try {
			properties.load(new FileReader("database.properties"));
			String driverName = (String) properties.get("db.driver");
			Class.forName(driverName);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		DATABASE_URL = (String)properties.get("db.url");
	}
	public static Connection createConnection() throws SQLException {
		return DriverManager.getConnection(DATABASE_URL, properties);
	}
}
