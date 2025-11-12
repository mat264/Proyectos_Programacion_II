package g3_Poliretos.g3_CadenaDeCaracteres;

import java.util.Scanner;

public class g3_CadenaDeCaracteres3 {

    private boolean validarSoloLetras(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            return false;
        }
        return texto.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$");
    }
    
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
    
  
    private char solicitarVocalValida(Scanner scanner) {
        String vocalInput;
        char vocal;
        boolean esValido = false;
        
        do {
            System.out.print("Ingrese una vocal a eliminar (a, e, i, o, u): ");
            vocalInput = scanner.nextLine();
            
            if (vocalInput.trim().isEmpty()) {
                System.out.println("Error: No puede dejar la línea vacía.");
            } else if (vocalInput.length() != 1) {
                System.out.println("Error: Debe ingresar solo una vocal (un carácter).");
            } else if (!vocalInput.matches("[a-zA-ZáéíóúÁÉÍÓÚ]")) {
                System.out.println("Error: Solo se permiten letras. No ingrese números o símbolos.");
            } else {
                vocal = Character.toLowerCase(vocalInput.charAt(0));
                // Incluir vocales con tilde
                if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u' ||
                    vocal == 'á' || vocal == 'é' || vocal == 'í' || vocal == 'ó' || vocal == 'ú') {
                    esValido = true;
                    return vocal;
                } else {
                    System.out.println("Error: Debe ingresar una vocal válida (a, e, i, o, u).");
                }
            }
        } while (!esValido);
        
        return 'a'; // Esta línea nunca se alcanzará
    }
    
    public void Cadena3(Scanner ingresoDatos) {
        // Solicitar frase con validación
        String frase = solicitarTextoValido(ingresoDatos, "Ingrese una frase: ");
        
        // Solicitar vocal con validación
        char vocal = solicitarVocalValida(ingresoDatos);
        
        System.out.println("\n Frase original: " + frase);
        System.out.println(" Vocal a eliminar: " + vocal + "\n");
        
        // Método con FOR
        String resultadoFor = "";
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            char cLower = Character.toLowerCase(c);
            // Eliminar vocal incluyendo versiones con tilde
            if (cLower != vocal && 
                !(vocal == 'a' && (cLower == 'á')) &&
                !(vocal == 'e' && (cLower == 'é')) &&
                !(vocal == 'i' && (cLower == 'í')) &&
                !(vocal == 'o' && (cLower == 'ó')) &&
                !(vocal == 'u' && (cLower == 'ú'))) {
                resultadoFor += c;
            }
        }
        System.out.println("Resultado con FOR: " + resultadoFor);
        
        // Método con WHILE
        String resultadoWhile = "";
        int j = 0;
        while (j < frase.length()) {
            char c = frase.charAt(j);
            char cLower = Character.toLowerCase(c);
            if (cLower != vocal && 
                !(vocal == 'a' && (cLower == 'á')) &&
                !(vocal == 'e' && (cLower == 'é')) &&
                !(vocal == 'i' && (cLower == 'í')) &&
                !(vocal == 'o' && (cLower == 'ó')) &&
                !(vocal == 'u' && (cLower == 'ú'))) {
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
                char cLower = Character.toLowerCase(c);
                if (cLower != vocal && 
                    !(vocal == 'a' && (cLower == 'á')) &&
                    !(vocal == 'e' && (cLower == 'é')) &&
                    !(vocal == 'i' && (cLower == 'í')) &&
                    !(vocal == 'o' && (cLower == 'ó')) &&
                    !(vocal == 'u' && (cLower == 'ú'))) {
                    resultadoDoWhile += c;
                }
                k++;
            } while (k < frase.length());
        }
        System.out.println("Resultado con DO WHILE: " + resultadoDoWhile);
    }
}
