/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade_12_08;

/**
 *
 * @author leona
 */
public class PilhaDinamica {
    
    No topo = null;
    
    No base = null;
    
    public void empilha(No n){
        
        
        if(topo == null){
            
            topo = n;
            base = n;
            System.out.println("Inserido com sucesso!");
            
        }
        else{
            
            topo.proximo = n;
            topo = n;
            System.out.println("Inserido com sucesso!");
            
            
        }
        
    }
    
    public void exibir(){
        
        No aux = base;
        
        while(aux != null){
            
            System.out.println(aux.toString());
            aux = aux.proximo;
            
        }
        
    }
    
    public void desempilha(){
        
   
        
        if(base == null){
            
            System.out.println("Pilha esta vazia");
            
        }
        else{
            
                 
            No aux = base;
            No anterior = null;
            
            while(aux != null){
            
                if(aux == topo){

                    break;

                }
                anterior = aux;
                aux = aux.proximo;


            }
            topo = anterior;
            anterior.proximo = null;
             System.out.println("Elemento removido com sucesso!");
        
            
            
        }
        
    }
    
}
