/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Dao.VendaItemDao;
import Model.VendaItem;
import java.util.ArrayList;

/**
 *
 * @author Maicon Virgens
 */
public class VendaItemController {
    

    public boolean salvarVendaItens(ArrayList<VendaItem> listVendaItens) {
        VendaItemDao vendaitemDoa = new VendaItemDao();
        
        return vendaitemDoa.salvarVendaProdutos(listVendaItens);
        
    }
    
}
