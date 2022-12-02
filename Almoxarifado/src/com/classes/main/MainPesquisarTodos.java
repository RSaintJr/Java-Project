package com.classes.main;

import java.util.ArrayList;
import java.util.List;
import com.classes.BO.PedidoBO;
import com.classes.DTO.Pedido;

public class MainPesquisarTodos {

	public static void main(String[] args) {
		
		// Teste Pesquisar Todos (Retorna a Lista de Marcas)
		PedidoBO pedidoBO = new PedidoBO();
		List<Pedido> lista = new ArrayList<Pedido>();
		lista = pedidoBO.pesquisarTodos();	
		for (Pedido pedido : lista) {
			System.out.println(pedido.toString());
		}
	
	}
}