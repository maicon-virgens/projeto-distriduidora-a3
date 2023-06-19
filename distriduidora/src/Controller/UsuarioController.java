 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Usuario;
//import Dao.UsuarioDao;
import Dao.Conexao;
import Dao.UsuarioDao;

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
       
      
   }
   
   public int adicionarUsuario(Usuario usuario){
       
        int result = 0;
        
        UsuarioDao usuarioDao = new UsuarioDao();
      
        result = usuarioDao.adicionarUsuario(usuario);

        return result;
       
   }
   
   public List<Usuario> listarUsuarios() throws SQLException{  
       UsuarioDao usuarioDao = new UsuarioDao();
       return usuarioDao.listarUsuarios(); 
   }
   
   public void alterarUsuario(Usuario usuario){
       UsuarioDao usuarioDao = new UsuarioDao();
       usuarioDao.AlterarUsuario(usuario);
       
   }
   
   public void deletarUsuario(String id_usuario){
       UsuarioDao usuarioDao = new UsuarioDao();
       usuarioDao.excluirUsuario(id_usuario);
   }
    
}
