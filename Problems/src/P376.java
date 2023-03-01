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
public class P376 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while(ejercicio());
    }
    
 
    public static boolean ejercicio(){
        int n = sc.nextInt();
        
        if(n==0)return false;
        
        int nPicos = 0;
        
        int tramos[] = new int[n];
        tramos [0] = sc.nextInt();
        tramos [1] = sc.nextInt();
        for (int i = 2; i < n; i++) {
            tramos[i] = sc.nextInt();
            if(tramos[i-1]>tramos[i] && tramos[i-1]>tramos[i-2]) nPicos++;
        }
        
        if(tramos[n-1]>tramos[0] && tramos[n-1]>tramos[n-2]) nPicos++;
        
        if(tramos[0]>tramos[1] && tramos[0]>tramos[n-1]) nPicos++;
        
        
        System.out.println(nPicos);
        return true;
    }
}