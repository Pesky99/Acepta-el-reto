/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author teres
 */
public class P433 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (ejercicio());
    }
    
    public static boolean ejercicio(){
        
        int n = sc.nextInt();
        
        if (n==0)return false;
        
        int sumatoria = 0;
        int count =0;
        for (int i =1; sumatoria<n; i++) {
            sumatoria +=i;
            count++;
        }
        
        System.out.println(count);
        
        return true;
    }
}