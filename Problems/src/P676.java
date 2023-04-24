
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
public class P676 {
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            ejercicio();
        }
    }
    
    public static void ejercicio(){
        
        int anio1 = sc.nextInt(); int anio2 = sc.nextInt();
        
        int count1 = 0; int count2 = 0;
        
        for (int i = anio1; i <= anio2; i++) {
            if(i%4==0 && i%100!=0 || i%4==0 && i%100==0 && i%400==0){
                count2++;
            }else{
                count1++;
            }
        }
        
        System.out.println(count1 + " " + count2);
    }
}
