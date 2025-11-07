package g3_Poliretos.g3_SerieNumerica;

public class g3_S12 {
    //SERIE 12
    //Serie 12 con el bucle for
    public void S12_for(int n){
        System.out.println("SECUENCIA 12");
        System.out.print("Serie (con el bucle for) hasta " + n + ": ");
        
        int a = 2, b =4;
        System.out.print(a + " ");
        for(int i = 1; i < n; i++){
            a = a + b;
            b += 2;
            System.out.print(a + " ");
        }

        System.out.println();
    }

    //Serie 12 con el bucle while
    public void S12_while (int n){
        System.out.print("Serie (con el bucle while) hasta " + n + ": ");
        int a = 2, b = 4, i = 1;
        System.out.print(a + " ");
        while(i < n){
            a = a + b;
            b += 2;
            System.out.print(a + " ");
            i++;
        }
        System.out.println();
    }

    //Serie 12 con el bucle do while
    public void S12_do_while(int n){
        System.out.print("Serie (con el bucle do while) hasta " + n + ": ");
        int a = 2, b = 4, i = 1;
        System.out.print(a + " ");
        do{
            a = a + b;
            b += 2;
            System.out.print(a + " ");
            i++;
        }while(i < n);
    }
}
