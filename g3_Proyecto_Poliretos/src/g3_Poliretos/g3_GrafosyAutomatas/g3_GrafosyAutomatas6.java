package g3_Poliretos.g3_GrafosyAutomatas;

public class g3_GrafosyAutomatas6 {
    public static boolean validar(String variable) {
        return variable.matches("[a-zA-Z_$][a-zA-Z\\d_$]*");
    }

    public static void main(String[] args) {
        System.out.println("edad1 => " + validar("edad1"));
    }
}
