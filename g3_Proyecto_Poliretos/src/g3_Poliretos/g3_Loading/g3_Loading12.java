package g3_Loading;

public class g3_Loading12 {

    private void delay() {
        try { Thread.sleep(100); } catch (InterruptedException e) {}
    }

    private void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // Helper para dibujar la figura en una posición
    private void dibujarFigura(int posicion) {
        String[] figura = {
            "  \\|||/ ",
            "   (> <) ",
            " ooO-(_)-Ooo"
        };
        String padding = "";
        for (int i = 0; i < posicion; i++) {
            padding += " ";
        }
        
        clearScreen();
        for (String linea : figura) {
            System.out.println(padding + linea);
        }
        delay();
    }

    public void g3_L12_for(int n) {
        if (n <= 0) n = 20; // Default de 20 si n es inválido
        // Ida
        for (int i = 0; i < n; i++) {
            dibujarFigura(i);
        }
        // Regreso
        for (int i = n; i >= 0; i--) {
            dibujarFigura(i);
        }
    }

    public void g3_L12_while(int n) {
        if (n <= 0) n = 20;
        int i = 0;
        // Ida
        while (i < n) {
            dibujarFigura(i);
            i++;
        }
        // Regreso
        while (i >= 0) {
            dibujarFigura(i);
            i--;
        }
    }

    public void g3_L12_do_while(int n) {
        if (n <= 0) n = 20;
        int i = 0;
        // Ida
        do {
            dibujarFigura(i);
            i++;
        } while (i < n);
        // Regreso
        do {
            dibujarFigura(i);
            i--;
        } while (i >= 0);
    }
}