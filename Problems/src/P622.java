/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class P622 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (ejercicio());
    }

    public static boolean ejercicio() {

        int examenes;
        int notas;
        int media;
        int metaM;
        int notaObj;

        examenes = sc.nextInt();

        if (examenes == 0) {
            return false;
        }
        media = 0;

        for (int i = 0; i < examenes; i++) {
            notas = sc.nextInt();
            media = media + notas;
        }

        metaM = sc.nextInt();

        
        
        notaObj = (((examenes + 1) * metaM) - media);

        if (notaObj >= 0 && notaObj <= 10) {
            System.out.println(notaObj);

        } else {
            System.out.println("IMPOSIBLE");

        }
        return true;
    }
}
