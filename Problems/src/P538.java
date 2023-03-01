
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
public class P538 {
    
    public static Scanner sc = new Scanner (System.in);
    
    public static void main(String[] args) {
        while(ejercicio());
    }
    
    public static boolean ejercicio(){
        
        int aA= sc.nextInt(); int aI= sc.nextInt();
        
        if (aA==0 && aI==0){
            return  false;
        }
        
        if(aA==aI || aI<aA){
            System.out.println("CUERDO");
        }else{
            System.out.println("SENIL");
        }
        
        
        return true;
    }
}
