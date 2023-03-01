/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author teres
 */
public class P436 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (sc.hasNext()) {
            ejercicio();
        }
    }

    public static void ejercicio() {
        int grosor = sc.nextInt();
        int altura = sc.nextInt();

        double g = grosor;
        double grosor2 = g / 1000000;
        double si = altura / grosor2;
        double x = Math.log(si) / Math.log(2);
        int xx = (int) Math.ceil(x);
        System.out.println(xx);
    }
}