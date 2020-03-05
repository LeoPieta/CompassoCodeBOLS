package br.com.alura.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexão {
	Connection connection = null;
	public void AbrirConexão() throws SQLException {
		System.out.println("Abrindo conexão...");
		connection = DriverManager.getConnection
				("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC", "root", "leoannaleo22");	
	}
	public Connection getConnection() {
		return connection;
		
	}
	
	public void FecharConexão() throws SQLException {
		System.out.println("Fechando a conexão...");
		connection.close();
	}
}
