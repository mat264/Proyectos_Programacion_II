package g3_Poliretos.g3_CadenaDeCaracteres;

import java.util.Scanner;

public class g3_CadenaDeCaracteres2 {
    public void Cadena2() {
        Scanner ingresoDatos = new Scanner(System.in);

        System.out.println("Ingrese una cadena de caracteres: ");
        String cadena = ingresoDatos.nextLine();

        // Conteo con FOR
        int contadorFor = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (Character.isLetter(c)) {
                contadorFor++;
            }
        }
        System.out.println("Conteo con FOR: tiene " + contadorFor + " letras");
        
        // Conteo con WHILE
        int contadorWhile = 0;
        int j = 0;
        while (j < cadena.length()) {
            char c = cadena.charAt(j);
            if (Character.isLetter(c)) {
                contadorWhile++;
            }
            j++;
        }
        System.out.println("Conteo con WHILE: tiene " + contadorWhile + " letras");
        
        // Conteo con DO WHILE
        int contadorDoWhile = 0;
        int k = 0;
        if (cadena.length() > 0) {
            do {
                char c = cadena.charAt(k);
                if (Character.isLetter(c)) {
                    contadorDoWhile++;
                }
                k++;
            } while (k < cadena.length());
        }
        System.out.println("Conteo con DO WHILE: tiene " + contadorDoWhile + " letras");
       
    }
}