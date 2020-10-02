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
public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistido;
    
    //Construtor
    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
    
    public String getLogin(){
        return this.login;
    }
    public void setLogin(String l){
        this.login = l;
    }
    
    public Integer getTotAssistido(){
        return this.totAssistido;
    }
    public void setTotAssistido(Integer t){
        this.totAssistido = t;
    }
    
    public void viuMaisUm(){
        this.totAssistido++;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "login=" + login + ", totAssistido=" + totAssistido + '}';
    }
    
    
}
