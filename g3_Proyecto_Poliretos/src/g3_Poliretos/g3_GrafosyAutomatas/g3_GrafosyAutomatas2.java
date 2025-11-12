package g3_Poliretos.g3_GrafosyAutomatas;

public class g3_GrafosyAutomatas2 {
    public static boolean validar(String cadena) {
        return cadena.matches("ab+ca");
    }

    public static void main(String[] args) {
        System.out.println("abbca => " + validar("abbca"));
    }
}
