package g3_Poliretos.g3_SerieNumerica;

public class g3_S8 {
    
    //SERIE 8 
    //S8 con el bucle for
    public void S8_for (int n){
        System.out.println("SECUENCIA 8");
        System.out.print("Serie (con el bucle for) hasta " + n + ": ");
        int a = 3;
        System.out.print(a + " ");
        for(int i = 0; i <= n; i++){
            a+= 5;
            System.out.print(a + " ");
        }
        System.out.println();
    }

    //S8 con el bucle while
    public void S8_while(int n){
        System.out.print("Serie (con el bucle while) hasta " + n + ": ");
        int a = 3, i = 0;
        System.out.print(a + " ");
        while(i <= n){
            a+= 5;
            System.out.print(a + " ");
            i++;
        }
        System.out.println();
    }

    //S8 con el bucle do while
    public void S8_do_while(int n){
        System.out.print("Serie (con el bucle do while) hasta " + n + ": ");
        int a = 3, i = 0;
        System.out.print(a + " ");
        do{
            a += 5;
            System.out.print(a + " ");
            i++;
        }while(i <= n);
        System.out.println();
        System.out.println("------------------------------------------------------");
    }
}
