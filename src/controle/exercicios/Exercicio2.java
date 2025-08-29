package controle.exercicios;

import java.time.Year;

public class Exercicio2 {
    public static void main(String[] args) {

        int ano = Year.now().getValue();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("O ano " + ano + " é bissexto");
        } else {
            System.out.println("O ano " + ano + " não é bissexto.");
        }
    }
}
