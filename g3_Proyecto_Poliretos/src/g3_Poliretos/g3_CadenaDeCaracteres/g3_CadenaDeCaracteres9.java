package g3_Poliretos.g3_CadenaDeCaracteres;

import java.util.Scanner;

public class g3_CadenaDeCaracteres9 {
    
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
    //Convierte un carácter a minúscula, manejando correctamente tildes
    
    private char convertirMinuscula(char c) {
        switch (c) {
            case 'Á': return 'á';
            case 'É': return 'é';
            case 'Í': return 'í';
            case 'Ó': return 'ó';
            case 'Ú': return 'ú';
            case 'Ñ': return 'ñ';
            default: return Character.toLowerCase(c);
        }
    }
    
    public void Cadena9(Scanner ingresoDatos) {
        // Solicitar frase con validación
        String frase = solicitarTextoValido(ingresoDatos, "Ingrese una frase: ");
        
        System.out.println("\n Frase original: " + frase + "\n");
        
        // Método con FOR
        String resultadoFor = "";
        int contadorLetrasFor = 0;
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            
            if (Character.isLetter(c) || esLetraConTilde(c)) {
                // Si el contador de letras es par -> mayúscula, impar -> minúscula
                if (contadorLetrasFor % 2 == 0) {
                    resultadoFor += convertirMayuscula(c);
                } else {
                    resultadoFor += convertirMinuscula(c);
                }
                contadorLetrasFor++;
            } else {
                // Si es espacio, mantener como está
                resultadoFor += c;
            }
        }
        System.out.println("Resultado con FOR: " + resultadoFor);
        
        // Método con WHILE
        String resultadoWhile = "";
        int contadorLetrasWhile = 0;
        int j = 0;
        while (j < frase.length()) {
            char c = frase.charAt(j);
            
            if (Character.isLetter(c) || esLetraConTilde(c)) {
                if (contadorLetrasWhile % 2 == 0) {
                    resultadoWhile += convertirMayuscula(c);
                } else {
                    resultadoWhile += convertirMinuscula(c);
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
                
                if (Character.isLetter(c) || esLetraConTilde(c)) {
                    if (contadorLetrasDoWhile % 2 == 0) {
                        resultadoDoWhile += convertirMayuscula(c);
                    } else {
                        resultadoDoWhile += convertirMinuscula(c);
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
    
    /**
     * Verifica si un carácter es una letra con tilde
     * @param c El carácter a verificar
     * @return true si es una letra con tilde, false en caso contrario
     */
    private boolean esLetraConTilde(char c) {
        return c == 'á' || c == 'é' || c == 'í' || c == 'ó' || c == 'ú' ||
               c == 'Á' || c == 'É' || c == 'Í' || c == 'Ó' || c == 'Ú' ||
               c == 'ñ' || c == 'Ñ';
    }
}