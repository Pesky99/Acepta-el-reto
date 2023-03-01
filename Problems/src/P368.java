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
public class P368 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while(ejercicio());
    }
    
 
    public static boolean ejercicio(){
        int h = sc.nextInt(); int c = sc.nextInt();
        
        if(h==0 && c==0) return false;
        
        int min = 0;
        
        if(h<=c){
            System.out.println(10);
        }else{
            if(h%c==0){
                min = (h/c)*10;
                System.out.println(min);
            }else{
                min = ((h/c)*10)+10;
                System.out.println(min);
            }
        }
        
        return true;
    }
}