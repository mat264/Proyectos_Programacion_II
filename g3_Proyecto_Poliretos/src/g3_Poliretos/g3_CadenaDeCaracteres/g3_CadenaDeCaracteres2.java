package g3_Poliretos.g3_CadenaDeCaracteres;

import java.util.Scanner;

public class g3_CadenaDeCaracteres2 {
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
    
    private boolean esConsonante(char c) {
        char lower = Character.toLowerCase(c);
        // Consonantes son todas las letras excepto a, e, i, o, u
        return Character.isLetter(c) && "bcdfghjklmnpqrstvwxyzñ".indexOf(lower) != -1;
    }
    
    public void Cadena2() {
        Scanner ingresoDatos = new Scanner(System.in);

        // Solicitar cadena con validación
        String cadena = solicitarTextoValido(ingresoDatos, "Ingrese una cadena de caracteres: ");
        System.out.println("\n Cadena ingresada: \"" + cadena + "\"\n");
        // Conteo con FOR
        int contadorFor = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (esConsonante(c)) {
                contadorFor++;
            }
        }
        System.out.println("Conteo con FOR: tiene " + contadorFor + " consonantes");
        
        // Conteo con WHILE
        int contadorWhile = 0;
        int j = 0;
        while (j < cadena.length()) {
            char c = cadena.charAt(j);
            if (esConsonante(c)) {
                contadorWhile++;
            }
            j++;
        }
        System.out.println("Conteo con WHILE: tiene " + contadorWhile + " consonantes");
        
        // Conteo con DO WHILE
        int contadorDoWhile = 0;
        int k = 0;
        if (cadena.length() > 0) {
            do {
                char c = cadena.charAt(k);
                if (esConsonante(c)) {
                    contadorDoWhile++;
                }
                k++;
            } while (k < cadena.length());
        }
        System.out.println("Conteo con DO WHILE: tiene " + contadorDoWhile + " consonantes");
        
    }
}