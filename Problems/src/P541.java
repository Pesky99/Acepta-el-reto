
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
public class P541 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (ejercicio());
    }

    public static boolean ejercicio() {

        long i = sc.nextLong();
        long v = sc.nextLong();
        long x = sc.nextLong();

        if (i == 0 && v == 0 && x == 0) {
            return false;
        }
        
        long mcdIV = mcd(i,v);
        
        long molde = mcd(mcdIV,x);

        long pMolde = i/molde + v/molde + x/molde;
        
        System.out.println(pMolde);
        
        return true;
    }

    public static long mcd(long i, long v) {
        if (v == 0) {
            return i;
        }

        return mcd(v, i % v);
    }
}
