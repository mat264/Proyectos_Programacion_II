package g3_Poliretos.g3_Loading;

public class g3_Loading6 {

    private void delay() {
        try { Thread.sleep(50); } catch (InterruptedException e) {}
    }

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