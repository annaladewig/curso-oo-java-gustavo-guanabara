/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercício09depoo.biblioteca;

/**
 *
 * @author DELL
 */
public class Exercício09dePOOBiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[5];
        
        p[1] = new Pessoa("Anna Maria",31,'F');
        p[2] = new Pessoa("Victor", 32,'M');
        p[3] = new Pessoa("Ângela",35,'F');
        
        Livro l[] = new Livro[5];
        
        l[1] = new Livro("Aprendendo Java","Gustavo Guanabara",120);
        l[2] = new Livro("Lógica de Programação","Aldo Moura", 50);
        l[3] = new Livro("É bonca, meu véi!","Abel Rossiter", 75);
        l[4] = new Livro("tem que ver isso aê!","Rodrigo Paulino", 93);
        
        l[1].setLeitor(p[1]);
        l[2].setLeitor(p[2]);
        
        l[1].detalhes();
        l[2].detalhes();
        
        
    }
    
}
