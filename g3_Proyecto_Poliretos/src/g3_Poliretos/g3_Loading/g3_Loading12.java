package g3_Poliretos.g3_Loading;

public class g3_Loading12 {

    private void delay() {
        try { Thread.sleep(100); } catch (InterruptedException e) {}
    }

    private void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

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
        if (n <= 0) n = 20; 
        for (int i = 0; i < n; i++) {
            dibujarFigura(i);
        }
        for (int i = n; i >= 0; i--) {
            dibujarFigura(i);
        }
    }

    public void g3_L12_while(int n) {
        if (n <= 0) n = 20;
        int i = 0;
        while (i < n) {
            dibujarFigura(i);
            i++;
        }
        while (i >= 0) {
            dibujarFigura(i);
            i--;
        }
    }

    public void g3_L12_do_while(int n) {
        if (n <= 0) n = 20;
        int i = 0;
        do {
            dibujarFigura(i);
            i++;
        } while (i < n);
        do {
            dibujarFigura(i);
            i--;
        } while (i >= 0);
    }
}