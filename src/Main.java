import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double nota1, nota2, nota3, nota4;


        Scanner scanner = new Scanner(System.in);
        System.out.println("calculando a média ");

        System.out.println("qual a primeira nota?");
        nota1 = scanner.nextDouble();
        System.out.println("qual a segunda nota?");
        nota2 = scanner.nextDouble();
        System.out.println("qual a terceira nota?");
        nota3 = scanner.nextDouble();
        System.out.println("qual a quarta nota?");
        nota4 = scanner.nextDouble();
        System.out.println("gerando media");

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            System.out.println("Sua média foi: " + media + " Parabéns, você foi aprovado");
        } else if (media >= 5 && media < 7) {

            System.out.println("Sua média foi: " + media + " Foi quase! infelizmente você está de recuperação");

        } else if (media < 5) {
            System.out.println("Sua média foi: " + media + " Infelizmente você reprovou");
        }
    }
}
