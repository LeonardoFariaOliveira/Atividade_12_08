/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade_12_08;

/**
 *
 * @author leona
 */
public class FilaDinamica {
    
    //No fila[];
    No comeco = null;
    No fim = null;
    
    
    
    
    
    public void inserir(No n){
        
        if(comeco == null){
            
            comeco = n;
            fim = n;
        //    fila[fim] = n;;
            System.out.println("Elemento inserido com sucesso!");
            
        }
        else if(fim.proximo == null){
            
            
            fim.proximo =n;
            fim = n;
            System.out.println("Elemento inserido com sucesso!");
            
        }
        else{
            
            System.out.println("Houve um erro, tente novamente");
            
        }
        
    }
    
    public void exibir(){
        No aux = comeco;
        
        while(aux != null){
            
            System.out.println(aux.toString());
            aux = aux.proximo;
            
        }
            
        
    }
    
    
    public void remover(){
        
        
        No aux = comeco;
        No removido = null;
        No anterior = null;
          
        
        if(comeco == null){
            
            System.out.println("Nada para remover");
            
        }
        else{
            
           comeco = aux.proximo;
           aux.proximo = null;
           System.out.println("Elemento removido com sucesso!");
  
        }
        
        
       
             
    }
    
  
    
}
