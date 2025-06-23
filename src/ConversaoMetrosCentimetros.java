import java.util.Scanner;

public class ConversaoMetrosCentimetros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor em metros: ");
        double metros = sc.nextDouble();

        double centimetros = metros * 100;

        System.out.println(metros + " metros equivalem a " + centimetros + " centímetros.");

        sc.close();
    }


}
