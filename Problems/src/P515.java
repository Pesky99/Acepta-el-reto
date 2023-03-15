
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
public class P515 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (ejercicio());
    }
    
    public static boolean ejercicio(){
        
        
        int copas = sc.nextInt();
        
        if(copas==0){
            return false;
        }
        int val = 0;
        if(copas%2!=0 && copas!=1){
            System.out.println(copas-1);
        }else{
            System.out.println(copas);
        }
        
        
        return true;
    }
}
