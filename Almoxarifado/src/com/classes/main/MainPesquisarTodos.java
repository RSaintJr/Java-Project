package com.classes.main;

import java.util.ArrayList;
import java.util.List;
import com.classes.BO.*;
import com.classes.DTO.*;

public class MainPesquisarTodos {

	public static void main(String[] args) {
		
		// Teste Pesquisar Todos 
		
		// Pedido
		
		PedidoBO pedidoBO = new PedidoBO();
		List<Pedido> lista = new ArrayList<Pedido>();
		lista = pedidoBO.pesquisarTodos();	
		for (Pedido pedido : lista) {
			System.out.println(pedido.toString());
		}
		
		// Pessoa
		
		PessoaBO pessoaBO = new PessoaBO();
		List<Pessoa> lista_pessoa = new ArrayList<Pessoa>();
		lista_pessoa = pessoaBO.pesquisarTodos();	
		for (Pessoa pessoa : lista_pessoa) {
			System.out.println(pessoa.toString());
		}
		
		// Local
		
		LocalBO localBO = new LocalBO();
		List<Local> lista_local = new ArrayList<Local>();
		lista_local = localBO.pesquisarTodos();	
		for (Local local : lista_local) {
			System.out.println(local.toString());
		}
		
		// Estoque
		
		EstoqueBO estoqueBO = new EstoqueBO();
		List<Estoque> lista_estoque = new ArrayList<Estoque>();
		lista_estoque = estoqueBO.pesquisarTodos();	
		for (Estoque estoque : lista_estoque) {
			System.out.println(estoque.toString());
		}
	}
}