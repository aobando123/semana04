/**
 * Notas
 * Descripción: Determinar la situaciondel estudiante en base a la nota
 * Fecha:9 de febrero del 2017
 * Autor:Adrián Obando Leitón
 * Fecha de modificación: 09-02-17
 * Modificado por: Adrián Obando Leitón
 */
package ejerciciosBasicos;

//Librerias

import java.io.*;

public class Notas {

    public static void main(String[] args) throws IOException {//Inicia el programa
        //Variables
        int nota;
        String estatus;
        //variables de entrada y salida
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        PrintStream imprimir = System.out;
        //codigo
        imprimir.println("Digite su nota");
        nota = Integer.parseInt(leer.readLine());

        if (nota >= 70) {
            estatus = "Aprobado";
        } else if (nota >= 60) {
            estatus = "Aplazado";
        } else {
            estatus = "Reprobado";
        }
        
        imprimir.println("Usted esta: "+estatus);
    }//Termina el programa
}