package br.com.alura.JDBC;
import java.sql.*;
public class TesteConexao {

	public static void main(String[] args) throws SQLException {
		Conexão conexão = new Conexão();
		conexão.AbrirConexão();
		conexão.FecharConexão();
	}

}
