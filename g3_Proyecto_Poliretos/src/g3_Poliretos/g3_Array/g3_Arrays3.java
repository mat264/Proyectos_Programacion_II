package g3_Array;

public class g3_Arrays3 {

    private String nombre = "patmic";

    // Helper privado para imprimir el plano (evita repetir código complejo)
    private void imprimirPlano(char[][] plano, int max_y, int max_x) {
        // Imprimir eje Y y contenido
        for (int y = 0; y <= max_y; y++) {
            System.out.print((max_y - y) + " | ");
            for (int x = 0; x <= max_x; x++) {
                System.out.print(plano[y][x]);
            }
            System.out.println();
        }
        // Imprimir eje X
        System.out.print("  | ");
        for (int x = 0; x <= max_x; x++) {
            System.out.print("_");
        }
        System.out.println();
    }

    public void g3_arrayA03_for(int n) {
        // --- Validación ---
        if (n <= 0) {
            System.out.println("A03: El tamaño debe ser positivo.");
            return;
        }
        
        int max_x = n;
        int max_y = 2 * n; // f(x)=2x, el punto más alto será 2*n
        char[][] plano = new char[max_y + 1][max_x + 1];

        // 1. Rellenar con espacios (FOR)
        for (int y = 0; y <= max_y; y++) {
            for (int x = 0; x <= max_x; x++) {
                plano[y][x] = ' ';
            }
        }

        // 2. Graficar puntos (FOR)
        for (int x = 0; x <= max_x; x++) {
            int y = 2 * x; // f(x)=2x
            
            // Validaciones
            if (y > max_y || x >= nombre.length()) {
                continue; // Saltar si está fuera de bounds
            }
            
            // Invertir eje Y para la matriz
            plano[max_y - y][x] = nombre.charAt(x);
        }

        imprimirPlano(plano, max_y, max_x);
    }

    public void g3_arrayA03_while(int n) {
        // --- Validación ---
        if (n <= 0) {
            System.out.println("A03: El tamaño debe ser positivo.");
            return;
        }
        
        int max_x = n;
        int max_y = 2 * n;
        char[][] plano = new char[max_y + 1][max_x + 1];

        // 1. Rellenar con espacios (WHILE)
        int y = 0;
        while (y <= max_y) {
            int x = 0;
            while (x <= max_x) {
                plano[y][x] = ' ';
                x++;
            }
            y++;
        }

        // 2. Graficar puntos (WHILE)
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

    public void g3_arrayA03_do_while(int n) {
        // --- Validación ---
        if (n <= 0) {
            System.out.println("A03: El tamaño debe ser positivo.");
            return;
        }
        
        int max_x = n;
        int max_y = 2 * n;
        char[][] plano = new char[max_y + 1][max_x + 1];

        // 1. Rellenar con espacios (DO-WHILE)
        int y = 0;
        do {
            int x = 0;
            do {
                plano[y][x] = ' ';
                x++;
            } while (x <= max_x);
            y++;
        } while (y <= max_y);

        // 2. Graficar puntos (DO-WHILE)
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