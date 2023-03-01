
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
public class P100 {

    /**
     *
     */
    public static Scanner sc = new Scanner(System.in);

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        // Variables 
        int multiplica = 1000;
        int divide = 1000;
        int numero;
        int modulo = 1000;
        int casos;
        int restos[] = new int[4];
        int invertido[] = new int[4];
        int nuevoNumero = 0;
        int nuevoNumero2 = 0;
        byte contador = 0;

        casos = sc.nextInt();
        do {
            if (casos > 0) {
                numero = sc.nextInt();
                if (numero != 6174) {
                    do {
                        for (int i = 0; i < 4; i++) {
                            restos[i] = numero / divide;
                            divide = divide / 10;
                            numero = numero % modulo;
                            modulo = modulo / 10;

                        }
                        Arrays.sort(restos);
                        for (int i = restos.length - 1, j = 0; i >= 0 && j < 4; i--, j++) {
                            invertido[j] = restos[i];
                        }

                        for (int i = 0; i < restos.length; i++) {
                            nuevoNumero = nuevoNumero + restos[i] * multiplica;
                            nuevoNumero2 = nuevoNumero2 + invertido[i] * multiplica;
                            multiplica = multiplica / 10;
                        }
                        numero = nuevoNumero2 - nuevoNumero;
                        
                        if (numero == 0){
                            contador = 7;
                        }

                        contador++;
                        divide = 1000;
                        modulo = 1000;
                        nuevoNumero2 = 0;
                        nuevoNumero = 0;
                        multiplica = 1000;

                    } while (numero != 6174 && numero != 0);
                } 
                System.out.println(contador);
                casos--;
                contador = 0;
            }
        } while (casos > 0);

    }
}
