package g3_Loading;

import java.util.Scanner;

public class g3_Loading3 {

    private void delay() {
        try { Thread.sleep(50); } catch (InterruptedException e) {}
    }

    public void g3_L03_for() {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("L03 (for) - Ingrese caracter: ");
            char c = s.next().charAt(0);
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
        }
        System.out.println();
    }

    public void g3_L03_while() {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("L03 (while) - Ingrese caracter: ");
            char c = s.next().charAt(0);
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
        }
        System.out.println();
    }

    public void g3_L03_do_while() {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("L03 (do-while) - Ingrese caracter: ");
            char c = s.next().charAt(0);
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
        }
        System.out.println();
    }
}