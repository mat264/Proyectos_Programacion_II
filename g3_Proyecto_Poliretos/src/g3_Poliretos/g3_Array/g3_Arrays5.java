package g3_Array;

import java.util.Random;

public class g3_Arrays5 {

    private String nombre = "Patricio"; // Para el tamaño
    private String nombreCompleto = "PatricioPachaMarceloAnrango"; // Nombres del ejemplo
    private Random rand = new Random();

    // Helper para visualizar (limpia consola e imprime)
    private void visualizar(char[][] matriz) {
        try {
            // Pausa (delay)
            Thread.sleep(100); 
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // "Limpiar" consola
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Imprimir matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                // Imprimir '.' si está vacío, o la letra/asterisco
                System.out.print((matriz[i][j] == '\0' ? '.' : matriz[i][j]) + " ");
            }
            System.out.println();
        }
    }

    public void g3_arrayA05_for() {
        int n = nombre.length(); // Tamaño 8x8
        // --- Validación ---
        if (n == 0) return;

        char[][] matriz = new char[n][n];
        
        for (int i = 0; i < nombreCompleto.length(); i++) {
            char letra = nombreCompleto.charAt(i);
            int x = rand.nextInt(n); // Fila aleatoria
            int y = rand.nextInt(n); // Columna aleatoria

            if (matriz[x][y] == '\0') {
                matriz[x][y] = letra;
            } else {
                matriz[x][y] = '*'; // Colisión
            }
            visualizar(matriz);
        }
    }

    public void g3_arrayA05_while() {
        int n = nombre.length();
        // --- Validación ---
        if (n == 0) return;

        char[][] matriz = new char[n][n];
        
        int i = 0;
        while (i < nombreCompleto.length()) {
            char letra = nombreCompleto.charAt(i);
            int x = rand.nextInt(n);
            int y = rand.nextInt(n);

            if (matriz[x][y] == '\0') {
                matriz[x][y] = letra;
            } else {
                matriz[x][y] = '*';
            }
            visualizar(matriz);
            i++;
        }
    }

    public void g3_arrayA05_do_while() {
        int n = nombre.length();
        // --- Validación ---
        if (n == 0 || nombreCompleto.length() == 0) return;

        char[][] matriz = new char[n][n];
        
        int i = 0;
        do {
            char letra = nombreCompleto.charAt(i);
            int x = rand.nextInt(n);
            int y = rand.nextInt(n);

            if (matriz[x][y] == '\0') {
                matriz[x][y] = letra;
            } else {
                matriz[x][y] = '*';
            }
            visualizar(matriz);
            i++;
        } while (i < nombreCompleto.length());
    }
}