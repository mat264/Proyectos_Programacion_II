package g3_Poliretos.g3_CadenaDeCaracteres;

import java.util.Scanner;

public class g3_CadenaDeCaracteres4 {
    
    //Valida que una cadena contenga solo letras (sin números, símbolos o espacios vacíos)

    private boolean validarSoloLetras(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            return false;
        }
        return texto.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$");
    }
    
    // Solicita y valida la entrada del usuario hasta que ingrese solo letras
    

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
    
    // Verifica si un carácter es consonante
    private boolean esConsonante(char c) {
        char lower = Character.toLowerCase(c);
        return Character.isLetter(c) && "bcdfghjklmnpqrstvwxyzñ".indexOf(lower) != -1;
    }
    
    // Solicita y valida que el usuario ingrese una consonante válida
    private char solicitarConsonanteValida(Scanner scanner) {
        String letraInput;
        boolean esValido = false;
        
        do {
            System.out.print("Ingrese una consonante a eliminar: ");
            letraInput = scanner.nextLine();
            
            if (letraInput.trim().isEmpty()) {
                System.out.println("Error: No puede dejar la línea vacía.");
            } else if (letraInput.length() != 1) {
                System.out.println("Error: Debe ingresar solo un carácter.");
            } else if (!esConsonante(letraInput.charAt(0))) {
                System.out.println("Error: Debe ingresar una consonante. Las vocales (a, e, i, o, u) no son válidas.");
            } else {
                esValido = true;
                return letraInput.charAt(0);
            }
        } while (!esValido);
        
        return 'b'; // Esta línea nunca se alcanzará
    }
    
    public void Cadena4(Scanner ingresoDatos) {
        // Solicitar frase con validación
        String frase = solicitarTextoValido(ingresoDatos, "Ingrese una frase: ");
        
        // Solicitar consonante con validación
        char consonante = solicitarConsonanteValida(ingresoDatos);
        
        System.out.println("\n Frase original: " + frase);
        System.out.println(" Consonante a eliminar: " + consonante + "\n");
        
        // Normalizar la consonante a buscar para comparación (minúscula)
        char consonanteNormalizada = Character.toLowerCase(consonante);
        
        // Método con FOR
        String resultadoFor = "";
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            // Mantiene el carácter solo si NO coincide con la consonante a eliminar
            if (Character.toLowerCase(c) != consonanteNormalizada) {
                resultadoFor += c;
            }
        }
        System.out.println("Resultado con FOR: " + resultadoFor);
        
        // Método con WHILE
        String resultadoWhile = "";
        int j = 0;
        while (j < frase.length()) {
            char c = frase.charAt(j);
            if (Character.toLowerCase(c) != consonanteNormalizada) {
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
                if (Character.toLowerCase(c) != consonanteNormalizada) {
                    resultadoDoWhile += c;
                }
                k++;
            } while (k < frase.length());
        }
        System.out.println("Resultado con DO WHILE: " + resultadoDoWhile);
    }
}