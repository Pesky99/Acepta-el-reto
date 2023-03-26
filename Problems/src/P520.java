
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
public class P520 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (ejercicio()) {

        }
    }

    public static boolean ejercicio() {

        int cubiletes = sc.nextInt();
        int cubileteBola = sc.nextInt();

        if (cubiletes == 0 && cubileteBola == 0) {
            return false;
        }
        
        int cambio1 = -1;
        int cambio2 = -1;
        for (int i = 0; cambio1 != 0 && cambio2 != 0; i++) {
            cambio1 = sc.nextInt();
            cambio2 = sc.nextInt();
            if (cambio1 == cubileteBola || cambio2 == cubileteBola) {
                if (cambio1 == cubileteBola) {
                    cubileteBola = cambio2;
                } else {
                    cubileteBola = cambio1;
                }
            }
        }

        System.out.println(cubileteBola);

        return true;
    }
}
