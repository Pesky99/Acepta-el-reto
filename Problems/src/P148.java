
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
public class P148 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (ejercicio()) {
        }
    }

    public static boolean ejercicio() {
        String hora = sc.next();

        if (hora.equals("00:00")) {
            return false;
        }

        hora = hora.replace(":", "");

        int hI = Integer.parseInt(hora);
        
        int dif = 2360-hI;
        
        int nDeVueltas = dif/100;
        
        int minF = dif - (nDeVueltas*40);
        
        System.out.println(minF);

        return true;
    }
}
