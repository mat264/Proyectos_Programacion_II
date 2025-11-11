package g3_Poliretos.g3_Recursion;

import java.util.Scanner;

public class g3_recursion1 {
    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        int n = -1;
        
        while (n < 0) {
            try {
                System.out.print("Ingrese un número para calcular su factorial (n >= 0): ");
                n = sc.nextInt();
                
                if (n < 0) {
                    System.out.println("Error: El número debe ser positivo o cero.");
                } else if (n > 20) {
                    System.out.println("Advertencia: Números muy grandes pueden causar desbordamiento.");
                    System.out.print("¿Desea continuar? (s/n): ");
                    sc.nextLine(); // Limpiar buffer
                    String respuesta = sc.nextLine();
                    if (!respuesta.equalsIgnoreCase("s")) {
                        n = -1;
                        continue;
                    }
                }
            } catch (Exception e) {
                System.out.println("Error: Debe ingresar un número entero.");
                sc.nextLine(); // Limpiar buffer
                n = -1;
            }
        }
        
        System.out.println("El factorial de " + n + " es: " + factorial(n));
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
}