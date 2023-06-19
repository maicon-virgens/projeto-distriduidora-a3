/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.Cliente;
import Model.Produto;
import Model.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maicon Virgens
 */
public class ProdutoDoa {
        //private Produto produto;
    
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ArrayList<Produto> produtos = new ArrayList<>();
    private ArrayList<Cliente> cliente = new ArrayList<>();
   
    
    private static final String URL = "jdbc:mysql://localhost:3306/distribuidora";
    private static final String USUARIO = "root";
    private static final String SENHA = "";
    //private ArrayList<String> cars = new ArrayList<String>();

    private Connection conexao;

    public ProdutoDoa() {
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
    
    
     
    //PRODUTO ADICIONAR
    public int adicionarProduto(Produto produto){
        int result = 0;

        try {
           String query = "INSERT INTO produto (nome, quantidade, preco) VALUES (?, ?, ?)";
           PreparedStatement preparedStatement = conexao.prepareStatement(query);
           preparedStatement.setString(1, produto.getNome());
           preparedStatement.setInt(2, produto.getQuantidade());
           preparedStatement.setDouble(3, produto.getPreco());
           
           result = preparedStatement.executeUpdate();

       } catch (SQLException e) {
           e.printStackTrace();
       }
        return result;
    }
    
    // -----------------------------------------------------------------------------
    
     //PRODUTOS LISTAR 
     public List<Produto> listarProduto() throws SQLException {
        List<Produto> produtos = new ArrayList<>();
        String query = "SELECT * FROM produto"; // 
        
        try {
            PreparedStatement statement = conexao.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {
                 
                int id = resultSet.getInt("id_produto");
                String nome = resultSet.getString("nome");
                int quantidade = resultSet.getInt("quantidade");
                double preco = resultSet.getDouble("preco");
                
                
                //Criar um objeto Usuario e adicioná-lo à lista
          
                Produto produto = new Produto(id, nome, quantidade, preco);
                        
              
                produtos.add(produto);
              
            }

       } catch (SQLException e) {
           e.printStackTrace();
       }
 
        return produtos;
    }
     
         //USUARIO ALTERAR
     public int AlterarProduto(Produto produto){

         
        int result = 0;
         
         String query = "UPDATE produto SET nome = ?, quantidade = ?, preco = ? WHERE id_produto = ?";

        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(query);
            
            preparedStatement.setString(1, produto.getNome());
            preparedStatement.setInt(2, produto.getQuantidade());
            preparedStatement.setDouble(3, produto.getPreco());
            preparedStatement.setInt(4, produto.getId_produto());

            result = preparedStatement.executeUpdate();

            
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar Produto: " + e.getMessage());
        }
        
        return result;
 
     }
     
    public void excluirProduto(int id_produto) {
        String query = "DELETE FROM produto WHERE id_produto = ?";

        try {
           PreparedStatement preparedStatement = conexao.prepareStatement(query);
           preparedStatement.setInt(1, id_produto);

           preparedStatement.executeUpdate();

          // System.out.println("Usuário excluído com sucesso. Linhas afetadas: " + linhasAfetadas);
        } catch (SQLException e) {
           System.out.println("Erro ao excluir Produto: " + e.getMessage());
        }
    }
    
    
}
