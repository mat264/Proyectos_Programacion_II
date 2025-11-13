package g3_Poliretos.g3_Loading;

// Barra de progreso que combina un puntero que cambia (spinner) y el relleno "=".
// Implementada en for/while/do-while.

public class g3_Loading7 {

    // Retardo para animación
    private void delay() {
        try { Thread.sleep(50); } catch (InterruptedException e) {}
    }

    // Barra con puntero tipo spinner (for)
    public void g3_L07_for() {
        int barLength = 20;
        char[] spinner = {'|', '/', '-', '\\'};
        for (int i = 0; i <= 100; i++) {
            int position = (i * barLength) / 100;
            char tip = spinner[i % 4];
            String bar = "";
            for (int j = 0; j < barLength; j++) {
                if (j < position) bar += "=";
                else if (j == position && i != 100) bar += tip;
                else bar += " ";
            }
            if (i == 100) bar = "=".repeat(barLength);
            
            System.out.print("\r[" + bar + "] " + i + "%");
            delay();
        }
        System.out.println();
    }

    // Misma idea con while
    public void g3_L07_while() {
        int barLength = 20;
        char[] spinner = {'|', '/', '-', '\\'};
        int i = 0;
        while (i <= 100) {
            int position = (i * barLength) / 100;
            char tip = spinner[i % 4];
            String bar = "";
            int j = 0;
            while (j < barLength) {
                if (j < position) bar += "=";
                else if (j == position && i != 100) bar += tip;
                else bar += " ";
                j++;
            }
            if (i == 100) bar = "=".repeat(barLength);
            
            System.out.print("\r[" + bar + "] " + i + "%");
            delay();
            i++;
        }
        System.out.println();
    }

    // Misma idea con do-while
    public void g3_L07_do_while() {
        int barLength = 20;
        char[] spinner = {'|', '/', '-', '\\'};
        int i = 0;
        do {
            int position = (i * barLength) / 100;
            char tip = spinner[i % 4];
            String bar = "";
            int j = 0;
            do {
                if (j < position) bar += "=";
                else if (j == position && i != 100) bar += tip;
                else bar += " ";
                j++;
            } while (j < barLength);
            if (i == 100) bar = "=".repeat(barLength);
            
            System.out.print("\r[" + bar + "] " + i + "%");
            delay();
            i++;
        } while (i <= 100);
        System.out.println();
    }
}