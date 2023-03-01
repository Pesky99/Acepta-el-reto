import java.util.Arrays;
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
public class P234 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int veces = sc.nextInt();

        for (int i = 0; i < veces; i++) {
            ejercicio();
        }
    }

    public static void ejercicio() {
        int n = sc.nextInt(); int vMin = sc.nextInt();
        int nCoches=0;
        int pilas [] = new int[n];
        for (int i = 0; i < n; i++) {
            pilas [i] = sc.nextInt();
        }
        
        Arrays.sort(pilas);
        
        for (int i = 0, j = pilas.length-1; i <=n/2 && j>=n/2 || i<j; i++) {
            if(pilas[i]+pilas[j]>=vMin && i!=j){
                nCoches++;
                j--;
            }
        }
        
        System.out.println(nCoches);
    }
}