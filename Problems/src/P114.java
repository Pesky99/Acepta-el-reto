
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
public class P114 {
    
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int veces = sc.nextInt();
        
        for (int i = 0; i < veces; i++) {
            ejercicio();
        }
    }
    
    public static void ejercicio(){
        
        int n = sc.nextInt();
        
        if(n==0 || n==1){
            System.out.println(1);
        }else if (n==2){
            System.out.println(2);
        }else if (n==3){
            System.out.println(6);
        }else if (n==4){
            System.out.println(4);
        }else if (n>=5){
            System.out.println(0);
        }
    }
}
