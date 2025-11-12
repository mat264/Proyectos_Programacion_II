package g3_Poliretos.g3_CadenaDeCaracteres;

import java.util.Scanner;

public class g3_CadenaDeCaracteres5 {
    
    //Valida que una cadena contenga solo letras (sin números, símbolos o espacios vacíos)
    
    private boolean validarSoloLetras(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            return false;
        }
        return texto.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$");
    }
    
    //Solicita y valida la entrada del usuario hasta que ingrese solo letras
    
    private String solicitarTextoValido(Scanner scanner, String mensaje) {
        String texto;
        boolean esValido = false;
        
        do {
            System.out.print(mensaje);
            texto = scanner.nextLine();
            
            if (validarSoloLetras(texto)) {
                esValido = true;
            } else {
                if (texto.trim().isEmpty()) {
                    System.out.println("Error: No puede dejar la línea vacía.");
                } else {
                    System.out.println("Error: Solo se permiten letras. No ingrese números o símbolos.");
                }
            }
        } while (!esValido);
        
        return texto.trim();
    }
    
   // Verifica si un carácter es una vocal (incluyendo vocales con tilde)
    
    private boolean esVocal(char c) {
        char cLower = Character.toLowerCase(c);
        return cLower == 'a' || cLower == 'e' || cLower == 'i' || cLower == 'o' || cLower == 'u' ||
               cLower == 'á' || cLower == 'é' || cLower == 'í' || cLower == 'ó' || cLower == 'ú';
    }
    
    //Convierte una vocal con tilde a mayúscula correctamente
    
    private char convertirVocalMayuscula(char c) {
        switch (c) {
            case 'á': return 'Á';
            case 'é': return 'É';
            case 'í': return 'Í';
            case 'ó': return 'Ó';
            case 'ú': return 'Ú';
            default: return Character.toUpperCase(c);
        }
    }
    
    public void Cadena5(Scanner ingresoDatos) {
        // Solicitar frase con validación
        String frase = solicitarTextoValido(ingresoDatos, "Ingrese una frase: ");
        
        System.out.println("\n Frase original: " + frase + "\n");
        
        // Método con FOR
        String resultadoFor = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            char c = frase.charAt(i);
            
            // Si es vocal, convertir a mayúscula
            if (esVocal(c)) {
                resultadoFor += convertirVocalMayuscula(c);
            } else {
                resultadoFor += c;
            }
        }
        System.out.println("Resultado con FOR: " + resultadoFor);
        
        // Método con WHILE
        String resultadoWhile = "";
        int j = frase.length() - 1;
        while (j >= 0) {
            char c = frase.charAt(j);
            
            if (esVocal(c)) {
                resultadoWhile += convertirVocalMayuscula(c);
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
                
                if (esVocal(c)) {
                    resultadoDoWhile += convertirVocalMayuscula(c);
                } else {
                    resultadoDoWhile += c;
                }
                k--;
            } while (k >= 0);
        }
        System.out.println("Resultado con DO WHILE: " + resultadoDoWhile);
    }
}