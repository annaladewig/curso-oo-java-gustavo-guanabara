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
public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacao, views, curtidas;
    private boolean reproduzindo;
    
    //Construtor
    public Video(String titulo){ 
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;  
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String t){
        this.titulo = t;
    }
    
    public Integer getAvaliacao(){
        return this.avaliacao;
    }
    public void setAvaliacao(Integer a){
        this.avaliacao = a;
    }
    
    public Integer getViews(){
        return this.views;
    }
    public void setViews(Integer v){
        this.views = v;
    }
    
    public Integer getCurtidas(){
        return this.curtidas;
    }
    public void setCurtidas(Integer c){
        this.curtidas = c;
    }
    
    public Boolean getReproduzindo(){
        return this.reproduzindo;
    }
    public void setReproduzindo(Boolean r){
        this.reproduzindo = r;
    }

    @Override
    public void play() {
        this.reproduzindo = true;
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
    }

    @Override
    public void like() {
        this.curtidas++;
    }
}
