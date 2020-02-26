package br.com.alura;

import java.util.Scanner;

import br.com.caelum.stella.format.CNPJFormatter;
import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.format.TituloEleitoralFormatter;

public class FormatadorDocumento {
		public static void main(String[] args) {
			/**
			 * digitação de cpf, cnpj e titulo de eleitor.
			 */
			Scanner scanner = new Scanner(System.in);
			System.out.println("digite um cpf:");
			String cpf = scanner.nextLine();
			System.out.println("digite um CNPJ:");
			String cnpj = scanner.nextLine();
			System.out.println("digite um Titulo de Eleitor:");
			String tituloEleitor = scanner.nextLine();
			
			/**
			 * Formatação de cpf, cnpj e titulo de eleitor
			 */
			CPFFormatter FormatadorCPF = new CPFFormatter();
			String cpfSemFormatacao = FormatadorCPF.unformat(cpf);
			
			CNPJFormatter FormatadorCNPJ = new CNPJFormatter();
			String cnpjSemFormatacao = FormatadorCNPJ.unformat(cnpj);
			
			TituloEleitoralFormatter FormatadorTitulo = new TituloEleitoralFormatter();
			String tituloComFormatacao = FormatadorTitulo.format(tituloEleitor);
			
			System.out.println("CPF sem formatação: "+ cpfSemFormatacao);
			System.out.println("CNPJ sem formatação: "+ cnpjSemFormatacao);
			System.out.println("Titulo com formatação: "+ tituloComFormatacao);
			
			
		}
}
