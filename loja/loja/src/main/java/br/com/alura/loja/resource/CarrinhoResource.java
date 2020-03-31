package br.com.alura.loja.resource;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import br.com.alura.loja.dao.CarrinhoDAO;
import br.com.alura.loja.modelo.Carrinho;


@Path("carrinhos")
public class CarrinhoResource {
	
		@GET
		@Produces(MediaType.APPLICATION_XML)
		public String busca() {
			Carrinho carrinho = new CarrinhoDAO().busca(1l);
			return carrinho.toXML();
		}
}
