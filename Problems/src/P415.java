
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
public class P415 {
        public static Scanner sc = new Scanner(System.in);
        
        public static void main(String[] args) {
        while(ejercicio());
    }
        
        public static boolean ejercicio(){
            
            int n = sc.nextInt();
            
            if(n==0){
                return false;
            }
            
            if(n%9==0){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
            
            return true;
        }
}
