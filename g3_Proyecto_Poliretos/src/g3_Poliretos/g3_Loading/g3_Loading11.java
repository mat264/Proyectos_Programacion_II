package g3_Poliretos.g3_Loading;

import java.util.Random;

// Contiene dos modos: 'señal' que dibuja barras con simetría y 'vectorial' que dibuja
// una representación vertical (como un histograma) con puntos.

public class g3_Loading11 {

    // Dibuja una línea con un segmento de guiones según el 'nivel'
    private void dibujarSenal(int nivel, int eje) {
        if (nivel < 0) nivel = 0;
        String barra = "";
        for(int i=0; i<nivel; i++) barra += "-";
        
        String padding = "";
        for(int i=0; i < (eje - nivel); i++) padding += " ";
        
        System.out.println(padding + barra + " | " + barra);
    }
    
    // Dibuja una vista vertical de un arreglo de alturas (pequeño histograma)
    private void dibujarVectorial(int[] alturas) {
        int maxAlto = 8;
        for (int fila = maxAlto; fila >= 0; fila--) {
            String line = "";
            for (int col = 0; col < alturas.length; col++) {
                if (alturas[col] > fila) line += ". ";
                else if (alturas[col] == fila && fila != 0) line += ". "; 
                else line += "  ";
            }
            System.out.println(line);
        }
        String base = "";
        for(int i=0; i<alturas.length; i++) base += "= ";
        System.out.println(base);
    }


    // Genera n niveles aleatorios y los dibuja con for
    public void g3_L11a_for(int n) {
        if (n <= 0) return;
        Random rand = new Random();
        int ejeCentral = 50; 

        for(int i = 0; i < n; i++) {
            int nivel = rand.nextInt(11);
            dibujarSenal(nivel, ejeCentral);
        }
    }

    // Genera n niveles aleatorios y los dibuja con while
    public void g3_L11a_while(int n) {
        if (n <= 0) return;
        Random rand = new Random();
        int ejeCentral = 50;
        int i = 0;
        while (i < n) {
            int nivel = rand.nextInt(11);
            dibujarSenal(nivel, ejeCentral);
            i++;
        }
    }

    // Genera n niveles aleatorios y los dibuja con do-while
    public void g3_L11a_do_while(int n) {
        if (n <= 0) return;
        Random rand = new Random();
        int ejeCentral = 50;
        int i = 0;
        do {
            int nivel = rand.nextInt(11);
            dibujarSenal(nivel, ejeCentral);
            i++;
        } while (i < n);
    }

    // Crea un arreglo de alturas aleatorias y lo muestra tipo vectorial (for)
    public void g3_L11b_for(int n) {
        if (n <= 0) return;
        Random rand = new Random();
        int[] alturas = new int[n];
        
        for (int i = 0; i < n; i++) {
            alturas[i] = rand.nextInt(9); 
        }
        dibujarVectorial(alturas);
    }
    
    // Igual que la anterior pero con while
    public void g3_L11b_while(int n) {
        if (n <= 0) return;
        Random rand = new Random();
        int[] alturas = new int[n];
        int i = 0;
        while (i < n) {
            alturas[i] = rand.nextInt(9);
            i++;
        }
        dibujarVectorial(alturas);
    }

    // Igual que la anterior pero con do-while
    public void g3_L11b_do_while(int n) {
        if (n <= 0) return;
        Random rand = new Random();
        int[] alturas = new int[n];
        int i = 0;
        do {
            alturas[i] = rand.nextInt(9);
            i++;
        } while (i < n);
        dibujarVectorial(alturas);
    }
}