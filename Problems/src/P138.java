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
public class P138 {

    static Scanner sc = new Scanner(System.in);

    public static void ejercicio() {
        
        
        
        long n = sc.nextLong();
        int p = 25;
        int h = p;
        int z = 0;
        long nCeros = 0;
        int k = 0;
   
        
        for (long i = n; i>=5 ; ) {
            nCeros += i/5;
            i = i/5;
        }
        
        System.out.println(nCeros);

    }

    public static void main(String[] args) {

        int i = sc.nextInt();

        for (int j = 0; j < i; j++) {
            ejercicio();
        }
    }
}