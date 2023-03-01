/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class P638 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int nCasos = sc.nextInt();

        for (int i = 0; i < nCasos; i++) {
            ejercicio();
        }
    }

    public static void ejercicio() {

        int c = sc.nextInt();
        int n = sc.nextInt();
        int k = n%(c-1);
        int min = 0;
        int max = 0;
           if(n%(c-1)==0){
               max=n+(n/(c-1));
               min=max-1;
           }else if (n%(c-1)!=0){              
               max=n+k;
               min=max;
           }
        System.out.println(min + " " + max);
    }

}
