package com.classes.main;

import com.classes.BO.*;
import com.classes.DTO.*;

public class MainExiste {

	public static void main(String[] args) {

		// Teste Existe
		
		// Pedido
		
		PedidoBO pedidoBO = new PedidoBO();
		Pedido pedido = new Pedido(1);
		if (pedidoBO.existe(pedido))
			System.out.println("Pedido Existe");
		else
			System.out.println("Não Existe");
		
		// Pessoa
		
		PessoaBO pessoaBO = new PessoaBO();
		Pessoa pessoa = new Pessoa(1);
		if (pessoaBO.existe(pessoa))
			System.out.println("Pessoa Existe");
		else
			System.out.println("Não Existe");
		
		// Local
	
		LocalBO localBO = new LocalBO();
		Local local = new Local(1);
		if (localBO.existe(local))
			System.out.println("Setor Existe");
		else
			System.out.println("Nao Existe");
		
		// Estoque
		
		EstoqueBO estoqueBO = new EstoqueBO();
		Estoque estoque = new Estoque(1);
		if (estoqueBO.existe(estoque))
			System.out.println("Produtos Existem");
		else
			System.out.println("Nao Existem");

	}
}