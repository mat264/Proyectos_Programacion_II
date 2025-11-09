package g3_Poliretos.g3_GrafosyAutomatas;

public class g3_GrafosyAutomatas7 {
    public static boolean validar(String clave) {
        // Requiere: al menos 1 mayúscula, 1 minúscula, 1 número, 1 carácter especial
        return clave.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[^A-Za-z0-9]).+$");
    }

    public static void main(String[] args) {
        System.out.println("Abc1234! => " + validar("Abc123!"));
    }
}
