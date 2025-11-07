package g3_Poliretos;

import java.util.Scanner;

import g3_Poliretos.g3_SerieCaracteres.SerieCaracteres;
import g3_Poliretos.g3_SerieNumerica.*;

public class Controller {
    public void inicializar () {
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

        g3_S2 serie2 = new g3_S2();
        serie2.S2_for(n);
        serie2.S2_while(n);
        serie2.S2_do_while(n);

        g3_S3 serie3 = new g3_S3();
        serie3.S3_for(n);
        serie3.S3_while(n);
        serie3.S3_do_while(n);

        g3_S4 serie4 = new g3_S4();
        serie4.S4_for(n);
        serie4.S4_while(n);
        serie4.S4_do_while(n);

        g3_S5 serie5 = new g3_S5();
        serie5.S5_for(n);
        serie5.S5_while(n);
        serie5.S5_do_while(n);

        g3_S6 serie6 = new g3_S6();
        serie6.S6_for(n);
        serie6.S6_while(n);
        serie6.S6_do_while(n);

        g3_S7 serie7 = new g3_S7();
        serie7.S7_for(n);
        serie7.S7_while(n);
        serie7.S7_do_while(n);

        g3_S8 serie8 = new g3_S8();
        serie8.S8_for(n);
        serie8.S8_while(n);
        serie8.S8_do_while(n);

        g3_S9 serie9 = new g3_S9();
        serie9.S9_for(n); 
        serie9.S9_while(n);
        serie9.S9_do_while(n);

        g3_S10 serie10 = new g3_S10();
        serie10.S10_for(n);
        serie10.S10_while(n);
        serie10.S10_do_while(n);

        g3_S12 serie12 = new g3_S12();
        serie12.S12_for(n);
        serie12.S12_while(n);
        serie12.S12_do_while(n);
    }
}
