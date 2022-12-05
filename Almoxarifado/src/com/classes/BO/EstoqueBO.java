package com.classes.BO;

import com.classes.DTO.Estoque;
import com.classes.DAO.EstoqueDAO;
import java.util.List;

public class EstoqueBO {

    public boolean inserir(Estoque estoque){
        if (existe(estoque) != true) {
            EstoqueDAO estoqueDAO = new EstoqueDAO();
            return estoqueDAO.inserir(estoque);
        }
        return false;
    }
    public boolean alterar(Estoque estoque){
        EstoqueDAO estoqueDAO = new EstoqueDAO();
        return estoqueDAO.alterar(estoque);
    }
    public boolean excluir(Estoque estoque){
        EstoqueDAO estoqueDAO = new EstoqueDAO();
        return estoqueDAO.excluir(estoque);
    }
    public Estoque procurarPorSetor(Estoque estoque){
        EstoqueDAO estoqueDAO = new EstoqueDAO();
        return estoqueDAO.procurarPorSetor(estoque);
    }
    public boolean existe(Estoque estoque){
        EstoqueDAO estoqueDAO = new EstoqueDAO();
        return estoqueDAO.existe(estoque);
    }
    public List<Estoque> pesquisarTodos(){
        EstoqueDAO estoqueDAO = new EstoqueDAO();
        return estoqueDAO.pesquisarTodos();
    }
}