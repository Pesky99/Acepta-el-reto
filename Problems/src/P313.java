
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
public class P313 {
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int veces = sc.nextInt();
        
        for (int i = 0; i < veces; i++) {
            ejercicio();
        }
    }
    
    public static void ejercicio(){
        int s = sc.nextInt(); int c = sc.nextInt();
        
        if(c<0){
            if(s+c>=0){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
        }else{
            if(s>=0){
                System.out.println("SI");
            }else if (s<0){
                if(s+c>=0){
                    System.out.println("SI");
                }else{
                    System.out.println("NO");
                }
            }
        }
        
    }
}
