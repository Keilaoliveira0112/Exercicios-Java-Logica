package condicionais.exercicios;
import java.util.Scanner;
public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println(num + " é par.");
        }else {
            System.out.println(num + " é ímpar.");
        }

        sc.close();
    }
}
