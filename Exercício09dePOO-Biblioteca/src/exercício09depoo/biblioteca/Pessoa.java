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
public class Pessoa {
    
// Construtor
public Pessoa(String n, int i, char s) {
    setNome(n);
    setIdade(i);
    setSexo(s);
} 
    
// Atributos
    private String nome;
    private int idade;
    private char sexo; 
    
// Métodos 
public String getNome(){
    return this.nome; 
}   

public void setNome(String n){
    this.nome = n;
}

public int getIdade(){
    return this.idade;
}
    
public void setIdade(int i){
    this.idade = i; 
}

public char getSexo(){
    return this.sexo;
}

public void setSexo(char s){
    this.sexo = s;
}

public void fazerAniver(){
    this.setIdade(this.getIdade() + 1);
}
}