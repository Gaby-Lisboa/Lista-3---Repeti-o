import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int saldoPositivo = 0;
        int saldoNegativo = 0;
        int totalPessoas = 0;

        while (true) {
            System.out.print("Digite o saldo da pessoa: ");
            double saldo = scanner.nextDouble();
            totalPessoas++;

            if (saldo >= 0) {
                saldoPositivo++;
            } else {
                saldoNegativo++;
            }

            System.out.print("Deseja continuar informando saldos? (S/N): ");
            char continuar = scanner.next().charAt(0);
            if (continuar == 'N' || continuar == 'n') {
                break;
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Total de pessoas: " + totalPessoas);
        System.out.println("Total de pessoas com saldos positivos: " + saldoPositivo);
        System.out.println("Total de pessoas com saldos negativos: " + saldoNegativo);

        if (totalPessoas > 0 && (saldoPositivo * 100.0 / totalPessoas) >= 50) {
            System.out.println("Nenhum risco!");
        } else {
            System.out.println("Risco ao banco!");
        }
    }
}
