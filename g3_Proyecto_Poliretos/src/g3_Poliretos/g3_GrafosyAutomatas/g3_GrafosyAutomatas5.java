package g3_Poliretos.g3_GrafosyAutomatas;

import java.util.Scanner;

public class g3_GrafosyAutomatas5 {
    public static boolean validar(String numero) {
        return numero.matches("\\d+\\.\\d+");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número decimal: ");
        String numero = sc.nextLine();
        System.out.println(numero + " => " + validar(numero));
        sc.close();
    }
}
