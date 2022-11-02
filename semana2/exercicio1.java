package semana2;

import java.math.BigInteger;
import java.util.Scanner;

class LacoRepeticao {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int fator = 0;
        BigInteger resultado = BigInteger.ONE;
        System.out.println("Digite um numero");
        fator = value.nextInt();
        for (int i = fator; i > 1; --i) {
            resultado = resultado.multiply(BigInteger.valueOf(i));
            System.out.println("O resultado é: " + resultado + "" + "Fator é:" + fator);
        }
        value.close();
    }
}

class exercicio1 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Me informe um numero: ");
        int num1 = value.nextInt();
        for (int i = 0; i <= num1; i++) {
            if (i % 2 == 0) {
                System.out.println("todos os numeros pares" + " " + i);
            }

        }
        value.close();
    }
}

class exercicio2 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Me informe um numero: ");
        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println("todos os numeros multiplos de 5" + " " + i);
            }
        }
        value.close();

    }
}