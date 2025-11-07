package g3_Poliretos.g3_SerieNumerica;

public class g3_S10 {
    
    //SERIE 10
    //Serie 10 con el bucle for

    public void S10_for (int n){
        System.out.println("SECUENCIA 10"); 
        System.out.print("Serie (con el bucle for) hasta " + n + ": ");

        int a = 1;
        for(int i = 0; i < n; i++){
            a *= 3; 
            System.out.print(a + " ");
        }
        System.out.println();
    }

    //Serie 10 con el bucle while
    public void S10_while (int n){
        System.out.print("Serie (con el bucle while) hasta " + n + ":");
        int a = 1, i = 0;

        while(i < n){
            a *= 3; 
            System.out.print(a + " ");
            i++;
        }
        System.out.println();
    }

    //Serie 10 con el bucle do while
    public void S10_do_while(int n){
        System.out.print("Serie (con el bucle do while) hasta " + n + ": ");
        int a = 1, i = 0;
        do{
            a *= 3;
            System.out.print(a + " ");
            i++;
        }while(i < n);
        System.out.println();
        System.out.println("-----------------------------------------------------------------");
    }
}
