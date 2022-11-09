package semana3;

import java.util.Scanner;

public class semana4 {
    public static void main(String[] args) {
        int myArray[] = new int[10];
        myArray[1] = 10;
        myArray[3] = 40;
        System.out.println(myArray[1]);
        // ================================
        int myInt[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int i : myInt) {
            System.out.println(i);
        }
    }
}

class vetores {
    public static void main(String[] args) {
        int myArray[];
        byte tamanho;
        int soma = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        tamanho = input.nextByte();
        myArray = new int[tamanho];
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Digite o valor da posição " + i + ": ");
            myArray[i] = input.nextInt();
            soma += myArray[i];
        }
        input.close();
    }
}

class vetor {
    public static void main(String[] args) {
        int myArray[] = new int[10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i;
            System.out.println(myArray[i]);
        }
    }
}

class vetor2 {
    public static void main(String[] args) {
        int myArray[] = new int[3];
        int myArray2[] = new int[3];
        int myArray3[] = new int[3];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i;
            myArray2[i] = i;
            myArray3[i] = myArray[i] + myArray2[i];
            if (myArray3[i] % 2 == 0) {
                System.out.println(myArray3[i]);
            }
        }

    }
}