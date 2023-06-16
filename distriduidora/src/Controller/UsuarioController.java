 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Usuario;
//import Dao.UsuarioDao;
import Dao.Conexao;

//import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author Maicon Virgens
 */
public class UsuarioController {
  // private UsuarioDao usuarioDao;
    
   private Conexao conexao;
   
   public UsuarioController(){
       //usuarioDao = new UsuarioDao();
       
       
       conexao = new Conexao();
   }
   
   public int adicionarUsuario(String name, String email, String senha){
     
        int result = 0;
        Usuario usuario = new Usuario();
        usuario.setNome(name);
        usuario.setEmail(email);
        usuario.setSenha(senha);
        result = conexao.adicionarUsuario(usuario);

        return result;
       
   }
   
   public List<Usuario> listarUsuarios() throws SQLException{  
       return conexao.listarUsuarios(); 
   }
   
   public void alterarUsuario(String idUsuario, String nome, String email){
       
       conexao.AlterarUsuario(idUsuario, nome, email);
       
   }
   
   public void deletarUsuario(String id_usuario){
       conexao.excluirUsuario(id_usuario);
   }
    
}
