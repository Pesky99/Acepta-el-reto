
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
public class P120 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (ejercicio());
    }

    public static boolean ejercicio() {
        
        int n = sc.nextInt(); int k = sc.nextInt();
        
        if(n==0 && k==0) return false;
        
        int pasos = 1;
        int constM = 0;
        int fila = 0;
        int columna = n/2;
        for (int i = 1; i < n; i+=2) {
            pasos++;
        }
        int comienzoDiagonal = ((pasos-1)*n)+1;
        
        pasos *=n;
        
        for (int i = 1; i <= pasos; i++) {
            if(i>=comienzoDiagonal) constM+=k;
            k++;
            
        }
        /*int matriz [][] = new int[n][n];
        
        for (int i = 1; i <= pasos; i++) {
            for (int j = 0; j < 1; j++) {
                if(matriz[fila][columna]==0){
                    matriz[fila][columna] = k;
                }else{
                    if(fila==n-1) fila=0;
                    else fila++;
                    if(columna==0) columna=n-1;
                    else columna--;
                    fila++;
                    matriz[fila][columna] = k;
                }
                matriz[fila][columna] = k;
                if(i>=comienzoDiagonal) constM+=k;
                k++;
            }
            if(fila-1<0) fila = n;
            if(columna+1>=n) columna = 0;
            else columna++;
            fila--;
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println("");
        }*/
        
        System.out.println(constM);
        
        return true;
    }
}
