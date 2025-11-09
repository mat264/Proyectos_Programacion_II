package g3_Poliretos;

import java.util.Scanner;

import g3_Array.g3_Arrays1;
import g3_Array.g3_Arrays2;
import g3_Array.g3_Arrays3;
import g3_Array.g3_Arrays4;
import g3_Array.g3_Arrays5;
import g3_Loading.g3_Loading1;
import g3_Loading.g3_Loading10;
import g3_Loading.g3_Loading11;
import g3_Loading.g3_Loading12;
import g3_Loading.g3_Loading2;
import g3_Loading.g3_Loading3;
import g3_Loading.g3_Loading4;
import g3_Loading.g3_Loading5;
import g3_Loading.g3_Loading6;
import g3_Loading.g3_Loading7;
import g3_Loading.g3_Loading8;
import g3_Loading.g3_Loading9;
import g3_LoadingPoliretos.g3_CadenaDeCaracteres.*;
import g3_LoadingPoliretos.g3_SerieCaracteres.*;
import g3_LoadingPoliretos.g3_SerieNumerica.*;
import g3_SerieCaracteres.g3_SerieCaracter1;
import g3_SerieCaracteres.g3_SerieCaracter2;
import g3_SerieNumerica.g3_SerieNum1;
import g3_SerieNumerica.g3_SerieNum10;
import g3_SerieNumerica.g3_SerieNum12;
import g3_SerieNumerica.g3_SerieNum2;
import g3_SerieNumerica.g3_SerieNum3;
import g3_SerieNumerica.g3_SerieNum4;
import g3_SerieNumerica.g3_SerieNum5;
import g3_SerieNumerica.g3_SerieNum6;
import g3_SerieNumerica.g3_SerieNum7;
import g3_SerieNumerica.g3_SerieNum8;
import g3_SerieNumerica.g3_SerieNum9;

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
    

    System.out.println("--------- EJERCICIOS ARRAYS -----------");

<<<<<<< Updated upstream
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
=======
        g3_Arrays1 array1 = new g3_Arrays1();
        array1.g3_arrayA01_for();
        array1.g3_arrayA01_while();
        array1.g3_arrayA01_do_while();
>>>>>>> Stashed changes

        g3_Arrays2 array2 = new g3_Arrays2();
        array2.g3_arrayA02_for(n); 
        array2.g3_arrayA02_while(n);
        array2.g3_arrayA02_do_while(n);

        g3_Arrays3 array3 = new g3_Arrays3();
        array3.g3_arrayA03_for(n); 
        array3.g3_arrayA03_while(n);
        array3.g3_arrayA03_do_while(n);

        g3_Arrays4 array4 = new g3_Arrays4();
        array4.g3_arrayA04_for(); 
        array4.g3_arrayA04_while();
        array4.g3_arrayA04_do_while();

        g3_Arrays5 array5 = new g3_Arrays5();
        array5.g3_arrayA05_for(); 
        array5.g3_arrayA05_while();
        array5.g3_arrayA05_do_while();
    
    
    System.out.println("--------- EJERCICIOS LOADING L01-L12 -----------");

        g3_Loading1 l01 = new g3_Loading1();
        l01.g3_L01_for(); l01.g3_L01_while(); l01.g3_L01_do_while();
        
        g3_Loading2 l02 = new g3_Loading2();
        l02.g3_L02_for(); l02.g3_L02_while(); l02.g3_L02_do_while();
        
        g3_Loading3 l03 = new g3_Loading3();
        l03.g3_L03_for(); l03.g3_L03_while(); l03.g3_L03_do_while();
        
        g3_Loading4 l04 = new g3_Loading4();
        l04.g3_L04_for(); l04.g3_L04_while(); l04.g3_L04_do_while();
        
        g3_Loading5 l05 = new g3_Loading5();
        l05.g3_L05_for(); l05.g3_L05_while(); l05.g3_L05_do_while();
        
        g3_Loading6 l06 = new g3_Loading6();
        l06.g3_L06_for(); l06.g3_L06_while(); l06.g3_L06_do_while();
        
        g3_Loading7 l07 = new g3_Loading7();
        l07.g3_L07_for(); l07.g3_L07_while(); l07.g3_L07_do_while();
        
        g3_Loading8 l08 = new g3_Loading8();
        l08.g3_L08_for(); l08.g3_L08_while(); l08.g3_L08_do_while();
        
        g3_Loading9 l09 = new g3_Loading9();
        l09.g3_L09_for(); l09.g3_L09_while(); l09.g3_L09_do_while();
        
        g3_Loading10 l10 = new g3_Loading10();
        l10.g3_L10_for(); l10.g3_L10_while(); l10.g3_L10_do_while();
        
        g3_Loading11 l11 = new g3_Loading11();
        
        System.out.println("--- L11a (Simétrico) ---");

        l11.g3_L11a_for(n); l11.g3_L11a_while(n); l11.g3_L11a_do_while(n);

        System.out.println("--- L11b (Vectorial) ---");
        l11.g3_L11b_for(n); l11.g3_L11b_while(n); l11.g3_L11b_do_while(n);
        
        g3_Loading12 l12 = new g3_Loading12();
        l12.g3_L12_for(n); l12.g3_L12_while(n); l12.g3_L12_do_while(n);
    
    
    
    
    
    }
} 