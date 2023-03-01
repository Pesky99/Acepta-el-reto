/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P_12UVAS_2017;

import java.util.Scanner;

/**
 *
 * @author teres
 */
public class P438 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while(sc.hasNext())ejercicio();
    }
    public static void ejercicio(){
        String mensaje = sc.nextLine();
        int nLetras=0;
        mensaje = mensaje.replaceAll(" ", "");
        String mensajeSin = mensaje.replaceAll("!", "");
        for (int i = 0; i < mensaje.length(); i++) {
            if(Character.isLetter(mensaje.charAt(i)))nLetras++; 
        }
        
        if(mensajeSin.length()==0) System.out.println("ESGRITO");
        else{
            int nSignos = mensaje.length()-mensajeSin.length();
            if(nSignos>nLetras)System.out.println("ESGRITO");
            else System.out.println("escrito");
        }
    }
}