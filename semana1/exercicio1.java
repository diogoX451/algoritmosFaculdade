package semana1;

import javax.swing.JOptionPane;

class exercicios {
    public static void main(String[] args) {
        double dinheiro = 10000;

        if (dinheiro >= 10000) {
            System.out.println("Voce vai para disney");
        } else {
            System.out.println("Você não vai para disney");
        }

    }
}

class primoPar {
    public static void main(String[] args) {
        int numero = 3;

        if (numero % 2 == 0) {
            System.out.println("O Numero é par");
        } else {
            System.out.println("O numero e impar");
        }
    }
}

class teste {
    public static void main(String[] args) {
        String value = JOptionPane.showInputDialog("Digite um numero");
        int numero = Integer.parseInt(value);
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O numero é par");
        } else {
            JOptionPane.showMessageDialog(null, "O numero e impar");
        }
    }

}
