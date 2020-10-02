/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercício05depoo.banco;

/**
 *
 * @author DELL
 */
public class Conta {
   
    //Atributos
   public int numConta;
   protected String tipo;
   private String dono;
   private float saldo;
   private boolean status;
    
   //Métodos 
    public Conta() { //Este é o método Construtor.
        this.status = false;
        this.saldo = 0;  
}
    
    public int getNumConta(){
        return this.numConta;
}
    public void setNumConta(int num) {
        this.numConta = num;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String codigo){
        if (codigo.equals("CC") || codigo.equals("CP")){
          this.tipo = codigo;
        } else {
             System.out.println("Só existem dois tipos de conta: Conta Corrente (CC) e Conta Poupança (CP).");
            return;
        }
    }
    
    public String getDono(){
        return this.dono;
    }
    public void setDono(String nome){
        this.dono = nome;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float valor){
        this.saldo = valor;
    }
    
    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean estado){
        this.status = estado;
    }
            
    public void abrirConta(int num, String nome, String codigo){
        this.status = true;
        this.numConta = num;
        this.dono = nome;  
        
        if (codigo.equals("CC") || codigo.equals("CP")){
          this.tipo = codigo;
        } else {
             System.out.println("Só existem dois tipos de conta: Conta Corrente (CC) e Conta Poupança (CP).");
            return;
        }
        
        if (this.tipo.equals("CC")) {
            this.saldo = 50.00f;
        }
        if (this.tipo.equals("CP")) {
            this.saldo = 150.00f;
        }
    }
    
    public void fecharConta(){
        if (this.saldo == 0) {
           setStatus(false);
        } else if (this.saldo > 0) {
            System.out.println("A conta contém saldo positivo, é necessário sacar o dinheiro da conta.");
        } else if (this.saldo < 0) {
            System.out.println("A conta possui saldo negativo, é necessário fazer depósito para cobrir os débitos.");
        }
    }
    
    public void depositar(float deposito) {
       if (this.getStatus() == true){
        this.saldo += deposito;
       } else {
           System.out.println("Essa conta está fechada. Não foi possível realizar o depósito.");
       }
    }
    
    public void sacar(float saque) {
       if (this.status == true) {
           if (saque > this.saldo){
           System.out.println("Você não possui saldo suficiente para este saque.");
           } else {
           this.saldo -= saque;
           }
       } else {
           System.out.println("Essa conta está fechada. Não foi possível realizar o saque.");
           
       }
    }
    
    public void pagarMensal() {
        if (this.tipo.equals("CC")){
            this.saldo -= 12;
        } else {
            this.saldo -= 20;
        }
    }
    
    public void estadoAtual(){
        System.out.println("----------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("----------------------------------");
    }
}
