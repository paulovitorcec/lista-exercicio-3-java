import java.util.Scanner;

/**
 * Faça um programa que leia e valide as seguintes informações:
 * Nome: maior que 3 caracteres;
 * Idade: entre 0 e 150;
 * Salário: maior que zero;
 * Sexo: 'f' ou 'm';
 * Estado Civil: 's', 'c', 'v', 'd';
 **/

class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeUsuario;
        final int NUMERO_MINIMO_DE_LETRAS = 4;
        do {
            System.out.println("Informe seu nome");
            nomeUsuario = scanner.nextLine();
            if (nomeUsuario.length() < NUMERO_MINIMO_DE_LETRAS)
                System.out.println(
                        "O nome precisa possuir mais que " + NUMERO_MINIMO_DE_LETRAS + " letras para ser válido");
        } while (nomeUsuario.length() < NUMERO_MINIMO_DE_LETRAS);

        int idade;
        final int IDADE_MINIMA_ACEITA = 0;
        final int IDADE_MAXIMA_ACEITA = 150;
        do {
            System.out.println("Qual é a sua idade?");
            idade = scanner.nextInt();
            if (idade < IDADE_MINIMA_ACEITA || idade > IDADE_MAXIMA_ACEITA)
                System.out.println(
                        "A idade informada não é um valor válido para o sistema, por favor insira um valor válido (de "
                                + IDADE_MINIMA_ACEITA + " a " + IDADE_MAXIMA_ACEITA + " anos)");
        } while (idade < IDADE_MINIMA_ACEITA || idade > IDADE_MAXIMA_ACEITA);

        float salario = 0;
        final float MENOR_SALARIO_ACEITO = 1;
        while (salario < MENOR_SALARIO_ACEITO) {
            System.out.println("Informe o seu salário atual");
            salario = scanner.nextFloat();
            if (salario < MENOR_SALARIO_ACEITO)
                System.out.println(
                        "O salário não pode ser menor que " + MENOR_SALARIO_ACEITO + ", por favor informe novamente");
        }

        char sexo;
        do {
            System.out.println(
                    "Qual o seu sexo? Informe 'm' (sem aspas) para Masculino ou 'f' (sem aspas) para Feminino");
            sexo = scanner.next().charAt(0); // Pega somente a 1ª letra
            if (sexo != 'm' || sexo != 'f')
                System.out.println(
                        "O valor informado é inválido. A pergunta aceita apenas dois possíveis valores: 'f' (sem aspas) ou 'm' (sem aspas)");
        } while (sexo != 'm' && sexo != 'f');

        char estadoCivil;
        final char SOLTEIRO = 's',
                CASADO = 'c',
                DIVORCIADO = 'd',
                VIUVO = 'v';
        do {
            System.out.printf(
                    "Informe qual é o seu estado civil: \n Solteiro(a) -> '%c'(sem aspas), \n Casado(a) -> '%c'(sem aspas), \n Divorciado(a) -> '%c'(sem aspas), \n Viúvo(a) -> '%c'(sem aspas) \n",
                    SOLTEIRO, CASADO, DIVORCIADO, VIUVO);
            estadoCivil = scanner.next().charAt(0);
            if (estadoCivil != SOLTEIRO && estadoCivil != CASADO && estadoCivil != DIVORCIADO && estadoCivil != VIUVO)
                System.out.println("Informe um dos valores válidos");
        } while (estadoCivil != SOLTEIRO && estadoCivil != CASADO && estadoCivil != DIVORCIADO && estadoCivil != VIUVO);

        System.out.println("Todas as informações foram recebidas, mostrando o relatório:");
        System.out.println("Nome: " + nomeUsuario);
        System.out.println("Idade: " + idade);
        if (sexo == 'm')
            System.out.println("Sexo: Masculino");
        else
            System.out.println("Sexo: Feminino");
        System.out.print("Estado Civil: ");
        switch (estadoCivil) {
            case SOLTEIRO:
                System.out.print("Solteir");
                break;
            case CASADO:
                System.out.print("Casad");
                break;
            case DIVORCIADO:
                System.out.print("Divorciad");
                break;
            case VIUVO:
                System.out.print("Viúv");
                break;
        }
        if (sexo == 'm')
            System.out.print("o \n");
        else
            System.out.print("a \n");

        scanner.close();
    }

}

///  Paulo Vítor Amorim de Oliveira RA: 323114192