/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Dao.VendaDao;
import Model.Venda;

/**
 *
 * @author Maicon Virgens
 */
public class VendaController {
    
    
    public int cadastrarVenda(Venda vendaDados){
        VendaDao vendaDao = new VendaDao();
        
   
        return vendaDao.cadastrarVenda(vendaDados);
    }
        
    
    
    
    
    
    
    
}
