package br.com.alura.JDBC;

import java.sql.*;


public class TesteRemocao {
	public static void main(String[] args) throws SQLException {
		Conexão conexão = new Conexão();
		conexão.AbrirConexão();
		
		PreparedStatement stm = conexão.getConnection().prepareStatement("DELETE FROM PRODUTO WHERE ID > 2");
		stm.execute();
		
		int linhasModificadas = stm.getUpdateCount();
		
		System.out.println("Quantidade de linhas que foram modificadas: "+ linhasModificadas);
		
		conexão.FecharConexão();
	}
}
