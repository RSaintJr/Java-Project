package com.classes.BO;

import com.classes.DTO.Pedido;
import com.classes.DAO.PedidoDAO;
import java.util.List;

public class PedidoBO {

    public boolean inserir(Pedido pedido){
        if (existe(pedido) != true) {
            PedidoDAO pedidoDAO = new PedidoDAO();
            return pedidoDAO.inserir(pedido);
        }
        return false;
    }
    public boolean alterar(Pedido pedido){
        PedidoDAO pedidoDAO = new PedidoDAO();
        return pedidoDAO.alterar(pedido);
    }
    public boolean excluir(Pedido pedido){
        PedidoDAO pedidoDAO = new PedidoDAO();
        return pedidoDAO.excluir(pedido);
    }
    public Pedido procurarPorCodigo(Pedido pedido){
        PedidoDAO pedidoDAO = new PedidoDAO();
        return pedidoDAO.procurarPorCodigo(pedido);
    }
    public Pedido procurarPorNome(Pedido pedido){
        PedidoDAO pedidoDAO = new PedidoDAO();
        return pedidoDAO.procurarPorNome(pedido);
    }
    public boolean existe(Pedido pedido){
        PedidoDAO pedidoDAO = new PedidoDAO();
        return pedidoDAO.existe(pedido);
    }
    public List<Pedido> pesquisarTodos(){
        PedidoDAO pedidoDAO = new PedidoDAO();
        return pedidoDAO.pesquisarTodos();
    }
}