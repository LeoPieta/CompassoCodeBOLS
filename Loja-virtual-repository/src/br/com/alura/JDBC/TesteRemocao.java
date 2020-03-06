package br.com.alura.JDBC;

import java.sql.*;


public class TesteRemocao {
	public static void main(String[] args) throws SQLException {
		Conex�o conex�o = new Conex�o();
		conex�o.AbrirConex�o();
		
		PreparedStatement stm = conex�o.getConnection().prepareStatement("DELETE FROM PRODUTO WHERE ID > 2");
		stm.execute();
		
		int linhasModificadas = stm.getUpdateCount();
		
		System.out.println("Quantidade de linhas que foram modificadas: "+ linhasModificadas);
		
		conex�o.FecharConex�o();
	}
}
