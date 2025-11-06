package g3_Poliretos;

import java.util.Scanner;

import g3_Poliretos.g3_SerieCaracteres.SerieCaracteres;
import g3_Poliretos.g3_SerieNumerica.*;

public class main {
    public static void main(String[] args) {
       Scanner ingresoDatos = new Scanner(System.in);

       System.out.println("--------- GRUPO 3 ---------");
       System.out.println("INTEGRANTES:");
       System.out.println("Lanchimba.Danny");
       System.out.println("Lima.Diego");
       System.out.println("López.John");
       System.out.println("Mejía.Mathias");
       System.out.println("Molina.Jhanavi");
       System.out.println("---------------------------");

       System.out.println("Ingrese el numero de terminos a generar: ");
       int n = ingresoDatos.nextInt();

        System.out.println("----- SERIES NUMERICAS -----");

        g3_S1 serie1 = new g3_S1();
        serie1.S1_for(n);
        serie1.S1_while(n);
        serie1.S1_do_while(n);

    }

    
}
