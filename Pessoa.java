/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade_12_08;

/**
 *
 * @author leona
 */
public class Pessoa {
    
    public String nome;
    public String profissao;
    
    
    public Pessoa(String n, String p){
        
        this.nome = n;
        this.profissao = p;
        
    }
    
    
    public String toString(){
        
        return "Nome:"+this.nome+" - Profissão: "+this.profissao;
    }
    
}
