package g3_Poliretos.g3_Recursion;

public class g3_recursion2 {
    public static int suma(int a, int b) {
        if (b == 0) return a;        // Caso base
        return 1 + suma(a, b - 1);   // Caso recursivo
    }

    public static void main(String[] args) {
        System.out.println("Suma recursiva (4,3): " + suma(4, 3));
    }
}
