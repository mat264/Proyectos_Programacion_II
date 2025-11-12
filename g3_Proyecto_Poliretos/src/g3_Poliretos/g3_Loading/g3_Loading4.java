package g3_Poliretos.g3_Loading;

public class g3_Loading4 {

    private void delay() {
        try { Thread.sleep(100); } catch (InterruptedException e) {}
    }

    public void g3_L04_for() {
        String[] states = {"oOo", "OoO", "oOo", "Ooo"};
        for (int i = 0; i <= 100; i++) {
            String state = states[i % states.length];
            System.out.print("\r" + state + " " + i + "%");
            delay();
        }
        System.out.println();
    }

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