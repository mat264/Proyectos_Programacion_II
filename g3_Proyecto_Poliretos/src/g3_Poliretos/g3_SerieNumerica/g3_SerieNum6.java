package g3_Poliretos.g3_SerieNumerica;

public class g3_SerieNum6 {
    
    // SERIE 6
    //S6 con el bucle for
    public void S6Numerica_for (int n){
        System.out.println("SECUENCIA NUMERICA #6");
        System.out.print("Serie (con el bucle for) hasta " + n + ": ");
        int impar = 0, valest = 1, result = 0;
        int suma = 1;
        System.out.print(valest + " ");
        for(int i = 1; i < n; i++) {
            impar +=2;
            result = valest + impar;
            suma = suma + result ;
            System.out.print(suma + " ");
        }
        System.out.println();

    }

    //S6 con el bucle while
    public void S6Numerica_while (int n){
        System.out.print("Serie (con el bucle while) hasta " + n + ": ");
        int impar = 0, valest = 1, result= 0, suma = 1;
        System.out.print(valest + " ");
        int i = 1;
        while(i < n){
            impar +=2;
            result = valest + impar;
            suma = suma + result ;
            System.out.print(suma + " ");
            i++;
        }
        System.out.println();
    }

    //S6 con el bucle do while
    public void S6Numerica_do_while (int n){
        System.out.print("Serie (con el bucle do while) hasta " + n + ": ");
        int impar = 0, valest = 1, result= 0, suma = 1;
        System.out.print(valest + " ");
        int i = 1;
        do{
            impar +=2;
            result = valest + impar;
            suma = suma + result ;
            System.out.print(suma + " ");
            i++;
        }while(i < n);
        System.out.println();
        System.out.println("--------------------------------------");

    }
}
