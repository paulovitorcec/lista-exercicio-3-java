
/**
 * Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso 
 * o valor seja inválido e continue pedindo até que o usuário informe um valor válido.
 */
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;

        do {

            System.out.println("Digite qual foi a nota do aluno de 0 a 10: ");
            numero = scanner.nextInt();

            if (numero > 10)
                System.out.println("\nNúmero Inválido !");
            else if (numero < 0)
                System.out.println("\nNúmero inválido! ");
            else {
                System.out.println("\nNúmero Registrado!");
                break;
            }

        } while (true);

        scanner.close();
    }

}

///  Paulo Vítor Amorim de Oliveira RA: 323114192