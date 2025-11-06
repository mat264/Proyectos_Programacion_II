package g3_Poliretos.g3_SerieNumerica;

public class g3_S5 {
    
    // SERIE 5
    //S5 con el bucle for
    public void S5_for (int n) {
        System.out.println("SECUENCIA 5");
        System.out.print("Serie (con el bucle for) hasta " + n + ": ");
        for(int i = 2; i <= n; i++) {
            boolean esPrimo = true;
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if(esPrimo) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    //S5 con el bucle while
    public void S5_while (int n) {
        System.out.print("Serie (con el bucle while) hasta " + n + ": ");
        int i = 2;
        while(i <= n) {
            boolean esPrimo = true;
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if(esPrimo) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
    }

    //S5 con el bucle do while
    public void S5_do_while (int n) {
        System.out.print("Serie (con el bucle do while) hasta " + n + ": ");
        int i = 2;
        do {
            boolean esPrimo = true;
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if(esPrimo) {
                System.out.print(i + " ");
            }
            i++;
        } while(i <= n);
        System.out.println();
        System.out.println("\n---------------------------");
    }
}
