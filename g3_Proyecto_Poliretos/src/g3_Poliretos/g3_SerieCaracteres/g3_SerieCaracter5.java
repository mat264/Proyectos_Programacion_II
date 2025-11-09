package g3_Poliretos.g3_SerieCaracteres;

public class g3_SerieCaracter5 {
    //Serie 5 con el bucle for
    public void S5Caracter_for (int n){
        System.out.println("SECUENCIA DE CARACTERES #5");
        System.out.print("Serie (con el bucle for) hasta " + n + ": ");
        for(int i = 1; i < n; i++){
            if(i % 5 == 1){
                System.out.print(" \\ ");
            }else if(i % 5 == 2){
                System.out.print(" | ");
            }else if(i % 5 == 3){
                System.out.print(" / ");
            }else if(i % 5 == 4){
                System.out.print(" - ");
            }else{
                System.out.print(" | ");
            }
        }
        System.out.println();
    }

    //Serie 5 con el bucle while
    public void S5Caracter_while(int n){
        System.out.print("Serie (con el bucle while) hasta " + n + ": ");
        int i = 1;
        while(i < n){
            if(i % 5 == 1){
                System.out.print(" \\ ");
            }else if(i % 5 == 2){
                System.out.print(" | ");
            }else if(i % 5 == 3){
                System.out.print(" / ");
            }else if(i % 5 == 4){
                System.out.print(" - ");
            }else{
                System.out.print(" | ");
            }
            i++;
        }
        System.out.println();
    }

    //Serie 5 con el bucle do while
    public void S5Caracter_do_while (int n){
        System.out.print("Serie (con el bucle do while) hasta " + n + ": ");
        int i = 1;
        do{
            if(i % 5 == 1){
                System.out.print(" \\ ");
            }else if(i % 5 == 2){
                System.out.print(" | ");
            }else if(i % 5 == 3){
                System.out.print(" / ");
            }else if(i % 5 == 4){
                System.out.print(" - ");
            }else{
                System.out.print(" | ");
            }
            i++;
        }while(i < n);
        System.out.println();
        System.out.println("-----------------------------------------------------------");
}   }
