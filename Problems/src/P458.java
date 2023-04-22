
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
public class P458 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (ejercicio()) {

        }
    }

    public static boolean ejercicio() {

        int n = sc.nextInt();

        if (n == 0) {
            return false;
        }

        long array[] = new long[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        Arrays.sort(array);
        
        long minM = array[array.length - 1] * array[array.length - 2];
        long minm = array[0] * array[1];

        if (minM < minm) {
            System.out.println(minm);
        }else{
            System.out.println(minM);
        }

        return true;
    }
}
