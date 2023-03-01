
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
public class P539 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (sc.hasNext()) {
            ejercicio();
        }
    }
    
    public static void ejercicio(){
        
        int primerA = sc.nextInt(); int Aactual = sc.nextInt();
       

        if((Aactual-primerA)%10==9){
            System.out.println("FELIZ DECADA NUEVA");
        }else{
            System.out.println("TOCA ESPERAR");
        }
    }
}
