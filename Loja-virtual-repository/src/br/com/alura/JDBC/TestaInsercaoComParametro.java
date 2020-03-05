package br.com.alura.JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercaoComParametro {
	public static void main(String[] args) throws SQLException {
		Conexão conexão = new Conexão();
		conexão.AbrirConexão();
		
		Statement stm = conexão.getConnection().createStatement();
		stm.execute("INSERT INTO PRODUTO (nome, descricao) VALUES ('Mouse', 'Mouse sem fio')", Statement.RETURN_GENERATED_KEYS);
		ResultSet rst = stm.getGeneratedKeys();
		while(rst.next()) {
			int id = rst.getInt(1);
			System.out.println("O ID criado foi : " + id);
		}
	}
}