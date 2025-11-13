package g3_Poliretos.g3_Array;

import java.util.Scanner;

// Dibuja la letra 'P' en una matriz usando un caracter elegido por el usuario.
// Crea dos letras 'P' separadas (lado a lado) y muestra con for/while/do-while.

public class g3_Array2 {

    // Decide si la posición (i,j) forma parte de la letra 'P'
    private boolean esLetraP(int i, int j, int n) {
        if (j == 0) return true;
        if (i == 0 && j < n - 1) return true;
        if (i == n / 2 && j < n - 1) return true;
        if (j == n - 1 && i > 0 && i < n / 2) return true;
        return false;
    }

    // Pide un caracter y pinta la matriz con dos 'P' (for)
    public void g3_arrayA02_for(int n, Scanner s) {
        if (n <= 0) {
            System.out.println("A02: El tamaño debe ser positivo.");
            return;
        }

        String input;
        String regexUnCaracter = "^\\S$"; 
        
        do {
            System.out.println("A02 (for) - Ingrese un caracter (ej: #): ");
            input = s.next();
            if (!input.matches(regexUnCaracter)) {
                System.out.println("Entrada inválida. Ingrese UN SOLO caracter (no espacio).");
            }
        } while (!input.matches(regexUnCaracter));
        char c = input.charAt(0);
        
        int ancho = n * 2 + 1;
        char[][] matriz = new char[n][ancho];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < ancho; j++) {
                matriz[i][j] = ' ';
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (esLetraP(i, j, n)) {
                    matriz[i][j] = c;
                    matriz[i][j + n + 1] = c;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }

    // Mismo dibujo con while
    public void g3_arrayA02_while(int n, Scanner s) {
        if (n <= 0) {
            System.out.println("A02: El tamaño debe ser positivo.");
            return;
        }

        String input;
        String regexUnCaracter = "^\\S$";
        
        do {
            System.out.println("A02 (while) - Ingrese un caracter (ej: #): ");
            input = s.next();
            if (!input.matches(regexUnCaracter)) {
                System.out.println("Entrada inválida. Ingrese UN SOLO caracter (no espacio).");
            }
        } while (!input.matches(regexUnCaracter));
        char c = input.charAt(0);
        
        int ancho = n * 2 + 1;
        char[][] matriz = new char[n][ancho];

        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < ancho) {
                matriz[i][j] = ' ';
                j++;
            }
            i++;
        }
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

    // Mismo dibujo con do-while
    public void g3_arrayA02_do_while(int n, Scanner s) {
        if (n <= 0) {
            System.out.println("A02: El tamaño debe ser positivo.");
            return;
        }

        String input;
        String regexUnCaracter = "^\\S$";
        
        do {
            System.out.println("A02 (do-while) - Ingrese un caracter (ej: #): ");
            input = s.next();
            if (!input.matches(regexUnCaracter)) {
                System.out.println("Entrada inválida. Ingrese UN SOLO caracter (no espacio).");
            }
        } while (!input.matches(regexUnCaracter));
        char c = input.charAt(0);
        
        int ancho = n * 2 + 1;
        char[][] matriz = new char[n][ancho];

        int i = 0;
        do {
            int j = 0;
            do {
                matriz[i][j] = ' ';
                j++;
            } while (j < ancho);
            i++;
        } while (i < n);
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