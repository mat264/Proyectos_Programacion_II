package g3_Poliretos.g3_Loading;

public class g3_Loading1 {

    private void delay() {
        try { Thread.sleep(50); } catch (InterruptedException e) {}
    }

    public void g3_L01_for() {
        char[] spinner = {'|', '/', '-', '\\'};
        for (int i = 0; i <= 100; i++) {
            System.out.print("\r" + spinner[i % 4] + " " + i + "%");
            delay();
        }
        System.out.println(); 
    }

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