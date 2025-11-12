package g3_Poliretos.g3_Array;

import java.util.Random;
import java.util.Scanner; 

public class g3_Array5 {

    private Random rand = new Random();

    private void visualizar(char[][] matriz) {
        try {
            Thread.sleep(100); 
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print((matriz[i][j] == '\0' ? '.' : matriz[i][j]) + " ");
            }
            System.out.println();
        }
    }

    public void g3_arrayA05_for(Scanner s) {
        String nombreSize;
        String nombreLetras;
        do {
            System.out.println("A05 (for) - Ingrese un nombre (para el tamaño, ej: Patricio): ");
            nombreSize = s.next();
        } while (nombreSize.isEmpty());
        do {
            System.out.println("A05 (for) - Ingrese nombres (para las letras, ej: PatricioPacha): ");
            nombreLetras = s.next();
        } while (nombreLetras.isEmpty());

        int n = nombreSize.length(); 
        if (n == 0) return;

        char[][] matriz = new char[n][n];
        
        for (int i = 0; i < nombreLetras.length(); i++) {
            char letra = nombreLetras.charAt(i);
            int x = rand.nextInt(n); 
            int y = rand.nextInt(n); 

            if (matriz[x][y] == '\0') {
                matriz[x][y] = letra;
            } else {
                matriz[x][y] = '*'; 
            }
            visualizar(matriz);
        }
    }

    public void g3_arrayA05_while(Scanner s) {
        String nombreSize;
        String nombreLetras;
        do {
            System.out.println("A05 (while) - Ingrese un nombre (para el tamaño, ej: Patricio): ");
            nombreSize = s.next();
        } while (nombreSize.isEmpty());
        do {
            System.out.println("A05 (while) - Ingrese nombres (para las letras, ej: PatricioPacha): ");
            nombreLetras = s.next();
        } while (nombreLetras.isEmpty());

        int n = nombreSize.length();
        if (n == 0) return;

        char[][] matriz = new char[n][n];
        
        int i = 0;
        while (i < nombreLetras.length()) {
            char letra = nombreLetras.charAt(i);
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

    public void g3_arrayA05_do_while(Scanner s) {
        String nombreSize;
        String nombreLetras;
        do {
            System.out.println("A05 (do-while) - Ingrese un nombre (para el tamaño, ej: Patricio): ");
            nombreSize = s.next();
        } while (nombreSize.isEmpty());
        do {
            System.out.println("A05 (do-while) - Ingrese nombres (para las letras, ej: PatricioPacha): ");
            nombreLetras = s.next();
        } while (nombreLetras.isEmpty());

        int n = nombreSize.length();
        if (n == 0 || nombreLetras.length() == 0) return;

        char[][] matriz = new char[n][n];
        
        int i = 0;
        do {
            char letra = nombreLetras.charAt(i);
            int x = rand.nextInt(n);
            int y = rand.nextInt(n);

            if (matriz[x][y] == '\0') {
                matriz[x][y] = letra;
            } else {
                matriz[x][y] = '*';
            }
            visualizar(matriz);
            i++;
        } while (i < nombreLetras.length());
    }
}