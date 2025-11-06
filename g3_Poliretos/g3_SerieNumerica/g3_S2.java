package g3_Poliretos.g3_SerieNumerica;

public class g3_S2 {
    // SERIE 2
    //S2 con el bucle for
    public void S2_for (int n) {
        System.out.println("SECUENCIA 2");
        System.out.print("Serie (con el bucle for) hasta " + n + ": ");
        int b = 1;
        for(int i = 0; i < n; i++) {
            System.out.print(b + " " + "0 ");
            b += 2;
        }
        System.out.println();
    }

    //S2 con el bucle while
    public void S2_while (int n) {
        System.out.print("Serie (con el bucle while) hasta " + n + ": ");
        int b = 1;
        int i = 0;
        while(i < n) {
            System.out.print(b + " " + "0 ");
            b += 2;
            i++;
        }
        System.out.println();
    }

    //S2 con el bucle do while
    public void S2_do_while (int n) {
        System.out.print("Serie (con el bucle do while) hasta " + n + ": ");
        int b = 1;
        int i = 0;
        do {
            System.out.print(b + " " + "0 ");
            b += 2;
            i++;
        } while(i < n);
        System.out.println();
        System.out.println("\n---------------------------");
    }   
}
