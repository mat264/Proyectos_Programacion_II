package g3_Poliretos.g3_CadenaDeCaracteres;

import java.util.Scanner;

public class g3_CadenaDeCaracteres9 {
    public void Cadena9(Scanner ingresoDatos) {
        System.out.println("Ingrese una frase: ");
        String frase = ingresoDatos.nextLine();
        
        System.out.println("\nFrase original: " + frase);
        
        // Método con FOR
        String resultadoFor = "";
        int contadorLetrasFor = 0;
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            
            if (Character.isLetter(c)) {
                // Si el contador de letras es par -> mayúscula, impar -> minúscula
                if (contadorLetrasFor % 2 == 0) {
                    resultadoFor += Character.toUpperCase(c);
                } else {
                    resultadoFor += Character.toLowerCase(c);
                }
                contadorLetrasFor++;
            } else {
                // Si no es letra (espacio, número, etc.), mantener como está
                resultadoFor += c;
            }
        }
        System.out.println("\nResultado con FOR: " + resultadoFor);
        
        // Método con WHILE
        String resultadoWhile = "";
        int contadorLetrasWhile = 0;
        int j = 0;
        while (j < frase.length()) {
            char c = frase.charAt(j);
            
            if (Character.isLetter(c)) {
                if (contadorLetrasWhile % 2 == 0) {
                    resultadoWhile += Character.toUpperCase(c);
                } else {
                    resultadoWhile += Character.toLowerCase(c);
                }
                contadorLetrasWhile++;
            } else {
                resultadoWhile += c;
            }
            j++;
        }
        System.out.println("Resultado con WHILE: " + resultadoWhile);
        
        // Método con DO WHILE
        String resultadoDoWhile = "";
        int contadorLetrasDoWhile = 0;
        if (frase.length() > 0) {
            int k = 0;
            do {
                char c = frase.charAt(k);
                
                if (Character.isLetter(c)) {
                    if (contadorLetrasDoWhile % 2 == 0) {
                        resultadoDoWhile += Character.toUpperCase(c);
                    } else {
                        resultadoDoWhile += Character.toLowerCase(c);
                    }
                    contadorLetrasDoWhile++;
                } else {
                    resultadoDoWhile += c;
                }
                k++;
            } while (k < frase.length());
        }
        System.out.println("Resultado con DO WHILE: " + resultadoDoWhile);
    }
}