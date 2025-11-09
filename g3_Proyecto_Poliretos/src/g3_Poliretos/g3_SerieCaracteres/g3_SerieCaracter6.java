package g3_Poliretos.g3_SerieCaracteres;

public class g3_SerieCaracter6 {
    //Serie 6 con el bucle for
    public void S6Caracter_for (int n){
        System.out.println("SECUENCIA DE CARACTERES #6");
        System.out.print("Serie (con el bucle for) hasta " + n + ": ");
        char letra = 'a';
        for(int i = 0; i < n; i++){
            System.out.print(letra + " ");
            letra++;
        }
        System.out.println();
    }

    //Serie 6 con el bucle while
    public void S6Caracter_while (int n){
        System.out.print("Serie (con el bucle while) hasta " + n + ": ");
        char letra = 'a';
        int i = 0;
        while(i < n){
            System.out.print(letra + " ");
            letra++;
            i++;
        }
        System.out.println();
    }

    //Serie 6 con el bucle do while
    public void S6Caracter_do_while (int n){
        System.out.print("Serie (con el bucle do while) hasta " + n + ": ");
        char letra = 'a';
        int i = 0;
        do{
           System.out.print(letra + " ");
            letra++;
            i++; 
        }while(i < n);
        System.out.println();
        System.out.println("-----------------------------------------------------------");
    }
}
