/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Dao.Conexao;
import Model.Produto;
import java.sql.SQLException;
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
    
    
    
    public int  adicionarProduto(String nome, int quantidade, double preco){
        
        Produto produto = new Produto();
        int result = 0;
        
        produto.setNome(nome);
        produto.setQuantidade(quantidade);
        produto.setPreco(preco);
        
        result = conexao.adicionarProduto(produto);

        return result;
    }
    
    public List<Produto> listarProdutos() throws SQLException{  
       return conexao.listarProduto();
    }
    
    public int alterarProduto(int  idProduto, String nome, int quantidade, double preco){

      return conexao.AlterarProduto(idProduto, nome, quantidade, preco);

    }
    
     public void deletarProduto(int id_produto){
       conexao.excluirProduto(id_produto);
   }

   
    
    
    
}
