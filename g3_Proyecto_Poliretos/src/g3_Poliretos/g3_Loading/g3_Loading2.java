package g3_Loading;

import java.util.Scanner;

public class g3_Loading2 {

    private void delay() {
        try { Thread.sleep(50); } catch (InterruptedException e) {}
    }

    public void g3_L02_for() {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("L02 (for) - Ingrese caracter: ");
            char c = s.next().charAt(0);
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
        }
        System.out.println();
    }

    public void g3_L02_while() {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("L02 (while) - Ingrese caracter: ");
            char c = s.next().charAt(0);
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
        }
        System.out.println();
    }

    public void g3_L02_do_while() {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("L02 (do-while) - Ingrese caracter: ");
            char c = s.next().charAt(0);
            int barLength = 20;
            int i = 0;

            do {
                int filled = (i * barLength) / 100;
                String bar = "";
                int j = 0;
                // Un do-while aquí es más complejo, usamos while anidado por legibilidad
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
        }
        System.out.println();
    }
}