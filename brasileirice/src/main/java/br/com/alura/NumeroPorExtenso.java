package br.com.alura;

import java.math.BigDecimal;
import java.util.Scanner;

import br.com.caelum.stella.inwords.FormatoDeReal;
//import br.com.caelum.stella.inwords.InteiroSemFormato;
import br.com.caelum.stella.inwords.NumericToWordsConverter;

public class NumeroPorExtenso {
	public static void main(String[] args) {
		try {
		NumericToWordsConverter conversor = new NumericToWordsConverter(new FormatoDeReal());
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um valor e o sistema retornara o valor por extenso: ");
		BigDecimal valor = new BigDecimal(scanner.nextDouble());  //utilizado no lugar do double, por conta de sua precisão
		System.out.println(conversor.toWords(valor.doubleValue()));
		}
		catch(Exception e){System.out.println("Erro Encontrado :" + e );}
		
	}
}
