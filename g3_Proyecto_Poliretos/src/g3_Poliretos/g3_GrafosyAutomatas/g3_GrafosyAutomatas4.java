package g3_Poliretos.g3_GrafosyAutomatas;

public class g3_GrafosyAutomatas4 {
    public static boolean validar(String cadena) {
        return cadena.matches("1+0+1*");
    }

    public static void main(String[] args) {
        System.out.println("11100011 => " + validar("11100011"));
    }
}
