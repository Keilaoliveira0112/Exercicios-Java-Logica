package br.com.keila.exercicios;

import java.util.Scanner;

public class SequenciaNumeros {
    public static void main(String[] args) {  // 🔥 O método principal estava faltando!
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número: ");
        int n = sc.nextInt();

        System.out.println("Sequência de 1 até " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
