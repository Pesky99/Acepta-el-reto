
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
public class P249 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int casos = sc.nextInt();

        for (int i = 0; i < casos; i++) {
            ejercicio();
        }
    }

    public static void ejercicio() {

        int burros = sc.nextInt();
        int sacos = sc.nextInt();
        int h = 0;
        if ((sacos / 2) < burros) {
            int pesoSacos[] = new int[sacos];

            for (int i = 0; i < sacos; i++) {
                pesoSacos[i] = sc.nextInt();
            }

            Arrays.sort(pesoSacos);

            for (int i = 0; i < sacos - 1; i++) {
                if (pesoSacos[i] == pesoSacos[i + 1]) {
                    h++;
                    i++;
                    if (h == sacos/2) {
                        break;
                    }
                }
            }
            System.out.println(h);
        } else {
            int pesoSacos[] = new int[sacos];

            for (int i = 0; i < sacos; i++) {
                pesoSacos[i] = sc.nextInt();
            }

            Arrays.sort(pesoSacos);

            for (int i = 0; i < sacos - 1; i++) {
                if (pesoSacos[i] == pesoSacos[i + 1]) {
                    h++;
                    i++;
                    if (h == burros) {
                        break;
                    }
                }
            }
            System.out.println(h);
        }

    }
}
