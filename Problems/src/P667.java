
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
public class P667 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (ejercicio());
    }

    public static boolean ejercicio() {
        String anio = sc.next();

        if (anio.equals("0")) {
            return false;
        }

        int uvas[] = new int[10];

        for (int i = 0; i < 10; i++) {
            uvas[i] = sc.nextInt();
        }

        int digAnio[] = new int[10];

        int personas = 0;
        int nUvas;
        int minP = -1;
        for (int i = 0; i < 4; i++) {
            if (Integer.parseInt("" + anio.charAt(i)) == 0) {
                digAnio[0]++;
            }
            if (Integer.parseInt("" + anio.charAt(i)) == 1) {
                digAnio[1]++;
            }
            if (Integer.parseInt("" + anio.charAt(i)) == 2) {
                digAnio[2]++;
            }
            if (Integer.parseInt("" + anio.charAt(i)) == 3) {
                digAnio[3]++;
            }
            if (Integer.parseInt("" + anio.charAt(i)) == 4) {
                digAnio[4]++;
            }
            if (Integer.parseInt("" + anio.charAt(i)) == 5) {
                digAnio[5]++;
            }
            if (Integer.parseInt("" + anio.charAt(i)) == 6) {
                digAnio[6]++;
            }
            if (Integer.parseInt("" + anio.charAt(i)) == 7) {
                digAnio[7]++;
            }
            if (Integer.parseInt("" + anio.charAt(i)) == 8) {
                digAnio[8]++;
            }
            if (Integer.parseInt("" + anio.charAt(i)) == 9) {
                digAnio[9]++;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (digAnio[i] > 0) {
                nUvas = digAnio[i] * 3;
                personas = uvas[i] / nUvas;
                if (minP == -1) {
                    minP = personas;
                }
                if (personas < minP) {
                    minP = personas;
                }
            }
        }

        System.out.println(minP);

        return true;
    }
}
