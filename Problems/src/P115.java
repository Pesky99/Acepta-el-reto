
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
public class P115 {

    static public Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (ejercicio());
    }

    public static boolean ejercicio() {

        int n = sc.nextInt();

        if (n == 0) {
            return false;
        }

        long nD = (long) Math.pow(n, 2);

        String nDS = "" + nD;
        String nDSn = "" + nD;
        String nDS1 = "";
        String nDS2 = "";
        //String nDS3 = "";
        //String nDS4 = "";
        int n1;
        int n2;
       // int n3;
        //int n4;
        boolean si = false;
        if (n == 1) {
            System.out.println("SI");
        } else if (n > 1 && n < 9) {
            System.out.println("NO");
        } else {
            for (int i = 0; i < nDS.length(); i++) {

                nDS1 = nDS1 + nDSn.charAt(i);

                nDS2 = nDS.replaceFirst(nDS.charAt(0) + "", "");
                nDS = nDS.replaceFirst(nDS.charAt(0) + "", "");

                n1 = Integer.parseInt(nDS1);
                n2 = Integer.parseInt(nDS2);

                if (n1 + n2 == n && n1 > 0 && n2 > 0) {
                    si = true;
                    break;
                }
            }

            if (si) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }

        /*
        if (n == 1) {
            System.out.println("SI");
        } else if (n > 1 && n < 9) {
            System.out.println("NO");
        } else {
            if (nDS.length() % 2 == 0) {
                int pos = nDS.length() / 2;
                System.out.println("nds " + nDS);
                for (int i = 0; i < pos; i++) {
                    nDS1 = nDS1 + nDS.charAt(i);
                }

                for (int i = pos; i < pos + pos; i++) {
                    nDS2 = nDS2 + nDS.charAt(i);
                }

                n1 = Integer.parseInt(nDS1);
                n2 = Integer.parseInt(nDS2);
                
                System.out.println(n1);
                System.out.println(n2);

                if (n1 + n2 == n) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
            } else if (nDS.length() % 2 != 0) {
                int pos1 = nDS.length() / 2;

                for (int i = 0; i < pos1 + 1; i++) {
                    nDS1 = nDS1 + nDS.charAt(i);
                }

                for (int i = pos1 + 1; i < pos1 + pos1 + 1; i++) {
                    nDS2 = nDS2 + nDS.charAt(i);
                }

                for (int i = 0; i < pos1; i++) {
                    nDS3 = nDS3 + nDS.charAt(i);
                }
                for (int i = pos1; i < pos1 + pos1 + 1; i++) {
                    nDS4 = nDS4 + nDS.charAt(i);
                }

                n1 = Integer.parseInt(nDS1);
                n2 = Integer.parseInt(nDS2);
                n3 = Integer.parseInt(nDS3);
                n4 = Integer.parseInt(nDS4);
                
                System.out.println(n1);
                System.out.println(n2);
                System.out.println(n3);
                System.out.println(n4);

                if (n1 + n2 == n && n1 > 0 && n2 > 0 || n3 + n4 == n && n3 > 0 && n4 > 0) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
            }
        }
         */
        return true;
    }
}
