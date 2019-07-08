/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paq4;

/**
 *
 * @author Jorgeso
 */
public class ObtenerTamanioArreglo {
    public static int obtenerTamanioArreglo(int arreglo2[], int tamanio) {
        // método recursivo para la obtención de la suma del arreglo
        if (tamanio == 1) {
            return arreglo2[0];
        } else {
            return arreglo2[tamanio - 1] + obtenerTamanioArreglo(arreglo2, tamanio - 1 ); 
        }
         
    }
    
    public static int obtenerTamanioDos(int arreglo2[], int tamnio) {
        // metodo normal de obtecion se suma, ciclo repetitivo
        int sum = 0;
        
        for (int i = 0; i < arreglo2.length; i++) {
            sum = sum + arreglo2[i];
        }
        
        
        
        return sum;
    }
    
    
}


