
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
public class P237 {
    
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        while(sc.hasNext()){
            ejercicio();
        }
    }
    
    public static void ejercicio(){
        
        long n = sc.nextLong();
        
        
        String nS = ""+n;
        

        
        int size = nS.length();
        
        boolean si = true;
        for (int i = nS.length(); i > 0; i--) {
            if(n%size!=0){
                si=false;
                break;
            }

            size--;
            nS=nS.replace(nS.charAt(size)+"", "");
            
            System.out.println(nS);

            if(nS.length()>=1){
            n = Integer.parseInt(nS);
            }
        }
        
        if(si){
            System.out.println("POLIDIVISIBLE");
        }else{
            System.out.println("NO POLIDIVISIBLE");
        }
    }

}
