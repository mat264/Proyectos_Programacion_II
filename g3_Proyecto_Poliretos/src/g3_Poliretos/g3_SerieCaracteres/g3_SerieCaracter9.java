package g3_Poliretos.g3_SerieCaracteres;

public class g3_SerieCaracter9 {
    //Serie 9 con el ciclo for
    public void S9Caracter_for (int n){
        System.out.println("SECUENCIA DE CARACTERES #9");
        System.out.print("Secuencia (con el ciclo for) hasta " + n + ": ");
        char letra = 'a';
        int repeticion = 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < repeticion; j++){
                System.out.print(letra);
            }
            System.out.print(" ");
            letra++;
            repeticion +=2;
        }
        System.out.println();

    }

    //Serie 9 con el ciclo while
    public void S9Caracter_while(int n){
        System.out.print("Secuencia (con el ciclo while) hasta" + n + ": ");
        char letra = 'a';
        int repeticion = 1, i = 0;
        while(i < n){
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

    //Serie 9 con el ciclo do while
    public void S9Caracter_do_while (int n){
        System.out.print("Secuencia (con el ciclo do while) hasta " + n + ": ");
        char letra = 'a';
        int repeticion = 1, i = 0;
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
        }while(i < n);
        System.out.println();
        System.out.println("---------------------------------------------------");
    }
}
