package g3_Poliretos.g3_CadenaDeCaracteres;

import java.util.Scanner;
import java.util.Random;

public class g3_CadenaDeCaracteres8 {
    
    // Conjunto de palabras y sus anagramas
    private String[][] anagramas = {
        {"delira", "lidera"},
        {"ballena", "llenaba"},
        {"alondra", "ladrona"},
        {"españa", "apañes"},
        {"enrique", "quieren"}
    };
    
    public void Cadena8(Scanner ingresoDatos) {
        Random random = new Random();
        
        // Seleccionar un par de anagramas aleatorio
        int indice = random.nextInt(anagramas.length);
        String palabraOriginal = anagramas[indice][0];
        String anagramaCorrecto = anagramas[indice][1];
        
        System.out.println("\n===== JUEGO DE ANAGRAMAS =====");
        System.out.println("Encuentra el anagrama de la siguiente palabra:");
        System.out.println("Palabra: " + palabraOriginal.toUpperCase());
        System.out.println("Tienes 3 intentos\n");
        
        boolean acertado = false;
        int intentos = 0;
        int maxIntentos = 3;
        
        // Juego con WHILE
        while (intentos < maxIntentos && !acertado) {
            intentos++;
            System.out.print("Intento " + intentos + "/" + maxIntentos + ": ");
            String respuesta = ingresoDatos.nextLine().toLowerCase().trim();
            
            // Verificar si es anagrama válido
            if (esAnagrama(palabraOriginal, respuesta)) {
                if (respuesta.equals(anagramaCorrecto)) {
                    System.out.println("¡CORRECTO! ✓");
                    System.out.println(palabraOriginal.toUpperCase() + " y " + respuesta.toUpperCase() + " son anagramas.");
                    acertado = true;
                } else {
                    System.out.println("Es un anagrama válido, pero no es el que buscamos.");
                }
            } else {
                System.out.println("✗ Incorrecto. No es un anagrama válido.");
            }
            
            // Si falló en el tercer intento
            if (intentos == maxIntentos && !acertado) {
                System.out.println("\n¡Se acabaron los intentos!");
                System.out.println("La respuesta correcta era: " + anagramaCorrecto.toUpperCase());
            }
        }
        
        System.out.println("\n===== FIN DEL JUEGO =====\n");
    }
    
    // Método para verificar si dos palabras son anagramas
    private boolean esAnagrama(String palabra1, String palabra2) {
        // Si tienen diferente longitud, no pueden ser anagramas
        if (palabra1.length() != palabra2.length()) {
            return false;
        }
        
        // Contar frecuencia de cada letra en palabra1
        int[] frecuencia = new int[26];
        
        for (int i = 0; i < palabra1.length(); i++) {
            char c = Character.toLowerCase(palabra1.charAt(i));
            if (c >= 'a' && c <= 'z') {
                frecuencia[c - 'a']++;
            }
        }
        
        // Restar frecuencia de cada letra en palabra2
        for (int i = 0; i < palabra2.length(); i++) {
            char c = Character.toLowerCase(palabra2.charAt(i));
            if (c >= 'a' && c <= 'z') {
                frecuencia[c - 'a']--;
            }
        }
        
        // Si todas las frecuencias son 0, son anagramas
        for (int i = 0; i < 26; i++) {
            if (frecuencia[i] != 0) {
                return false;
            }
        }
        
        return true;
    }
}