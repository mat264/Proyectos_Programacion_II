package g3_Poliretos.g3_Loading;

import java.util.Scanner;

public class g3_Loading9 {

    private void delay() {
        try { Thread.sleep(100); } catch (InterruptedException e) {}
    }
    
    private void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void g3_L09_for(Scanner s) {
        String regexSoloLetras = "^[a-zA-Z]+$";
        String nombre;
        String apellido;

        do {
            System.out.println("L09 (for) - Ingrese nombre (solo letras): ");
            nombre = s.next();
            if (!nombre.matches(regexSoloLetras))
                 System.out.println("Entrada inválida. Use solo letras (sin espacios).");
        } while (!nombre.matches(regexSoloLetras));
        
        do {
            System.out.println("L09 (for) - Ingrese apellido (solo letras): ");
            apellido = s.next();
            if (!apellido.matches(regexSoloLetras))
                 System.out.println("Entrada inválida. Use solo letras (sin espacios).");
        } while (!apellido.matches(regexSoloLetras));

        String name = nombre + " " + apellido;
        
        int maxPadding = 20;
        for (int i = 0; i <= 100; i++) {
            clearScreen();
            System.out.println("Ejemplo: " + name);
            
            int charIndex = 0;
            if (name.length() > 1) { 
                charIndex = (i * (name.length() - 1)) / 100;
            }
            
            int padding = (i * maxPadding) / 100;
            
            String line = "";
            for(int j=0; j < padding; j++) line += " ";
            line += name.charAt(charIndex);
            
            System.out.println(line);
            System.out.println(i + "%");
            delay();
        }
        System.out.println();
    }

    public void g3_L09_while(Scanner s) {
        String regexSoloLetras = "^[a-zA-Z]+$";
        String nombre;
        String apellido;

        do {
            System.out.println("L09 (while) - Ingrese nombre (solo letras): ");
            nombre = s.next();
            if (!nombre.matches(regexSoloLetras))
                 System.out.println("Entrada inválida. Use solo letras (sin espacios).");
        } while (!nombre.matches(regexSoloLetras));
        
        do {
            System.out.println("L09 (while) - Ingrese apellido (solo letras): ");
            apellido = s.next();
            if (!apellido.matches(regexSoloLetras))
                 System.out.println("Entrada inválida. Use solo letras (sin espacios).");
        } while (!apellido.matches(regexSoloLetras));

        String name = nombre + " " + apellido;
        
        int maxPadding = 20;
        int i = 0;
        while (i <= 100) {
            clearScreen();
            System.out.println("Ejemplo: " + name);
            
            int charIndex = 0;
            if (name.length() > 1) {
                charIndex = (i * (name.length() - 1)) / 100;
            }
            
            int padding = (i * maxPadding) / 100;
            
            String line = "";
            int j = 0;
            while(j < padding) {
                line += " ";
                j++;
            }
            line += name.charAt(charIndex);
            
            System.out.println(line);
            System.out.println(i + "%");
            delay();
            i++;
        }
        System.out.println();
    }

    public void g3_L09_do_while(Scanner s) {
        String regexSoloLetras = "^[a-zA-Z]+$";
        String nombre;
        String apellido;

        do {
            System.out.println("L09 (do-while) - Ingrese nombre (solo letras): ");
            nombre = s.next();
            if (!nombre.matches(regexSoloLetras))
                 System.out.println("Entrada inválida. Use solo letras (sin espacios).");
        } while (!nombre.matches(regexSoloLetras));
        
        do {
            System.out.println("L09 (do-while) - Ingrese apellido (solo letras): ");
            apellido = s.next();
            if (!apellido.matches(regexSoloLetras))
                 System.out.println("Entrada inválida. Use solo letras (sin espacios).");
        } while (!apellido.matches(regexSoloLetras));

        String name = nombre + " " + apellido;
        
        int maxPadding = 20;
        int i = 0;
        do {
            clearScreen();
            System.out.println("Ejemplo: " + name);
            
            int charIndex = 0;
            if (name.length() > 1) {
                charIndex = (i * (name.length() - 1)) / 100;
            }

            int padding = (i * maxPadding) / 100;
            
            String line = "";
            int j = 0;
            if(padding > 0) {
                do {
                    line += " ";
                    j++;
                } while (j < padding);
            }
            line += name.charAt(charIndex);
            
            System.out.println(line);
            System.out.println(i + "%");
            delay();
            i++;
        } while (i <= 100);
        System.out.println();
    }
}