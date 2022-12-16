package com.classes.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.classes.DTO.Pedido;
import com.classes.Conexao.Conexao;

public class PedidoDAO {

    final String NOMEDATABELA = "pedido";
    public boolean inserir(Pedido pedido) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (pessoa_codigo,codProduto,entrada,data)  VALUES (?,?,?,?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, pedido.getPessoaCod());
            ps.setInt(2, pedido.getCodProduto());
            ps.setBoolean(3, pedido.isEntrada());
            ps.setDate(4, (Date) pedido.getData());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean alterar(Pedido pedido) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "UPDATE " + NOMEDATABELA + " SET codProduto = ?,entrada = ? WHERE codigo = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, pedido.getCodProduto());
            ps.setBoolean(2, pedido.isEntrada());
            ps.setInt(3, pedido.getCodigo());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    public boolean excluir(Pedido pedido) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE codigo = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, pedido.getCodigo());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    public Pedido procurarPorCodigo(Pedido pedido) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE codigo = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, pedido.getCodigo());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Pedido obj = new Pedido();
                obj.setCodigo(rs.getInt(1));
                obj.setPessoaCod(rs.getInt(2));
                obj.setCodProduto(rs.getInt(3));
                obj.setEntrada(rs.getBoolean(4));
                obj.setData(rs.getDate(5));
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
    public Pedido procurarPorCodProduto(Pedido pedido) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE codProduto = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, pedido.getCodProduto());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Pedido obj = new Pedido();
                obj.setCodigo(rs.getInt(1));
                obj.setPessoaCod(rs.getInt(2));
                obj.setCodProduto(rs.getInt(3));
                obj.setEntrada(rs.getBoolean(4));
                obj.setData(rs.getDate(5));
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
            return null;
        }
    }
    public boolean existe(Pedido pedido) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE codigo = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, pedido.getCodigo());
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
    public List<Pedido> pesquisarTodos() {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Pedido> listObj = montarLista(rs);
            return listObj;
        } catch (Exception e) {
//            System.err.println("Erro: " + e.toString());
//            e.printStackTrace();
        	  return null;
        }
    }
    public List<Pedido> montarLista(ResultSet rs) {
        List<Pedido> listObj = new ArrayList<Pedido>();
        try {
            while (rs.next()) {
                Pedido obj = new Pedido();
                obj.setCodigo(rs.getInt(1));
                obj.setPessoaCod(rs.getInt(2));
                obj.setCodProduto(rs.getInt(3));
                obj.setEntrada(rs.getBoolean(4));
                obj.setData(rs.getDate(5));
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