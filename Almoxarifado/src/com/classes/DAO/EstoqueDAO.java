package com.classes.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.classes.DTO.Estoque;
import com.classes.Conexao.Conexao;

public class EstoqueDAO {

    final String NOMEDATABELA = "estoque";
    public boolean inserir(Estoque estoque) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (codigo_setor,produto,ferramenta,componente)  VALUES (?,?,?,?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, estoque.getCodSetor());
            ps.setInt(2, estoque.getProduto());
            ps.setInt(3, estoque.getFerramentas());
            ps.setInt(4, estoque.getComponentes());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean alterar(Estoque estoque) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "UPDATE " + NOMEDATABELA + " SET produto = ?,ferramenta = ?,componente = ? WHERE codigo_setor = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, estoque.getProduto());
            ps.setInt(2, estoque.getFerramentas());
            ps.setInt(3, estoque.getComponentes());
            ps.setInt(4, estoque.getCodSetor());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    public boolean excluir(Estoque estoque) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE setor = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, estoque.getSetor());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    public Estoque procurarPorCodigoSetor(Estoque estoque) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE codigo_setor = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, estoque.getCodSetor());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
            	Estoque obj = new Estoque();
            	obj.setCodSetor(rs.getInt(1));
                obj.setProduto(rs.getInt(2));
                obj.setFerramentas(rs.getInt(3));
                obj.setComponentes(rs.getInt(4));
                ps.close();
                rs.close();
                conn.close();
                return obj;
            } else {
                ps.close();
                rs.close();
                conn.close();
                return null;
            }
        } catch (Exception e) {
        	 e.printStackTrace();
             return null;
        }
    }
    
    public boolean existe(Estoque estoque) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE codigo_setor = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, estoque.getCodSetor());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ps.close();
                rs.close();
                conn.close();
                return true;
            }
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return false;
        }
        return false;
    }
    public List<Estoque> pesquisarTodos() {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Estoque> listObj = montarLista(rs);
            return listObj;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }
    public List<Estoque> montarLista(ResultSet rs) {
        List<Estoque> listObj = new ArrayList<Estoque>();
        try {
            while (rs.next()) {
                Estoque obj = new Estoque();
                obj.setSetor(rs.getString(1));
                obj.setProduto(rs.getInt(2));
                obj.setFerramentas(rs.getInt(3));
                obj.setComponentes(rs.getInt(4));
                
                listObj.add(obj);
            }
            return listObj;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }
}