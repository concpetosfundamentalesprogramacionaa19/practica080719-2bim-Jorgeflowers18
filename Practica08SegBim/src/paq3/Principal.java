/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paq3;
import java.util.Scanner;
/**
 *
 * @author Jorgeso
 */
public class Principal {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        int num;
        System.out.println("Ingrese el número");
        num = sc.nextInt();
        
        int sum = SumaNumeros.obtenerSumaDos(num);
        
        System.out.println(sum);
        
    }
    
    
    
    
}
