package g3_Poliretos.g3_Loading;

// Animación que alterna pequeños estados de texto (como una luz) junto al porcentaje.
// También muestra versiones con for, while y do-while.

public class g3_Loading4 {

    // Pausa algo más larga para que el cambio de estado sea visible
    private void delay() {
        try { Thread.sleep(100); } catch (InterruptedException e) {}
    }

    // Usa un arreglo de estados y recorre con for
    public void g3_L04_for() {
        String[] states = {"oOo", "OoO", "oOo", "Ooo"};
        for (int i = 0; i <= 100; i++) {
            String state = states[i % states.length];
            System.out.print("\r" + state + " " + i + "%");
            delay();
        }
        System.out.println();
    }

    // Igual usando while
    public void g3_L04_while() {
        String[] states = {"oOo", "OoO", "oOo", "Ooo"};
        int i = 0;
        while (i <= 100) {
            String state = states[i % states.length];
            System.out.print("\r" + state + " " + i + "%");
            delay();
            i++;
        }
        System.out.println();
    }

    // Igual usando do-while
    public void g3_L04_do_while() {
        String[] states = {"oOo", "OoO", "oOo", "Ooo"};
        int i = 0;
        do {
            String state = states[i % states.length];
            System.out.print("\r" + state + " " + i + "%");
            delay();
            i++;
        } while (i <= 100);
        System.out.println();
    }
}