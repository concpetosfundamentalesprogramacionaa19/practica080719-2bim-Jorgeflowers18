/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paq3;

/**
 *
 * @author Jorgeso
 */
public class SumaNumeros {
    
    
    public static int obtenerSumaUno(int v){
        
        int sum = 0;
        
        for (int i = 1; i <= v; i++) {
            
            sum = sum + i;
           
        }
        
     return sum;   
    }
    
    public static int obtenerSumaDos(int valor) {
        
        if (valor <= 0) {
            return 0;
        }else{
            return valor + obtenerSumaDos(valor-1);
        }
  
        
    }
    
}
