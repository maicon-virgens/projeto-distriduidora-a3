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
public class ClienteDao {
      //private Produto produto;
    
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ArrayList<Produto> produtos = new ArrayList<>();
    private ArrayList<Cliente> cliente = new ArrayList<>();
   
    
    private static final String URL = "jdbc:mysql://localhost:3306/distribuidora";
    private static final String USUARIO = "root";
    private static final String SENHA = "";
    //private ArrayList<String> cars = new ArrayList<String>();

    private Connection conexao;

    public ClienteDao() {
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
    
    
    
    
    
    
    
    
     //CLIENTE ADICIONAR
    public int adicionarCliente(Cliente cliente){
        int result = 0;

        try {
           String query = "INSERT INTO cliente (nome, cnpj, telefone, endereco, email) VALUES (?, ?, ?, ?, ?)";
           PreparedStatement preparedStatement = conexao.prepareStatement(query);
           
           preparedStatement.setString(1, cliente.getNome());
           preparedStatement.setString(2, cliente.getCnpj());
           preparedStatement.setString(3, cliente.getTelefone());
           preparedStatement.setString(4, cliente.getEndereco());
           preparedStatement.setString(5, cliente.getEmail());
           
           
           result = preparedStatement.executeUpdate();

       } catch (SQLException e) {
           e.printStackTrace();
       }
        return result;
    }
    
        //CLIENTE LISTAR 
     public List<Cliente> listarCliente() throws SQLException {
        List<Cliente> clientes = new ArrayList<>();
        String query = "SELECT * FROM cliente"; // Query SQL para buscar os usuários
        
        try {
            PreparedStatement statement = conexao.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {
                
                //String nome, String cnpj, String telefone, String endereco, String email
                 
                int id = resultSet.getInt("id_cliente");
                String nome = resultSet.getString("nome");
                String cnpj = resultSet.getString("cnpj");
                String telefone = resultSet.getString("telefone");
                String endereco = resultSet.getString("endereco");
                String email = resultSet.getString("email");
                
                
                //Criar um objeto Usuario e adicioná-lo à lista
                Cliente cliente = new Cliente(id, nome, cnpj, telefone, endereco, email);
                clientes.add(cliente);
              
            }

       } catch (SQLException e) {
           e.printStackTrace();
       }
 
        return clientes;
    }
     
           //Clinete ALTERAR
     public int AlterarCliente(Cliente cliente){
         
         
        int result = 0;
         
         String query = "UPDATE cliente SET nome = ?, cnpj = ?, telefone = ?, endereco = ?, email = ? WHERE id_cliente = ?";

        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(query);
            
            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setString(2, cliente.getCnpj());
            preparedStatement.setString(3, cliente.getTelefone());
            preparedStatement.setString(4, cliente.getEndereco());
            preparedStatement.setString(5, cliente.getEmail());
            preparedStatement.setInt(6, cliente.getId_cliente());

            result = preparedStatement.executeUpdate();

            
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar Produto: " + e.getMessage());
        }
        
        return result;
 
     }
     
      //USUARIO  EXCLUIR
     public void excluirCliente(int id_cliente) {
        String query = "DELETE FROM cliente WHERE id_cliente = ?";

        try {
            PreparedStatement preparedStatement = conexao.prepareStatement(query);
            preparedStatement.setInt(1, id_cliente);

            int linhasAfetadas = preparedStatement.executeUpdate();

            System.out.println("Cliente excluído com sucesso. Linhas afetadas: " + linhasAfetadas);
        } catch (SQLException e) {
            System.out.println("Erro ao excluir usuário: " + e.getMessage());
        }
    }
     
    
}
