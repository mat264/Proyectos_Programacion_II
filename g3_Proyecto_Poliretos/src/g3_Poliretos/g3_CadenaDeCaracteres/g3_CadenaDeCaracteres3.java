package g3_Poliretos.g3_CadenaDeCaracteres;
import java.util.Scanner;
public class g3_CadenaDeCaracteres3 {
     public void Cadena3(Scanner ingresoDatos) {
        System.out.println("Ingrese una frase: ");
        String frase = ingresoDatos.nextLine();
        
        System.out.println("Ingrese una vocal a eliminar (a, e, i, o, u): ");
        String vocalInput = ingresoDatos.nextLine();
        
        // Validar que sea una vocal
        if (vocalInput.length() != 1) {
            System.out.println("Error: Debe ingresar solo una vocal.");
            return;
        }
        
        char vocal = Character.toLowerCase(vocalInput.charAt(0));
        if (vocal != 'a' && vocal != 'e' && vocal != 'i' && vocal != 'o' && vocal != 'u') {
            System.out.println("Error: Debe ingresar una vocal válida.");
            return;
        }
        
        System.out.println("\nFrase original: " + frase);
        System.out.println("Vocal a eliminar: " + vocal);
        
        // Método con FOR
        String resultadoFor = "";
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (Character.toLowerCase(c) != vocal) {
                resultadoFor += c;
            }
        }
        System.out.println("\nResultado con FOR: " + resultadoFor);
        
        // Método con WHILE
        String resultadoWhile = "";
        int j = 0;
        while (j < frase.length()) {
            char c = frase.charAt(j);
            if (Character.toLowerCase(c) != vocal) {
                resultadoWhile += c;
            }
            j++;
        }
        System.out.println("Resultado con WHILE: " + resultadoWhile);
        
        // Método con DO WHILE
        String resultadoDoWhile = "";
        int k = 0;
        if (frase.length() > 0) {
            do {
                char c = frase.charAt(k);
                if (Character.toLowerCase(c) != vocal) {
                    resultadoDoWhile += c;
                }
                k++;
            } while (k < frase.length());
        }
        System.out.println("Resultado con DO WHILE: " + resultadoDoWhile);
    }
}

