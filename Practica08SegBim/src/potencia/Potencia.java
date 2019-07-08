/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potencia;

/**
 *
 * @author Jorgeso
 */
public class Potencia {
    
    public static int get_potencia(int base, int exponente) {
        
        // ciclo comparativo para utilizar la técnica de recursión para obtener
        // una ppotencia
        if (exponente == 1) {
            return base;
        } else{
            
            return base * get_potencia(base, exponente - 1);
        }
    }

}
