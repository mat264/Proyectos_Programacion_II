package g3_Poliretos.g3_Loading;

//Clase que muestra una pequeña animación tipo "spinner" con porcentaje.
// Incluye tres versiones que usan for, while y do-while para practicar los tres bucles.

public class g3_Loading1 {

    // Pausa breve para dar efecto de animación
    private void delay() {
        try { Thread.sleep(50); } catch (InterruptedException e) {}
    }

    // Usa un for para recorrer del 0 al 100 mostrando un spinner y el porcentaje
    public void g3_L01_for() {
        char[] spinner = {'|', '/', '-', '\\'};
        for (int i = 0; i <= 100; i++) {
            System.out.print("\r" + spinner[i % 4] + " " + i + "%");
            delay();
        }
        System.out.println(); 
    }

    // Misma animación, implementada con while
    public void g3_L01_while() {
        char[] spinner = {'|', '/', '-', '\\'};
        int i = 0;
        while (i <= 100) {
            System.out.print("\r" + spinner[i % 4] + " " + i + "%");
            delay();
            i++;
        }
        System.out.println();
    }

    // Misma animación, implementada con do-while
    public void g3_L01_do_while() {
        char[] spinner = {'|', '/', '-', '\\'};
        int i = 0;
        do {
            System.out.print("\r" + spinner[i % 4] + " " + i + "%");
            delay();
            i++;
        } while (i <= 100);
        System.out.println();
    }
}