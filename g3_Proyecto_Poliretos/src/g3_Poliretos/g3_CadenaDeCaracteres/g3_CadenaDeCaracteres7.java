package g3_Poliretos.g3_CadenaDeCaracteres;

import java.util.Scanner;

public class g3_CadenaDeCaracteres7 {
    
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
    
    public void Cadena7(Scanner ingresoDatos) {
        // Solicitar frase con validación
        String frase = solicitarTextoValido(ingresoDatos, "Ingrese una frase: ");
        
        System.out.println("\n Frase original: " + frase + "\n");
        
        // Método con FOR
        String resultadoFor = "";
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            
            // Si no es 'j' ni 'J', agregar en mayúscula
            if (Character.toLowerCase(c) != 'j') {
                resultadoFor += convertirMayuscula(c);
            }
        }
        System.out.println("Resultado con FOR: " + resultadoFor);
        
        // Método con WHILE
        String resultadoWhile = "";
        int j = 0;
        while (j < frase.length()) {
            char c = frase.charAt(j);
            
            if (Character.toLowerCase(c) != 'j') {
                resultadoWhile += convertirMayuscula(c);
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
                    resultadoDoWhile += convertirMayuscula(c);
                }
                k++;
            } while (k < frase.length());
        }
        System.out.println("Resultado con DO WHILE: " + resultadoDoWhile);
    }
}