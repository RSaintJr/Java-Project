package com.classes.main;

import com.classes.BO.*;
import com.classes.DTO.*;

public class MainAlteracao {

	public static void main(String[] args) {
			
		// Teste Alterar
		
		// Pedido
		
		PedidoBO pedidoBO = new PedidoBO();
		Pedido pedido = new Pedido(1,9,false);
		pedidoBO.alterar(pedido);
		pedido = pedidoBO.procurarPorCodigo(pedido);
		System.out.println(pedido);
		
		// Pessoa
		
		PessoaBO pessoaBO = new PessoaBO();
		Pessoa pessoa = new Pessoa(1,"Rafael","128.575.675-96",57615637);
		pessoaBO.alterar(pessoa);
		pessoa = pessoaBO.procurarPorCodigo(pessoa);
		System.out.println(pessoa);
		
		// Estoque
		
		EstoqueBO estoqueBO = new EstoqueBO();
		Estoque estoque = new Estoque(1,5,7,9);
		estoqueBO.alterar(estoque);
		estoque = estoqueBO.procurarPorCodigoSetor(estoque);
		System.out.println(estoque);
		
		// Local
		
		LocalBO localBO = new LocalBO();
		Local local = new Local(1,"Frios");
		localBO.alterar(local);
		local = localBO.procurarPorCodigo(local);
		System.out.println(local);
		
	}
}