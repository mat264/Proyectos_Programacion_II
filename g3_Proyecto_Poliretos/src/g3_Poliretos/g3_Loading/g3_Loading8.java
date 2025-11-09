package g3_Loading;

import java.util.Scanner;

public class g3_Loading8 {

    private void delay() {
        try { Thread.sleep(50); } catch (InterruptedException e) {}
    }

    public void g3_L08_for() {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("L08 (for) - Ingrese nombre y apellidos: ");
            String name = s.nextLine();
            if (name.isEmpty()) return;

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
        }
        System.out.println();
    }

    public void g3_L08_while() {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("L08 (while) - Ingrese nombre y apellidos: ");
            String name = s.nextLine();
            if (name.isEmpty()) return;

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
        }
        System.out.println();
    }

    public void g3_L08_do_while() {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("L08 (do-while) - Ingrese nombre y apellidos: ");
            String name = s.nextLine();
            if (name.isEmpty()) return;

            int i = 0;
            do {
                int chars = (i * name.length()) / 100;
                String sub = name.substring(0, chars);
                String padding = "";
                int j = chars;
                do {
                    if(j >= name.length()) break;
                    padding += " ";
                    j++;
                } while (j < name.length());
                
                System.out.print("\r[" + sub + padding + "] " + i + "%");
                delay();
                i++;
            } while (i <= 100);
        }
        System.out.println();
    }
}