package condicionais.exercicios;
import java.util.Scanner;

/* Exercicio para consolidar conceitos de condicionais. Verificar se a pessoa é maior de Idade*/
public class MaiorIdade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.print ("Maior de idade.");
        }else{
            System.out.print("Menor de idade");
        }

            sc.close();

    }
}
