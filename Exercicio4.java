import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        double n1, n2, n3, n4, n5, soma, media = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor 1: ");
        n1 = scanner.nextDouble();
        System.out.println("Digite o valor 2: ");
        n2 = scanner.nextDouble();
        System.out.println("Digite o valor 3: ");
        n3 = scanner.nextDouble();
        System.out.println("Digite o valor 4: ");
        n4 = scanner.nextDouble();
        System.out.println("Digite o valor 5: ");
        n5 = scanner.nextDouble();

        soma = n1 + n2 + n3 + n4 + n5;

        media = soma / 5;

        System.out.printf("O valor da soma dos numeros e %.2f ", soma);
        System.out.printf("\nA media e  %.2f ", media);
        scanner.close();
    }

}

///  Paulo Vítor Amorim de Oliveira RA: 323114192