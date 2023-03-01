
import java.util.Arrays;
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
public class P664 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (ejercicio());
    }

    public static boolean ejercicio() {
        int n = sc.nextInt();
        if (n == 0) {
            return false;
        }
        
        int maxPuente [] = new int [n];
        int maxP = 0;
        int nCarriles;
        int altura;
        
        for (int i = 0; i < n; i++) {
            nCarriles = sc.nextInt();
            for (int j = 0; j < nCarriles; j++) {
                altura = sc.nextInt();
                if(altura>maxP){
                    maxP = altura;
                }
            }
            maxPuente [i] = maxP;
            maxP=0;
        }
       
        Arrays.sort(maxPuente);
        System.out.println(maxPuente[0]);
        
        return true;
    }
}
