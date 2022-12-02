package com.classes.BO;

import java.util.List;

import com.classes.DAO.LocalDAO;
import com.classes.DTO.Local;

class LocalBO {
	
    public boolean inserir(Local local){
        if (existe(local) != true) {
            LocalDAO localDAO = new LocalDAO();
            return localDAO.inserir(local);
        }
        return false;
    }
    public boolean alterar(Local local){
        LocalDAO localDAO = new LocalDAO();
        return localDAO.alterar(local);
    }
    public boolean excluir(Local local){
        LocalDAO localDAO = new LocalDAO();
        return localDAO.excluir(local);
    }
    public Local procurarPorCodigo(Local local){
        LocalDAO localDAO = new LocalDAO();
        return localDAO.procurarPorCodigo(local);
    }
    public boolean existe(Local local){
        LocalDAO localDAO = new LocalDAO();
        return localDAO.existe(local);
    }
    public List<Local> pesquisarTodos(){
        LocalDAO localDAO = new LocalDAO();
        return localDAO.pesquisarTodos();
    }

}
