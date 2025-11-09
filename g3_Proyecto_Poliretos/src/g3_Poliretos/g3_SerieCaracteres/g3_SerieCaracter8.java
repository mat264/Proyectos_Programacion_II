package g3_Poliretos.g3_SerieCaracteres;

public class g3_SerieCaracter8 {
    //Serie 8 con el bucle for
    public void S8Caracter_for (int n){
        System.out.println("SECUENCIA DE CARACTERES #8");
        System.out.print("Serie (con el bucle for) hasta " + n + ": ");
        char letra = 'a';
        int repeticion = 2;
        for(int i = 0; i <= n; i++){
            for(int j = 0; j < repeticion; j++){
                System.out.print(letra);
            }
            System.out.print(" ");
            letra++;
            repeticion += 2;
        }
        System.out.println();
    }

    //Serie 8 con el bucle while
    public void S8Caracter_while(int n){
        System.out.print("Serie (con el bucle while) hasta " + n + ": ");
        char letra = 'a';
        int repeticion = 2, i = 0;
        while(i <= n){
            int j = 0;
            while(j < repeticion){
                System.out.print(letra);
                j++;
            }
            System.out.print(" ");
            letra++;
            repeticion += 2;
            i++;
        }
        System.out.println();
    }

    //Serie 8 con el bucle do while
    public void S8Caracter_do_while(int n){
        System.out.print("Serie (con el bucle do while) hasta " + n + ": ");
        char letra = 'a';
        int repeticion = 2, i = 0;
        do{
            int j = 0;
            do{
                System.out.print(letra);
                j++;
            }while(j < repeticion);
            System.out.print(" ");
            letra++;
            repeticion += 2;
            i++;
        }while(i <= n);
        System.out.println();
        System.out.println("-------------------------------------------------------");
    }

}
