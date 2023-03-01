
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
public class P611 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (sc.hasNext()) {
            ejercicio();
        }
    }

    public static void ejercicio() {
        int año = sc.nextInt();
        String nombre = sc.nextLine();
        int nObras = sc.nextInt();
        String obra = null;
        int añoObra;
        String nomObra;
        int count = 0;
        int minAño = 0;

        for (int i = 0; i < nObras; i++) {
            añoObra = sc.nextInt();
            nomObra = sc.nextLine();
            if (añoObra >= año) {
                if (minAño == 0) {
                    minAño = añoObra;
                    obra = nomObra;
                } else {
                    if (minAño > añoObra) {
                        minAño = añoObra;
                        obra = nomObra;
                    }
                }
                count++;
            }
        }

        if (count == 0) {
            System.out.println("NINGUNA");
        } else if (count == nObras) {
            System.out.println("TODAS");
        } else {
            System.out.println(obra.replaceFirst(" ", ""));
        }
    }
}
