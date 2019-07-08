/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potencia;
import java.util.Scanner;
/**
 *
 * @author Jorgeso
 */
public class Principal {
    public static void main(String[] args) {
        
        int v; // se declrar variable entera
        
        v = Potencia.get_potencia(2, 4);// se utiliza la variable para recpetar 
        // la información del método
                
        System.out.printf("El resultado es: %d\n",v);// se imprime el texto y 
        //la variable
                
    }
    
    
    
}
