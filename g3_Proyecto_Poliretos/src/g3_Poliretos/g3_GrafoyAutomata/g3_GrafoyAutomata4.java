package g3_Poliretos.g3_GrafoyAutomata;

import java.util.Scanner;

public class g3_GrafoyAutomata4 {
    public static boolean validar(String cadena) {
        return cadena.matches("1+|0+1*");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cadena (1+ o 0+1*): ");
        String cadena = sc.nextLine();
        System.out.println(cadena + " => " + validar(cadena));
        sc.close();
    }
}
