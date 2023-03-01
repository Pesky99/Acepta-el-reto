
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
public class P533 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            ejercicio();
        }
    }

    public static void ejercicio() {
        int cantidadO = sc.nextInt() * 1000;
        int aporteI = sc.nextInt();
        int cantA = aporteI * 125;
        int ganador = 0;

        if (cantA >= cantidadO) {
            ganador = 1;
        }

        for (int i = 1; aporteI != 0; i++) {
            if (i > 1) {
                cantA += aporteI * 125;
            }
            if (cantA >= cantidadO) {
                if (ganador == 0) {
                    ganador = i;
                }
            }
            aporteI = sc.nextInt();
        }

        if (cantA < cantidadO) {
            System.out.println("SIGAMOS RECICLANDO");
        } else {
            System.out.println(ganador);
        }
    }
}
