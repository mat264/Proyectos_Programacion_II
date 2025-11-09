package g3_Poliretos;

import java.util.Scanner;

import g3_Poliretos.g3_SerieCaracteres.*;
import g3_Poliretos.g3_SerieNumerica.*;
import g3_Poliretos.g3_CadenaDeCaracteres.*;

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

       System.out.print("Ingrese el numero de terminos a generar: ");
       int n = ingresoDatos.nextInt();
       ingresoDatos.nextLine(); 

       while(n <= 0){
        System.out.println("El número que ingreso es incorrecto");
        System.out.println("Ingrese de nuevo el número de términos a generar:");
        n = ingresoDatos.nextInt();
       }

        System.out.println("----- SERIES NUMERICAS -----");

        g3_SerieNum1 serie1 = new g3_SerieNum1();
        serie1.S1Numerica_for(n);
        serie1.S1Numerica_while(n);
        serie1.S1Numerica_do_while(n);

        g3_SerieNum2 serie2 = new g3_SerieNum2();
        serie2.S2Numerica_for(n);
        serie2.S2Numerica_while(n);
        serie2.S2Numerica_do_while(n);

        g3_SerieNum3 serie3 = new g3_SerieNum3();
        serie3.S3Numerica_for(n);
        serie3.S3Numerica_while(n);
        serie3.S3Numerica_do_while(n);

        g3_SerieNum4 serie4 = new g3_SerieNum4();
        serie4.S4Numerica_for(n);
        serie4.S4Numerica_while(n);
        serie4.S4Numerica_do_while(n);

        g3_SerieNum5 serie5 = new g3_SerieNum5();
        serie5.S5Numerica_for(n);
        serie5.S5Numerica_while(n);
        serie5.S5Numerica_do_while(n);

        g3_SerieNum6 serie6 = new g3_SerieNum6();
        serie6.S6Numerica_for(n);
        serie6.S6Numerica_while(n);
        serie6.S6Numerica_do_while(n);

        g3_SerieNum7 serie7 = new g3_SerieNum7();
        serie7.S7Numerica_for(n);
        serie7.S7Numerica_while(n);
        serie7.S7Numerica_do_while(n);

        g3_SerieNum8 serie8 = new g3_SerieNum8();
        serie8.S8Numerica_for(n);
        serie8.S8Numerica_while(n);
        serie8.S8Numerica_do_while(n);

        g3_SerieNum9 serie9 = new g3_SerieNum9();
        serie9.S9Numerica_for(n); 
        serie9.S9Numerica_while(n);
        serie9.S9Numerica_do_while(n);

        g3_SerieNum10 serie10 = new g3_SerieNum10();
        serie10.S10Numerica_for(n);
        serie10.S10Numerica_while(n);
        serie10.S10Numerica_do_while(n);

        g3_SerieNum12 serie12 = new g3_SerieNum12();
        serie12.S12Numerica_for(n);
        serie12.S12Numerica_while(n);
        serie12.S12Numerica_do_while(n);

        System.out.println("--------- SERIES DE CARACTERES -----------");

        g3_SerieCaracter1 serieCaracter1 = new g3_SerieCaracter1();
        serieCaracter1.S1Caracter_for(n);
        serieCaracter1.S1Caracter_while(n);
        serieCaracter1.S1Caracter_do_while(n);

        g3_SerieCaracter2 serieCaracter2 = new g3_SerieCaracter2();
        serieCaracter2.S2Caracter_for(n);
        serieCaracter2.S2Caracter_while(n);
        serieCaracter2.S2Caracter_do_while(n);


        g3_SerieCaracter3 serieCaracter3 = new g3_SerieCaracter3();
        serieCaracter3.S3Caracter_for(n);
        serieCaracter3.S3Caracter_while(n);
        serieCaracter3.S3Caracter_do_while(n);

        g3_SerieCaracter4 serieCaracter4 = new g3_SerieCaracter4();
        serieCaracter4.S4Caracter_for(n);
        serieCaracter4.S4Caracter_while(n);
        serieCaracter4.S4Caracter_do_while(n);

        g3_SerieCaracter5 serieCaracter5 = new g3_SerieCaracter5();
        serieCaracter5.S5Caracter_for(n);
        serieCaracter5.S5Caracter_while(n);
        serieCaracter5.S5Caracter_do_while(n);

        g3_SerieCaracter6 serieCaracter6 = new g3_SerieCaracter6();
        serieCaracter6.S6Caracter_for(n);
        serieCaracter6.S6Caracter_while(n);
        serieCaracter6.S6Caracter_do_while(n);

        g3_SerieCaracter7 serieCaracter7 = new g3_SerieCaracter7();
        serieCaracter7.S7Caracter_for(n);
        serieCaracter7.S7Caracter_while(n);
        serieCaracter7.S7Caracter_do_while(n);

        g3_SerieCaracter8 serieCaracter8 = new g3_SerieCaracter8();
        serieCaracter8.S8Caracter_for(n);
        serieCaracter8.S8Caracter_while(n);
        serieCaracter8.S8Caracter_do_while(n);

        g3_SerieCaracter9 serieCaracter9 = new g3_SerieCaracter9();
        serieCaracter9.S9Caracter_for(n);
        serieCaracter9.S9Caracter_while(n);
        serieCaracter9.S9Caracter_do_while(n);

        g3_SerieCaracter10 serieCaracter10 = new g3_SerieCaracter10();
        serieCaracter10.S10Caracter_for(n);
        serieCaracter10.S10Caracter_while(n);
        serieCaracter10.S10Caracter_do_while(n);


        System.out.println("----- CADENA DE CARACTERES -----");

        g3_CadenaDeCaracteres1 cadena1 = new g3_CadenaDeCaracteres1();
        cadena1.Cadena1();
        
        g3_CadenaDeCaracteres2 cadena2 = new g3_CadenaDeCaracteres2();
        cadena2.Cadena2();
        
        g3_CadenaDeCaracteres3 cadena3 = new g3_CadenaDeCaracteres3();
        cadena3.Cadena3(ingresoDatos);  

        g3_CadenaDeCaracteres4 cadena4 = new g3_CadenaDeCaracteres4();
        cadena4.Cadena4(ingresoDatos);

        g3_CadenaDeCaracteres5 cadena5 = new g3_CadenaDeCaracteres5();
        cadena5.Cadena5(ingresoDatos);

        g3_CadenaDeCaracteres6 cadena6 = new g3_CadenaDeCaracteres6();
        cadena6.Cadena6(ingresoDatos);

        g3_CadenaDeCaracteres7 cadena7 = new g3_CadenaDeCaracteres7();
        cadena7.Cadena7(ingresoDatos);
        
        g3_CadenaDeCaracteres8 cadena8 = new g3_CadenaDeCaracteres8();
        cadena8.Cadena8(ingresoDatos);

        g3_CadenaDeCaracteres9 cadena9 = new g3_CadenaDeCaracteres9();
        cadena9.Cadena9(ingresoDatos);

        ingresoDatos.close(); 
    }
}