package g3_Poliretos.g3_Recursion;

public class g3_recursion3 {
    public static int multiplicacion(int a, int b) {
        if (b == 0) return 0;                // Caso base
        return a + multiplicacion(a, b - 1); // Caso recursivo
    }

    public static void main(String[] args) {
        System.out.println("Multiplicación recursiva (3,4): " + multiplicacion(3, 4));
    }
}

