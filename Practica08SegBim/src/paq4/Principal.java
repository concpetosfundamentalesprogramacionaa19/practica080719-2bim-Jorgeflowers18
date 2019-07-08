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
public class Principal {
    
    public static void main(String[] args) {
        
        // declaración del arreglo
        int arreglo[] = {10, 20, 30, 1, 2, 3, 40, 4}; 
        
        //declracion de variables
        int v; 
        int v2;
        // recibiendo el valor del primer metodo
        v = ObtenerTamanioArreglo.obtenerTamanioArreglo(arreglo, 
                arreglo.length);
        // recibiendo el valor del segundo método
        v2 = ObtenerTamanioArreglo.obtenerTamanioDos(arreglo, arreglo.length);
        
        //Presentacion de resultados
        System.out.printf("La suma del arreglo es: %d, obtenido con el método"
                + " recursivo\nLa suma del arreglo es: %d, obtenida con el "
                + "método normal de un bucle repetitivo", v, v2);
        
    }
}
