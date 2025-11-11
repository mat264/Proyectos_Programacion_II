package g3_Poliretos.g3_Recursion;

import java.util.Scanner;

public class g3_recursion1 {
    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número para calcular su factorial: ");
        int n = sc.nextInt();
        System.out.println("El factorial de " + n + " es: " + factorial(n));
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
}
