
import java.util.Arrays;
import java.util.Locale;
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
public class P103{

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (ejercicio());
    }

    public static boolean ejercicio() {
        sc.useLocale(Locale.US);
        byte gradoPolinomio;

        gradoPolinomio = sc.nextByte();

        if (gradoPolinomio == 200) {
            return false;
        }

        double sumatorio = 0;
        double coeficientes[] = new double[gradoPolinomio + 1];
        double areas = 1;
        double sumaF = 0;
        
        for (int i = gradoPolinomio; i>=0; i--) {
            coeficientes[i] = sc.nextDouble();
        }

        double nRectangulos = sc.nextDouble();

        for (int i = 0; i < nRectangulos; i++) {
            for (int j = 0, k = 0; j < coeficientes.length; j++, k++) {
                if (j > 0){
                    sumatorio = sumatorio + coeficientes[j]* (Math.pow((i / nRectangulos), k));
                } else {
                    sumatorio = sumatorio + coeficientes[j];
                }
                
            }
            if (sumatorio > 0 && sumatorio < 1) {
                sumaF = sumaF + (sumatorio/ nRectangulos);
            } else if (sumatorio >= 1) {
                sumaF = sumaF + (1/nRectangulos);
            }
            sumatorio=0;
        }

        areas = 1 - sumaF;

        System.out.println("areas " + areas);
        if (areas-sumaF<0.001 && areas-sumaF>0) {
            System.out.println("JUSTO");
        } else if (areas > sumaF) {
            System.out.println("ABEL");
        } else if (sumaF > areas) {
            System.out.println("CAIN");
        }

        return true;
    }

}
