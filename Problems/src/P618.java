
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
public class P618 {
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (ejercicio());
    }
    
    public static boolean ejercicio(){
        
        int nNiveles = sc.nextInt();
        
        if (nNiveles==0){
            return false;
        }
        
        int [] niveles = new int [nNiveles];
        
        for (int i = 0; i < nNiveles; i++) {
            niveles[i] = sc.nextInt();
        }

        int subconsultas = sc.nextInt();
        
        int a; int b;
        int datos = 0;
        
        for (int i = 0; i < subconsultas; i++) {
            a = sc.nextInt();  b = sc.nextInt();
            if(a<b){
                for (int j = a; j < b-1; j++) {
                    datos = datos + niveles[j];
                }
                System.out.println(datos);
                datos = 0;
            }else{
                for (int j = a-1; j >= b-1; j--) {
                    datos = datos + niveles[j];
                }
                System.out.println(datos*-1);
                datos = 0;
            }
        }
        
        System.out.println("---");
                
        
        return true;
    }
}
