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
    
    //Solicita y valida que el usuario ingrese una letra válida
   
    private char solicitarLetraValida(Scanner scanner) {
        String letraInput;
        boolean esValido = false;
        
        do {
            System.out.print("Ingrese una letra a eliminar: ");
            letraInput = scanner.nextLine();
            
            if (letraInput.trim().isEmpty()) {
                System.out.println("Error: No puede dejar la línea vacía.");
            } else if (letraInput.length() != 1) {
                System.out.println("Error: Debe ingresar solo una letra (un carácter).");
            } else if (!letraInput.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ]")) {
                System.out.println("Error: Solo se permiten letras. No ingrese números o símbolos.");
            } else {
                esValido = true;
                return letraInput.charAt(0);
            }
        } while (!esValido);
        
        return 'a'; // Esta línea nunca se alcanzará
    }
    
    //Normaliza un carácter removiendo tildes para comparación
     
    private char normalizarCaracter(char c) {
        char lower = Character.toLowerCase(c);
        switch (lower) {
            case 'á': return 'a';
            case 'é': return 'e';
            case 'í': return 'i';
            case 'ó': return 'o';
            case 'ú': return 'u';
            default: return lower;
        }
    }
    
    public void Cadena4(Scanner ingresoDatos) {
        // Solicitar frase con validación
        String frase = solicitarTextoValido(ingresoDatos, "Ingrese una frase: ");
        
        // Solicitar letra con validación
        char letra = solicitarLetraValida(ingresoDatos);
        
        System.out.println("\n Frase original: " + frase);
        System.out.println(" Letra a eliminar: " + letra + "\n");
        
        // Normalizar la letra a buscar (eliminar tilde si tiene)
        char letraNormalizada = normalizarCaracter(letra);
        
        // Método con FOR
        String resultadoFor = "";
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            // Compara normalizando ambos caracteres (elimina tildes para comparar)
            if (normalizarCaracter(c) != letraNormalizada) {
                resultadoFor += c;
            }
        }
        System.out.println("Resultado con FOR: " + resultadoFor);
        
        // Método con WHILE
        String resultadoWhile = "";
        int j = 0;
        while (j < frase.length()) {
            char c = frase.charAt(j);
            if (normalizarCaracter(c) != letraNormalizada) {
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
                if (normalizarCaracter(c) != letraNormalizada) {
                    resultadoDoWhile += c;
                }
                k++;
            } while (k < frase.length());
        }
        System.out.println("Resultado con DO WHILE: " + resultadoDoWhile);
    }
}