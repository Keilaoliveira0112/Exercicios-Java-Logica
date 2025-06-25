package condicionais.exercicios;

import java.util.Scanner;

/* Exercicio para consolidar os conceitos de laços de repetição. Somar números até que o usuário digite zero (usando while)*/
public class SomaAteZero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int num;

        do{
            System.out.print("Digite um número (0 para parar): ");
            num = sc.nextInt();
            soma += num;
        } while ( num != 0);

        System.out.println("Soma total: " + soma);
        sc.close();

    }

}
