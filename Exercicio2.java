import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nomedeUsuario, senha;

        System.out.println("Cadastre-se no sistema");

        do {
            System.out.println("\nDigite o nome de usuário: ");
            nomedeUsuario = scanner.nextLine();

            System.out.println("\nDigite a senha: ");
            senha = scanner.nextLine();

            if (nomedeUsuario.equals(senha)) {

                System.out.println("\nO nome de usuário não pode ser igual a senha !");
            }

            else {

                System.out.println("\nO usuário foi cadastrado ! ");
            }

        } while (nomedeUsuario.equals(senha));

    }

}

///  Paulo Vítor Amorim de Oliveira RA: 323114192
