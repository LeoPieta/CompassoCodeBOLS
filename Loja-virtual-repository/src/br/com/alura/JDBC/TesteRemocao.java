package br.com.alura.JDBC;

import java.sql.SQLException;
import java.sql.Statement;

public class TesteRemocao {
	public static void main(String[] args) throws SQLException {
		Conex�o conex�o = new Conex�o();
		conex�o.AbrirConex�o();
		
		Statement stm = conex�o.getConnection().createStatement();
		stm.execute("DELETE FROM PRODUTO WHERE ID > 2");
		
		int linhasModificadas = stm.getUpdateCount();
		
		System.out.println("Quantidade de linhas que foram modificadas: "+ linhasModificadas);
		
		conex�o.FecharConex�o();
	}
}
