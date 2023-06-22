/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Dao.ClienteDao;
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
    
    public int  adicionarCliente(Cliente cliente){

        int result = 0;

        ClienteDao clienteDoa = new ClienteDao();

        result = clienteDoa.adicionarCliente(cliente);

        return result;
    }
     
    public List<Cliente> listarClientes() throws SQLException{  
        ClienteDao clienteDoa = new ClienteDao();
        return clienteDoa.listarCliente();
    }
    
     public int alterarCliente(Cliente cliente){
         
        ClienteDao clienteDoa = new ClienteDao();
        
        return clienteDoa.AlterarCliente(cliente);

    }
     
    public void deletarCliente(int id_cliente){
        
        ClienteDao clienteDoa = new ClienteDao();
        
        clienteDoa.excluirCliente(id_cliente);
   }
     
     
}
