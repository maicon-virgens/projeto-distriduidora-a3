/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Cliente;
import Dao.Conexao;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Maicon Virgens
 */
public class ClienteController {
    
     private Conexao conexao;

    public ClienteController() {
        conexao = new Conexao();
    }
    
     public int  adicionarCliente(String nome, String cnpj, String telefone, String endereco, String email){
        
        Cliente cliente = new Cliente();
        int result = 0;
        
        
        cliente.setNome(nome);
        cliente.setCnpj(cnpj);
        cliente.setTelefone(telefone);
        cliente.setEndereco(endereco);
        cliente.setEmail(email);
        
        
        result = conexao.adicionarCliente(cliente);

        return result;
    }
     
    public List<Cliente> listarClientes() throws SQLException{  
        return conexao.listarCliente();
    }
    
     public int alterarCliente(int  idCliente, String nome, String cnpj, String telefone, String endereco, String email){

      return conexao.AlterarCliente(idCliente, nome, cnpj, telefone, endereco, email);

    }
     
      public void deletarCliente(int id_cliente){
       conexao.excluirCliente(id_cliente);
   }
     
     
}
