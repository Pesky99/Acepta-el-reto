import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author teres
 */
public class P370 {
     public static Scanner sc = new Scanner(System.in);
     public static void main(String[] args) {
        int veces = sc.nextInt();
         for (int i = 0; i < veces; i++) {
             ejercicio();
         }
    }
     
     public static void ejercicio(){
         String llave = sc.next();
         
         int a = Integer.parseInt(llave.substring(0, llave.indexOf("-")));
         int b = Integer.parseInt(llave.substring(llave.indexOf("-")+1, llave.length()));
         
         if(a%2==0 && (a+1)==b || b%2==0 && (b+1)==a){
             System.out.println("SI");
         }else{
             System.out.println("NO");
         }
     } 
}