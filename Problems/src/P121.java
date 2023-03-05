
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author teres
 */
public class P121 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (ejercicio()) {
        }
    }

    public static boolean ejercicio() {
        int necesario = sc.nextInt();
        int regalo = sc.nextInt();
        int chicles = sc.nextInt();

        if (necesario == 0 && regalo == 0 && chicles == 0) {
            return false;
        }

        if (chicles < necesario || regalo==0) {
            System.out.println(chicles + " " + chicles);
            return true;
        }

        if (regalo >= necesario && chicles >= necesario) {
            System.out.println("RUINA");
            return true;
        }

        int divisores = chicles;
        int residual = 0;
        for (int i = divisores; i/necesario>=1;) {
            chicles += i / necesario;
            if(i%necesario<necesario){
                residual = i%necesario;
            }
            i = (divisores / necesario)+residual;
            divisores = i;
        }
        
        System.out.println(chicles + " " + divisores);
        return true;
    }
}
