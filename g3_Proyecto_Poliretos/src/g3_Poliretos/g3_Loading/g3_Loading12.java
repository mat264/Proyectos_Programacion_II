package g3_Poliretos.g3_Loading;

// Anima una pequeña figura moviéndose a la derecha y luego a la izquierda.
// Sirve para practicar control de pantalla y bucles anidados.

public class g3_Loading12 {

    // Pausa para animación
    private void delay() {
        try { Thread.sleep(100); } catch (InterruptedException e) {}
    }

    // Limpia la pantalla para mover la figura
    private void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // Dibuja la figura con un padding para simular desplazamiento horizontal
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

    // Mueve la figura hacia la derecha y vuelve con for
    public void g3_L12_for(int n) {
        if (n <= 0) n = 20; 
        for (int i = 0; i < n; i++) {
            dibujarFigura(i);
        }
        for (int i = n; i >= 0; i--) {
            dibujarFigura(i);
        }
    }

    // Misma animación con while
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

    // Misma animación con do-while
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