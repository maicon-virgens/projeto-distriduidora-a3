/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Maicon Virgens
 */
public class VendaItem {
    private int id_venda_cliente;
    private int id_venda_fk;
    private int id_produto_fk;
    private int quantidade;
    private double valor_venda_item;

    public double getValor_venda_item() {
        return valor_venda_item;
    }

    public void setValor_venda_item(double valor_venda_item) {
        this.valor_venda_item = valor_venda_item;
    }

    public int getId_venda_cliente() {
        return id_venda_cliente;
    }

    public void setId_venda_cliente(int id_venda_cliente) {
        this.id_venda_cliente = id_venda_cliente;
    }

    public int getId_venda_fk() {
        return id_venda_fk;
    }

    public void setId_venda_fk(int id_venda_fk) {
        this.id_venda_fk = id_venda_fk;
    }

    public int getId_produto_fk() {
        return id_produto_fk;
    }

    public void setId_produto_fk(int id_produto_fk) {
        this.id_produto_fk = id_produto_fk;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
}
