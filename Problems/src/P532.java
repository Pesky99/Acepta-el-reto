
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
public class P532 {
    public static Scanner sc = new Scanner(System.in);
    
    public static void ejercicio(){
        
        int pesoSin=sc.nextInt(); int pesoTotal=sc.nextInt();
        
        System.out.println(pesoTotal-pesoSin);
        
        
    }
    
    public static void main(String[] args) {
        int veces =sc.nextInt();
        for (int i = 0; i < veces; i++) {
            ejercicio();
        }
    }
}
