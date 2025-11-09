package g3_Poliretos.g3_CadenaDeCaracteres;
import java.util.Scanner;
public class g3_CadenaDeCaracteres6 {
    public void Cadena6(Scanner ingresoDatos) {
        System.out.println("Ingrese una frase: ");
        String frase = ingresoDatos.nextLine();
        
        System.out.println("\nFrase original: " + frase);
        
        // Método con FOR
        String resultadoFor = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            char c = frase.charAt(i);
            
            // Si es letra (consonante o vocal), convertir a mayúscula
            if (Character.isLetter(c)) {
                resultadoFor += Character.toUpperCase(c);
            } else {
                // Si no es letra (espacio, número, símbolo), mantener como está
                resultadoFor += c;
            }
        }
        System.out.println("\nResultado con FOR: " + resultadoFor);
        
        // Método con WHILE
        String resultadoWhile = "";
        int j = frase.length() - 1;
        while (j >= 0) {
            char c = frase.charAt(j);
            
            if (Character.isLetter(c)) {
                resultadoWhile += Character.toUpperCase(c);
            } else {
                resultadoWhile += c;
            }
            j--;
        }
        System.out.println("Resultado con WHILE: " + resultadoWhile);
        
        // Método con DO WHILE
        String resultadoDoWhile = "";
        if (frase.length() > 0) {
            int k = frase.length() - 1;
            do {
                char c = frase.charAt(k);
                
                if (Character.isLetter(c)) {
                    resultadoDoWhile += Character.toUpperCase(c);
                } else {
                    resultadoDoWhile += c;
                }
                k--;
            } while (k >= 0);
        }
        System.out.println("Resultado con DO WHILE: " + resultadoDoWhile);
    }
}