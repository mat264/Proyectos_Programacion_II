package g3_Poliretos.g3_Loading;

public class g3_Loading5 {

    private void delay() {
        try { Thread.sleep(50); } catch (InterruptedException e) {}
    }

    public void g3_L05_for() {
        int baraLongitud = 20;
        for (int i = 0; i <= 100; i++) {
            int position = (i * baraLongitud) / 100;
            String bar = "";
            for (int j = 0; j < baraLongitud; j++) {
                if (j < position) bar += "=";
                else if (j == position && i != 100) bar += ">";
                else bar += " ";
            }
            if (i == 100) bar = "=".repeat(baraLongitud); 
            
            System.out.print("\r[" + bar + "] " + i + "%");
            delay();
        }
        System.out.println();
    }

    public void g3_L05_while() {
        int baraLongitud = 20;
        int i = 0;
        while (i <= 100) {
            int position = (i * baraLongitud) / 100;
            String bar = "";
            int j = 0;
            while (j < baraLongitud) {
                if (j < position) bar += "=";
                else if (j == position && i != 100) bar += ">";
                else bar += " ";
                j++;
            }
            if (i == 100) bar = "=".repeat(baraLongitud);
            
            System.out.print("\r[" + bar + "] " + i + "%");
            delay();
            i++;
        }
        System.out.println();
    }

    public void g3_L05_do_while() {
        int baraLongitud = 20;
        int i = 0;
        do {
            int position = (i * baraLongitud) / 100;
            String bar = "";
            int j = 0;
            do {
                if (j < position) bar += "=";
                else if (j == position && i != 100) bar += ">";
                else bar += " ";
                j++;
            } while (j < baraLongitud);
            if (i == 100) bar = "=".repeat(baraLongitud);
            
            System.out.print("\r[" + bar + "] " + i + "%");
            delay();
            i++;
        } while (i <= 100);
        System.out.println();
    }
}