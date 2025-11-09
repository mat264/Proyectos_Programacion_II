package g3_Array;

import java.util.Scanner;

public class g3_Arrays2 {

    // Helper privado para la lógica de la 'P' (evita código ilegible)
    private boolean esLetraP(int i, int j, int n) {
        if (j == 0) return true; // Tallo
        if (i == 0 && j < n - 1) return true; // Arriba
        if (i == n / 2 && j < n - 1) return true; // Medio
        if (j == n - 1 && i > 0 && i < n / 2) return true; // Curva
        return false;
    }

    public void g3_arrayA02_for(int n) {
        // --- Validación ---
        if (n <= 0) {
            System.out.println("A02: El tamaño debe ser positivo.");
            return;
        }

        try (Scanner s = new Scanner(System.in)) {
            System.out.println("A02 (for) - Ingrese caracter: ");
            char c = s.next().charAt(0);
            
            int ancho = n * 2 + 1;
            char[][] matriz = new char[n][ancho];

            // 1. Rellenar con espacios (FOR)
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < ancho; j++) {
                    matriz[i][j] = ' ';
                }
            }

            // 2. Dibujar letras (FOR)
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (esLetraP(i, j, n)) {
                        matriz[i][j] = c;         // Primera 'P'
                        matriz[i][j + n + 1] = c; // Segunda 'P'
                    }
                }
            }

            // 3. Imprimir matriz (FOR)
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < ancho; j++) {
                    System.out.print(matriz[i][j]);
                }
                System.out.println();
            }
        }
    }

    public void g3_arrayA02_while(int n) {
        // --- Validación ---
        if (n <= 0) {
            System.out.println("A02: El tamaño debe ser positivo.");
            return;
        }

        try (Scanner s = new Scanner(System.in)) {
            System.out.println("A02 (while) - Ingrese caracter: ");
            char c = s.next().charAt(0);
            
            int ancho = n * 2 + 1;
            char[][] matriz = new char[n][ancho];

            // 1. Rellenar con espacios (WHILE)
            int i = 0;
            while (i < n) {
                int j = 0;
                while (j < ancho) {
                    matriz[i][j] = ' ';
                    j++;
                }
                i++;
            }

            // 2. Dibujar letras (WHILE)
            i = 0;
            while (i < n) {
                int j = 0;
                while (j < n) {
                    if (esLetraP(i, j, n)) {
                        matriz[i][j] = c;
                        matriz[i][j + n + 1] = c;
                    }
                    j++;
                }
                i++;
            }

            // 3. Imprimir matriz (WHILE)
            i = 0;
            while (i < n) {
                int j = 0;
                while (j < ancho) {
                    System.out.print(matriz[i][j]);
                    j++;
                }
                System.out.println();
                i++;
            }
        }
    }

    public void g3_arrayA02_do_while(int n) {
        // --- Validación ---
        if (n <= 0) {
            System.out.println("A02: El tamaño debe ser positivo.");
            return;
        }

        try (Scanner s = new Scanner(System.in)) {
            System.out.println("A02 (do-while) - Ingrese caracter: ");
            char c = s.next().charAt(0);
            
            int ancho = n * 2 + 1;
            char[][] matriz = new char[n][ancho];

            // 1. Rellenar con espacios (DO-WHILE)
            int i = 0;
            do {
                int j = 0;
                do {
                    matriz[i][j] = ' ';
                    j++;
                } while (j < ancho);
                i++;
            } while (i < n);

            // 2. Dibujar letras (DO-WHILE)
            i = 0;
            do {
                int j = 0;
                do {
                    if (esLetraP(i, j, n)) {
                        matriz[i][j] = c;
                        matriz[i][j + n + 1] = c;
                    }
                    j++;
                } while (j < n);
                i++;
            } while (i < n);

            // 3. Imprimir matriz (DO-WHILE)
            i = 0;
            do {
                int j = 0;
                do {
                    System.out.print(matriz[i][j]);
                    j++;
                } while (j < ancho);
                System.out.println();
                i++;
            } while (i < n);
        }
    }
}