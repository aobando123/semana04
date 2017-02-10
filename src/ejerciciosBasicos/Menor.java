/**
 * Nombre del programa
 * Descripción: 
 * Fecha:9 de febrero del 2017
 * Autor:Adrián Obando Leitón
 * Fecha de modificación: 09-02-17
 * Modificado por: Adrián Obando Leitón
 */
package ejerciciosBasicos;

//Librerias

import java.io.*;

public class Menor {

    public static void main(String[] args) throws IOException {//Inicia el programaaa
        //variables
        int num1,num2,num3;
        int menor;
        //variables de entrada y salida
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        PrintStream imprimir = System.out;
        //codigo
        imprimir.println("Digite tres numeros separados por enter: ");
        num1 = Integer.parseInt(leer.readLine());
        num2 = Integer.parseInt(leer.readLine());
        num3 = Integer.parseInt(leer.readLine());

        if (num1 < num2) {
            if (num1 < num3) {
                menor = num1;
            } else {
                menor = num3;
            }
        } else if (num2 < num3) {
            menor = num2;
        } else {
            menor = num3;
        }
        imprimir.println("El numero menor es: " + menor);

    }//Termina el programa
}