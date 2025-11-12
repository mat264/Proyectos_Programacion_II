package g3_Poliretos.g3_SerieNumerica;

public class g3_SerieNum7 {
    
    // SERIE 7
    //S7 con el bucle for
    public void S7Numerica_for (int n){
        System.out.println("SECUENCIA NUMERICA #7");
        System.out.print("Serie (con el bucle for) hasta " + n + ": ");
        int a = 1, b= 1;
        System.out.print(b + " ");
        for(int i = 1; i < n; i++) {
            a+= 3;
            System.out.print(a + " ");
        }
        System.out.println();
    }

    //S7 con el bucle while
    public void S7Numerica_while (int n){
        System.out.print("Serie (con el bucle while) hasta " + n + ": ");
        int a = 1, b= 1;
        System.out.print(b + " ");
        int i = 1;
        while(i < n) {
            a+= 3;
            System.out.print(a + " ");
            i++;
        }
        System.out.println();
    }

    //S7 con el bucle do while
    public void S7Numerica_do_while (int n){
        System.out.print("Serie (con el bucle do while) hasta " + n + ": ");
        int a = 1, b= 1;
        System.out.print(b + " ");
        int i = 1;
        do {
            a+= 3;
            System.out.print(a + " ");
            i++;
        } while(i < n);
        System.out.println();
        System.out.println("--------------------------------------");

    }
}
