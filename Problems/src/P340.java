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
public class P340 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        int veces = sc.nextInt();
        
        for (int i = 0; i < veces; i++) {
            ejercicio();
        }
    }
    
    public static void ejercicio(){
        
        int n = sc.nextInt(); int m = sc.nextInt();
        
        int nCerillas = ((n-1)*3) + 4 + ((m-1)*3) + ((n*m)-n-(m-1))*2;
        
        System.out.println(nCerillas);
    }
}