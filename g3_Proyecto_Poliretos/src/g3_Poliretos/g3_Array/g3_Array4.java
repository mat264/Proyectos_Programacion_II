package g3_Poliretos.g3_Array;

import java.util.Scanner;

public class g3_Array4 {

    public void g3_arrayA04_for(Scanner s) {
        String regexLetrasYEspacios = "^[a-zA-Z ]+$";
        String nombreCompleto;

        s.nextLine(); 

        do {
            System.out.println("A04 (for) - Ingrese nombre y apellido (ej: Patricio Pacha): ");
            nombreCompleto = s.nextLine();

            if (nombreCompleto.isEmpty()) {
                System.out.println("El nombre no puede estar vacío.");
            } else if (!nombreCompleto.matches(regexLetrasYEspacios)) {
                System.out.println("Entrada inválida. Use solo letras y espacios.");
            }
        
        } while (nombreCompleto.isEmpty() || !nombreCompleto.matches(regexLetrasYEspacios));

        int n = nombreCompleto.length(); 
        if (n == 0) return;

        char[][] matriz = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = ' ';
            }
        }

        for (int i = 0; i < n; i++) {
            matriz[i][i] = nombreCompleto.charAt(i); 
            matriz[i][(n - 1) - i] = nombreCompleto.charAt(i); 
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void g3_arrayA04_while(Scanner s) {
        String regexLetrasYEspacios = "^[a-zA-Z ]+$";
        String nombreCompleto;
        

        do {
            System.out.println("A04 (while) - Ingrese nombre y apellido (ej: Patricio Pacha): ");
            nombreCompleto = s.nextLine(); 

            if (nombreCompleto.isEmpty()) {
                System.out.println("El nombre no puede estar vacío.");
            } else if (!nombreCompleto.matches(regexLetrasYEspacios)) {
                System.out.println("Entrada inválida. Use solo letras y espacios.");
            }
        } while (nombreCompleto.isEmpty() || !nombreCompleto.matches(regexLetrasYEspacios));


        int n = nombreCompleto.length();
        if (n == 0) return;

        char[][] matriz = new char[n][n];

        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < n) {
                matriz[i][j] = ' ';
                j++;
            }
            i++;
        }

        i = 0;
        while (i < n) {
            matriz[i][i] = nombreCompleto.charAt(i);
            matriz[i][(n - 1) - i] = nombreCompleto.charAt(i);
            i++;
        }

        i = 0;
        while (i < n) {
            int j = 0;
            while (j < n) {
                System.out.print(matriz[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public void g3_arrayA04_do_while(Scanner s) {
        String regexLetrasYEspacios = "^[a-zA-Z ]+$";
        String nombreCompleto;

        
        do {
            System.out.println("A04 (do-while) - Ingrese nombre y apellido (ej: Patricio Pacha): ");
            nombreCompleto = s.nextLine(); 

            if (nombreCompleto.isEmpty()) {
                System.out.println("El nombre no puede estar vacío.");
            } else if (!nombreCompleto.matches(regexLetrasYEspacios)) {
                System.out.println("Entrada inválida. Use solo letras y espacios.");
            }
        } while (nombreCompleto.isEmpty() || !nombreCompleto.matches(regexLetrasYEspacios));

        int n = nombreCompleto.length();
        if (n == 0) return;

        char[][] matriz = new char[n][n];

        int i = 0;
        do {
            int j = 0;
            do {
                matriz[i][j] = ' ';
                j++;
            } while (j < n);
            i++;
        } while (i < n);

        i = 0;
        do {
            matriz[i][i] = nombreCompleto.charAt(i);
            matriz[i][(n - 1) - i] = nombreCompleto.charAt(i);
            i++;
        } while (i < n);

        i = 0;
        do {
            int j = 0;
            do {
                System.out.print(matriz[i][j] + " ");
                j++;
            } while (j < n);
            System.out.println();
            i++;
        } while (i < n);
    }
}