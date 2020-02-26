package br.com.alura;

//import java.math.BigDecimal;
import java.util.Scanner;

import br.com.caelum.stella.inwords.InteiroSemFormato;
import br.com.caelum.stella.inwords.NumericToWordsConverter;

public class NumeroPorExtenso {
	public static void main(String[] args) {
		try {
		NumericToWordsConverter conversor = new NumericToWordsConverter(new InteiroSemFormato());
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um numero e o sistema retornara o valor por extenso: ");
		System.out.println(conversor.toWords(scanner.nextDouble()));
		
//		BigDecimal valor = new BigDecimal(scanner.nextDouble());  // metodo utilizado no video da alura
//		System.out.println(conversor.toWords(valor.doubleValue()));
		}
		catch(Exception e){System.out.println("Erro Encontrado :" + e );}
		
	}
}
