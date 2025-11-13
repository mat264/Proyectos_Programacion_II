package g3_Poliretos.g3_Array;

import java.util.Scanner;

// Dibuja en un plano los caracteres de un nombre siguiendo la función f(x)=2x.
// Muestra el plano con coordenadas; incluye for/while/do-while para construir el arreglo.

public class g3_Array3 {

    // Imprime la matriz en forma de plano con ejes y separadores
    private void imprimirPlano(char[][] plano, int max_y, int max_x) {
        // ... (Tu código de imprimirPlano está bien, no se toca) ...
        for (int y = 0; y <= max_y; y++) {
            System.out.print((max_y - y) + " | ");
            for (int x = 0; x <= max_x; x++) {
                System.out.print(plano[y][x]);
            }
            System.out.println();
        }
        System.out.print("  | ");
        for (int x = 0; x <= max_x; x++) {
            System.out.print("_");
        }
        System.out.println();
    }

    public void g3_arrayA03_for(int n, Scanner s) {
        if (n <= 0) {
            System.out.println("A03: El tamaño debe ser positivo.");
            return;
        }

        String nombre;
        do {
            System.out.println("A03 (for) - Ingrese un nombre (no vacío, ej: patmic): ");
            nombre = s.next(); 
        } while (nombre.isEmpty());
        
        int max_x = n;
        int max_y = 2 * n; 
        char[][] plano = new char[max_y + 1][max_x + 1];

        for (int y = 0; y <= max_y; y++) {
            for (int x = 0; x <= max_x; x++) {
                plano[y][x] = ' ';
            }
        }

        for (int x = 0; x <= max_x; x++) {
            int y = 2 * x; // f(x)=2x
            
            if (y > max_y || x >= nombre.length()) { 
                continue; 
            }
            
            plano[max_y - y][x] = nombre.charAt(x); 
        }

        imprimirPlano(plano, max_y, max_x);
    }

    public void g3_arrayA03_while(int n, Scanner s) {
        if (n <= 0) {
            System.out.println("A03: El tamaño debe ser positivo.");
            return;
        }

        String nombre;
        do {
            System.out.println("A03 (while) - Ingrese un nombre (no vacío, ej: patmic): ");
            nombre = s.next();
        } while (nombre.isEmpty());
        
        int max_x = n;
        int max_y = 2 * n;
        char[][] plano = new char[max_y + 1][max_x + 1];

        int y = 0;
        while (y <= max_y) {
            int x = 0;
            while (x <= max_x) {
                plano[y][x] = ' ';
                x++;
            }
            y++;
        }

        int x = 0;
        while (x <= max_x) {
            int y_func = 2 * x;
            
            if (y_func <= max_y && x < nombre.length()) { 
                 plano[max_y - y_func][x] = nombre.charAt(x); 
            }
            x++;
        }

        imprimirPlano(plano, max_y, max_x);
    }

    public void g3_arrayA03_do_while(int n, Scanner s) {
        if (n <= 0) {
            System.out.println("A03: El tamaño debe ser positivo.");
            return;
        }
        
        String nombre;
        do {
            System.out.println("A03 (do-while) - Ingrese un nombre (no vacío, ej: patmic): ");
            nombre = s.next();
        } while (nombre.isEmpty());

        int max_x = n;
        int max_y = 2 * n;
        char[][] plano = new char[max_y + 1][max_x + 1];

        int y = 0;
        do {
            int x = 0;
            do {
                plano[y][x] = ' ';
                x++;
            } while (x <= max_x);
            y++;
        } while (y <= max_y);

        int x = 0;
        do {
            int y_func = 2 * x;
            
            if (y_func <= max_y && x < nombre.length()) { 
                 plano[max_y - y_func][x] = nombre.charAt(x); 
            }
            x++;
        } while (x <= max_x);

        imprimirPlano(plano, max_y, max_x);
    }
}
