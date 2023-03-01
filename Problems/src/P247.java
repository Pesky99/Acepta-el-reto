
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
public class P247 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (ejercicio());
    }

    public static boolean ejercicio() {

        int dias = sc.nextInt();

        if (dias == 0) {
            return false;
        }

        int economia[] = new int[dias];
        boolean bien = true;
        for (int i = 0; i < dias; i++) {
            economia[i] = sc.nextInt();
            if (i > 0) {
                if (economia[i - 1] >= economia[i]) {
                    bien = false;
                }
            }
        }

        if (bien) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

        return true;
    }
}
