package g3_Poliretos.g3_CadenaDeCaracteres;

import java.util.Scanner;
public class g3_CadenaDeCaracteres1 {
    public void Cadena1() {
        Scanner ingresoDatos = new Scanner(System.in);

        System.out.println("Ingrese una cadena de caracteres: ");
        String cadena = ingresoDatos.nextLine();

        // Conteo con FOR
        int contadorFor = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char c = Character.toLowerCase(cadena.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contadorFor++;
            }
        }
        System.out.println("Conteo con FOR: tiene " + contadorFor + " vocales");
        
        // Conteo con WHILE
        int contadorWhile = 0;
        int j = 0;
        while (j < cadena.length()) {
            char c = Character.toLowerCase(cadena.charAt(j));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contadorWhile++;
            }
            j++;
        }
        System.out.println("Conteo con WHILE: tiene " + contadorWhile + " vocales");
        // Conteo con DO WHILE
        int contadorDoWhile = 0;
        int k = 0;
        do {
            char c = Character.toLowerCase(cadena.charAt(k));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contadorDoWhile++;
            }
            k++;
        } while (k < cadena.length());
        System.out.println("Conteo con DO WHILE: tiene " + contadorDoWhile + " vocales");
    }
}

