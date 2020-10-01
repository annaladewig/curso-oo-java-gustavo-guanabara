/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercício04.resoluçãodatela;


import java.awt.Toolkit;
import java.awt.Dimension;

/**
 *
 * @author DELL
 */
public class Exercício04ResoluçãoDaTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Toolkit tk = Toolkit.getDefaultToolkit();  
        Dimension d = tk.getScreenSize();  
        System.out.println(“A resolução do seu sistema é: ” + d.width + ” X ” + d.height);  
    }
    
}
