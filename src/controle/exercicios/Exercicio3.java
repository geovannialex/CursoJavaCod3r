package controle.exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = entrada.nextDouble();
        double media = (nota1 + nota2) / 2.0;

        if (media >= 7.0) {
            System.out.println("Aprovado com média " + media);
        } else if (media > 4.0) {
            System.out.println("Recuperação com média " + media);
        } else {
            System.out.println("Reprovado com média " + media);
        }
        entrada.close();
    }
}
