
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
public class P126 {
    
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        while(ejercicio());
    }
    
    public static boolean ejercicio(){
        
        int p = sc.nextInt(); int n = sc.nextInt();
        
        if(p<0 && n<0){
            return false;
        }
        
        if(p<=n || p==1 && n==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
        return true;
    }
}
