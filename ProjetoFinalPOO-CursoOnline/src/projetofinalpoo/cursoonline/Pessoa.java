/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinalpoo.cursoonline;

/**
 *
 * @author DELL
 */
public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected float experiencia;
    
    //Construtor
    public Pessoa(String nome, int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome = n;
    }
    
    public Integer getIdade(){
        return this.idade;
    }
    public void setIdade(Integer i){
        this.idade = i;
    }
    
    public String getSexo(){
        return this.sexo;
    }
    public void setSexo(String s){
        this.sexo = s;
    }
    
    public Float getExperiencia(){
        return this.experiencia;
    }
    public void setExperiencia(Float e){
        this.experiencia = e;
    }
    
    protected void ganharExp(){
        
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", experiencia=" + experiencia + '}';
    }
    
    
}
