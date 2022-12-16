package com.classes.main;

import com.classes.BO.*;
import com.classes.DTO.*;

public class MainExclusao {

	public static void main(String[] args) {

		// Teste Excluir
		
		// Pedido
		
		PedidoBO pedidoBO = new PedidoBO();
		Pedido pedido = new Pedido(1);
		if (pedidoBO.excluir(pedido))
			System.out.println("Excluido com Sucesso");
		else
			System.out.println("Erro ao Excluir");
		
		// Pessoa
		
		PessoaBO pessoaBO = new PessoaBO();
		Pessoa pessoa = new Pessoa(1);
		if (pessoaBO.excluir(pessoa))
			System.out.println("Excluido com Sucesso");
		else
			System.out.println("Erro ao Excluir");
		
		// Local
		
		LocalBO localBO = new LocalBO();
		Local local = new Local(1);
		if (localBO.excluir(local))
			System.out.println("Excluido com Sucesso");
		else
			System.out.println("Erro ao Excluir");
		
		// Estoque
		
		EstoqueBO estoqueBO = new EstoqueBO();
		Estoque estoque = new Estoque(1);
		if (estoqueBO.excluir(estoque))
			System.out.println("Excluido com Sucesso");
		else
			System.out.println("Erro ao Excluir");

	}
}