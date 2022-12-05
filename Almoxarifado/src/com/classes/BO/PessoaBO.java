package com.classes.BO;

import com.classes.DTO.Pessoa;
import com.classes.DAO.PessoaDAO;
import java.util.List;

public class PessoaBO {

    public boolean inserir(Pessoa pessoa){
        if (existe(pessoa) != true) {
            PessoaDAO pessoaDAO = new PessoaDAO();
            return pessoaDAO.inserir(pessoa);
        }
        return false;
    }
    public boolean alterar(Pessoa pessoa){
        PessoaDAO pessoaDAO = new PessoaDAO();
        return pessoaDAO.alterar(pessoa);
    }
    public boolean excluir(Pessoa pessoa){
        PessoaDAO pessoaDAO = new PessoaDAO();
        return pessoaDAO.excluir(pessoa);
    }
    public Pessoa procurarPorCodigo(Pessoa pessoa){
        PessoaDAO pessoaDAO = new PessoaDAO();
        return pessoaDAO.procurarPorCodigo(pessoa);
    }
    public Pessoa procurarPorNome(Pessoa pessoa){
        PessoaDAO pessoaDAO = new PessoaDAO();
        return pessoaDAO.procurarPorNome(pessoa);
    }
    public boolean existe(Pessoa pessoa){
        PessoaDAO pessoaDAO = new PessoaDAO();
        return pessoaDAO.existe(pessoa);
    }
    public List<Pessoa> pesquisarTodos(){
        PessoaDAO pessoaDAO = new PessoaDAO();
        return pessoaDAO.pesquisarTodos();
    }
}