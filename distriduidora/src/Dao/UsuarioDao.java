/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.Usuario;
import java.util.List;
import java.util.ArrayList;
import java.sql.*;
import Dao.Conexao;
import Model.Cliente;
import Model.Produto;



/**
 *
 * @author Maicon Virgens
 */
public class UsuarioDao extends Conexao{
     
  
   
    //private Produto produto;
    
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ArrayList<Produto> produtos = new ArrayList<>();
    private ArrayList<Cliente> cliente = new ArrayList<>();
   
    
    private static final String URL = "jdbc:mysql://localhost:3306/distribuidora";
    private static final String USUARIO = "root";
    private static final String SENHA = "";
    //private ArrayList<String> cars = new ArrayList<String>();

    private Connection conexao;

    public UsuarioDao() {
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
    
     // -----------------------------------------------------------------------------
    
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
                java.util.Date data_cadastro = resultSet.getDate("data_cadastro");
                
                
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
     public void AlterarUsuario(Usuario usuario){
         
         String query = "UPDATE usuario SET nome = ?, email = ? WHERE id_usuario = ?";

        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(query);
            
            preparedStatement.setString(1, usuario.getNome());
            preparedStatement.setString(2, usuario.getEmail());
            preparedStatement.setInt(3, usuario.getId_usuario());

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
   
  
    
    
}
