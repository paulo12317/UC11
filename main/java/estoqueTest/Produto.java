/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estoqueTest;

/**
 *
 * @author PAULOHENRIQUEVICENTE
 */
public class Produto {
    String nome;
    int quantidade;
    
    public Produto(String nome, int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
    }
    
    public void addQuant(int num){
        quantidade += num;
    }
    
    public void removeQuant(int num){
        quantidade -= num;
    }
    
    public String getNome(){
        return nome;
    }
}
