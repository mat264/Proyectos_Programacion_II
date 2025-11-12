package g3_Poliretos.g3_CadenaDeCaracteres;

import java.util.Scanner;

public class g3_CadenaDeCaracteres1 {
    
   
    private boolean validarSoloLetras(String texto) {
        // Verifica que no esté vacío o solo contenga espacios
        if (texto == null || texto.trim().isEmpty()) {
            return false;
        }
        
        // Verifica que todos los caracteres sean letras (incluyendo letras con tildes)
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
    
    public void Cadena1() {
        Scanner ingresoDatos = new Scanner(System.in);

        // Solicitar cadena con validación
        String cadena = solicitarTextoValido(ingresoDatos, "Ingrese una cadena de caracteres: ");
        System.out.println("\n1 Cadena ingresada: \"" + cadena + "\"\n");

        // Conteo con FOR
        int contadorFor = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char c = Character.toLowerCase(cadena.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'á' || c == 'é' || c == 'í' || c == 'ó' || c == 'ú') {
                contadorFor++;
            }
        }
        System.out.println("Conteo con FOR: tiene " + contadorFor + " vocales");
        
        // Conteo con WHILE
        int contadorWhile = 0;
        int j = 0;
        while (j < cadena.length()) {
            char c = Character.toLowerCase(cadena.charAt(j));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'á' || c == 'é' || c == 'í' || c == 'ó' || c == 'ú') {
                contadorWhile++;
            }
            j++;
        }
        System.out.println("Conteo con WHILE: tiene " + contadorWhile + " vocales");
        
        // Conteo con DO WHILE
        int contadorDoWhile = 0;
        int k = 0;
        if (cadena.length() > 0) {
            do {
                char c = Character.toLowerCase(cadena.charAt(k));
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'á' || c == 'é' || c == 'í' || c == 'ó' || c == 'ú') {
                    contadorDoWhile++;
                }
                k++;
            } while (k < cadena.length());
        }
        System.out.println("Conteo con DO WHILE: tiene " + contadorDoWhile + " vocales");
    }
}