package g3_Poliretos.g3_Loading;

// Barra con un bloque "<=>" que se mueve a lo largo de la barra.
// Presenta las tres versiones para practicar estructuras de repetición.

public class g3_Loading6 {

    // Pequeña pausa para animación
    private void delay() {
        try { Thread.sleep(50); } catch (InterruptedException e) {}
    }

    // Bloc móvil implementado con for
    public void g3_L06_for() {
        int barLength = 20;
        String block = "<=>";
        for (int i = 0; i <= 100; i++) {
            int position = (i * (barLength - block.length())) / 100;
            String bar = "";
            for (int j = 0; j < barLength; j++) {
                bar += " ";
            }
            bar = bar.substring(0, position) + block + bar.substring(position + block.length());
            System.out.print("\r[" + bar + "] " + i + "%");
            delay();
        }
        System.out.println();
    }

    // Bloc móvil implementado con while
    public void g3_L06_while() {
        int barLength = 20;
        String block = "<=>";
        int i = 0;
        while (i <= 100) {
            int position = (i * (barLength - block.length())) / 100;
            String bar = "";
            int j = 0;
            while(j < barLength) {
                bar += " ";
                j++;
            }
            bar = bar.substring(0, position) + block + bar.substring(position + block.length());
            System.out.print("\r[" + bar + "] " + i + "%");
            delay();
            i++;
        }
        System.out.println();
    }

    // Bloc móvil implementado con do-while
    public void g3_L06_do_while() {
        int barLength = 20;
        String block = "<=>";
        int i = 0;
        do {
            int position = (i * (barLength - block.length())) / 100;
            String bar = "";
            int j = 0;
            do {
                bar += " ";
                j++;
            } while (j < barLength);
            bar = bar.substring(0, position) + block + bar.substring(position + block.length());
            System.out.print("\r[" + bar + "] " + i + "%");
            delay();
            i++;
        } while (i <= 100);
        System.out.println();
    }
}