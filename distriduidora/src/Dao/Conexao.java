/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;
import Model.Cliente;
import Model.Produto;
import Model.Usuario;
import Model.Produto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.Date;

/**
 *
 * @author Maicon Virgens
 */
public class Conexao {
    
    //private Produto produto;
    
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ArrayList<Produto> produtos = new ArrayList<>();
   
    
    private static final String URL = "jdbc:mysql://localhost:3306/distribuidora";
    private static final String USUARIO = "root";
    private static final String SENHA = "";
    //private ArrayList<String> cars = new ArrayList<String>();

    private Connection conexao;

    public Conexao() {
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
    
     //USUARIO ADICIONAR
    public int adicionarUsuario(Usuario usuario){
        int result = 0;

        try {
           String query = "INSERT INTO usuario (nome, email, senha) VALUES (?, ?, ?)";
           PreparedStatement preparedStatement = conexao.prepareStatement(query);
           preparedStatement.setString(1, usuario.getNome());
           preparedStatement.setString(2, usuario.getEmail());
           preparedStatement.setString(3, usuario.getSenha());
           
           result = preparedStatement.executeUpdate();

       } catch (SQLException e) {
           e.printStackTrace();
       }
        return result;
    }
    
    //USUARIO LISTAR 
     public List<Usuario> listarUsuarios() throws SQLException {
        List<Usuario> usuarios = new ArrayList<>();
        String query = "SELECT * FROM usuario"; // Query SQL para buscar os usuários
        
        try {
            PreparedStatement statement = conexao.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {
                 
                int id = resultSet.getInt("id_usuario");
                String nome = resultSet.getString("nome");
                String email = resultSet.getString("email");
                String senha = resultSet.getString("senha");
                Date data_cadastro = resultSet.getDate("data_cadastro");
                
                
                //Criar um objeto Usuario e adicioná-lo à lista
                Usuario usuario = new Usuario(id, nome, email ,data_cadastro);
                usuarios.add(usuario);
              
            }

       } catch (SQLException e) {
           e.printStackTrace();
       }
 
        return usuarios;
    }
     
     //USUARIO ALTERAR
     public void AlterarUsuario(String id_usuario, String nome, String email){
         
         String query = "UPDATE usuario SET nome = ?, email = ? WHERE id_usuario = ?";

        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(query);
            
            preparedStatement.setString(1, nome);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, id_usuario);

            int linhasAfetadas = preparedStatement.executeUpdate();

            System.out.println("Usuário atualizado com sucesso. Linhas afetadas: " + linhasAfetadas);
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar usuário: " + e.getMessage());
        }
 
     }
     
     //USUARIO  EXCLUIR
     public void excluirUsuario(String id_usuario) {
        String query = "DELETE FROM usuario WHERE id_usuario = ?";

        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(query);
            preparedStatement.setString(1, id_usuario);

            int linhasAfetadas = preparedStatement.executeUpdate();

            System.out.println("Usuário excluído com sucesso. Linhas afetadas: " + linhasAfetadas);
        } catch (SQLException e) {
            System.out.println("Erro ao excluir usuário: " + e.getMessage());
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
     public int AlterarProduto(int id_Produto, String nome, int quantidade, double preco){
         
         System.out.println("id: " + id_Produto);
         System.out.println("nome: " + nome);
         System.out.println("quan: " + quantidade);
         System.out.println("preco: " + preco);
         
        int result = 0;
         
         String query = "UPDATE produto SET nome = ?, quantidade = ?, preco = ? WHERE id_produto = ?";

        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(query);
            
            preparedStatement.setString(1, nome);
            preparedStatement.setInt(2, quantidade);
            preparedStatement.setDouble(3, preco);
            preparedStatement.setInt(4, id_Produto);

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