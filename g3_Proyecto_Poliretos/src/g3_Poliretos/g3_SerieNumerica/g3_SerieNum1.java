package g3_Poliretos.g3_SerieNumerica;

public class g3_SerieNum1 {
    // SERIE 1
    // S1 con bucle for
    public void S1Numerica_for (int n) {
        System.out.println("SECUENCIA NUMERICA #1");
        int a = 0, b = 1, c = 0;
        System.out.print("Serie (con el bucle for) hasta " + n + ": ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    //S1 con bucle while
    public void S1Numerica_while (int n) {
        int a = 0, b = 1, c = 0;
        int i = 0;
        System.out.print("Serie (con el bucle while) hasta " + n + ": ");
        while (i < n) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
            i++;
        }
        System.out.println();
    }

    //S1 con bucle do while
    public void S1Numerica_do_while (int n) {
        int a = 0, b = 1, c = 0;
        int i = 0;
        System.out.print("Serie (con el bucle do while) hasta " + n + ": ");
        do {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
            i++;
        } while (i < n);
        System.out.println();
        System.out.println("\n---------------------------");
    }
}
