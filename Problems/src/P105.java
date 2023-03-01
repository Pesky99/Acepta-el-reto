
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Usuario
 */
public class P105 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (ejercicio());

    }

    public static boolean ejercicio() {
        sc.useLocale(Locale.US);
        double dia1 = sc.nextDouble();

        if (dia1 == -1) {
            return false;
        }

        double max = 0;
        double min = 0;
        int dMax = 0;
        int dMin = 0;
        double media = 0;
        double vDias[] = new double[6];
        boolean empMax = false;
        boolean empMin = false;

        vDias[0] = dia1;

        max = vDias[0];

        min = vDias[0];

        media = media + vDias[0];
        for (int i = 1; i < 6; i++) {
            vDias[i] = sc.nextDouble();
            media = media + vDias[i];
            if (vDias[i] >= max) {

                empMax = false;
                if (vDias[i] == max) {
                    empMax = true;
                }
                dMax = i;
                max = vDias[i];
            }
            if (vDias[i] < min) {

                empMin = false;
                if (vDias[i] == min) {
                    empMin = true;
                }
                dMin = i;
                min = vDias[i];
            }
        }

        if (empMax == true) {
            System.out.print("EMPATE ");
        }
        if (empMin == true) {
            System.out.print("EMPATE ");
        }

        switch (dMax) {
            case 0: {
                System.out.print("MARTES ");
                break;
            }
            case 1: {
                System.out.print("MIERCOLES ");
                break;
            }
            case 2: {
                System.out.print("JUEVES ");
                break;
            }
            case 3: {
                System.out.print("VIERNES ");
                break;
            }
            case 4: {
                System.out.print("SABADO ");
                break;
            }
            case 5: {
                System.out.print("DOMINGO ");
                break;
            }
        }
        switch (dMin) {
            case 0: {
                System.out.print("MARTES ");
                break;
            }
            case 1: {
                System.out.print("MIERCOLES ");
                break;
            }
            case 2: {
                System.out.print("JUEVES ");
                break;
            }
            case 3: {
                System.out.print("VIERNES ");
                break;
            }
            case 4: {
                System.out.print("SABADO ");
                break;
            }
            case 5: {
                System.out.print("DOMINGO ");
                break;
            }
        }

        media = media-vDias[5];
        media = media / 5;

        if (media < vDias[5]) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }


        return true;
    }

}
