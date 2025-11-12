package g3_Poliretos.g3_CadenaDeCaracteres;

import java.util.Scanner;

public class g3_CadenaDeCaracteres6 {
    
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
    
    //Convierte un carácter a mayúscula, manejando correctamente tildes
   
    private char convertirMayuscula(char c) {
        switch (c) {
            case 'á': return 'Á';
            case 'é': return 'É';
            case 'í': return 'Í';
            case 'ó': return 'Ó';
            case 'ú': return 'Ú';
            case 'ñ': return 'Ñ';
            default: return Character.toUpperCase(c);
        }
    }
    
    public void Cadena6(Scanner ingresoDatos) {
        // Solicitar frase con validación
        String frase = solicitarTextoValido(ingresoDatos, "Ingrese una frase: ");
        
        System.out.println("\n Frase original: " + frase + "\n");
        
        // Método con FOR
        String resultadoFor = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            char c = frase.charAt(i);
            
            // Si es letra, convertir a mayúscula (incluyendo tildes)
            if (Character.isLetter(c) || c == 'á' || c == 'é' || c == 'í' || c == 'ó' || c == 'ú' || c == 'ñ') {
                resultadoFor += convertirMayuscula(c);
            } else {
                // Si es espacio u otro carácter, mantener como está
                resultadoFor += c;
            }
        }
        System.out.println("Resultado con FOR: " + resultadoFor);
        
        // Método con WHILE
        String resultadoWhile = "";
        int j = frase.length() - 1;
        while (j >= 0) {
            char c = frase.charAt(j);
            
            if (Character.isLetter(c) || c == 'á' || c == 'é' || c == 'í' || c == 'ó' || c == 'ú' || c == 'ñ') {
                resultadoWhile += convertirMayuscula(c);
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
                
                if (Character.isLetter(c) || c == 'á' || c == 'é' || c == 'í' || c == 'ó' || c == 'ú' || c == 'ñ') {
                    resultadoDoWhile += convertirMayuscula(c);
                } else {
                    resultadoDoWhile += c;
                }
                k--;
            } while (k >= 0);
        }
        System.out.println("Resultado con DO WHILE: " + resultadoDoWhile);
    }
}