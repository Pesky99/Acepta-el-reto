
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
public class P615 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int veces = sc.nextInt();

        for (int i = 0; i < veces; i++) {
            ejercicio();
        }
    }

    public static void ejercicio() {

        int n = sc.nextInt();
        int f = sc.nextInt();
        int t = sc.nextInt();
        int potencia;

        if (n > t || n == t) {
            System.out.println(t * f);
        } else {
            n = n+1;
            potencia = t/n;
            
            potencia = n*potencia;
            
            potencia = t - potencia;
            
            
            System.out.println(potencia*f);
            

        }

    }
}
