package br.com.alura.JDBC;
import java.sql.*;
public class TesteConexao {

	public static void main(String[] args) throws SQLException {
		Conex�o conex�o = new Conex�o();
		conex�o.AbrirConex�o();
		conex�o.FecharConex�o();
	}

}
