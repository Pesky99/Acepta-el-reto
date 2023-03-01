
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
public class P192 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (ejercicio());
    }

    public static boolean ejercicio() {

        int num;

        num = sc.nextInt();
        if (num == 0) {
            return false;
        }

        boolean si3=false;
        for (int i = num; i > 0; i -= 5) {
            if(i%3==0 && i%5!=0){
                si3=true;
                break;
            }
        }
        if (num % 3 == 0 && num % 5 != 0 || (num - 5) % 3 == 0 && num != 5 || num == 1 || (num - 1) % 5 == 0 || si3==true) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

        return true;
    }

}
