/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P_12UVAS_2017;

import java.util.Scanner;

/**
 *
 * @author teres
 */
public class P439 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            ejercicio();
        }
    }

    public static void ejercicio() {
        String dato1 = sc.next();
        String dato2 = sc.next();

        char var1 = dato1.charAt(0);
        char var2 = dato2.charAt(0);
        int valor1 = Integer.parseInt(dato1.substring(2, dato1.length()));
        int valor2 = Integer.parseInt(dato2.substring(2, dato2.length()));
        int sol;
        switch (var1 + " " + var2) {
            case "V D": {
                sol = valor2 / valor1;
                System.out.println("T=" + sol);
                break;
            }
            case "D V": {
                sol = valor1 / valor2;
                System.out.println("T=" + sol);
                break;
            }
            case "V T": {
                sol = valor1 * valor2;
                System.out.println("D=" + sol);
                break;
            }
            case "T V": {
                sol = valor1 * valor2;
                System.out.println("D=" + sol);
                break;
            }
            case "D T": {
                sol = valor1 / valor2;
                System.out.println("V=" + sol);
                break;
            }
            case "T D": {
                sol = valor2 / valor1;
                System.out.println("V=" + sol);
                break;
            }
        }
    }
}