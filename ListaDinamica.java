/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade_12_08;

/**
 *
 * @author leona
 */
public class ListaDinamica {
    
    No inicio;
    No fim;
    
    
    public void inserir(No n){
        
        if(inicio == null){
            
            inicio = n;
            fim = n;
        }
        else{
            
            fim.proximo =n;
            fim = n;
            
        }
    }
    
    public void exibir(){
        No aux = inicio;
        
        while(aux != null){
            
            System.out.println(aux.toString());
            aux = aux.proximo;
            
        }
            
        
    }
    
    public void remover(String conteudo){
        
        No aux = inicio;
        No removido = null;
        No anterior = null;
        
        while(aux != null){
            
            if(aux.toString().contains(conteudo)){
                
                removido = aux;
                break;
                
            }
            
        }
        
        anterior = aux;
        aux = aux.proximo;
        
        if(removido == inicio){
            
            inicio = removido.proximo;
            removido.proximo = null;
            if(removido == fim){
                fim = null;
                System.out.println("Removido com sucesso ");
                
            }
            
        }
        else if(removido != null && anterior != null){
            
            anterior.proximo = removido.proximo;
            removido.proximo = null;
            
            if(removido == fim){
                
                fim = anterior;
                
            }
            System.out.println("Removido com sucesso ");
        
        }
        else{
            
            System.out.println("Não há nada para ser removido ");
        }
        
    }
    
}
