/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Dao.Conexao;
import Dao.ProdutoDoa;
import Model.Produto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Maicon Virgens
 */
public class ProdutoController {
    private Conexao conexao;

   public ProdutoController() {
        conexao = new Conexao();
    }
    
    
    
    public int  adicionarProduto(Produto produto){
        
        ProdutoDoa produtoDao = new ProdutoDoa();
        
        int result = 0;
       
        
        result = produtoDao.adicionarProduto(produto);

        return result;
    }
    
    public List<Produto> listarProdutos() throws SQLException{  
       ProdutoDoa produtoDao = new ProdutoDoa();
       return produtoDao.listarProduto();
    }
    
    public int alterarProduto(Produto produto){
        ProdutoDoa produtoDao = new ProdutoDoa();
        return produtoDao.AlterarProduto(produto);

    }
    
    public void deletarProduto(int id_produto){
        ProdutoDoa produtoDao = new ProdutoDoa();
        produtoDao.excluirProduto(id_produto);
    }
    
    public Produto retornaProduto(int idProduto){
        ProdutoDoa produtoDao = new ProdutoDoa();
        return produtoDao.retornaProduto(idProduto);
    }

    public boolean alterarEstoqueProduto(ArrayList<Produto> listProduto) {
        ProdutoDoa produtoDao = new ProdutoDoa();
        
        return produtoDao.alterarEstoqueProduto(listProduto);
    }

  

   
    
    
    
}
