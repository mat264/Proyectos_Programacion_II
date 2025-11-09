package g3_Loading;

import java.util.Scanner;

public class g3_Loading9 {

    private void delay() {
        try { Thread.sleep(100); } catch (InterruptedException e) {}
    }
    
    // Limpia la consola (para animaciones multi-línea)
    private void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void g3_L09_for() {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("L09 (for) - Ingrese nombre completo: ");
            String name = s.nextLine();
            if (name.isEmpty()) return;
            
            int maxPadding = 20; // Ancho de la "columna"

            for (int i = 0; i <= 100; i++) {
                clearScreen();
                System.out.println("Ejemplo: " + name);
                
                int charIndex = (i * (name.length() - 1)) / 100;
                int padding = (i * maxPadding) / 100;
                
                String line = "";
                for(int j=0; j < padding; j++) line += " ";
                line += name.charAt(charIndex);
                
                System.out.println(line);
                System.out.println(i + "%");
                delay();
            }
        }
        System.out.println();
    }

    public void g3_L09_while() {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("L09 (while) - Ingrese nombre completo: ");
            String name = s.nextLine();
            if (name.isEmpty()) return;
            
            int maxPadding = 20;
            int i = 0;
            while (i <= 100) {
                clearScreen();
                System.out.println("Ejemplo: " + name);
                
                int charIndex = (i * (name.length() - 1)) / 100;
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
        }
        System.out.println();
    }

    public void g3_L09_do_while() {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("L09 (do-while) - Ingrese nombre completo: ");
            String name = s.nextLine();
            if (name.isEmpty()) return;
            
            int maxPadding = 20;
            int i = 0;
            do {
                clearScreen();
                System.out.println("Ejemplo: " + name);
                
                int charIndex = (i * (name.length() - 1)) / 100;
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
        }
        System.out.println();
    }
}