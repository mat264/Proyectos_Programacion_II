package g3_Poliretos.g3_Loading;

import java.util.Scanner;

// Muestra el nombre completo (nombre + apellido) progresivamente dentro de una barra.
// Se valida que nombre y apellido contengan solo letras.

public class g3_Loading8 {

    // Pausa para que la animación sea visible
    private void delay() {
        try { Thread.sleep(50); } catch (InterruptedException e) {}
    }

    // Variante que muestra nombre parcial con for
    public void g3_L08_for(Scanner s) {
        String regexSoloLetras = "^[a-zA-Z]+$";
        String nombre;
        String apellido;

        do {
            System.out.println("L08 (for) - Ingrese nombre (solo letras): ");
            nombre = s.next();
            if (!nombre.matches(regexSoloLetras))
                 System.out.println("Entrada inválida. Use solo letras (sin espacios).");
        } while (!nombre.matches(regexSoloLetras));
        
        do {
            System.out.println("L08 (for) - Ingrese apellido (solo letras): ");
            apellido = s.next();
            if (!apellido.matches(regexSoloLetras))
                 System.out.println("Entrada inválida. Use solo letras (sin espacios).");
        } while (!apellido.matches(regexSoloLetras));

        String name = nombre + " " + apellido;

        for (int i = 0; i <= 100; i++) {
            int chars = (i * name.length()) / 100;
            String sub = name.substring(0, chars);
            String padding = "";
            for(int j = chars; j < name.length(); j++) {
                padding += " ";
            }
            System.out.print("\r[" + sub + padding + "] " + i + "%");
            delay();
        }
        System.out.println();
    }

    // Variante con while
    public void g3_L08_while(Scanner s) {
        String regexSoloLetras = "^[a-zA-Z]+$";
        String nombre;
        String apellido;

        do {
            System.out.println("L08 (while) - Ingrese nombre (solo letras): ");
            nombre = s.next();
            if (!nombre.matches(regexSoloLetras))
                 System.out.println("Entrada inválida. Use solo letras (sin espacios).");
        } while (!nombre.matches(regexSoloLetras));
        
        do {
            System.out.println("L08 (while) - Ingrese apellido (solo letras): ");
            apellido = s.next();
            if (!apellido.matches(regexSoloLetras))
                 System.out.println("Entrada inválida. Use solo letras (sin espacios).");
        } while (!apellido.matches(regexSoloLetras));

        String name = nombre + " " + apellido;
        
        int i = 0;
        while (i <= 100) {
            int chars = (i * name.length()) / 100;
            String sub = name.substring(0, chars);
            String padding = "";
            int j = chars;
            while (j < name.length()) {
                padding += " ";
                j++;
            }
            System.out.print("\r[" + sub + padding + "] " + i + "%");
            delay();
            i++;
        }
        System.out.println();
    }

    // Variante con do-while
    public void g3_L08_do_while(Scanner s) {
        String regexSoloLetras = "^[a-zA-Z]+$";
        String nombre;
        String apellido;

        do {
            System.out.println("L08 (do-while) - Ingrese nombre (solo letras): ");
            nombre = s.next();
            if (!nombre.matches(regexSoloLetras))
                 System.out.println("Entrada inválida. Use solo letras (sin espacios).");
        } while (!nombre.matches(regexSoloLetras));
        
        do {
            System.out.println("L08 (do-while) - Ingrese apellido (solo letras): ");
            apellido = s.next();
            if (!apellido.matches(regexSoloLetras))
                 System.out.println("Entrada inválida. Use solo letras (sin espacios).");
        } while (!apellido.matches(regexSoloLetras));

        String name = nombre + " " + apellido;
        
        int i = 0;
        do {
            int chars = (i * name.length()) / 100;
            String sub = name.substring(0, chars);
            String padding = "";
            int j = chars;
            if (j < name.length()) { 
                do {
                    padding += " ";
                    j++;
                } while (j < name.length());
            }
            
            System.out.print("\r[" + sub + padding + "] " + i + "%");
            delay();
            i++;
        } while (i <= 100);
        System.out.println();
    }
}