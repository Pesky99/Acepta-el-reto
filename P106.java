
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
public class P106 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (ejercicio()) {

        }
    }

    public static boolean ejercicio() {

        String s = sc.next();

        if (s.equals("0")) {
            return false;
        }
        int sum = 0;
        String cods = s;
        int j = 1;
        if (cods.length() <= 8) {
            for (int i = cods.length() - 2; i >= 0; i--) {
                if (j % 2 != 0) {
                    sum += Integer.parseInt("" + cods.charAt(i)) * 3;
                } else {
                    sum += Integer.parseInt("" + cods.charAt(i));
                }
                j++;
            }
            int test = sum + Integer.parseInt("" + cods.charAt(cods.length() - 1));
            if (test % 10 == 0) {
                System.out.println("SI");
                return true;
            } else {
                System.out.println("NO");
                return true;
            }
        } else {
            for (int i = cods.length() - 2; i >= 0; i--) {
                if (j % 2 != 0) {
                    sum += Integer.parseInt("" + cods.charAt(i)) * 3;
                } else {
                    sum += Integer.parseInt("" + cods.charAt(i));
                }
                j++;
            }
            int test = sum + Integer.parseInt("" + cods.charAt(cods.length() - 1));
            if (test % 10 != 0) {
                System.out.println("NO");
                return true;
            } else {
                System.out.print("SI ");

                if (cods.charAt(0) == '0' || cods.length()<13) {
                    System.out.println("EEUU");
                } else if (cods.subSequence(0, 3).equals("380")) {
                    System.out.println("Bulgaria");
                } else if (cods.subSequence(0, 2).equals("50")) {
                    System.out.println("Inglaterra");
                } else if (cods.subSequence(0, 3).equals("539")) {
                    System.out.println("Irlanda");
                } else if (cods.subSequence(0, 3).equals("560")) {
                    System.out.println("Portugal");
                } else if (cods.subSequence(0, 2).equals("70")) {
                    System.out.println("Noruega");
                } else if (cods.subSequence(0, 3).equals("759")) {
                    System.out.println("Venezuela");
                } else if (cods.subSequence(0, 3).equals("850")) {
                    System.out.println("Cuba");
                } else if (cods.subSequence(0, 3).equals("890")) {
                    System.out.println("India");
                } else {
                    System.out.println("Desconocido");
                }
            }
 
        }

        return true;
    }
}
