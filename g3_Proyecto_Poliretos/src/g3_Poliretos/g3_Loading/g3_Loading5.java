package g3_Loading;

public class g3_Loading5 {

    private void delay() {
        try { Thread.sleep(50); } catch (InterruptedException e) {}
    }

    public void g3_L05_for() {
        int barLength = 20;
        for (int i = 0; i <= 100; i++) {
            int position = (i * barLength) / 100;
            String bar = "";
            for (int j = 0; j < barLength; j++) {
                if (j < position) bar += "=";
                else if (j == position && i != 100) bar += ">";
                else bar += " ";
            }
            if (i == 100) bar = "=".repeat(barLength); // Caso final
            
            System.out.print("\r[" + bar + "] " + i + "%");
            delay();
        }
        System.out.println();
    }

    public void g3_L05_while() {
        int barLength = 20;
        int i = 0;
        while (i <= 100) {
            int position = (i * barLength) / 100;
            String bar = "";
            int j = 0;
            while (j < barLength) {
                if (j < position) bar += "=";
                else if (j == position && i != 100) bar += ">";
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

    public void g3_L05_do_while() {
        int barLength = 20;
        int i = 0;
        do {
            int position = (i * barLength) / 100;
            String bar = "";
            int j = 0;
            do {
                if (j < position) bar += "=";
                else if (j == position && i != 100) bar += ">";
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