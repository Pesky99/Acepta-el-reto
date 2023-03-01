import java.util.Scanner;

/*
 * Este programa calcula el ancho y el alto de un puzzle según la entrada del 
 * total de piezas
 */
/**
 *
 * @author Miguel Gaytan Labro
 */
public class Prueba4 {

    // VARIABLES
    public static int totalPiezas;// Representa el número total de piezas que tiene el puzzle
    public static int piezasAncho;// Representa la cantidad de piezas que tiene por ancho
    public static int piezasAlto;// Representa la cantidad de piezas que tiene por alto

    // ENTRADA DATOS
    public static Scanner sc;

    // FUNCIÓN 1
    public static void calcularVordes() {

        // BUCLE HASTA QUE LA ENTRADA DE LAS PIEZAS DEL PUZZLE SEA 0
        do {

            //LECTURA DE LAS PIEZAS TOTALES
            totalPiezas = sc.nextInt();

            // CONDICIÓN PARA LA CANTIDAD DE PIEZAS, QUE NO SEA PRIMO, MAYOR QUE 0 Y MENOR QUE 10^9
            if (totalPiezas > 0 && totalPiezas <= 1000000000) {
                piezasAncho = (int) Math.sqrt(totalPiezas);
                piezasAlto = (int) Math.sqrt(totalPiezas);
                if (piezasAncho * piezasAlto == totalPiezas) {
                    System.out.println(piezasAncho);
                } else {
                    do {
                        
                        if (totalPiezas % piezasAlto != 0) {
                            piezasAlto--;
                        }

                        
                    } while (totalPiezas % piezasAlto != 0);
                    piezasAncho=totalPiezas/piezasAlto;
                    System.out.println(piezasAncho);
                }
                piezasAncho = 1;
                piezasAlto = 1;
            }

        } while (totalPiezas != 0);

    }

    // EJECUCIÓN DEL PROGRAMA
    public static void main(String[] args) {

        // ENTRADA DATOS 
        sc = new Scanner(System.in);

        // FUNCIÓN 1
        calcularVordes();
    }
}