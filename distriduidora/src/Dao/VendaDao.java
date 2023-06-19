/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;
import Dao.Conexao;
import Model.Venda;
import java.sql.*;

/**
 *
 * @author Maicon Virgens
 */
public class VendaDao {
     
    private static final String URL = "jdbc:mysql://localhost:3306/distribuidora";
    private static final String USUARIO = "root";
    private static final String SENHA = "";
    //private ArrayList<String> cars = new ArrayList<String>();

    private Connection conexao;

    public VendaDao() {
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
   
     //CADASTRAR UMA VENDA;
    public int cadastrarVenda(Venda venda){
        int idVenda = 0;

        try {
           String query = "INSERT INTO venda (id_cliente, valor_total) VALUES (?, ?)";
           PreparedStatement preparedStatement = conexao.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
           preparedStatement.setInt(1, venda.getId_cliente_fk());
           preparedStatement.setDouble(2, venda.getValor_total());
           
           preparedStatement.executeUpdate();
           
            // Obter o ID cadastrado
         ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
         if (generatedKeys.next()) {
             idVenda = generatedKeys.getInt(1);
         }

         // Fechar recursos
         generatedKeys.close();
         preparedStatement.close();

       } catch (SQLException e) {
           e.printStackTrace();
       }
        return idVenda;
    }
   

}
