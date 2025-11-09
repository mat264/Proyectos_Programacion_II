package g3_Poliretos.g3_SerieCaracteres;

public class g3_SerieCaracter10 {
    //Serie 10 con el bucle for
    public void S10Caracter_for(int n) {
    System.out.println("SECUENCIA DE CARACTERES #10");
    System.out.print("Serie (con bucle for) hasta " + n + ": ");
    char letra = 'a';
    int a = 1, b = 1, c = 1; 
    for (int i = 1; i <= n; i++) {
        int repeticiones;

        if (i <= 3) {
            repeticiones = 1;
        } else {
            repeticiones = a + b;
            a = b;
            b = c;
            c = repeticiones;
        }

        for (int j = 0; j < repeticiones; j++) {
            System.out.print(letra);
        }
        System.out.print(" ");
        letra++;
    }
    System.out.println();
}


    //Serie 10 con el bucle while
    public void S10Caracter_while(int n){
        System.out.print("Serie (con el bucle while) hasta " + n + ": ");
        char letra = 'a';
        int a = 1, b = 1, i = 1, c = 1;
        while(i <= n){
            int repeticiones;
            if(i <= 3){
                repeticiones = 1;
            }else{
                repeticiones = a + b;
                a = b;
                b = c;
                c = repeticiones;
            }
            int j = 0;
            while(j < repeticiones){
                System.out.print(letra);
                j++;
            }
            System.out.print(" ");
            letra++;
            i++;
        }
        System.out.println();
    }

    //Serie 10 con el bucle do while
    public void S10Caracter_do_while(int n){
        System.out.print("Serie (con el bucle do while) hasta " + n + ": ");
        char letra = 'a';
        int a = 1, b= 1, i =1, c= 1;
        do{
            int repeticiones = 0;
            if(i <= 3){
                repeticiones = 1;
            }else{
                repeticiones = a + b;
                a = b;
                b = c;
                c = repeticiones;
            }
            int j = 0;
            do{
                System.out.print(letra);
                j++;
            }while(j < repeticiones);
            System.out.print(" ");
            letra++; 
            i++;           
        }while(i <= n);
        System.out.println();
        System.out.println("-------------------------------------------------");
    }
}
