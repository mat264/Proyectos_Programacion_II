package g3_Poliretos.g3_Recursion;

public class g3_recursion4 {
    public static int potencia(int a, int b) {
        if (b == 0) return 1;           // Caso base
        return a * potencia(a, b - 1);  // Caso recursivo
    }

    public static void main(String[] args) {
        System.out.println("Potencia recursiva (2^5): " + potencia(2, 5));
    }
}
