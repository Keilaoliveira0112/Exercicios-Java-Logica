package br.com.keila.exercicios;

import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double nota1, nota2, nota3, media;

        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        nota3 = sc.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Sua média é: %.2f%n", media);

        if (media >= 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado.");
        }

        sc.close();
    }
}
