
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
public class P674 {

    static Scanner sc = new Scanner(System.in);

    public static boolean ejercicio() {

        int d = sc.nextInt();
        long n = sc.nextLong();
        if (d == 0 && n == 0) {
            return false;
        }

        long restaSobrante = 0;

        if (d < 5 && n == 0) {
            System.out.println(d);
            return true;
        }
        if (d >= 5 && n == 0) {
            System.out.println("NINGUNO");
            return true;
        }
        long sobrante = (n / 5);
        long sinS = (n - sobrante);
        for (; sinS >= 5;) {
            restaSobrante += sinS / 5;
            sinS = sinS / 5;
        }

        long nCeros = 0;
        long num = n - restaSobrante;
        long num2 = num * 5;

        for (; nCeros > n || nCeros == 0;) {
            num2 = num * 5;
            nCeros = 0;
            for (long i = num2; i >= 5;) {
                nCeros += i / 5;
                i = i / 5;
            }
            if (nCeros== n) {
                break;
            }
            num--;
        }

        if (nCeros != n) {
            System.out.println("NINGUNO");
            return true;
        }
        for (int i = 0; i < 5; i++) {
            if ((num2 + i) % d == 0 && nCeros == n) {
                System.out.println(num2 + i);
                return true;
            }
        }
        System.out.println("NINGUNO");

        return true;
    }

    public static void main(String[] args) {

        while (ejercicio());

    }
}