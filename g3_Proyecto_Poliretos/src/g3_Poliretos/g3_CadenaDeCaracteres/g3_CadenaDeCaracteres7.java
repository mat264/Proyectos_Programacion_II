package g3_Poliretos.g3_CadenaDeCaracteres;
import java.util.Scanner;

public class g3_CadenaDeCaracteres7 {
    public void Cadena7(Scanner ingresoDatos) {
        System.out.println("Ingrese una frase: ");
        String frase = ingresoDatos.nextLine();
        
        System.out.println("\nFrase original: " + frase);
        
        // Método con FOR
        String resultadoFor = "";
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            
            // Si no es 'j' ni 'J', agregar en mayúscula
            if (Character.toLowerCase(c) != 'j') {
                resultadoFor += Character.toUpperCase(c);
            }
        }
        System.out.println("\nResultado con FOR: " + resultadoFor);
        
        // Método con WHILE
        String resultadoWhile = "";
        int j = 0;
        while (j < frase.length()) {
            char c = frase.charAt(j);
            
            if (Character.toLowerCase(c) != 'j') {
                resultadoWhile += Character.toUpperCase(c);
            }
            j++;
        }
        System.out.println("Resultado con WHILE: " + resultadoWhile);
        
        // Método con DO WHILE
        String resultadoDoWhile = "";
        if (frase.length() > 0) {
            int k = 0;
            do {
                char c = frase.charAt(k);
                
                if (Character.toLowerCase(c) != 'j') {
                    resultadoDoWhile += Character.toUpperCase(c);
                }
                k++;
            } while (k < frase.length());
        }
        System.out.println("Resultado con DO WHILE: " + resultadoDoWhile);
    }
}