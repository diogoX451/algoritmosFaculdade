package semana2;

import java.util.Scanner;

class laco {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Digite um numero: ");
        num1 = value.nextInt();
        System.out.println("Digite outro numero: ");
        num2 = value.nextInt();
        int opcao = 1;
        while ((opcao != 0) && (opcao <= 4)) {
            System.out.println("**************************");
            System.out.println("0 - Sair");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            opcao = value.nextByte();
            if (opcao == 0) {
                System.out.println("Saindo do sistema");
            } else if (opcao == 1) {
                System.out.println("A soma é" + " " + (num1 + num2));
            } else if (opcao == 2) {
                System.out.println("A subtração é " + " " + (num1 - num2));
            } else if (opcao == 3) {
                System.out.println("A multiplicação é" + " " + (num1 * num2));
            } else if (opcao == 4) {
                System.out.println("A divisião é" + " " + (num1 / num2));
            }
        }
        value.close();
    }
}

class ReadNumber {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int num1;
        int soma;
        int i = 0;
        System.out.println("Digite um numero: ");
        num1 = value.nextInt();
        while (i <= num1) {
            if (i % 2 == 0) {
                soma = soma + i;
            }
            i += 2;

        }
        value.close();
    }
}