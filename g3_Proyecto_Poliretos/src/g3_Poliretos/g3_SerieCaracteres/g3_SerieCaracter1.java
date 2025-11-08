package g3_Poliretos.g3_SerieCaracteres;

public class g3_SerieCaracter1 {
    //Serie 1 con el bucle for
    public void S1Caracter_for (int n){
        System.out.println("SECUENCIA DE CARACTERES #1");
        System.out.print("Serie (con el bucle for) hasta " + n + ": ");
        for(int i = 0; i < n; i++){
            if(i % 2== 0){
                System.out.print("+ ");
            }else{
                System.out.print("- ");
            }
        }
        System.out.println();
    }

    //Serie 1 con el bucle while
    public void S1Caracter_while(int n){
        System.out.print("Serie (con el bucle while) hasta " + n + ": ");
        int i = 0;
        while(i < n){
            if(i % 2 == 0){
                System.out.print("+ ");
            }else{
                System.out.print("- ");
            }
            i++;
        }
        System.out.println();
    }

    //Serie 1 con el bucle do while
    public void S1Caracter_do_while(int n){
        System.out.print("Serie (con el bucle do while) hasta " + n + ": ");
        int i = 0;
        do{
            if(i % 2 == 0){
                System.out.print("+ ");
            }else{
                System.out.print("- ");
            }
            i++;
        }while(i < n);
        System.out.println();
        System.out.println("---------------------------------------------------------");
    }
}
