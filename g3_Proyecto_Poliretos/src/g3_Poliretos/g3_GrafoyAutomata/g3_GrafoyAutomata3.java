package g3_Poliretos.g3_GrafoyAutomata;

import java.util.Scanner;

public class g3_GrafoyAutomata3 {
    public static boolean validar(String cadena) {
        return cadena.matches("a+|b+|c+");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cadena (a+, b+ o c+): ");
        String cadena = sc.nextLine();
        System.out.println(cadena + " => " + validar(cadena));
        sc.close();
    }
}
