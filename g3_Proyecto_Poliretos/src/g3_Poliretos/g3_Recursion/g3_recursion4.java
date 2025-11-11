package g3_Poliretos.g3_Recursion;

import java.util.Scanner;

public class g3_recursion4 {
    public static int potencia(int a, int b) {
        if (b == 0) return 1;           // Caso base
        return a * potencia(a, b - 1);  // Caso recursivo
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la base: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el exponente: ");
        int b = sc.nextInt();
        System.out.println(a + " elevado a " + b + " = " + potencia(a, b));
        sc.close();
    }
}
