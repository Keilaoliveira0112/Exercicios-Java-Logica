package condicionais.exercicios;
import java.util.Scanner;

/* Exercicio para consolidar os conceitos de laços de repetição. Desafio prático: notas e média até digitar -1*/

    public class MediaNotas {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int contador = 0;
            double soma = 0;
            double nota;

            while (true) {
                System.out.println("Digite uma nota (-1 para sair): ");
                nota = sc.nextDouble();

                if (nota == -1) {
                    break;
                }

                soma += nota;
                contador++;
            }

            if (contador > 0) {
                double media = soma / contador;
                System.out.println("Média das notas: " + media);
            } else {
                System.out.println("Nenhuma nota foi digitada.");
            }

            sc.close();
        }
    }
