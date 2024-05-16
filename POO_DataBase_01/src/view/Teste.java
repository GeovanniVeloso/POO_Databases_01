package view;

import java.sql.Connection;
import java.sql.SQLException;

import persistence.GenericDaoMySQL;

public class Teste {

	public static void main(String[] args) {
		GenericDaoMySQL gDaoMySQL = new GenericDaoMySQL();
		
		try {
			Connection c = gDaoMySQL.getConnection();
			String sgbd = c.getMetaData().getDatabaseProductName();
			System.out.println(sgbd);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
