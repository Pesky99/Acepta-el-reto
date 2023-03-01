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
public class P369 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while(ejercicio());
    }
    
 
    public static boolean ejercicio(){
        int n = sc.nextInt();
        
        if(n==0) return false;
        
        for (int i = 0; i < n; i++) {
            System.out.print(""+1);
        }
        System.out.println("");
        return true;
    }
}