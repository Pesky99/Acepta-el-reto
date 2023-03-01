
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
public class P540 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            ejercicio();
        }

        int a = 50;
        int b = 120;
        int mcdRecursivo = maximoComunDivisorRecursivo(a, b);
        System.out.printf("El MCD de %d y %d (con recursividad) es %d\n", a, b, mcdRecursivo);
    }

    public static void ejercicio() {
        int pisos = sc.nextInt();
        int esc = sc.nextInt();
        int pSubidos = sc.nextInt();
        int escSubidas = sc.nextInt();

        int bajar = pSubidos * esc + escSubidas;
        int subir = pisos * esc + bajar;

        System.out.println(bajar + " " + subir);

    }

    public static int maximoComunDivisorRecursivo(int a, int b) {
        if (b == 0) {
            return a;
        }
        System.out.println(a);
        return maximoComunDivisorRecursivo(b, a % b);
    }

}
