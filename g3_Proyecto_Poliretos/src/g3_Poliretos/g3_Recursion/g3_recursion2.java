package g3_Poliretos.g3_Recursion;

import java.util.Scanner;

public class g3_recursion2 {
    public static int suma(int a, int b) {
        if (b == 0) return a;       // Caso base
        return 1 + suma(a, b - 1);  // Caso recursivo
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = sc.nextInt();
        System.out.println("La suma es: " + suma(a, b));
        sc.close();
    }
}
