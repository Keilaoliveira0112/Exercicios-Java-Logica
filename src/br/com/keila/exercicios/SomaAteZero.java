package br.com.keila.exercicios;

import java.util.Scanner;
public class SomaAteZero {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int soma = 0;
        int numero;

        do {
            System.out.print("Digite um número (0 para sair): ");
            numero = sc.nextInt();
            soma += numero;
        } while (numero != 0);

        System.out.println("A soma total é: " + soma);

        sc.close();

    }
}
