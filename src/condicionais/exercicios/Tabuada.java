package condicionais.exercicios;

import java.util.Scanner;

/* Exercicios para consoidar conceitos de laços de repetições. Tabuada usando for */

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        sc.close();



    }
}
