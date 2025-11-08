package g3_Poliretos.g3_SerieNumerica;

public class g3_SerieNum3 {
    
    // SERIE 3
    // S3 con el bucle for
    public void S3Numerica_for (int n) {
        System.out.println("SECUENCIA NUMERICA #3");
        System.out.print("Serie (con el bucle for) hasta " + n + ": ");
        int a = 0, b = 1, c;
        int e = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + "/"+ e + " ");
            c = a + b;
            a = b;
            b = c;
            e+= 2;
        }
        System.out.println();
    }

    // S3 con el bucle while
    public void S3Numerica_while (int n) {
        System.out.print("Serie (con el bucle while) hasta " + n + ": ");
        int a = 0, b = 1, c;
        int e = 1;
        int i = 0;
        while (i < n) {
            System.out.print(a + "/"+ e + " ");
            c = a + b;
            a = b;
            b = c;
            e+= 2;
            i++;
        }
        System.out.println();
    }

    // S3 con el bucle do while
    public void S3Numerica_do_while (int n) {
        System.out.print("Serie (con el bucle do while) hasta " + n + ": ");
        int a = 0, b = 1, c;
        int e = 1;
        int i = 0;
        do {
            System.out.print(a + "/"+ e + " ");
            c = a + b;
            a = b;
            b = c;
            e+= 2;
            i++;
        } while (i < n);
        System.out.println();
        System.out.println("\n---------------------------");
    }

}
