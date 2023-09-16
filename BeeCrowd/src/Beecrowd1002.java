import java.util.Scanner;

public class Beecrowd1002 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n = 3.14159;
        double raio = sc.nextDouble();

        double A = n*(raio*raio);
        System.out.printf("A=%2.4f%n", A);
    }
}
