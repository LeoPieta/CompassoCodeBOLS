package br.com.alura;


import java.util.Scanner;

import com.github.gilbertotorrezan.viacep.se.ViaCEPClient;
import com.github.gilbertotorrezan.viacep.shared.ViaCEPEndereco;

public class CEP {
	public static void main(String[] args) {
	ViaCEPClient cliente = new ViaCEPClient();
	Scanner scanner = new Scanner(System.in);
	try {
		ViaCEPEndereco endereco = cliente.getEndereco(scanner.nextLine());
		System.out.println(endereco.getLogradouro());
	} catch(Exception e) {
		e.printStackTrace();
	}
	}
	}
