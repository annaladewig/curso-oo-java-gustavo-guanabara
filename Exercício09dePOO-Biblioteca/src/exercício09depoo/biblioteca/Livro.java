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
public class Livro implements Publicacao{
    
    //Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    // Construtor
    public Livro(String titulo, String autor, int totPaginas){    
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
    }

    // Métodos
    public String getTitulo() {
        return this.titulo;
    }
    public void setTitulo(String t){
        this.titulo = t;
    }
    
    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String a){
        this.autor = a;
    }
    
    public int getTotPaginas(){
        return this.totPaginas;
    }
    public void setTotPaginas(int tot){
        this.totPaginas = tot;
    }
    
    public int getPagAtual(){
        return this.pagAtual;
    }
    public void setPagAtual(int p){
        this.pagAtual = p;
    }
    
    public boolean getAberto(){
        return this.aberto;
    }
    public void setAberto(Boolean a){
        this.aberto = a;
    }
   
    public Pessoa getLeitor(){
        return this.leitor;
    }
    public void setLeitor(Pessoa l){
        this.leitor = l;
    }
    
    public void detalhes(){
     
        System.out.println("-------------------Biblioteca---------------------");
        System.out.println("O livro: " + getTitulo() + ", ");
        System.out.println("com autoria de " + getAutor() + " ");
        System.out.println("e com o total de páginas de " + getTotPaginas() + ", ");
        System.out.println("está com o leitor(a): " + leitor.getNome() + ", " + leitor.getIdade() + ", " + leitor.getSexo() + ", ");
        System.out.println("que no momento está na página: " + getPagAtual() + ".");
        System.out.println("--------------------------------------------------");
       
             
    }

    @Override
    public void abrir() {
        setAberto(true);
    }

    @Override
    public void fechar() {
        setAberto(false);
    }

    @Override
    public void folhear() {
        if(getAberto()){
            for (int i = 1; i<= getTotPaginas(); i+=15){
            setPagAtual(i);
            }
            } else {
            System.out.println("Esse livro não pode ser folheado pois está fechado.");
        }
    }

    @Override
    public void avançarPag() {
        setPagAtual(getPagAtual() + 1);
    }

    @Override
    public void voltarPag() {
        setPagAtual(getPagAtual() - 1);
    }
}
