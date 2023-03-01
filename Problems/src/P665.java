
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
public class P665 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            ejercicio();
        }
    }

    public static void ejercicio() {
        String n1 = sc.next();
        String n2 = sc.next();
        
        String numeros1[] = n1.split("\\.");
        String numeros2[] = n2.split("\\.");
        int primero1 = Integer.parseInt("" + numeros1[0]);
        int primero2 = Integer.parseInt("" + numeros2[0]);
        int segundo1 = Integer.parseInt("" + numeros1[1]);
        int segundo2 = Integer.parseInt("" + numeros2[1]);
        int tercero1 = Integer.parseInt("" + numeros1[2]);
        int tercero2 = Integer.parseInt("" + numeros2[2]);

        if (primero2 == (primero1 + 1) && segundo2 == 0 && tercero2 == 0) {
            System.out.println("SI");
        } else if (primero1==primero2 && segundo2 == (segundo1 + 1) && tercero2 == 0) {
            System.out.println("SI");
        } else if (segundo1==segundo2 && primero1==primero2 && tercero2 == (tercero1 + 1)) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}
