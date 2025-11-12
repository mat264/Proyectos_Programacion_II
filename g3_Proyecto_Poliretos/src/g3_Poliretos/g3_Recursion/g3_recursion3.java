package g3_Poliretos.g3_Recursion;

import java.util.Scanner;

public class g3_recursion3 {
    public static int multiplicacion(int a, int b) {
        if (b == 0) return 0;
        if (b < 0) return -multiplicacion(a, -b); // Manejo de negativos
        return a + multiplicacion(a, b - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;
        boolean valido = false;
        
        while (!valido) {
            try {
                System.out.print("Ingrese el primer número: ");
                a = sc.nextInt();
                System.out.print("Ingrese el segundo número: ");
                b = sc.nextInt();
                valido = true;
                
                if (Math.abs(b) > 1000) {
                    System.out.println("Advertencia: Multiplicar por números muy grandes puede ser lento.");
                }
            } catch (Exception e) {
                System.out.println("Error: Debe ingresar números enteros.");
                sc.nextLine(); // Limpiar buffer
            }
        }
        
        System.out.println("El producto de " + a + " x " + b + " es: " + multiplicacion(a, b));
        sc.close();
    }
}