package g3_Poliretos.g3_CadenaDeCaracteres;
import java.util.Scanner;
public class g3_CadenaDeCaracteres4 {
    public void Cadena4(Scanner ingresoDatos) {
        System.out.println("Ingrese una frase: ");
        String frase = ingresoDatos.nextLine();
        
        System.out.println("Ingrese una letra a eliminar: ");
        String letraInput = ingresoDatos.nextLine();
        
        // Validar que sea una sola letra
        if (letraInput.length() != 1) {
            System.out.println("Error: Debe ingresar solo una letra.");
            return;
        }
        
        char letra = letraInput.charAt(0);
        
        // Validar que sea una letra
        if (!Character.isLetter(letra)) {
            System.out.println("Error: Debe ingresar una letra válida.");
            return;
        }
        
        System.out.println("\nFrase original: " + frase);
        System.out.println("Letra a eliminar: " + letra);
        
        // Método con FOR
        String resultadoFor = "";
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            // Compara en minúsculas para eliminar mayúsculas y minúsculas
            if (Character.toLowerCase(c) != Character.toLowerCase(letra)) {
                resultadoFor += c;
            }
        }
        System.out.println("\nResultado con FOR: " + resultadoFor);
        
        // Método con WHILE
        String resultadoWhile = "";
        int j = 0;
        while (j < frase.length()) {
            char c = frase.charAt(j);
            if (Character.toLowerCase(c) != Character.toLowerCase(letra)) {
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
                if (Character.toLowerCase(c) != Character.toLowerCase(letra)) {
                    resultadoDoWhile += c;
                }
                k++;
            } while (k < frase.length());
        }
        System.out.println("Resultado con DO WHILE: " + resultadoDoWhile);
    }
}