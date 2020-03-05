package br.com.alura.JDBC;

import java.sql.SQLException;
import java.sql.Statement;

public class TesteRemocao {
	public static void main(String[] args) throws SQLException {
		Conexão conexão = new Conexão();
		conexão.AbrirConexão();
		
		Statement stm = conexão.getConnection().createStatement();
		stm.execute("DELETE FROM PRODUTO WHERE ID > 2");
		
		int linhasModificadas = stm.getUpdateCount();
		
		System.out.println("Quantidade de linhas que foram modificadas: "+ linhasModificadas);
		
		conexão.FecharConexão();
	}
}
