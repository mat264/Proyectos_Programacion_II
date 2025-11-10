package g3_Poliretos.g3_GrafosyAutomatas;

public class g3_GrafosyAutomatas3 {
    public static boolean validar(String cadena) {
        return cadena.matches("(a+|b+|c+)");
    }

    public static void main(String[] args) {
        System.out.println("bbb => " + validar("bbb"));
    }
}
