/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade_12_08;

/**
 *
 * @author leona
 */
public class No {
    
    
    Pessoa p;
    No proximo;
    
    public No(Pessoa p){
        
        this.p = p;
        
    }
    
    public String toString(){
        
        if(proximo == null){
            
            return this.hashCode()+ "-> Obj Pessoa: "+p.toString()+"| Proximo: vazio";
            
        }
        else{
            
            return this.hashCode()+ "-> Obj Pessoa: "+p.toString()+"| Proximo: "+ this.proximo.hashCode();
            
        }
        
    }
    
}
