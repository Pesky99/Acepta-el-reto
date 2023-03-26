/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class P518 {

    public static Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while (ejercicio1());
    }

    public static boolean ejercicio1() {

        double pi = sc.nextDouble();
        int max = 0;
        int entero = (int) pi;

        if (pi == 0) {
            return false;
        }

        if (entero > 12 && entero <= 0) {
            System.out.println("NO");
            return false;
        }

        switch (entero) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: {
                max = 31;
                break;
            }

            case 4:
            case 6:
            case 9:
            case 11: {
                max = 30;
                break;
            }

            case 2: {
                max = 28;
                break;
            }
        }

        pi = pi - entero;
        pi = Math.round(pi*100);
        int enteroDecimales = (int) pi;
        
        if (enteroDecimales > 0 && enteroDecimales <= max) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

        return true;
    }
}