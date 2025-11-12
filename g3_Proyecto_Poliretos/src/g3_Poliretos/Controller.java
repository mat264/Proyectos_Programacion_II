package g3_Poliretos;

import java.util.Scanner;

import g3_Poliretos.g3_SerieCaracteres.*;
import g3_Poliretos.g3_SerieNumerica.*;
import g3_Poliretos.g3_Array.*;
import g3_Poliretos.g3_Loading.*;
import g3_Poliretos.g3_CadenaDeCaracteres.*;
import g3_Poliretos.g3_Figuras.*;
import g3_Poliretos.g3_GrafoyAutomata.*;
import g3_Poliretos.g3_Recursion.*;
import g3_Poliretos.g3_SerieCaracteres.*;
import g3_Poliretos.g3_SerieNumerica.*;
import java.util.Scanner;


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

         int n;
    do {
    System.out.println("Ingrese el numero de terminos a generar: ");
    try {
        n = Integer.parseInt(ingresoDatos.nextLine());
        if (n <= 0) {
            System.out.println("Ingrese un tamaño valido");
        }
    } catch (NumberFormatException error) {
        System.out.println("Ingrese numeros no letras");
        n = -1;
    }
    }      while (n <= 0);
       
        

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


        System.out.println("--------- FIGURAS -----------");
        g3_Figuras figura = new g3_Figuras();
        figura.g3_figuraF1(n);
        figura.g3_figuraF2(n);
        figura.g3_figuraF3(n);
        figura.g3_figuraF4(n);
        figura.g3_figuraF5(n);  
        figura.g3_figuraF6(n);
        figura.g3_figuraF7(n);
        figura.g3_figuraF8(n);
        figura.g3_figuraF9(n);
        figura.g3_figuraF10(n);
        figura.g3_figuraF11(n);
        figura.g3_figuraF12(n);
        figura.g3_figuraF13(n);
        figura.g3_figuraF14(n);
        figura.g3_figuraF15(n);
        figura.g3_figuraF16(n);
        figura.g3_figuraF17(n);
        figura.g3_figuraF18(n);
        figura.g3_figuraF19(n);

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
       

System.out.println("--------- EJERCICIOS ARRAYS -----------");
        g3_Array1 array1 = new g3_Array1();
        array1.g3_arrayA01_for(ingresoDatos);
        array1.g3_arrayA01_while(ingresoDatos);
        array1.g3_arrayA01_do_while(ingresoDatos);
        
        g3_Array2 array2 = new g3_Array2();
        array2.g3_arrayA02_for(n, ingresoDatos); 
        array2.g3_arrayA02_while(n, ingresoDatos);
        array2.g3_arrayA02_do_while(n, ingresoDatos);

        g3_Array3 array3 = new g3_Array3();
        array3.g3_arrayA03_for(n, ingresoDatos); 
        array3.g3_arrayA03_while(n, ingresoDatos);
        array3.g3_arrayA03_do_while(n, ingresoDatos);

        g3_Array4 array4 = new g3_Array4();
        array4.g3_arrayA04_for(ingresoDatos); 
        array4.g3_arrayA04_while(ingresoDatos);
        array4.g3_arrayA04_do_while(ingresoDatos);

        g3_Array5 array5 = new g3_Array5();       
        array5.g3_arrayA05_for(ingresoDatos); 
        array5.g3_arrayA05_while(ingresoDatos);
        array5.g3_arrayA05_do_while(ingresoDatos);
    
    
System.out.println("--------- EJERCICIOS LOADING L01-L12 -----------");

        g3_Loading1 l01 = new g3_Loading1();
        l01.g3_L01_for(); l01.g3_L01_while(); l01.g3_L01_do_while();
        
        g3_Loading2 l02 = new g3_Loading2();
        l02.g3_L02_for(ingresoDatos); l02.g3_L02_while(ingresoDatos); l02.g3_L02_do_while(ingresoDatos);
        
        g3_Loading3 l03 = new g3_Loading3();
        // Se pasa 'ingresoDatos'
        l03.g3_L03_for(ingresoDatos); l03.g3_L03_while(ingresoDatos); l03.g3_L03_do_while(ingresoDatos);
        
        g3_Loading4 l04 = new g3_Loading4();
        l04.g3_L04_for(); l04.g3_L04_while(); l04.g3_L04_do_while();
        
        g3_Loading5 l05 = new g3_Loading5();
        l05.g3_L05_for(); l05.g3_L05_while(); l05.g3_L05_do_while();
        
        g3_Loading6 l06 = new g3_Loading6();
        l06.g3_L06_for(); l06.g3_L06_while(); l06.g3_L06_do_while();
        
        g3_Loading7 l07 = new g3_Loading7();
        l07.g3_L07_for(); l07.g3_L07_while(); l07.g3_L07_do_while();
        
        g3_Loading8 l08 = new g3_Loading8();
        l08.g3_L08_for(ingresoDatos); l08.g3_L08_while(ingresoDatos); l08.g3_L08_do_while(ingresoDatos);
        
        g3_Loading9 l09 = new g3_Loading9();
        l09.g3_L09_for(ingresoDatos); l09.g3_L09_while(ingresoDatos); l09.g3_L09_do_while(ingresoDatos);
        
        g3_Loading10 l10 = new g3_Loading10();
        l10.g3_L10_for(); l10.g3_L10_while(); l10.g3_L10_do_while();
        
        g3_Loading11 l11 = new g3_Loading11();
        
        System.out.println("--- L11a (Simétrico) ---");
        l11.g3_L11a_for(n); l11.g3_L11a_while(n); l11.g3_L11a_do_while(n);

        System.out.println("--- L11b (Vectorial) ---");
        l11.g3_L11b_for(n); l11.g3_L11b_while(n); l11.g3_L11b_do_while(n);
        
        g3_Loading12 l12 = new g3_Loading12();
        l12.g3_L12_for(n); l12.g3_L12_while(n); l12.g3_L12_do_while(n);
         ingresoDatos.close();
        System.out.println("\n--------- GRAFOS Y AUTOMATAS -----------");
        
    // A01) Automatas para validar: a*b+c
        System.out.println("\n--- A01: Validar a*b+c ---");
        System.out.print("Ingrese cadena: ");
        String cadenaA01 = ingresoDatos.nextLine();
    System.out.println(cadenaA01 + " => " + g3_GrafoyAutomata1.validar(cadenaA01));
        
        // A02) Automatas para validar: ab+ca
        System.out.println("\n--- A02: Validar ab+ca ---");
        System.out.print("Ingrese cadena: ");
        String cadenaA02 = ingresoDatos.nextLine();
    System.out.println(cadenaA02 + " => " + g3_GrafoyAutomata2.validar(cadenaA02));
        
        // A03) Automatas para validar: a+/b+/c+
        System.out.println("\n--- A03: Validar a+/b+/c+ ---");
        System.out.print("Ingrese cadena: ");
        String cadenaA03 = ingresoDatos.nextLine();
    System.out.println(cadenaA03 + " => " + g3_GrafoyAutomata3.validar(cadenaA03));
        
        // A04) Automatas para validar: 1+/0+1*
        System.out.println("\n--- A04: Validar 1+/0+1* ---");
        System.out.print("Ingrese cadena: ");
        String cadenaA04 = ingresoDatos.nextLine();
    System.out.println(cadenaA04 + " => " + g3_GrafoyAutomata4.validar(cadenaA04));
        
        // A05) Validar número decimal
        System.out.println("\n--- A05: Validar número decimal ---");
        System.out.print("Ingrese número: ");
        String numeroDecimal = ingresoDatos.nextLine();
    System.out.println(numeroDecimal + " => " + g3_GrafoyAutomata5.validar(numeroDecimal));
        
        // A06) Validar declaración de variables en Java
        System.out.println("\n--- A06: Validar variable Java ---");
        System.out.print("Ingrese variable: ");
        String variable = ingresoDatos.nextLine();
    System.out.println(variable + " => " + g3_GrafoyAutomata6.validar(variable));
        
        // A07) Validar clave segura
        System.out.println("\n--- A07: Validar clave segura ---");
        System.out.print("Ingrese clave: ");
        String clave = ingresoDatos.nextLine();
    System.out.println(clave + " => " + g3_GrafoyAutomata7.validar(clave));
        
        System.out.println("\n--------- RECURSION -----------");
        
    // R01) Factorial
    System.out.println("\n--- R01: Factorial ---");
    System.out.print("Ingrese el numero para calcular factorial: ");
    int fact_n = Integer.parseInt(ingresoDatos.nextLine());
    System.out.println("Factorial de " + fact_n + " = " + g3_recursion1.factorial(fact_n));
        
        // R02) Suma recursiva
        System.out.println("\n--- R02: Suma ---");
        System.out.print("Ingrese el primer número: ");
        int suma_a = Integer.parseInt(ingresoDatos.nextLine());
        System.out.print("Ingrese el segundo número: ");
        int suma_b = Integer.parseInt(ingresoDatos.nextLine());
        System.out.println("La suma es: " + g3_recursion2.suma(suma_a, suma_b));
        
        // R03) Multiplicación recursiva
        System.out.println("\n--- R03: Multiplicación ---");
        System.out.print("Ingrese el primer número: ");
        int mult_a = Integer.parseInt(ingresoDatos.nextLine());
        System.out.print("Ingrese el segundo número: ");
        int mult_b = Integer.parseInt(ingresoDatos.nextLine());
        System.out.println("El producto es: " + g3_recursion3.multiplicacion(mult_a, mult_b));
        
        // R04) Potencia recursiva
        System.out.println("\n--- R04: Potencia ---");
        System.out.print("Ingrese la base: ");
        int pot_a = Integer.parseInt(ingresoDatos.nextLine());
        System.out.print("Ingrese el exponente: ");
        int pot_b = Integer.parseInt(ingresoDatos.nextLine());
        System.out.println(pot_a + " elevado a " + pot_b + " = " + g3_recursion4.potencia(pot_a, pot_b));
        
        // R05) Conteo progresivo
        System.out.println("\n--- R05: Conteo progresivo ---");
        System.out.print("Ingrese el número hasta donde contar: ");
        int numProgresivo = Integer.parseInt(ingresoDatos.nextLine());
        g3_recursion5.conteoProgresivoHasta(numProgresivo);
        System.out.println();
        
        // R06) Conteo regresivo
        System.out.println("\n--- R06: Conteo regresivo ---");
        System.out.print("Ingrese el número desde donde contar hacia atrás: ");
        int numRegresivo = Integer.parseInt(ingresoDatos.nextLine());
        g3_recursion6.conteoRegresivo(numRegresivo);
        System.out.println(); 
              ingresoDatos.close();
    }
}
