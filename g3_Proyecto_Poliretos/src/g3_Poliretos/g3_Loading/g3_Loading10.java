package g3_Poliretos.g3_Loading;

import java.util.Random;

// Simula la descarga de un archivo mostrando KB descargados y una barra de progreso.
// Usa colores ANSI para marcar completado y muestra for/while/do-while.

public class g3_Loading10 {

    // Pequeña pausa para animación
    private void delay() {
        try { Thread.sleep(50); } catch (InterruptedException e) {}
    }

    // Simula descarga (for)
    public void g3_L10_for() {
        Random rand = new Random();
        double totalKb = 10 + (100 - 10) * rand.nextDouble(); 
        String fileName = "ArchivoYari-win_amd64.whl";
        int barLength = 20;
        String GREEN = "\u001B[32m";
        String RESET = "\u001B[0m";

        System.out.println("Downloading " + fileName);
        for (int i = 0; i <= 100; i++) {
            double currentKb = (i * totalKb) / 100.0;
            int filled = (i * barLength) / 100;
            String bar = "";
            for (int j = 0; j < filled; j++) bar += "=";
            for (int j = filled; j < barLength; j++) bar += " ";

            String output = String.format("%.1f / %.1f KB", currentKb, totalKb);
            if (i == 100) {
                bar = GREEN + "=".repeat(barLength) + RESET;
            }
            System.out.print("\r" + bar + " " + output);
            delay();
        }
        System.out.println();
    }

    // Simula descarga (while)
    public void g3_L10_while() {
        Random rand = new Random();
        double totalKb = 10 + (100 - 10) * rand.nextDouble();
        String fileName = "ArchivoYari-win_amd64.whl";
        int barLength = 20;
        String GREEN = "\u001B[32m";
        String RESET = "\u001B[0m";
        
        System.out.println("Downloading " + fileName);
        int i = 0;
        while (i <= 100) {
            double currentKb = (i * totalKb) / 100.0;
            int filled = (i * barLength) / 100;
            String bar = "";
            int j = 0;
            while(j < filled) { bar += "="; j++; }
            while(j < barLength) { bar += " "; j++; }

            String output = String.format("%.1f / %.1f KB", currentKb, totalKb);
            if (i == 100) bar = GREEN + "=".repeat(barLength) + RESET;
            
            System.out.print("\r" + bar + " " + output);
            delay();
            i++;
        }
        System.out.println();
    }

    // Simula descarga (do-while)
    public void g3_L10_do_while() {
        Random rand = new Random();
        double totalKb = 10 + (100 - 10) * rand.nextDouble();
        String fileName = "ArchivoYari-win_amd64.whl";
        int barLength = 20;
        String GREEN = "\u001B[32m";
        String RESET = "\u001B[0m";
        
        System.out.println("Downloading " + fileName);
        int i = 0;
        do {
            double currentKb = (i * totalKb) / 100.0;
            int filled = (i * barLength) / 100;
            String bar = "";
            int j = 0;
            // Usar whiles anidados es más legible
            while(j < filled) { bar += "="; j++; }
            while(j < barLength) { bar += " "; j++; }

            String output = String.format("%.1f / %.1f KB", currentKb, totalKb);
            if (i == 100) bar = GREEN + "=".repeat(barLength) + RESET;
            
            System.out.print("\r" + bar + " " + output);
            delay();
            i++;
        } while (i <= 100);
        System.out.println();
    }
}