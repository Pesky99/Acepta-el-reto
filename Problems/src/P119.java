
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
public class P119 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        
        int nSoldados = sc.nextInt();
        
        while(nSoldados!=0){
        int lados = 0;
        int sqr;
        long escudos = 0;
        int sqr2;
        
        for (int i = 0; nSoldados>0; i++) {
            sqr = (int) Math.sqrt(nSoldados);
            sqr2 = sqr * sqr;
            if(sqr!=2 && sqr!=0){
            lados =  (int) (sqr2 * 0.5);
            escudos = escudos + lados*2;
            }
            if(sqr!=1){
                escudos = escudos + 12;
                escudos = escudos + (sqr2-lados-4);   
            }else{
                escudos = escudos +5;
            }
            
            lados = 0;
            nSoldados = nSoldados - sqr2;
                
        }
        
        System.out.println(escudos);
        
        nSoldados = sc.nextInt();
        }
       
    }
    
}
