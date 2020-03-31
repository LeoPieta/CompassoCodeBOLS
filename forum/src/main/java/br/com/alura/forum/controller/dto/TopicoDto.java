package br.com.alura.forum.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.forum.modelo.Topico;

public class TopicoDto {
	
		private long id;
		private String titulo;
		private String mensagem;
		private LocalDateTime dataCriação;
		public TopicoDto(Topico topico) {
			this.id = topico.getId();
			this.titulo = topico.getTitulo();
			this.mensagem = topico.getMensagem();
			this.dataCriação = topico.getDataCriacao();
		}
		
		
		
		public long getId() {
			return id;
		}
		public String getTitulo() {
			return titulo;
		}
		public String getMensagem() {
			return mensagem;
		}
		public LocalDateTime getDataCriação() {
			return dataCriação;
		}



		public static List<TopicoDto> converter(List<Topico> topicos) {
			return topicos.stream().map(TopicoDto::new).collect(Collectors.toList());
		}

}
