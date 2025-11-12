package g3_Poliretos.g3_GrafosyAutomatas;

public class g3_GrafosyAutomatas5 {
    public static boolean validar(String numero) {
        // Acepta números decimales tipo: 12, 12.3, .45, 0.5
        return numero.matches("^[0-9]*\\.?[0-9]+$");
    }

    public static void main(String[] args) {
        System.out.println("12.34 => " + validar("12.34"));
    }
}
