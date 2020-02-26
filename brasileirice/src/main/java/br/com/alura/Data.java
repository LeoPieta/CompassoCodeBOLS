package br.com.alura;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Data {
	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();// cria uma variavel que puxa o dia de hoje
		System.out.println(hoje);

		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // formata a saida da data na tela.
		System.out.println(hoje.format(formatador));

		LocalDateTime agora = LocalDateTime.now(); // cria uma variavel que puxa a data, hora, minuto , segundo ....
		System.out.println(agora);

		DateTimeFormatter formatadorHora = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm"); // formata saida da data
																							// junto com a hora
		System.out.println(agora.format(formatadorHora));

		DateTimeFormatter formatadorCurto = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);// -->
		// formataçao pronta com opcão de SHORT ou MEDIUM para saida da data com hora
		System.out.println(agora.format(formatadorCurto));

		DateTimeFormatter formatadorCanadian = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
				.withLocale(Locale.CANADA);
		// formatador de data e hora para o pais: Canada
		System.out.println(agora.format(formatadorCanadian));

		System.out.println(agora.minusHours(5).format(formatadorCurto));// Diminui 5 horas

		System.out.println(agora.plusHours(10).format(formatadorCurto));// Aumenta 10 horas
	}
}
