package br.com.alura.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conex�o {
	Connection connection = null;
	public void AbrirConex�o() throws SQLException {
		System.out.println("Abrindo conex�o...");
		connection = DriverManager.getConnection
				("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC", "root", "leoannaleo22");	
	}
	public Connection getConnection() {
		return connection;
		
	}
	
	public void FecharConex�o() throws SQLException {
		System.out.println("Fechando a conex�o...");
		connection.close();
	}
}
