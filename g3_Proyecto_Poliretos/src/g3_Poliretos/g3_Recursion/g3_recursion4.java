package g3_Poliretos.g3_Recursion;

import java.util.Scanner;

public class g3_recursion4 {
    public static long potencia(int a, int b) {
        if (b == 0) return 1;
        if (b < 0) {
            throw new IllegalArgumentException("El exponente debe ser positivo");
        }
        return a * potencia(a, b - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = -1;
        boolean valido = false;
        
        while (!valido) {
            try {
                System.out.print("Ingrese la base: ");
                a = Integer.parseInt(sc.nextLine());
                System.out.print("Ingrese el exponente (debe ser >= 0): ");
                b = Integer.parseInt(sc.nextLine());
                
                if (b < 0) {
                    System.out.println("Error: El exponente debe ser positivo o cero.");
                    continue;
                }
                
                if (b > 30) {
                    System.out.println("Advertencia: Exponentes muy grandes pueden causar desbordamiento.");
                    System.out.print("¿Desea continuar? (s/n): ");
                    String respuesta = sc.nextLine();
                    if (!respuesta.equalsIgnoreCase("s")) {
                        continue;
                    }
                }
                
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar números enteros.");
            }
        }
        
        try {
            long resultado = potencia(a, b);
            System.out.println(a + " elevado a " + b + " = " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}