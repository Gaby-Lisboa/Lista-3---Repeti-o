import java.util.Scanner;
public class Exercicio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPessoas = 10;
        int contIdadeAcima50 = 0;
        int contAlturaAcima160 = 0;
        int contPesoAbaixo80 = 0;

        for (int i = 0; i < totalPessoas; i++) {
            System.out.println("Pessoa " + (i + 1) + ":");
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            System.out.print("Altura (em metros): ");
            double altura = scanner.nextDouble();
            System.out.print("Peso (em kg): ");
            double peso = scanner.nextDouble();

            if (idade > 50) {
                contIdadeAcima50++;
            }
            if (altura > 1.60) {
                contAlturaAcima160++;
            }
            if (peso < 80) {
                contPesoAbaixo80++;
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Pessoas com idade acima de 50 anos: " + contIdadeAcima50);
        System.out.println("Pessoas com altura acima de 1.60m: " + contAlturaAcima160);
        System.out.println("Pessoas com peso abaixo de 80kg: " + contPesoAbaixo80);
    }
}
