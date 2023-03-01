
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
public class P607 {
    static public Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int j = sc.nextInt();
        for (int i = 0; i < j; i++) {
            ejercicio();
        }          
    }
    public static void ejercicio(){
        
       long castigo = sc.nextLong();
       long nveces = 1;
       int h=0;
        for (int i = 0; nveces<castigo; i++) {
            h++;
            nveces = nveces*2;
        }
        System.out.println(h);
    }
}
