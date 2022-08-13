/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade_12_08;

/**
 *
 * @author leona
 */
public class Main {
    public static void main(String[] args) {



    ListaDinamica lista = new ListaDinamica();
    FilaDinamica fila = new FilaDinamica();
    PilhaDinamica pilha = new PilhaDinamica();

    Pessoa p1 = new Pessoa("Joao","Engenheiro");
    Pessoa p2 = new Pessoa("Maria","Medica");
    Pessoa p3 = new Pessoa("Jacques","Professor");

    
    pilha.empilha(new No(p1));
    pilha.empilha(new No(p2));
    pilha.empilha(new No(p3));
    
    pilha.exibir();
    pilha.desempilha();
    pilha.exibir();
/*
    lista.exibir();

    System.out.println("Ponteiro Inicio: "+lista.inicio.hashCode());
    System.out.println("Ponteiro Fim: "+lista.fim.hashCode());

    lista.remover("Jacques");
    lista.exibir();*/
    
  }
    
}
