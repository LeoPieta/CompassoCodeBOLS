package br.com.alura;

import java.util.Scanner;

import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.TituloEleitoralValidator;


public class ValidacaoDocumento {
	
	public static void main(String[] args) {
		int i=1;
		while(i!=0) {
			
		/**
		 * Validador de CPF
		 */
		System.out.println("Digite seu cpf:");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);	//Scaner para a digitação do user.
		String cpf = scanner.nextLine();			// User digita seu CPF
		CPFValidator validador = new CPFValidator();//Cria validador
		
		try {
			validador.assertValid(cpf); // Valida CPF.
			System.out.println("CPF VALIDO!");
		}
		catch(Exception e) {
			System.out.println("CPF INVALIDO : "+ e); // Caso der erro no CPF, é demonstrado o erro.
		}
		
		
		
		/**
		 * Validador de CNPJ.
		 */
		System.out.println("Digite seu CNPJ: (caso não tenha digite N)");
		String cnpj = scanner.nextLine();
		if(cnpj == "N") {}//Teste para saber se o User tem ou não CNPJ
		else {
		
		CNPJValidator validadorCNPJ = new CNPJValidator();
		
		try {
			validadorCNPJ.assertValid(cnpj); // Validaçao do CNPJ
			System.out.println("CNPJ VALIDO!");
		}catch(Exception e){
			System.out.println("CNPJ INVALIDO : " + e);
		}
		}
		
		
		/**
		 * Validador do Titulo de Eleitor.
		 */
		System.out.println("Digite seu titulo de Eleitor: ");
		TituloEleitoralValidator validadorTitulo = new TituloEleitoralValidator();
		String tituloEleitor = scanner.nextLine(); // usuario digita seu titulo de eleitor
		
		
		try {
			validadorTitulo.assertValid(tituloEleitor);
			System.out.println("Titulo Valido!");
		}catch(Exception e){
			System.out.println("Titulo INVAL       IDO : " + e);
		}   
		
		
		
		
		System.out.println("digite 1 para nova consulta e 0 para parar.");
		i = scanner.nextInt();
		}
	}
}
