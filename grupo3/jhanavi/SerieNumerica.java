package grupo3.jhanavi;


public class SerieNumerica {

    // SERIE 1
    // S1 con bucle for
    public void S1_for (int n) {
        System.out.println("SECUENCIA 1");
        int a = 0, b = 1, c;
        System.out.print("Serie (con el bucle for) hasta " + n + ": ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    //S1 con bucle while
    public void S1_while (int n) {
        int a = 0, b = 1, c;
        int i = 0;
        System.out.print("Serie (con el bucle while) hasta " + n + ": ");
        while (i < n) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
            i++;
        }
        System.out.println();
    }

    //S1 con bucle do while
    public void S1_do_while (int n) {
        int a = 0, b = 1, c;
        int i = 0;
        System.out.print("Serie (con el bucle do while) hasta " + n + ": ");
        do {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
            i++;
        } while (i < n);
        System.out.println();
        System.out.println("\n---------------------------");
    }

    //------------------------------------------------------------------------------------------------

    // SERIE 2
    //S2 con el bucle for
    public void S2_for (int n) {
        System.out.println("SECUENCIA 2");
        System.out.print("Serie (con el bucle for) hasta " + n + ": ");
        int b = 1;
        for(int i = 0; i < n; i++) {
            System.out.print(b + " " + "0 ");
            b += 2;
        }
        System.out.println();
    }

    //S2 con el bucle while
    public void S2_while (int n) {
        System.out.print("Serie (con el bucle while) hasta " + n + ": ");
        int b = 1;
        int i = 0;
        while(i < n) {
            System.out.print(b + " " + "0 ");
            b += 2;
            i++;
        }
        System.out.println();
    }

    //S2 con el bucle do while
    public void S2_do_while (int n) {
        System.out.print("Serie (con el bucle do while) hasta " + n + ": ");
        int b = 1;
        int i = 0;
        do {
            System.out.print(b + " " + "0 ");
            b += 2;
            i++;
        } while(i < n);
        System.out.println();
        System.out.println("\n---------------------------");
    }   

    //---------------------------------------------------------------------------------------------------------

    // SERIE 3
    // S3 con el bucle for
    public void S3_for (int n) {
        System.out.println("SECUENCIA 3");
        System.out.print("Serie (con el bucle for) hasta " + n + ": ");
        int a = 0, b = 1, c;
        int e = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + "/"+ e + " ");
            c = a + b;
            a = b;
            b = c;
            e+= 2;
        }
        System.out.println();
    }

    // S3 con el bucle while
    public void S3_while (int n) {
        System.out.print("Serie (con el bucle while) hasta " + n + ": ");
        int a = 0, b = 1, c;
        int e = 1;
        int i = 0;
        while (i < n) {
            System.out.print(a + "/"+ e + " ");
            c = a + b;
            a = b;
            b = c;
            e+= 2;
            i++;
        }
        System.out.println();
    }

    // S3 con el bucle do while
    public void S3_do_while (int n) {
        System.out.print("Serie (con el bucle do while) hasta " + n + ": ");
        int a = 0, b = 1, c;
        int e = 1;
        int i = 0;
        do {
            System.out.print(a + "/"+ e + " ");
            c = a + b;
            a = b;
            b = c;
            e+= 2;
            i++;
        } while (i < n);
        System.out.println();
        System.out.println("\n---------------------------");
    }

    //---------------------------------------------------------------------------------------------------------

    // SERIE 4
    //S4 con el bucle for
    public void S4_for (int n) {
        System.out.println("SECUENCIA 4");
        System.out.print("Serie (con el bucle for) hasta " + n + ": ");
        int a = 0, b = 1, c;
        int e = 2;
        for (int i = 0; i < n; i++) {
            System.out.print(a + "/"+ e + " ");
            c = a + b;
            a = b;
            b = c;
            e+= 2;
        }
        System.out.println();
    }

    //S4 con el bucle while
    public void S4_while (int n) {
        System.out.print("Serie (con el bucle while) hasta " + n + ": ");
        int a = 0, b = 1, c;
        int e = 2;
        int i = 0;
        while (i < n) {
            System.out.print(a + "/"+ e + " ");
            c = a + b;
            a = b;
            b = c;
            e+= 2;
            i++;
        }
        System.out.println();
    }

    //S4 con el bucle do while
    public void S4_do_while (int n) {
        System.out.print("Serie (con el bucle do while) hasta " + n + ": ");
        int a = 0, b = 1, c;
        int e = 2;
        int i = 0;
        do {
            System.out.print(a + "/"+ e + " ");
            c = a + b;
            a = b;
            b = c;
            e+= 2;
            i++;
        } while (i < n);
        System.out.println();
        System.out.println("\n---------------------------");
    }

    //-----------------------------------------------------------------------------------------

    // SERIE 5
    //S5 con el bucle for
    public void S5_for (int n) {
        System.out.println("SECUENCIA 5");
        System.out.print("Serie (con el bucle for) hasta " + n + ": ");
        for(int i = 2; i <= n; i++) {
            boolean esPrimo = true;
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if(esPrimo) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    //S5 con el bucle while
    public void S5_while (int n) {
        System.out.print("Serie (con el bucle while) hasta " + n + ": ");
        int i = 2;
        while(i <= n) {
            boolean esPrimo = true;
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if(esPrimo) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
    }

    //S5 con el bucle do while
    public void S5_do_while (int n) {
        System.out.print("Serie (con el bucle do while) hasta " + n + ": ");
        int i = 2;
        do {
            boolean esPrimo = true;
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if(esPrimo) {
                System.out.print(i + " ");
            }
            i++;
        } while(i <= n);
        System.out.println();
        System.out.println("\n---------------------------");
    }

    //-----------------------------------------------------------------------------------------

    // SERIE 6
    //S6 con el bucle for
    public void S6_for (int n){
        System.out.println("SECUENCIA 6");
        System.out.print("Serie (con el bucle for) hasta " + n + ": ");
        int impar = 0, valest = 1, result = 0;
        int suma = 1;
        System.out.print(valest + " ");
        for(int i = 1; i <= n; i++) {
            impar +=2;
            result = valest + impar;
            suma = suma + result ;
            System.out.print(suma + " ");
        }
        System.out.println();

    }

    //S6 con el bucle while
    public void S6_while (int n){
        System.out.print("Serie (con el bucle while) hasta " + n + ": ");
        int impar = 0, valest = 1, result= 0, suma = 1;
        System.out.print(valest + " ");
        int i = 1;
        while(i <= n){
            impar +=2;
            result = valest + impar;
            suma = suma + result ;
            System.out.print(suma + " ");
            i++;
        }
        System.out.println();
    }

    //S6 con el bucle do while
    public void S6_do_while (int n){
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
        }while(i <= n);
        System.out.println();
        System.out.println("\n---------------------------");

    }
    
    //-----------------------------------------------------------------------------------------

    // SERIE 7
    //S7 con el bucle for
    public void S7_for (int n){
        System.out.println("SECUENCIA 7");
        System.out.print("Serie (con el bucle for) hasta " + n + ": ");
        int a = 1, b= 1;
        System.out.print(b + " ");
        for(int i = 1; i <= n; i++) {
            a+= 3;
            System.out.print(a + " ");
        }
        System.out.println();
    }

    //S7 con el bucle while
    public void S7_while (int n){
        System.out.print("Serie (con el bucle while) hasta " + n + ": ");
        int a = 1, b= 1;
        System.out.print(b + " ");
        int i = 1;
        while(i <= n) {
            a+= 3;
            System.out.print(a + " ");
            i++;
        }
        System.out.println();
    }

    //S7 con el bucle do while
    public void S7_do_while (int n){
        System.out.print("Serie (con el bucle do while) hasta " + n + ": ");
        int a = 1, b= 1;
        System.out.print(b + " ");
        int i = 1;
        do {
            a+= 3;
            System.out.print(a + " ");
            i++;
        } while(i <= n);
        System.out.println();
        System.out.println("\n---------------------------");
    }
    
    //-----------------------------------------------------------------------------------------

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

    //--------------------------------------------------------------------------------------------------------------

    















    


}
