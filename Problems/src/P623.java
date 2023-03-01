/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurso;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Primitiva {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();
        int numero;
        int numero2;
        int restos[] = new int[7];
        int restos2[] = new int[7];
        int modulo = 1000000;
        int divide = 1000000;
        boolean premio = true;
        for (int c = 0; c < casos; c++) {
            numero = sc.nextInt();
            numero2 = sc.nextInt();
            for (int i = 0; i < 7; i++) {
                restos[i] = numero / divide;
                restos2[i] = numero2 / divide;
                divide = divide / 10;
                numero = numero % modulo;
                numero2 = numero2 % modulo;
                modulo = modulo / 10;

            }
            Arrays.sort(restos);
            Arrays.sort(restos2);
            for (int i = 0; i < 7; i++) {
                if (restos[i] != restos2[i]) {
                    premio = false;
                    break;
                }
            }

            if (premio == true) {
                System.out.println("GANA");

            } else {
                System.out.println("PIERDE");
            }
            modulo = 1000000;
            divide = 1000000;
            premio = true;
        }
    }
}