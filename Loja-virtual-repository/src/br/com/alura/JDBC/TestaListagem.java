package br.com.alura.JDBC;
import java.sql.*;


public class TestaListagem {
	public static void main(String[] args) throws SQLException {
		
		Conex�o conex�o = new Conex�o();
		conex�o.AbrirConex�o();
		
		PreparedStatement stm = conex�o.getConnection().prepareStatement("SELECT ID, NOME, DESCRICAO FROM PRODUTO");
		boolean resultado = stm.execute();
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
		
		
		conex�o.FecharConex�o();
		
	}
}
