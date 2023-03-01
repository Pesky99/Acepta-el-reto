
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miguel
 */
public class P617 {
    public static Scanner sc = new Scanner (System.in);
    
    public static void main(String[] args) {
        int veces = sc.nextInt();
        
        for (int i = 0; i < veces; i++) {
            ejercicio();
        }
    }
    
    public static void ejercicio(){
        
        int puntuaciones = sc.nextInt();
        
        String cadena1 = "";
        
        String cadena2 = "";
        String cadena3 = "";
        
        String aux;
        
        for (int i = 0; i < puntuaciones; i++) {
            aux = sc.next();
            cadena1 = cadena1 + aux.charAt(0);
            cadena2 = cadena2 + aux.charAt(1);
            cadena3 = cadena3 + aux.charAt(2);
        }
        
        String cadF = cadena1+cadena2+cadena3;
        
        System.out.println(cadF);
    }
    
    
}
