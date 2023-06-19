/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.VendaItem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Maicon Virgens
 */
public class VendaItemDao {
     private static final String URL = "jdbc:mysql://localhost:3306/distribuidora";
    private static final String USUARIO = "root";
    private static final String SENHA = "";
    //private ArrayList<String> cars = new ArrayList<String>();

    private Connection conexao;

    public VendaItemDao() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
            System.out.println("Conexão estabelecida com sucesso!");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver do MySQL não encontrado.");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }

    public Connection getConexao() {
        return conexao;
    }

    public void fecharConexao() {
        try {
            if (conexao != null) {
                conexao.close();
                System.out.println("Conexão fechada com sucesso!");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao fechar conexão com o banco de dados: " + e.getMessage());
        }
    }

    public boolean salvarVendaProdutos(ArrayList<VendaItem> listVendaItens) {
         
        int result;
        try {
           int cont = listVendaItens.size();
           
            for (int i = 0; i < cont; i++) {
               String query = "INSERT INTO venda_produto (id_venda, id_produto, quantidade, valor_venda_item) VALUES (?, ?, ?, ?)";
               PreparedStatement preparedStatement = conexao.prepareStatement(query);
               preparedStatement.setInt(1, listVendaItens.get(i).getId_venda_fk());
               preparedStatement.setInt(2, listVendaItens.get(i).getId_produto_fk());
               preparedStatement.setInt(3, listVendaItens.get(i).getQuantidade());
               preparedStatement.setDouble(4, listVendaItens.get(i).getValor_venda_item());
               result = preparedStatement.executeUpdate();
               
            }
            
            
            
       } catch (SQLException e) {
           e.printStackTrace();
       }
        return true;
       
    }
    
    
    
    
}
