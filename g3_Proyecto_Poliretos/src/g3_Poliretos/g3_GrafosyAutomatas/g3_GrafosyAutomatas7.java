package g3_Poliretos.g3_GrafosyAutomatas;

import java.util.Scanner;

public class g3_GrafosyAutomatas7 {
    public static boolean validar(String clave) {
        return clave.matches("(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[^A-Za-z0-9]).+");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una contraseña: ");
        String clave = sc.nextLine();
        System.out.println(clave + " => " + validar(clave));
        sc.close();
    }
}
