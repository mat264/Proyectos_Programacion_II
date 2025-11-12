package g3_Poliretos.g3_Recursion;

import java.util.Scanner;

public class g3_recursion6 {
    public static void conteoRegresivo(int n) {
        if (n < 0) return;
        System.out.print(n + " ");
        conteoRegresivo(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = -1;
        
        while (n < 0) {
            try {
                System.out.print("Ingrese el número desde donde contar hacia atrás (debe ser >= 0): ");
                n = Integer.parseInt(sc.nextLine());
                
                if (n < 0) {
                    System.out.println("Error: El número debe ser positivo o cero.");
                } else if (n > 10000) {
                    System.out.println("Advertencia: Contar desde números muy grandes puede causar desbordamiento de pila.");
                    System.out.print("¿Desea continuar? (s/n): ");
                    String respuesta = sc.nextLine();
                    if (!respuesta.equalsIgnoreCase("s")) {
                        n = -1;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número entero.");
                n = -1;
            }
        }
        
        System.out.print("Conteo regresivo: ");
        conteoRegresivo(n);
        System.out.println();
    }
}