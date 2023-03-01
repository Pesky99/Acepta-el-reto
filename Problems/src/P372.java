import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author teres
 */
public class P372 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            ejercicio();
        }
    }

    public static void ejercicio() {
        String palabra = sc.next();
        String palabraI = "";

        if (palabra.toLowerCase() != palabra) {
            palabra = palabra.toLowerCase();
            palabraI += palabra.toUpperCase().charAt(palabra.length() - 1);
            for (int i = palabra.length() - 2; i >= 0; i--) {
                palabraI += palabra.charAt(i);
            }
        } else {
            for (int i = palabra.length() - 1; i >= 0; i--) {
                palabraI += palabra.charAt(i);
            }
        }
        System.out.println(palabraI);
    }
}