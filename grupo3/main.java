package grupo3;

import java.util.Scanner;
import grupo3.jhanavi.SerieCaracteres;
import grupo3.jhanavi.SerieNumerica;

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

        SerieNumerica serieNum = new SerieNumerica();
        SerieCaracteres serieCar = new SerieCaracteres();

        System.out.println("----- SERIES NUMERICAS -----");
        serieNum.S1_for(n);
        serieNum.S1_while(n);
        serieNum.S1_do_while(n);
        serieNum.S2_for(n);
        serieNum.S2_while(n);
        serieNum.S2_do_while(n);
        serieNum.S3_for(n);
        serieNum.S3_while(n);
        serieNum.S3_do_while(n);
        serieNum.S4_for(n);
        serieNum.S4_while(n);
        serieNum.S4_do_while(n);
        serieNum.S5_for(n);
        serieNum.S5_while(n);
        serieNum.S5_do_while(n);
        serieNum.S6_for(n);
        serieNum.S6_while(n);
        serieNum.S6_do_while(n);
        serieNum.S7_for(n);
        serieNum.S7_while(n);
        serieNum.S7_do_while(n);
        serieNum.S8_for(n);
        serieNum.S8_while(n);
        serieNum.S8_do_while(n);

    }

    
}
