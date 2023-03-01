import java.math.BigInteger;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author teres
 */
public class P374 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            ejercicio();
        }
    }

    public static void ejercicio() {

        long temp = sc.nextLong();
        long maxTemp = temp;
        long minTemp = temp;
        int countMax = 0;
        int countMin = 0;

        while (temp != 0) {
            if (temp >= maxTemp) {
                if (temp == maxTemp) {
                    countMax++;
                } else {
                    maxTemp = temp;
                    countMax = 1;
                }
            }
            if (temp <= minTemp) {
                if (temp == minTemp) {
                    countMin++;
                } else {
                    minTemp = temp;
                    countMin = 1;
                }
            }
            temp = sc.nextLong();
        }

        System.out.println(minTemp + " " + countMin + " " + maxTemp + " " + countMax);
    }
}