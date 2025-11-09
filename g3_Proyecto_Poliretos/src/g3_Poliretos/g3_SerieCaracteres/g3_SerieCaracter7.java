package g3_Poliretos.g3_SerieCaracteres;

public class g3_SerieCaracter7 {

    //Serie 7 con el bucle for 
    public void S7Caracter_for (int n){
        System.out.println("SECUENCIA DE CARACTERES #7");
        System.out.print("Serie (con el bucle for) hasta " + n + ": ");
        char letra = 'a';
        for(int i = 0; i < n; i++){
            System.out.print(letra);
            if(i % 2 == 1){
                System.out.print(" - ");
            }else{
                System.out.print(" + ");
            }
            letra += 2;
        }
        System.out.println();
    }

    //Serie 7 con el bucle while
    public void S7Caracter_while (int n){
        System.out.print("Serie (con el bucle while) hasta " + n + ": ");
        char letra = 'a';
        int i = 0;
        while(i < n){
            System.out.print(letra);
            if(i % 2 == 1){
                System.out.print(" - ");
            }else{
                System.out.print(" + ");
            }
            letra += 2;
            i++;
        }
        System.out.println();
    }

    //Serie 7 con el bucle do while
    public void S7Caracter_do_while (int n){
        System.out.print("Serie (con el bucle do while) hasta " + n + ": ");
        char letra = 'a';
        int i = 0;
        do{
          System.out.print(letra);
            if(i % 2 == 1){
                System.out.print(" - ");
            }else{
                System.out.print(" + ");
            }
            letra += 2;  
            i++;
        }while(i < n);
        System.out.println();
        System.out.println("-------------------------------------------------------------");
    }
}
