
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
public class P677 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            ejercicio();
        }
    }

    public static void ejercicio() {

        long n = sc.nextLong();
        
        if(n==5){
            System.out.println(25);
        }else{
            String s = ""+n;
            s = s.substring(0, s.length()-1);

            long n2 = Integer.parseInt(s);
            
            n2 = n2*(n2+1);
            
            s = ""+n2+""+25;
            
            System.out.println(s);
            
            
            
        }
    }
}
