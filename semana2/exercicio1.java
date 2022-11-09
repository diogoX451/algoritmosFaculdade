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

class venda {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int d;
        int totc = 0;
        int totv = 0;

        for (int i = 1; i <= 40; i++) {
            System.out.print("informe o valor de custo do produto: ");
            int c = entrada.nextInt();
            System.out.println("Informe o valor de venda: ");
            int v = entrada.nextInt();

            d = v - c;

            if (d == 0) {
                System.out.println("houve empate ");
            } else if (d > 0) {
                System.out.println("houve lucro ");
            } else if (d < 0) {
                System.out.println("houve prejuizo ");
            }

            totc = totc + c;
            totv = totv + v;
        }
        System.out.println("a media de custo foi: " + (totc / 40));
        System.out.println("a media de venda foi: " + (totv / 40));

        entrada.close();
    }
}
// ___________________________________________________________________

class numeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int maior = 0;
        int menor = 999;

        for (int i = 1; i <= 20; i++) {
            System.out.println("informe um numero: ");
            int n = entrada.nextInt();

            if (n > maior) {
                maior = n;
            } else if (n < menor) {
                menor = n;
            }

        }
        System.out.println("o maior numero e: " + maior);
        System.out.println("o menor numero foi: " + menor);
        entrada.close();
    }
}
// ______________________________________________________________________

class conversao {
    public static void main(String[] args) {
        System.out.println("TABELA DE CONVERSAO DE CM PRA POL: ");
        for (int cent = 1; cent <= 20; cent++) {
            System.out.println(cent + "Cm = " + (cent * 2.54) + "Pol");
        }
    }
}
// ______________________________________________________________________

class altura {
    public static void main(String[] args) {
        double altA = 1.50;
        double altF = 1.10;
        int x = 0;

        while (altA >= altF) {
            altA = altA + 0.02;
            altF = altF + 0.03;
            System.out.println("Demorou entorno de " + x + " anos");
            x++;

        }
    }
}
// _________________________________________________________________________

class primo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i = 1;
        int resto = 0;

        System.out.println("informe o numero: ");
        int n = entrada.nextInt();

        while (i <= n) {
            if (n % i == 0) {
                resto++;
            } else if (resto == 2) {
                System.out.println("nao primo");
            } else {
                System.out.println(" é primo");
            }
            i = i + 1;
        }

        entrada.close();

    }
}