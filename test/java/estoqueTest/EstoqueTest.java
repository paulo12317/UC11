/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estoqueTest;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author PAULOHENRIQUEVICENTE
 */
public class EstoqueTest {
    private Estoque est;
    
    @BeforeEach
    public void criar(){
        est = new Estoque();
    }
    
    @Test
    public void addProdutoTest(){
        est.adicionarProduto("Pao", 2);
        assertEquals("Pao", est.produtoMaisEstocado(),"Erro");
    }
    
    @Test
    public void testConsultar(){
        est.adicionarProduto("Pao", 2);
        assertEquals(2, est.consultarQuantidade("Pao"),"Erro");
    }
    
    @Test
    public void removerTest(){
        est.adicionarProduto("Pao", 2);
        est.removerProduto("Pao", 1);
        assertEquals(1, est.consultarQuantidade("Pao"),"Erro");
    }
    
    @Test
    public void maisEstocadoTest(){
        est.adicionarProduto("Pao", 2);
        est.removerProduto("Cell", 1);
        assertEquals("Pao", est.produtoMaisEstocado(),"Erro");
    }
    
    @Test
    public void limparTest(){
        ArrayList<Produto> test = new ArrayList<>();
        est.removerProduto("Cell", 1);
        est.limparEstoque();
        assertEquals(test, est.estoque,"Erro");
    }
    
    @Test
    public void listarTest(){
        est.adicionarProduto("Cell", 1);
        est.adicionarProduto("Bola", 1);
        assertEquals("Cell Bola ",est.listarEstoque() ,"Erro");
    }
    
    @Test
    public void reabastecerTest(){
        est.adicionarProduto("Cell", 1);
        est.reabastecerEstoque(4);
        
        assertEquals(5,est.consultarQuantidade("Cell") ,"Erro");
    }
}
