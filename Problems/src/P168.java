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
public class P168 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int mida = sc.nextInt();

        while(mida!=0){
            boolean last = true; 
            mida = mida -1; 

            int piezas[] = new int [mida];

            for (int i = 0; i < mida; i++) {
                piezas[i] = sc.nextInt();
            }

            Arrays.sort(piezas);

            for (int i = 0; i < mida; i++) {
                if (piezas[i]!=i+1) {
                    last = false; 
                    System.out.println(i+1);
                    break;
                }
            }
            if(last)
                System.out.println(mida+1);
            mida = sc.nextInt();
        } 
    }
}