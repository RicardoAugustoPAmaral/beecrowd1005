import java.util.Scanner;

public class Beecrowd1005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double peso1 = 3.5;
        double peso2 = 7.5;

        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();

        double media = ((nota1 * peso1) + (nota2 * peso2)) / (peso1 + peso2);
        System.out.printf("MEDIA = %.5f%n", media);
    }
}
