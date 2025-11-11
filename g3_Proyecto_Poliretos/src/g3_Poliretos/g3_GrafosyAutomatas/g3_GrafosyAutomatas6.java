package g3_Poliretos.g3_GrafosyAutomatas;

import java.util.Scanner;

public class g3_GrafosyAutomatas6 {
    public static boolean validar(String variable) {
        return variable.matches("[a-zA-Z_$][a-zA-Z\\d_$]*");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una variable en Java: ");
        String variable = sc.nextLine();
        System.out.println(variable + " => " + validar(variable));
        sc.close();
    }
}
