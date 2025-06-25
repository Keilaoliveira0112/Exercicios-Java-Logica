package condicionais.exercicios;

import java.util.Scanner;

/* Exercicios para consolidar os conceitos de condicionais. Menu de opções usando switch*/
public class MenuSwitch {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Menu:");
            System.out.println("1 - Dizer Olá");
            System.out.println("2 - Mostrar data");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.print("Olá!");
                    break;
                case 2:
                    System.out.print("Hojé é 25 de 2025 de junho.");
                    break;
                case 3:
                    System.out.print("Saindo...");
                    break;
                default:;
                    System.out.println("Opção inválida!");
            }

            sc.close();
        }

}
