package g3_Poliretos.g3_Recursion;

public class g3_recursion1 {
    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;  // Caso base
        return n * factorial(n - 1);     // Caso recursivo
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
