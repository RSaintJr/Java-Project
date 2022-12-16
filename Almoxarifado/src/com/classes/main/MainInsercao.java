package com.classes.main;

import java.sql.Date;

import com.classes.BO.*;
import com.classes.DTO.*;

public class MainInsercao {
	public static void main(String[] args) {
		Date data = new Date(System.currentTimeMillis());
		// Teste Inserir
		
		// Pessoa
		
		
		PessoaBO pessoaBO = new PessoaBO();
		Pessoa pessoa = new Pessoa("Agenla","895.634.562-95",40028922);
		if (pessoaBO.inserir(pessoa))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		pessoa = new Pessoa("Rodney","488.874.484-44",656165897);
		if (pessoaBO.inserir(pessoa))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		pessoa = new Pessoa("Fran Bow","748.896.575-89",81676217);
		if (pessoaBO.inserir(pessoa))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		
		// Pedido
		
		PedidoBO pedidoBO = new PedidoBO();
		Pedido pedido = new Pedido(1,4,true,data);
		if (pedidoBO.inserir(pedido))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		pedido = new Pedido(2,7,false,data);
		if (pedidoBO.inserir(pedido))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		pedido = new Pedido(3,2,false,data);
		if (pedidoBO.inserir(pedido))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		
		
		// Local
		
		LocalBO localBO = new LocalBO();
		Local local = new Local("Produtos de uso Doméstico");
		if (localBO.inserir(local))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		local = new Local("Agrícola");
		if (localBO.inserir(local))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		
		// Estoque
		
		EstoqueBO estoqueBO = new EstoqueBO();
		Estoque estoque = new Estoque(1,4,0,0);
		if (estoqueBO.inserir(estoque))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		estoque = new Estoque(1,7,0,0);
		if (estoqueBO.inserir(estoque))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		estoque = new Estoque(2,0,0,15);
		if (estoqueBO.inserir(estoque))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
	}
}