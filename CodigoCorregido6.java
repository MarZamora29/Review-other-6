//Jueves 18 de Septiembre de 2025
//MarZamora29

/*
 * Este programa genera un arreglo de 20 números aleatorios entre 20 y 400.
 * Luego pregunta al usuario si desea resaltar los múltiplos de 5 o de 7.
 * Finalmente, imprime los números, resaltando los múltiplos seleccionados entre corchetes.
 * Se corrigieron errores de sintaxis, lógica y se mejoró la legibilidad del código.
 */

import java.util.Scanner;

public class Codigo6 {

    public static void main(String[] args) {
        int[] n = new int[20]; // Corregido: declaración de arreglo

        // Generar 20 números aleatorios entre 20 y 400
        for (int i = 0; i < 20; i++) {
            n[i] = (int)(Math.random() * 381) + 20; // 20 a 400
            System.out.print(n[i] + " "); // Corregido System.print a System.out.print
        }

        System.out.println(); // Salto de línea
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario qué múltiplos quiere resaltar
        System.out.print("¿Qué números quiere resaltar? ");
        System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
        int opcion = sc.nextInt(); // Corregido método de lectura de consola

        int multiplo = (opcion == 1) ? 5 : 7; // Corregido operador ternario

        // Imprimir números resaltando los múltiplos
        for (int e : n) { // Corregido foreach y tipo de dato
            if (e % multiplo == 0) {
                System.out.print("[" + e + "] "); // Resalta múltiplos
            } else {
                System.out.print(e + " "); // Imprime el resto normal
            }
        }

        sc.close(); // Cerrar Scanner
    }
}
