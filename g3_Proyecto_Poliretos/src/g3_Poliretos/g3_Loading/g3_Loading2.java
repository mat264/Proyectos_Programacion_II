package g3_Poliretos.g3_Loading;

import java.util.Scanner;

// Muestra una barra de progreso que se rellena con un carácter ingresado por el usuario.
// Hay tres variantes: for, while y do-while para practicar cada tipo de bucle.

public class g3_Loading2 {

    // Pausa corta entre actualizaciones de la barra
    private void delay() {
        try { Thread.sleep(50); } catch (InterruptedException e) {}
    }

    // Pide un caracter y pinta la barra usando for
    public void g3_L02_for(Scanner s) {
        String input;
        String regexUnCaracter = "^\\S$"; 
        
        do {
            System.out.println("L02 (for) - Ingrese caracter: ");
            input = s.next();
            if (!input.matches(regexUnCaracter)) {
                System.out.println("Entrada inválida. Ingrese UN SOLO caracter (no espacio).");
            }
        } while (!input.matches(regexUnCaracter));
        char c = input.charAt(0);

        int barLength = 20;
        for (int i = 0; i <= 100; i++) {
            int filled = (i * barLength) / 100;
            String bar = "";
            for (int j = 0; j < filled; j++) {
                bar += c;
            }
            for (int j = filled; j < barLength; j++) {
                bar += " ";
            }
            System.out.print("\r[" + bar + "] " + i + "%");
            delay();
        }
        System.out.println();
    }

    // Misma barra, usando while
    public void g3_L02_while(Scanner s) {
        String input;
        String regexUnCaracter = "^\\S$";
        
        do {
            System.out.println("L02 (while) - Ingrese caracter: ");
            input = s.next();
            if (!input.matches(regexUnCaracter)) {
                System.out.println("Entrada inválida. Ingrese UN SOLO caracter (no espacio).");
            }
        } while (!input.matches(regexUnCaracter));
        char c = input.charAt(0);
        
        int barLength = 20;
        int i = 0;
        while (i <= 100) {
            int filled = (i * barLength) / 100;
            String bar = "";
            int j = 0;
            while (j < filled) {
                bar += c;
                j++;
            }
            while (j < barLength) {
                bar += " ";
                j++;
            }
            System.out.print("\r[" + bar + "] " + i + "%");
            delay();
            i++;
        }
        System.out.println();
    }

    // Misma barra, usando do-while
    public void g3_L02_do_while(Scanner s) {
        String input;
        String regexUnCaracter = "^\\S$";
        
        do {
            System.out.println("L02 (do-while) - Ingrese caracter: ");
            input = s.next();
            if (!input.matches(regexUnCaracter)) {
                System.out.println("Entrada inválida. Ingrese UN SOLO caracter (no espacio).");
            }
        } while (!input.matches(regexUnCaracter));
        char c = input.charAt(0);

        int barLength = 20;
        int i = 0;
        do {
            int filled = (i * barLength) / 100;
            String bar = "";
            int j = 0;
            while (j < filled) {
                bar += c;
                j++;
            }
            while (j < barLength) {
                bar += " ";
                j++;
            }
            System.out.print("\r[" + bar + "] " + i + "%");
            delay();
            i++;
        } while (i <= 100);
        System.out.println();
    }
}