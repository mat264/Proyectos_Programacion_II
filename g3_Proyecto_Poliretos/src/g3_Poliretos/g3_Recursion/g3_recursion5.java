package g3_Poliretos.g3_Recursion;

public class g3_recursion5 {
    public static void conteoProgresivoHasta(int n) {
        if (n == 0) return;                 // Caso base
        conteoProgresivoHasta(n - 1);       // Llamada recursiva
        System.out.print(n + " ");          // Imprime al regresar
    }

    public static void main(String[] args) {
        System.out.print("Conteo progresivo hasta 5: ");
        conteoProgresivoHasta(5);
    }
}
