package g3_Poliretos.g3_Array;

import java.util.Scanner;

// Lee cuatro nombres y cuatro porcentajes y muestra cada nombre con una barra de progreso
// proporcional al porcentaje ingresado. Hay versiones con for, while y do-while.

public class g3_Array1 {

    // Pide cuatro nombres y luego cuatro porcentajes; imprime barras (for)
    public void g3_arrayA01_for(Scanner s) {
        
        String regexSoloLetras = "^[a-zA-Z]+$";
        String[] nombres = new String[4];
        
        System.out.println("A01 (for) - Ingrese 4 nombres (un nombre/apellido por palabra):");

        do {
            System.out.print("Nombre 1: ");
            nombres[0] = s.next();
            if (!nombres[0].matches(regexSoloLetras))
                System.out.println("Inválido. Solo letras.");
        } while (!nombres[0].matches(regexSoloLetras));
        
        do {
            System.out.print("Nombre 2: ");
            nombres[1] = s.next();
            if (!nombres[1].matches(regexSoloLetras))
                System.out.println("Inválido. Solo letras.");
        } while (!nombres[1].matches(regexSoloLetras));
        
        do {
            System.out.print("Nombre 3: ");
            nombres[2] = s.next();
            if (!nombres[2].matches(regexSoloLetras))
                System.out.println("Inválido. Solo letras.");
        } while (!nombres[2].matches(regexSoloLetras));
        
        do {
            System.out.print("Nombre 4: ");
            nombres[3] = s.next();
            if (!nombres[3].matches(regexSoloLetras))
                System.out.println("Inválido. Solo letras.");
        } while (!nombres[3].matches(regexSoloLetras));


        System.out.println("A01 (for) - Ingrese 4 porcentajes (ej: 100 75 50 25):");
        int[] porcentajes = new int[4];
        for (int i = 0; i < 4; i++) {
            porcentajes[i] = s.nextInt();
        }

        System.out.println(nombres[0] + " " + nombres[1] + " " + nombres[2] + " " + nombres[3]);
        
        for (int i = 0; i < 4; i++) {
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

    // Misma funcionalidad usando while
    public void g3_arrayA01_while(Scanner s) {
        
        String regexSoloLetras = "^[a-zA-Z]+$";
        String[] nombres = new String[4];
        
        System.out.println("A01 (while) - Ingrese 4 nombres (un nombre/apellido por palabra):");

        do {
            System.out.print("Nombre 1: ");
            nombres[0] = s.next();
            if (!nombres[0].matches(regexSoloLetras))
                System.out.println("Inválido. Solo letras.");
        } while (!nombres[0].matches(regexSoloLetras));
        
        do {
            System.out.print("Nombre 2: ");
            nombres[1] = s.next();
            if (!nombres[1].matches(regexSoloLetras))
                System.out.println("Inválido. Solo letras.");
        } while (!nombres[1].matches(regexSoloLetras));
        
        do {
            System.out.print("Nombre 3: ");
            nombres[2] = s.next();
            if (!nombres[2].matches(regexSoloLetras))
                System.out.println("Inválido. Solo letras.");
        } while (!nombres[2].matches(regexSoloLetras));
        
        do {
            System.out.print("Nombre 4: ");
            nombres[3] = s.next();
            if (!nombres[3].matches(regexSoloLetras))
                System.out.println("Inválido. Solo letras.");
        } while (!nombres[3].matches(regexSoloLetras));


        System.out.println("A01 (while) - Ingrese 4 porcentajes (ej: 100 75 50 25):");
        int[] porcentajes = new int[4];
        int i = 0;
        while (i < 4) {
            porcentajes[i] = s.nextInt();
            i++;
        }

        System.out.println(nombres[0] + " " + nombres[1] + " " + nombres[2] + " " + nombres[3]);
        
        i = 0;
        while (i < 4) {
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

    // Misma funcionalidad usando do-while
    public void g3_arrayA01_do_while(Scanner s) {
        
        String regexSoloLetras = "^[a-zA-Z]+$";
        String[] nombres = new String[4];
        
        System.out.println("A01 (do-while) - Ingrese 4 nombres (un nombre/apellido por palabra):");

        do {
            System.out.print("Nombre 1: ");
            nombres[0] = s.next();
            if (!nombres[0].matches(regexSoloLetras))
                System.out.println("Inválido. Solo letras.");
        } while (!nombres[0].matches(regexSoloLetras));
        
        do {
            System.out.print("Nombre 2: ");
            nombres[1] = s.next();
            if (!nombres[1].matches(regexSoloLetras))
                System.out.println("Inválido. Solo letras.");
        } while (!nombres[1].matches(regexSoloLetras));
        
        do {
            System.out.print("Nombre 3: ");
            nombres[2] = s.next();
            if (!nombres[2].matches(regexSoloLetras))
                System.out.println("Inválido. Solo letras.");
        } while (!nombres[2].matches(regexSoloLetras));
        
        do {
            System.out.print("Nombre 4: ");
            nombres[3] = s.next();
            if (!nombres[3].matches(regexSoloLetras))
                System.out.println("Inválido. Solo letras.");
        } while (!nombres[3].matches(regexSoloLetras));

        System.out.println("A01 (do-while) - Ingrese 4 porcentajes (ej: 100 75 50 25):");
        int[] porcentajes = new int[4];
        int i = 0;
        do {
            porcentajes[i] = s.nextInt();
            i++;
        } while (i < 4);

        System.out.println(nombres[0] + " " + nombres[1] + " " + nombres[2] + " " + nombres[3]);
        
        i = 0;
        do {
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