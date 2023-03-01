
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
public class P191 {
    
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int veces = sc.nextInt();
        
        for (int i = 0; i < veces; i++) {
            ejercicio();
        }
    }
    
    public static void ejercicio(){
        
        int nComp = sc.nextInt(); int lMax = sc.nextInt();    int dif = sc.nextInt();
        
        
        int difT=0;
        int difT2=0;
        for (int i = 0; i < nComp-1; i++) {
            difT = difT +dif;
            difT2 = difT2+difT;
        }
        
        
        int nLitros = nComp*lMax-difT2;
        
        System.out.println(nLitros);
    }
    
}
