
import java.lang.reflect.Array;
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
public class P161 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (ejercicio());
    }

    public static boolean ejercicio() {

        int tamañoMuestra = sc.nextInt();
        int muestra[] = new int[tamañoMuestra];
        if (tamañoMuestra == 0) {
            return false;

        }

        int mediana = 0;

        for (int i = 0; i < muestra.length; i++) {
            muestra[i] = sc.nextInt();
        }

        Arrays.sort(muestra);

        if (tamañoMuestra % 2 != 0) {
            mediana = (muestra[(tamañoMuestra / 2)]) * 2;
            System.out.println(mediana);
        } else {
            double valor1 = muestra[(tamañoMuestra / 2) - 1];
            double valor2 = muestra[tamañoMuestra / 2];
            double medianaPar = ((valor1 + valor2) / 2) * 2;
            int medianaP = (int) medianaPar;
            System.out.println(medianaP);
        }
        tamañoMuestra = 0;
        return true;
    }
}
