package g3_Poliretos.g3_Figuras;


public class g3_Figuras {
    // Figura 1
    public void g3_figuraF1(int tam) {

        System.out.println("\nFigura F1: Cuadro hueco\n");
        System.out.println("Con for");
        for (int i=1; i<=tam;i++) {
            for (int j=1; j<=tam;j++) {
                if (i ==1 || i ==tam || j ==1 || j ==tam) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("Con while");
        int i=1,j=1;

        while (i<=tam) {
            j=1;
            while(j<=tam){
                if(i==1|| i==tam|| j==1 || j==tam){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");

                }
                j++;
            }
            System.out.println();
            i++;
        }

        System.out.println("Con do while");
    i = 1;
    do {
        j = 1;
        do {
            if(i==1|| i==tam|| j==1 || j==tam){
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }
            j++;
        } while (j<=tam);

        System.out.println();
        i++;
    } while (i<=tam);
    }

    // Figura 2
    public void g3_figuraF2(int tam) {
        System.out.println("\nFigura F2: Cuadro hueco con * y + \n");

        System.out.println("Con for");

    for (int i = 1; i <= tam; i++) {
        for (int j = 1; j <= tam; j++) {
            if (i == 1 || i == tam) {
               
                if (j % 2 == 0) {
                    System.out.print("+ ");
                } else {
                    System.out.print("* ");
                }
            } else if (j == 1 || j == tam) {
  
                if (i % 2 == 0) {
                    System.out.print("+ ");
                } else {
                    System.out.print("* ");
                }
            } else {
             
                System.out.print("  ");
            }
        }
        System.out.println();
    }

     System.out.println("Con while");
    int i = 1, j;
    while (i <= tam) {
        j = 1;
        while (j <= tam) {

            if (i == 1 || i == tam) {

                if (j % 2 == 0) {
                    System.out.print("+ ");
                } else {
                    System.out.print("* ");
                }

            } else if (j == 1 || j == tam) {

                if (i % 2 == 0) {
                    System.out.print("+ ");
                } else {
                    System.out.print("* ");
                }

            } else {
                System.out.print("  ");
            }
            j++;
        }
        System.out.println();
        i++;
    }

    System.out.println("Con do while");
    i = 1;
    do {
        j = 1;
        do {
            if (i == 1 || i == tam) {

                if (j % 2 == 0) {
                    System.out.print("+ ");
                } else {
                    System.out.print("* ");
                }

            } else if (j == 1 || j == tam) {

                if (i % 2 == 0) {
                    System.out.print("+ ");
                } else {
                    System.out.print("* ");
                }

            } else {
                System.out.print("  ");
            }
            j++;
        } while (j <= tam);

        System.out.println();
        i++;
    } while (i <= tam);
}

    //Figura 3
    public void g3_figuraF3(int tam){
        System.out.println("\n Figura F3: Triangulo decreciente \n");

        System.out.println("Con for");
        for(int i=1; i<=tam; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Con while");
        int i=1, j=1;
        while(i<=tam){
            j=1;
            while(j<=i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }

        System.out.println("Con do while");
        i=1;
        do{
            j=1;
            do{
                System.out.print("* ");
                j++;
            }while(j<=i);
            System.out.println();
            i++;
        }while(i<=tam);

    }
   
    //Figura 4
     public void g3_figuraF4(int tam){
        System.out.println("\nFigura F4: triangulo creciente\n");
        System.out.println("Con for");

        for(int i=1; i<=tam; i++){
            for(int j=tam; j>i; j--){
                System.out.print("  ");
            }
            for(int d=1; d<=i; d++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Con while");
        int i=1, j=1, d=1;
        while(i<=tam){
            j=tam;
            while(j>i){
                System.out.print("  ");
                j--;
            }
            d=1;
            while(d<=i){
                System.out.print("* ");
                d++;
            }
            System.out.println();
            i++;
        }

        System.out.println("Con do while");
        i=1;
        do{
            j=tam;
            do{
                if(j>i){
                    System.out.print("  ");
                }
                j--;
            }while(j>=i);
            d=1;
            do{
                System.out.print("* ");
                d++;
            }while(d<=i);
            System.out.println();
            i++;
        }while(i<=tam);
         }
    
    //Figura 5
    public void g3_figuraF5(int tam){
        System.out.println("\nFigura F5: Piramide invertida\n");
        System.out.println("Con for");

        int totalF1=(2*tam)-1;

        for(int i=1; i<=tam ; i++){
            for(int j=1; j<i ;j++){
                System.out.print(" ");
            }
            for(int d=1; d<=totalF1-(2*(i-1));d++){
                System.out.print("*");
            }
            System.out.println();
        }
         System.out.println("Con while");
        int i=1, j=1, d=1;
        while(i<=tam){
            j=1;
            while(j<i){
                System.out.print(" ");
                j++;
            }
            d=1;
            while(d<=totalF1-(2*(i-1))){
                System.out.print("*");
                d++;
            }
            System.out.println();
            i++;
        }

        System.out.println("Con do while");
        i=1;
        do{
            j=1;
            do{
                if(j<i){
                    System.out.print(" ");
                }
                j++;
            }while(j<=i);

            d=1;
            do{
                System.out.print("*");
                d++;
            }while(d<=totalF1-(2*(i-1)));

            System.out.println();
            i++;
        }while(i<=tam);
        
    }

    //Figura 6
    public void g3_figuraF6(int tam){
         System.out.println("\nFigura F6: piramide normal\n");

        System.out.println("Con for");
        for(int i=1; i<=tam; i++){
            for(int j=tam;j>i;j--){
                System.out.print(" ");
            }
            for(int d=1; d<=(2*i)-1;d++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Con while");
        int i=1, j=1, d=1;
        while(i<=tam){
            j=tam;
            while(j>i){
                System.out.print(" ");
                j--;
            }
            d=1;
            while(d<=(2*i)-1){
                System.out.print("*");
                d++;
            }
            System.out.println();
            i++;
        }

        System.out.println("Con do while");
        i=1;
        do{
            j=tam;
            do{
                if(j>i){
                    System.out.print(" ");
                }
                j--;
            }while(j>=i);

            d=1;
            do{
                System.out.print("*");
                d++;
            }while(d<=(2*i)-1);

            System.out.println();
            i++;
        }while(i<=tam);
    }
    
    //Figura 7
    public void g3_figuraF7(int tam){
         System.out.println("\nFigura F7: Escalera decreciente\n");

         System.out.println("Con for");
        for(int i=1; i<=tam; i++){
            for(int j=1; j<=i; j++){
                if(j==i){
                    System.out.print("¯¯¯|");
                }else{
                    System.out.print("    ");
                }
                
            }
           System.out.println();
        }
        System.out.println("Con while");
    int i = 1;
    while(i <= tam){
        int j = 1;
        while(j <= i){
            if(j==i){
                System.out.print("¯¯¯|");
            }else{
                System.out.print("    ");
            }
            j++;
        }
        System.out.println();
        i++;
    }

    // Con do while
    System.out.println("Con do while");
    int a = 1;
    do{
        int b = 1;
        do{
            if(b==a){
                System.out.print("¯¯¯|");
            }else{
                System.out.print("    ");
            }
            b++;
        }while(b <= a);

        System.out.println();
        a++;
    }while(a <= tam);

    }

    //Figura 8
    public void g3_figuraF8(int tam){
         System.out.println("\nFigura F8: Escalera creciente\n");
         System.out.println("Con for");
        
         for(int i=1; i<=tam; i++){
            for(int j=tam; j>i; j--){
               System.out.print("   ");
            }
            System.out.println("|¯¯¯");
            
         }
         System.out.println("Con while");
    int i = 1;
    while(i <= tam){
        int j = tam;
        while(j > i){
            System.out.print("   ");
            j--;
        }
        System.out.println("|¯¯¯");
        i++;
    }

    System.out.println("Con do while");
    int a = 1;
    do{
        int b = tam;
        do{
            if(b > a){
                System.out.print("   ");
            }
            b--;
        }while(b >= a);
        System.out.println("|¯¯¯");
        a++;
    }while(a <= tam);
    }

    //Figura 9
    public void g3_figuraF9(int tam){
         System.out.println("\nFigura F9: Escalera sube y baja\n");
        System.out.println("Con for");
         for(int i=1;i<=tam; i++){
            for(int j=tam; j>i; j--){
                System.out.print("   ");
            }

            System.out.print("___|");
            for (int d = 1; d <= (i - 1) * 5; d++) {
               System.out.print(" ");
           }
           System.out.println("|__");
         }
         System.out.println("Con while");
        int i=1, j=1, d=1;
        while(i<=tam){
            j=tam;
            while(j>i){
                System.out.print("   ");
                j--;
            }
            System.out.print("___|");
            d=1;
            while(d <= (i - 1) * 5){
                System.out.print(" ");
                d++;
            }
            System.out.println("|__");
            i++;
        }

        System.out.println("Con do while");
        i=1;
        do{
            j=tam;
            do{
                if(j>i){
                    System.out.print("   ");
                }
                j--;
            }while(j>=i);

            System.out.print("___|");

            d=1;
            do{
                if(d <= (i - 1) * 5){
                    System.out.print(" ");
                }
                d++;
            }while(d <= (i - 1) * 5 + 1);

            System.out.println("|__");
            i++;
        }while(i<=tam);

    }

    //Figura 10
    public void g3_figuraF10(int tam){
         System.out.println("\nFigura F10: Escalera decreciente con + y -\n");
         System.out.println("Con for");
        for(int i=1; i<=tam; i++){
            for(int j=1;j<=i;j++){
                if(j==i){
                    if(j%2 != 0){
                        System.out.print("|_+_");
                    }else{
                        System.out.print("|_-_");

                    }
                }else{
                    System.out.print("    ");
                }
            }
            System.out.println();
        }

        System.out.println("Con while");
    int i=1, j=1;
    while(i<=tam){
        j=1;
        while(j<=i){
            if(j==i){
                if(j%2 != 0){
                    System.out.print("|_+_");
                }else{
                    System.out.print("|_-_");
                }
            }else{
                System.out.print("    ");
            }
            j++;
        }
        System.out.println();
        i++;
    }

    System.out.println("Con do while");
    i=1;
    do{
        j=1;
        do{
            if(j==i){
                if(j%2 != 0){
                    System.out.print("|_+_");
                }else{
                    System.out.print("|_-_");
                }
            }else{
                System.out.print("    ");
            }
            j++;
        }while(j<=i);
        System.out.println();
        i++;
    }while(i<=tam);
    }

    //Figura 11
    public void g3_figuraF11(int tam){
         System.out.println("\nFigura F11:Escalera decreciente aumentando en bases\n");
        System.out.println("Con for");
         for(int i=1;i<=tam;i++){
            for(int j=1;j<=i;j++){
                if(j==i){
                    System.out.print("|");
                    System.out.print("_".repeat(j));
                }else{
                    System.out.print(" ".repeat(j));
                }

            }
            System.out.println();
         }
         System.out.println("Con while");
    int i=1, j=1;
    while(i<=tam){
        j=1;
        while(j<=i){
            if(j==i){
                System.out.print("|");
                System.out.print("_".repeat(j));
            }else{
                System.out.print(" ".repeat(j));
            }
            j++;
        }
        System.out.println();
        i++;
    }

    System.out.println("Con do while");
    i=1;
    do{
        j=1;
        do{
            if(j==i){
                System.out.print("|");
                System.out.print("_".repeat(j));
            }else{
                System.out.print(" ".repeat(j));
            }
            j++;
        }while(j<=i);
        System.out.println();
        i++;
    }while(i<=tam);

    }

    //Figura 12
    public void g3_figuraF12(int tam){
        System.out.println("\nFigura F12: Números decrecientes\n");
        System.out.println("Con for");
            for(int i = tam; i >= 1; i--){
                for(int j = 1; j <= i; j++){
            System.out.print(j);
        }
        System.out.println();
    }

    System.out.println("Con while");
    int i = tam, j = 1;
    while(i >= 1){
        j = 1;
        while(j <= i){
            System.out.print(j);
            j++;
        }
        System.out.println();
        i--;
    }

        System.out.println("Con do while");
         i=tam;
        do {
            j=1;
            do {
                System.out.print(j);
                j++;
            } while (j<=i);
            System.out.println();
            i--;
        } while (i>=1);
    }

    //Figura 13
    public void g3_figuraF13(int tam){
        System.out.println("\nFigura F13: Números crecientes\n");
         System.out.println("Con for");
            for(int i = 1; i <= tam; i++){
                for(int j = 1; j <= i; j++){
            System.out.print(j);
        }
        System.out.println();
    }

    System.out.println("Con while");
    int i = 1, j = 1;
    while(i <= tam){
        j = 1;
        while(j <= i){
            System.out.print(j);
            j++;
        }
        System.out.println();
        i++;
    }
        
        System.out.println("Con do while");
        i=1;
        do {
            j=1;

            do {
                System.out.print(j);
                j++;
            } while (j<=i);
            System.out.println();
            i++;
        } while (i<=tam);
    }

    //Figura 14
   public void g3_figuraF14(int tam){
    System.out.println("\nFigura F14: Triángulo de pascal\n");
    System.out.println("Con for");
    for(int i=1; i<=tam; i++){
        
        for(int espacio=tam; espacio>i; espacio--){
            System.out.print(" ");
        }
        int num = 1;
        for(int j=0; j<=i; j++){
            System.out.print(num + " ");
            num = num * (i - j) / (j + 1);
        }

        System.out.println();
    }
     System.out.println("Con while");
    int i=1, espacio=1, j=1;
    while(i<=tam){
        espacio = tam;
        while(espacio>i){
            System.out.print(" ");
            espacio--;
        }
        int num = 1;
        j = 0;
        while(j<=i){
            System.out.print(num + " ");
            num = num * (i - j) / (j + 1);
            j++;
        }
        System.out.println();
        i++;
    }

    System.out.println("Con do while");
    i=1;
    do{
        espacio = tam;
        do{
            if(espacio>i){
                System.out.print(" ");
            }
            espacio--;
        }while(espacio>i);
        int num = 1;
        j = 0;
        do{
            System.out.print(num + " ");
            num = num * (i - j) / (j + 1);
            j++;
        }while(j<=i);
        System.out.println();
        i++;
    }while(i<=tam);
}

    //Figura 15
    public void g3_figuraF15(int tam){
        System.out.println("\nFigura F15: Triángulo de pascal descendiente\n");

        System.out.println("Con for");

    for(int i=1; i<=tam; i++){
        
        int num = 1;
        for(int j=0; j<=i; j++){
            System.out.print(num + " ");
            num = num * (i - j) / (j + 1);
        }

        System.out.println();
    }
     System.out.println("Con while");
    int i=1, j=1;
    while(i<=tam){
        int num = 1;
        j=0;
        while(j<=i){
            System.out.print(num + " ");
            num = num * (i - j) / (j + 1);
            j++;
        }
        System.out.println();
        i++;
    }

    System.out.println("Con do while");
    i=1;
    do{
        int num = 1;
        j=0;
        do{
            System.out.print(num + " ");
            num = num * (i - j) / (j + 1);
            j++;
        }while(j<=i);
        System.out.println();
        i++;
    }while(i<=tam);
    }

    //Figura 16
    public void g3_figuraF16(int tam){
        System.out.println("\nFigura F16: X hecha de + y - \n");

        System.out.println("Con for");
        int iz=tam;
        for(int i=1; i<=tam; i++){
            for(int j=1; j<=tam;j++){
                if(j==i || j==iz){
                    if(j==1 || j==tam || j==    (tam/2)+1){
                        System.out.print("+ ");
                    }else{
                        System.out.print("- ");
                    }
                }else{
                    System.out.print("  ");
                }
            }
            iz--;
            System.out.println();
        }
        System.out.println("Con while");
    int i=1, j=1;
    iz = tam;
    while(i<=tam){
        j=1;
        while(j<=tam){
            if(j==i || j==iz){
                if(j==1 || j==tam || j==(tam/2)+1){
                    System.out.print("+ ");
                }else{
                    System.out.print("- ");
                }
            }else{
                System.out.print("  ");
            }
            j++;
        }
        iz--;
        System.out.println();
        i++;
    }

    System.out.println("Con do while");
    i=1;
    iz=tam;
    do{
        j=1;
        do{
            if(j==i || j==iz){
                if(j==1 || j==tam || j==(tam/2)+1){
                    System.out.print("+ ");
                }else{
                    System.out.print("- ");
                }
            }else{
                System.out.print("  ");
            }
            j++;
        }while(j<=tam);
        iz--;
        System.out.println();
        i++;
    }while(i<=tam);
    }

    //Figura 17
    public void g3_figuraF17(int tam){
        System.out.println("\nFigura F17: X hecha de 1 y 0 \n");

        System.out.println("Con for");
        int iz=tam;
        for(int i=1; i<=tam; i++){
            for(int j=1; j<=tam; j++){
                if(j==i || j==iz){
                    if(j==1 || j==tam || j==(tam/2)+1){
                        System.out.print("1 ");
                    }else{
                        System.out.print("0 ");
                    }
                }else{
                    System.out.print("  ");
                }
            }
            iz--;
            System.out.println();
        }
         System.out.println("Con while");
    int i=1, j=1;
    iz=tam;
    while(i<=tam){
        j=1;
        while(j<=tam){
            if(j==i || j==iz){
                if(j==1 || j==tam || j==(tam/2)+1){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }else{
                System.out.print("  ");
            }
            j++;
        }
        iz--;
        System.out.println();
        i++;
    }

    System.out.println("Con do while");
    i=1;
    iz=tam;
    do{
        j=1;
        do{
            if(j==i || j==iz){
                if(j==1 || j==tam || j==(tam/2)+1){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }else{
                System.out.print("  ");
            }
            j++;
        }while(j<=tam);
        iz--;
        System.out.println();
        i++;
    }while(i<=tam);
    }

    //Figura 18
    public void g3_figuraF18(int tam){
        System.out.println("\nFigura F18: Triangulo decreciente de numeros\n");

        System.out.println("Con while");
        int[] fAnterior= new int[tam];
        int i=1;
        while (i<=tam) {
            int[] fActual=new int[i];
            int j=0;
            while ( j<i) {
                if(i==1){
                    fActual[j]=2;
                }else if(j==0){
                    fActual[j]=1;
                }else if(j==i-1){
                    fActual[j]=2;
                }else{
                    fActual[j]=fAnterior[j-1]+fAnterior[j];
                }
                System.out.print(fActual[j]);
                j++;
            }
            System.out.println();
            fAnterior=fActual;
            i++;
        }
        System.out.println("Con for");
    int[] fAnterior2 = new int[tam];
    int j;
    for(i = 1; i <= tam; i++){
        int[] fActual = new int[i];
        for(j = 0; j < i; j++){
            if(i==1){
                fActual[j]=2;
            }else if(j==0){
                fActual[j]=1;
            }else if(j==i-1){
                fActual[j]=2;
            }else{
                fActual[j]=fAnterior2[j-1] + fAnterior2[j];
            }
            System.out.print(fActual[j]);
        }
        System.out.println();
        fAnterior2 = fActual;
    }

    System.out.println("Con do while");
    int[] fAnterior3 = new int[tam];
    i = 1;
    do{
        int[] fActual = new int[i];
        j = 0;
        do{
            if(i==1){
                fActual[j]=2;
            }else if(j==0){
                fActual[j]=1;
            }else if(j==i-1){
                fActual[j]=2;
            }else{
                fActual[j]=fAnterior3[j-1] + fAnterior3[j];
            }
            System.out.print(fActual[j]);
            j++;
        }while(j < i);
        System.out.println();
        fAnterior3 = fActual;
        i++;
    }while(i <= tam);
        

    }

    //Figura 19
    public void g3_figuraF19(int tam){
        System.out.println("\nFigura F19: Triangulo decreciente de numeros con + y *\n");

        System.out.println("Con while");
        int[] fAnterior= new int[tam];
        int i=1;
        while (i<=tam) {
            int[] fActual=new int[i];
            int j=0;
            while ( j<i) {
                if(i==1){
                    fActual[j]=2;
                }else if(j==0){
                    fActual[j]=1;
                }else if(j==i-1){
                    fActual[j]=2;
                }else{
                    fActual[j]=fAnterior[j-1]+fAnterior[j];
                }

                if(i==1 || j==i-1){
                    System.out.print("*");
                }else if(j==0){
                    System.out.print("+");
                }else{

                    System.out.print(fActual[j]);
                }
                j++;
            }
            System.out.println();
            fAnterior=fActual;
            i++;
        }
        System.out.println("Con for");
    int[] fAnterior2 = new int[tam];
    for(i = 1; i <= tam; i++){
        int[] fActual = new int[i];
        for(int j = 0; j < i; j++){
            if(i==1){
                fActual[j]=2;
            }else if(j==0){
                fActual[j]=1;
            }else if(j==i-1){
                fActual[j]=2;
            }else{
                fActual[j]=fAnterior2[j-1] + fAnterior2[j];
            }

            if(i==1 || j==i-1){
                System.out.print("*");
            }else if(j==0){
                System.out.print("+");
            }else{
                System.out.print(fActual[j]);
            }
        }
        System.out.println();
        fAnterior2 = fActual;
    }


    System.out.println("Con do while");
    int[] fAnterior3 = new int[tam];
    i = 1;
    do{
        int[] fActual = new int[i];
        int j = 0;
        do{
            if(i==1){
                fActual[j]=2;
            }else if(j==0){
                fActual[j]=1;
            }else if(j==i-1){
                fActual[j]=2;
            }else{
                fActual[j]=fAnterior3[j-1] + fAnterior3[j];
            }

            if(i==1 || j==i-1){
                System.out.print("*");
            }else if(j==0){
                System.out.print("+");
            }else{
                System.out.print(fActual[j]);
            }
            j++;
        }while(j < i);
        System.out.println();
        fAnterior3 = fActual;
        i++;
    }while(i <= tam);
        
    }
}

