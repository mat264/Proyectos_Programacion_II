package g3_Poliretos.g3_Recursion;

import java.util.Scanner;

public class g3_recursion3 {
    public static int multiplicacion(int a, int b) {
        if (b == 0) return 0;           // Caso base
        return a + multiplicacion(a, b - 1); // Caso recursivo
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = sc.nextInt();
        System.out.println("El producto es: " + multiplicacion(a, b));
        sc.close();
    }
}
