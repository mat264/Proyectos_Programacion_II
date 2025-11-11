package g3_Poliretos.g3_Recursion;

import java.util.Scanner;

public class g3_recursion6 {
    public static void conteoRegresivo(int n) {
        if (n < 0) return;                // Caso base
        System.out.print(n + " ");        // Imprime primero
        conteoRegresivo(n - 1);           // Llama con n-1
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número desde donde contar hacia atrás: ");
        int n = sc.nextInt();
        conteoRegresivo(n);
        sc.close();
    }

    public static String g3_Recursion(int n) {
        // TODO Auto-generated method stub
        return null;
    }
}
