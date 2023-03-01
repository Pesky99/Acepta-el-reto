
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
public class P534 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (ejercicio()) {

        }
    }

    public static boolean ejercicio() {

        int nCubos = sc.nextInt();

        if (nCubos == 0) {
            return false;
        }
        
        int cubos [] = new int[nCubos];
        for (int i = 0; i < nCubos; i++) {
            cubos [i] = sc.nextInt();
        }
        
        Arrays.sort(cubos);
        
        int maxDif = 0;
        
        for (int i = 0; i < cubos.length-1; i+=2) {
            if(cubos[i+1]-cubos[i]>maxDif){
                maxDif=cubos[i+1]-cubos[i];
            }
        }
        
        System.out.println(maxDif);

        return true;
    }
}
