import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alumno
 */
public class P411 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (ejercicio()) {

        }
    }

    public static boolean ejercicio() {

        int tela = sc.nextInt();

        if (tela == 0) {
            return false;
        }
        
        int pesos = -1;
        int ele=0;
        boolean seguir = true;
        for (int i = 0; pesos!=0; i++) {
            pesos = sc.nextInt();
            if(tela-pesos>=0 && pesos!=0 && seguir){
                tela -= pesos;
                ele++;
            }else{
                seguir = false;
            }
        }
        
        System.out.println(ele);

        return true;
    }
}