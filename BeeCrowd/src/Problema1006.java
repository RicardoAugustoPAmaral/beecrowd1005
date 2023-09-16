import java.util.Scanner;

public class Problema1006 {

    public static void main(String[] args) {


        Scanner sc =new Scanner(System.in);
        double A =sc.nextDouble();
        double B =sc.nextDouble();
        double C =sc.nextDouble();
        double media=((A*2)+(B*3)+(C*5))/10;
        System.out.printf("MEDIA = %.1f",media);

/*
*       Scanner sc =new Scanner(System.in);
*       double nota1,nota2,nota3,peso1,peso2,peso3,media;
*
*       peso1=2;
*       peso2=3;
*       peso3=5;
*
        nota1 =sc.nextDouble();
        nota2=sc.nextDouble();
        nota3 =sc.nextDouble();
        double media=((nota1*peso1)+(nota2*peso2)+(nota3*peso3))/(peso1+peso2+peso3);
        System.out.printf("MEDIA = %.1f",media);
* */
    }


}
