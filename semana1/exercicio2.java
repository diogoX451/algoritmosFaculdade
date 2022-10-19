package semana1;

import javax.swing.JOptionPane;

class exercicio1 {
    public static void main(String[] args) {
        int number = 1;
        int number1 = 2;
        if (number < number1) {
            System.out.println(" O numero " + number + " E menor que " + number1);
        } else if (number > number1) {
            System.out.println(" O numero " + number + " E maior que " + number1);
        } else if (number == number1) {
            System.out.println(" O numero " + number + " E igual o " + number1);
        }
    }
}

class exercicio2 {
    public static void main(String[] args) {
        String value = JOptionPane.showInputDialog("Digite seu nome: ");
        String nota1 = JOptionPane.showInputDialog("Digite nota 1");
        String nota2 = JOptionPane.showInputDialog("Digite nota 2");
        String nota3 = JOptionPane.showInputDialog("Digite nota 3");
        int n1 = Integer.parseInt(nota1);
        int n2 = Integer.parseInt(nota2);
        int n3 = Integer.parseInt(nota3);
        var media = (n1 + n2 + n3) / 3;
        if (media >= 7) {
            JOptionPane.showMessageDialog(null,
                    "Aluno: " + value + " sua media foi: " + media + " e esta aprovado");
        } else if (media <= 5) {
            JOptionPane.showMessageDialog(null,
                    "Aluno: " + value + " sua media foi: " + media + " e esta reprovado");
        } else if (media >= 5.1 && media <= 6.9) {
            JOptionPane.showMessageDialog(null,
                    "Aluno: " + value + " sua media foi: " + media + " e esta de recuperação");
        }
    }
}

class exercicio3 {
    public static void main(String[] args) {
        String value = JOptionPane.showInputDialog("Digite um numer");
        int number = Integer.parseInt(value);
        switch (number) {
            case 1:
                JOptionPane.showMessageDialog(null, "Um");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Dois");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Tres");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Quatro");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Cinco");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Não temos este numero por extenso");
                break;
        }
    }
}

class desafio {
    public static void main(String[] args) {
        String A = JOptionPane.showInputDialog("Digite um numero");
        String B = JOptionPane.showInputDialog("Digite um numero");
        int number1 = Integer.parseInt(A);
        int number2 = Integer.parseInt(B);
        String C = JOptionPane.showInputDialog("Escolhe entre 1 = soma, 2 = subtração, 3 = multiplicação, 4 = divisão");
        int number3 = Integer.parseInt(C);
        switch (number3) {
            case 1:
                var result = number1 + number2;
                JOptionPane.showMessageDialog(null, "O resultado da soma é: " + result);
                break;
            case 2:
                var result2 = number1 + number2;
                JOptionPane.showMessageDialog(null, "O resultado da subtração é: " + result2);
                break;
            case 3:
                var result3 = number1 * number2;
                JOptionPane.showMessageDialog(null, "O resultado da multiplicação é: " + result3);
                break;
            case 4:
                var result4 = number1 / number2;
                if (number1 == 0 || number2 == 0) {
                    JOptionPane.showMessageDialog(null, "Não é possivel dividir por zero");
                } else {
                    JOptionPane.showMessageDialog(null, "O resultado da divisão é: " + result4);
                }
                break;
        }

    }
}