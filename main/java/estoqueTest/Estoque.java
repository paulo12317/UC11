/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estoqueTest;

import java.util.ArrayList;

/**
 *
 * @author PAULOHENRIQUEVICENTE
 */
public class Estoque {
    ArrayList<Produto> estoque = new ArrayList<>();
    
    public void adicionarProduto(String nome, int quantidade){
        if(nome == "" || quantidade <= 0){
            throw new IllegalArgumentException("Digite o nome do produto e uma quantidade acima de 0.");
        }
        
        for(Produto prod:estoque){
            if(prod.getNome().equals(nome)){
                System.out.println("Quantidade adicionada");
                prod.quantidade += quantidade;
                return;
            }
        }
        
        estoque.add(new Produto(nome,quantidade));
        System.out.println("Produto adicionado.");
    }
    
    public void removerProduto(String nome, int quantidade){
        for(int i = 0;i < estoque.size();i++){
            if(nome == estoque.get(i).nome){
                if(quantidade > estoque.get(i).quantidade){
                    throw new IllegalArgumentException("Digite uma quantidade menor.");
                }
                if(quantidade == estoque.get(i).quantidade){
                    estoque.remove(i);
                }else{
                    estoque.get(i).removeQuant(quantidade);
                }
            }
        }
    }
    
    public int consultarQuantidade(String nome){
        int ii = 0;
        for(int i = 0;i < estoque.size();i++){
            if(nome == estoque.get(i).nome){
                
                System.out.println(estoque.get(i).quantidade);
                return estoque.get(i).quantidade;
            }
        }
        return 0;
    }
    
    public String produtoMaisEstocado(){
        
        int maior = 0;
        int quant = 0;
        
        for(int i = 0;i < estoque.size();i++){
            if(quant < estoque.get(i).quantidade){
                maior = i;
                quant = estoque.get(i).quantidade;
            }
        }
        
        return estoque.get(maior).nome;
    }
    
    public void limparEstoque(){
        estoque.clear();
    }
    
    public void reabastecerEstoque(int quant){
        for(Produto prod:estoque){
            prod.quantidade += quant;
        }
    }
    
    public String listarEstoque(){
        String vazia = "";
        for(Produto prod:estoque){
            vazia += prod.nome;
            vazia += " ";
        }
        return vazia;
    }
}
