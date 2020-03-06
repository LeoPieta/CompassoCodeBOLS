package br.com.alura.JDBC;

import java.sql.*;
import java.util.Scanner;


public class TestaInsercaoComParametro {	
	public static void main(String[] args) throws SQLException {
		Conexão conexão = new Conexão();
		conexão.AbrirConexão();
		Scanner scanner = new Scanner(System.in);
		conexão.getConnection().setAutoCommit(false);
		try{
			PreparedStatement stm = conexão.getConnection()
				.prepareStatement("INSERT INTO PRODUTO (nome, descricao) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS);
		
		int i=0;
		while(i!=1) {
		System.out.println("Digite o nome e a descricao do produto que sera inserido no sistema.");
		AdicionarVariavel(scanner.next(), scanner.next(), stm);
		System.out.println("Deseja inserir mais um item ao sistema? Caso sim digite 0, caso contrario digite 1");
		i=scanner.nextInt();
		}
		conexão.getConnection().commit();
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("ROLLBACK EXECUTADO");
			conexão.getConnection().rollback();
		}
		conexão.FecharConexão();
		scanner.close();
	}

	private static void AdicionarVariavel(String nome, String descricao, PreparedStatement stm) throws SQLException {
		stm.setString(1, nome);
		stm.setString(2, descricao);
		stm.execute();
		
		ResultSet rst = stm.getGeneratedKeys();
		while(rst.next()) {
			int id = rst.getInt(1);
			System.out.println("O ID criado foi : " + id);
		
		}
	}
}