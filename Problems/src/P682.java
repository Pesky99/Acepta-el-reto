
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
public class P682 {

    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            ejercicio();
        }

    }

    public static void ejercicio() {
        int p = sc.nextInt();
        
        System.out.println(p + " " + p*2);
    }
}
