package g3_Poliretos.g3_Loading;

import java.util.Scanner;

public class g3_Loading3 {

    private void delay() {
        try { Thread.sleep(50); } catch (InterruptedException e) {}
    }

    public void g3_L03_for(Scanner s) {
        String input;
        String regexUnCaracter = "^\\S$"; // Un caracter, no espacio
        
        do {
            System.out.println("L03 (for) - Ingrese caracter: ");
            input = s.next();
            if (!input.matches(regexUnCaracter)) {
                System.out.println("Entrada inválida. Ingrese UN SOLO caracter (no espacio).");
            }
        } while (!input.matches(regexUnCaracter));
        char c = input.charAt(0);
        
        int barLength = 20;
        for (int i = 0; i <= 100; i++) {
            int position = (i * (barLength - 1)) / 100;
            String bar = "";
            for (int j = 0; j < barLength; j++) {
                bar += (j == position) ? c : " ";
            }
            System.out.print("\r[" + bar + "] " + i + "%");
            delay();
        }
        System.out.println();
    }

    public void g3_L03_while(Scanner s) {
        String input;
        String regexUnCaracter = "^\\S$";
        
        do {
            System.out.println("L03 (while) - Ingrese caracter: ");
            input = s.next();
            if (!input.matches(regexUnCaracter)) {
                System.out.println("Entrada inválida. Ingrese UN SOLO caracter (no espacio).");
            }
        } while (!input.matches(regexUnCaracter));
        char c = input.charAt(0);
        
        int barLength = 20;
        int i = 0;
        while (i <= 100) {
            int position = (i * (barLength - 1)) / 100;
            String bar = "";
            int j = 0;
            while (j < barLength) {
                bar += (j == position) ? c : " ";
                j++;
            }
            System.out.print("\r[" + bar + "] " + i + "%");
            delay();
            i++;
        }
        System.out.println();
    }

    public void g3_L03_do_while(Scanner s) {
        String input;
        String regexUnCaracter = "^\\S$";
        
        do {
            System.out.println("L03 (do-while) - Ingrese caracter: ");
            input = s.next();
            if (!input.matches(regexUnCaracter)) {
                System.out.println("Entrada inválida. Ingrese UN SOLO caracter (no espacio).");
            }
        } while (!input.matches(regexUnCaracter));
        char c = input.charAt(0);
        
        int barLength = 20;
        int i = 0;
        do {
            int position = (i * (barLength - 1)) / 100;
            String bar = "";
            int j = 0;
            do {
                bar += (j == position) ? c : " ";
                j++;
            } while (j < barLength);
            System.out.print("\r[" + bar + "] " + i + "%");
            delay();
            i++;
        } while (i <= 100);
        System.out.println();
    }
}