package g3_Poliretos.g3_SerieCaracteres;

public class g3_SerieCaracter4 {
    //SERIE 4 con el bucle for
    public void S4Caracter_for(int n){
        System.out.println("SECUENCIA DE CARACTERES #4");
        System.out.print("Serie (con el bucle for) hasta " + n + ": ");
        for(int i = 1; i < n; i++){
            if(i % 4 == 1){
                System.out.print(" + ");
            }else if(i % 4 == 2){
                System.out.print(" - ");
            }else if(i % 4 == 3){
                System.out.print(" * ");
            }else{
                System.out.print(" / ");
            }
        }
        System.out.println();
    }

    //Serie 4 con el bucle while
    public void S4Caracter_while(int n){
        System.out.print("Serie (con el bucle while) hasta " + n + ": ");
        int i = 1;
        while(i < n){
            if(i % 4 == 1){
                System.out.print(" + ");
            }else if(i % 4 == 2){
                System.out.print(" - ");
            }else if(i % 4 == 3){
                System.out.print(" * ");
            }else{
                System.out.print(" / ");
            }
            i++;
        }
        System.out.println();
    }

    //Serie 4 con el bucle do while
    public void S4Caracter_do_while(int n){
        System.out.print("Serie (con el bucle do while) hasta " + n + ": ");
        int i = 1;
        do{
            if(i % 4 == 1){
                System.out.print(" + ");
            }else if(i % 4 == 2){
                System.out.print(" - ");
            }else if(i % 4 == 3){
                System.out.print(" * ");
            }else{
                System.out.print(" / ");
            }
            i++;
        }while(i < n);
        System.out.println();
        System.out.println("---------------------------------------------------------------");
    }
}
 