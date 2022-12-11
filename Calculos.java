import java.util.Scanner;
public class Calculos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("EXERCÍCIO 11");
        System.out.println("Digite um número inteiro");
        int inteiro1 = Integer.parseInt(scanner.next());
        System.out.println("Digite outro número inteiro");
        int inteiro2 = Integer.parseInt(scanner.next());
        System.out.println("Digite um número real");
        double real = Double.parseDouble(scanner.next());
        int a = (inteiro1*2)*(inteiro2/2);
        double b = 3*inteiro1+real;
        double c = real*real*real;
        System.out.println("A: "+a);
        System.out.println("B: "+b);
        System.out.println("C: "+c);
        System.out.println("=====================================");
    }
}
