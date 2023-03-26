
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
public class P513 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (sc.hasNext()) {
            ejercicio();
        }
    }

    public static void ejercicio() {

        int dias = sc.nextInt();
        int media;
        int trabajoDias;
        int resta = 0;
        for (int i = 1; i <= dias; i++) {
            media = sc.nextInt();
            
            trabajoDias = media*i-resta;
            
            resta += trabajoDias;
            if(i!=dias){
                System.out.print(trabajoDias + " ");
            }else{
                System.out.println(trabajoDias);
            }
            
            
        }
    }
}
