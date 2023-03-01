
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
public class P463 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (sc.hasNext()) {
            ejercicio();
        }
    }

    public static boolean ejercicio() {

        String cadena = sc.next();

        int desniveles[] = new int[cadena.length()];
        int desnivel = 0;
        int maxDes = 0;
        int minDes = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'S') {
                desnivel++;
                desniveles[i] = desnivel - 1;
                if (desnivel - 1 > maxDes) {
                    maxDes = desnivel - 1;
                }
            } else if (cadena.charAt(i) == 'B') {
                desnivel--;
                desniveles[i] = desnivel;
                if (desnivel < minDes) {
                    minDes = desnivel;
                }
            } else {
                desniveles[i] = desnivel;
                if (desnivel > maxDes) {
                    maxDes = desnivel;
                }

            }
        }

        System.out.println(Arrays.toString(desniveles));
        for (int i = cadena.length() + 2; i > 0; i--) {
            System.out.print("#");
        }


            for (int k = maxDes; k >= minDes; k--) {
                System.out.println("");
                System.out.print("#");
                for (int j = 0; j < cadena.length(); j++) {
                    if (k == desniveles[j]) {
                        switch (cadena.charAt(j)) {
                            case 'I': {
                                System.out.print("_");
                                break;
                            }
                            case 'S': {
                                System.out.print("/");
                                break;
                            }
                            case 'B': {
                                System.out.print("\\");
                                break;
                            }
                        }
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("#");
            }
        
        System.out.println("");

        for (int i = cadena.length() + 2; i > 0; i--) {
            System.out.print("#");
        }
        System.out.println("");

        return true;
    }

}
