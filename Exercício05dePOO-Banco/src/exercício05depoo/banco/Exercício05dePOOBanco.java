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
public class Exercício05dePOOBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.abrirConta(001, "Anna Ladewig","CC");
        c1.depositar(1000);
        c1.sacar(500);
        c1.pagarMensal();
        c1.estadoAtual();
        
        Conta c2 = new Conta();
        c2.abrirConta(002, "Jubileu", "CC");
        c2.depositar(300);
        c2.estadoAtual();
        
        Conta c3 = new Conta();
        c3.abrirConta(003, "Creuza", "CP");
        c3.depositar(500);
        c3.sacar(100);
        c3.estadoAtual();
        
               
        
        
    }
    
}
