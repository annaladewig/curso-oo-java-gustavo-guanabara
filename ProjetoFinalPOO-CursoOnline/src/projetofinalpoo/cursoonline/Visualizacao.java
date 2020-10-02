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
public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;
    
    //Construtor
    public Visualizacao(Gafanhoto g, Video v){
        this.espectador = g;
        this.filme = v;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }
    
    public Gafanhoto getEspectador(){
        return this.espectador;
    }
    public void setEspectador(Gafanhoto g){
        this.espectador = g;
    }
    
    public Video getFilme(){
        return this.filme;
    }
    public void setFilme(Video v){
        this.filme = v;
    }
    
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    public void avaliar(float porc){
        
    }
}
