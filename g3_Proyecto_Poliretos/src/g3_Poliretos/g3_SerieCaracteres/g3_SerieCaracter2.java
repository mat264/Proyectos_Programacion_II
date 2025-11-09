package g3_Poliretos.g3_SerieCaracteres;

public class g3_SerieCaracter2 {
    //Serie 2 con el bucle for
    public void S2Caracter_for(int n){
        System.out.println("SECUENCIA DE CARACTERES #2");
        System.out.print("Serie (con el bucle for) hasta " + n + " ");
        int a = 1, b = 1, c = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < a; j++){
                System.out.print("+");
            }
            System.out.print(" ");
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    //Serie 2 con el bucle while
    public void S2Caracter_while (int n){
        System.out.print("Serie (con el bucle while) hasta " + n + ": ");
        int a = 1, b = 1, c = 0, i = 0;
        while(i < n){
            int j = 0;
            while(j < a){
                System.out.print("+");
                j++;
            }
            System.out.print(" ");
            c = a + b;
            a = b;
            b = c;
            i++;
        }
        System.out.println();
    }

    //Serie 2 con el bucle do while
    public void S2Caracter_do_while (int n){
        System.out.print("Serie (con el bucle do while) hasta " + n + ": ");
        int i = 0, a = 1, b = 1, c = 0;
        do{
            int j = 0;
            do{
                System.out.print("+");
                j++;
            }while(j < a);
            System.out.print(" ");
            c = a + b;
            a = b;
            b = c;
            i++;
        }while(i < n);
        System.out.println();
        System.out.println("-------------------------------------------------------------");
    }
}
