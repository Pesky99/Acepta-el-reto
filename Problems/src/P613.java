
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
public class P613 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (sc.hasNext()) {
            ejercicio();
        }
    }

    public static void ejercicio() {

        double n = sc.nextDouble();
        
        String mult = "1";
        
        double nM = Double.parseDouble(mult);
        
        while(nM%n!=0){
            mult = mult+"1";
            
            nM = Double.parseDouble(mult);
        }
        
        System.out.println(mult.length());
    }
}
