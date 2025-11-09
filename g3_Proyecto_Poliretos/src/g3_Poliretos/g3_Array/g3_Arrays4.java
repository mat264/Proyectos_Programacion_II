package g3_Array;

public class g3_Arrays4 {

    private String nombreCompleto = "PatricioPacha"; // Ejemplo A02

    public void g3_arrayA04_for() {
        int n = nombreCompleto.length();
        // --- Validación ---
        if (n == 0) return;

        char[][] matriz = new char[n][n];

        // 1. Rellenar con espacios (FOR)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = ' ';
            }
        }

        // 2. Dibujar 'X' (FOR)
        for (int i = 0; i < n; i++) {
            matriz[i][i] = nombreCompleto.charAt(i); // Diagonal \
            matriz[i][(n - 1) - i] = nombreCompleto.charAt(i); // Diagonal /
        }

        // 3. Imprimir (FOR)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void g3_arrayA04_while() {
        int n = nombreCompleto.length();
        // --- Validación ---
        if (n == 0) return;

        char[][] matriz = new char[n][n];

        // 1. Rellenar con espacios (WHILE)
        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < n) {
                matriz[i][j] = ' ';
                j++;
            }
            i++;
        }

        // 2. Dibujar 'X' (WHILE)
        i = 0;
        while (i < n) {
            matriz[i][i] = nombreCompleto.charAt(i);
            matriz[i][(n - 1) - i] = nombreCompleto.charAt(i);
            i++;
        }

        // 3. Imprimir (WHILE)
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

    public void g3_arrayA04_do_while() {
        int n = nombreCompleto.length();
        // --- Validación ---
        if (n == 0) return;

        char[][] matriz = new char[n][n];

        // 1. Rellenar con espacios (DO-WHILE)
        int i = 0;
        do {
            int j = 0;
            do {
                matriz[i][j] = ' ';
                j++;
            } while (j < n);
            i++;
        } while (i < n);

        // 2. Dibujar 'X' (DO-WHILE)
        i = 0;
        do {
            matriz[i][i] = nombreCompleto.charAt(i);
            matriz[i][(n - 1) - i] = nombreCompleto.charAt(i);
            i++;
        } while (i < n);

        // 3. Imprimir (DO-WHILE)
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