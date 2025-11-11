package g3_Poliretos.g3_Recursion;

import java.util.Scanner;

public class g3_recursion5 {
    public static void conteoProgresivoHasta(int n) {
        if (n == 0) return;                // Caso base
        conteoProgresivoHasta(n - 1);      // Llamada recursiva
        System.out.print(n + " ");         // Imprime al volver
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número hasta donde contar: ");
        int n = sc.nextInt();
        conteoProgresivoHasta(n);
        sc.close();
    }
}
