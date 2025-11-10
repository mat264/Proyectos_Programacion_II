package g3_Poliretos.g3_Recursion;

public class g3_recursion6 {
    public static void conteoRegresivo(int n) {
        if (n < 0) return;                  // Caso base
        System.out.print(n + " ");          // Imprime antes de la llamada
        conteoRegresivo(n - 1);             // Llamada recursiva
    }

    public static void main(String[] args) {
        System.out.print("Conteo regresivo desde 5: ");
        conteoRegresivo(5);
    }
}

