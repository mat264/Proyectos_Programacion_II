package g3_Poliretos.g3_Recursion;

import java.util.Scanner;

public class g3_recursion2 {
    public static int suma(int a, int b) {
        if (b == 0) return a;
        if (b < 0) return suma(a - 1, b + 1);
        return suma(a + 1, b - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;
        boolean valido = false;
        
        while (!valido) {
            try {
                System.out.print("Ingrese el primer número: ");
                a = Integer.parseInt(sc.nextLine());
                System.out.print("Ingrese el segundo número: ");
                b = Integer.parseInt(sc.nextLine());
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar números enteros.");
            }
        }
        
        System.out.println("La suma de " + a + " + " + b + " es: " + suma(a, b));
        // NO cerrar sc.close() aquí
    }
}