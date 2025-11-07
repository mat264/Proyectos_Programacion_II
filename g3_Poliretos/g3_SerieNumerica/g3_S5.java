package g3_Poliretos.g3_SerieNumerica;

public class g3_S5 {

    // SERIE 5
    // S5 con bucle for
    public void S5_for(int n) {
    System.out.println("SECUENCIA 5");
    System.out.print("Serie (con el bucle for) de los primeros " + n + " primos: ");

    int count = 0;  // contador de primos encontrados
    int num = 2;    // número a evaluar

        for (int i = 0; count < n; i++) {
            boolean esPrimo = true;

            for (int j = 2; j * j <= num; j++) {
                if (num % j == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.print(num + " ");
                count++;
            }

            num++; 
        }
        System.out.println();
    }


    // S5 con bucle while
    public void S5_while(int n) {
        System.out.print("Serie (con el bucle while) de los primeros " + n + " primos: ");
        int i = 0, num = 2;
        while (i < n) {
            boolean esPrimo = true;
            for (int j = 2; j * j <= num; j++) {
                if (num % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.print(num + " ");
                i++;
            }
            num++;
        }
        System.out.println();
    }

    // S5 con bucle do-while
    public void S5_do_while(int n) {
        System.out.print("Serie (con el bucle do while) de los primeros " + n + " primos: ");
        int i = 0, num = 2;
        do {
            boolean esPrimo = true;
            for (int j = 2; j * j <= num; j++) {
                if (num % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.print(num + " ");
                i++;
            }
            num++;
        } while (i < n);
        System.out.println();
        System.out.println("\n---------------------------");
    }
}
