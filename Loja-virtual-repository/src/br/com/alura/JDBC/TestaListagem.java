package br.com.alura.JDBC;
import java.sql.*;


public class TestaListagem {
	public static void main(String[] args) throws SQLException {
		
		Conexão conexão = new Conexão();
		conexão.AbrirConexão();
		
		Statement stm = conexão.getConnection().createStatement();
		boolean resultado = stm.execute("SELECT ID, NOME, DESCRICAO FROM PRODUTO");
		System.out.println(resultado);
		ResultSet rst = stm.getResultSet();
		
		
		while(rst.next()) {
			int id = rst.getInt("ID");
			String nome = rst.getString("NOME");
			String descricao = rst.getString("DESCRICAO");
			System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==--=");
			System.out.println("-=--=-= ID: "+id);
			System.out.println("-=--=-= NOME: "+nome);
			System.out.println("-=--=-= DESCRICAO: "+descricao);
			System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==--=");
		}
		
		
		conexão.FecharConexão();
		
	}
}
