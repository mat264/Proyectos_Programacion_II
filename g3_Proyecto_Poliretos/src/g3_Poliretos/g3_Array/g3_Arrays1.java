package g3_Array;

import java.util.Scanner;

public class g3_Arrays1 {

    private String[] nombres = {"Pancracia", "Carmeliana", "Altamirano", "Perez"};

    public void g3_arrayA01_for() {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("A01 (for) - Ingrese el porcentaje de carga: (ej: 100 75 50 25)");
            int[] porcentajes = new int[4];
            for (int i = 0; i < 4; i++) {
                porcentajes[i] = s.nextInt();
            }

            System.out.println("Pancracia Carmeliana Altamirano Perez");
            for (int i = 0; i < 4; i++) {
                // Lógica de la barra "desde cero"
                int p = porcentajes[i];
                if (p < 0) p = 0;
                if (p > 100) p = 100;

                int caracteresRellenos = (p * 10) / 100;
                String barra = "";
                for (int j = 0; j < caracteresRellenos; j++) {
                    barra += "=";
                }
                if (p < 100 && barra.length() < 10) {
                    barra += ">";
                }
                while (barra.length() < 10) {
                    barra += " ";
                }

                String nombreCorto = nombres[i];
                if (nombreCorto.length() > 7) {
                    nombreCorto = nombreCorto.substring(0, 7);
                }
                System.out.println("[" + barra + "] " + p + "% " + nombreCorto);
            }
        }
    }

    public void g3_arrayA01_while() {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("A01 (while) - Ingrese el porcentaje de carga: (ej: 100 75 50 25)");
            int[] porcentajes = new int[4];
            int i = 0;
            while (i < 4) {
                porcentajes[i] = s.nextInt();
                i++;
            }

            System.out.println("Pancracia Carmeliana Altamirano Perez");
            i = 0;
            while (i < 4) {
                // Lógica de la barra "desde cero"
                int p = porcentajes[i];
                if (p < 0) p = 0;
                if (p > 100) p = 100;

                int caracteresRellenos = (p * 10) / 100;
                String barra = "";
                int j = 0;
                while (j < caracteresRellenos) {
                    barra += "=";
                    j++;
                }
                if (p < 100 && barra.length() < 10) {
                    barra += ">";
                }
                while (barra.length() < 10) {
                    barra += " ";
                }

                String nombreCorto = nombres[i];
                if (nombreCorto.length() > 7) {
                    nombreCorto = nombreCorto.substring(0, 7);
                }
                System.out.println("[" + barra + "] " + p + "% " + nombreCorto);
                i++;
            }
        }
    }

    public void g3_arrayA01_do_while() {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("A01 (do-while) - Ingrese el porcentaje de carga: (ej: 100 75 50 25)");
            int[] porcentajes = new int[4];
            int i = 0;
            do {
                porcentajes[i] = s.nextInt();
                i++;
            } while (i < 4);

            System.out.println("Pancracia Carmeliana Altamirano Perez");
            i = 0;
            do {
                // Lógica de la barra "desde cero"
                int p = porcentajes[i];
                if (p < 0) p = 0;
                if (p > 100) p = 100;

                int caracteresRellenos = (p * 10) / 100;
                String barra = "";
                int j = 0;
                do {
                    if (j >= caracteresRellenos) break; 
                    barra += "=";
                    j++;
                } while (j < caracteresRellenos);

                if (p < 100 && barra.length() < 10) {
                    barra += ">";
                }
                while (barra.length() < 10) { 
                    barra += " ";
                }

                String nombreCorto = nombres[i];
                if (nombreCorto.length() > 7) {
                    nombreCorto = nombreCorto.substring(0, 7);
                }
                System.out.println("[" + barra + "] " + p + "% " + nombreCorto);
                i++;
            } while (i < 4);
        }
    }
}