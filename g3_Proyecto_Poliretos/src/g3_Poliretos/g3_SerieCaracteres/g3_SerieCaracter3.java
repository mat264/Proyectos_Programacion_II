package g3_Poliretos.g3_SerieCaracteres;

public class g3_SerieCaracter3 {

    //Serie 3 con el bucle for
    public void S3Caracter_for(int n){
        System.out.println("SECUENCIA DE CARACTERES #3");
        System.out.print("Serie (con el bucle for) hasta " + n + ": ");
        int cont = 0;
        for(int i = 2; cont < n; i++){
            boolean esPrimo = true;
            for(int j = 2; j * j <= i; j++){
                if(i % j == 0){
                    esPrimo = false;
                    break;
                }
            }
            if(esPrimo){
                for(int k = 0; k < i; k++){
                    System.out.print("+");
                }
                System.out.print(" ");
                cont ++;
            }
        }
        System.out.println();
    }

    //Serie 3 con el bucle while
    public void S3Caracter_while(int n){
        System.out.print("Serie (con el bucle while) hasta " + n + ": ");
        int cont = 0, i = 2;
        while(cont < n){
            boolean esPrimo = true;
            int j = 2;
            while(j * j <= i){
                if(i % j == 0){
                    esPrimo = false;
                    break;
                }
                j++;
            }
            if(esPrimo){
                int k = 0;
                while(k < i){
                    System.out.print("+");
                    k++;
                }
                System.out.print(" ");
                cont++;
            }
            i++;

        }
        System.out.println();
    }
    
    //Serie 3 con el bucle do while
    public void S3Caracter_do_while (int n){
        System.out.print("Serie (con el bucle do while) hasta " + n + ": ");
        int cont = 0, i = 2;
        do{
            boolean esPrimo = true;
            int j =2;
            do{
                if(i % j == 0 && i != j){
                    esPrimo = false;
                    break;
                }
                j++;
            }while(j * j <= i);
            if(esPrimo){
                int k = 0;
                do{
                    System.out.print("+");
                    k++;
                }while(k < i);
                 System.out.print(" ");
                cont++;
            }
            i++;
        }while(cont < n);
        System.out.println();
        System.out.println("------------------------------------------------------------------------------");
    }
}
