package g3_Poliretos.g3_SerieNumerica;

public class g3_SerieNum9 {

    //SERIE 9
    //S9 con el bucle for

    public void S9_for(int n){
        System.out.println("SECUENCIA 9");
        System.out.print("Serie (con el bucle for) hasta " + n + ": ");
        int a = 1;
        for(int i = 1; i <= n; i++){
            a *= 2;
            System.out.print(a + " ");
        }
        System.out.println();
    }

    //S9 con el bucle while
    public void S9_while(int n){
        System.out.print("Serie (con el bucle while) hasta " + n + ": ");
        int i = 1;
        int a = 1;
        while(i <= n){
            a *= 2;
            System.out.print(a + " ");
            i++;
        }
        System.out.println();
    }

    //S9 con el bucle do while
    public void S9_do_while(int n){
        System.out.print("Serie (con el bucle do while) hasta " + n + ": ");
        int i = 1;
        int a = 1;
        do{
            a *= 2;
            System.out.print(a + " ");
            i++;
        }while(i <= n);
        System.out.println();
        System.out.println("------------------------------------------------------");
    }
    
}
