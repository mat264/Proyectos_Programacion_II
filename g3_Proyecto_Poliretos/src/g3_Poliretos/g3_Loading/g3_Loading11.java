package g3_Poliretos.g3_Loading;

import java.util.Random;

public class g3_Loading11 {

    private void dibujarSenal(int nivel, int eje) {
        if (nivel < 0) nivel = 0;
        String barra = "";
        for(int i=0; i<nivel; i++) barra += "-";
        
        String padding = "";
        for(int i=0; i < (eje - nivel); i++) padding += " ";
        
        System.out.println(padding + barra + " | " + barra);
    }
    
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


    public void g3_L11a_for(int n) {
        if (n <= 0) return;
        Random rand = new Random();
        int ejeCentral = 50; 

        for(int i = 0; i < n; i++) {
            int nivel = rand.nextInt(11);
            dibujarSenal(nivel, ejeCentral);
        }
    }

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

    public void g3_L11b_for(int n) {
        if (n <= 0) return;
        Random rand = new Random();
        int[] alturas = new int[n];
        
        for (int i = 0; i < n; i++) {
            alturas[i] = rand.nextInt(9); 
        }
        dibujarVectorial(alturas);
    }
    
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