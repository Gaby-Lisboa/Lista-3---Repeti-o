
import java.util.Scanner;

public class Exercicio07 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String[] nomes = new String[6];
            double[] pesos = new double[6];
            double[] alturas = new double[6];

            for (int i = 0; i < 6; i++) {
                System.out.print("Digite o nome da " + (i + 1) + "° pessoa: ");
                nomes[i] = scanner.nextLine();
                System.out.print("Digite a altura da " + (i + 1) + "° pessoa (em metros): ");
                alturas[i] = scanner.nextDouble();
                System.out.print("Digite o peso da " + (i + 1) + "° pessoa (em kg): ");
                pesos[i] = scanner.nextDouble();
                scanner.nextLine();
            }

            int indiceMaisPesado = 0;
            int indiceMaisAlto = 0;

            for (int i = 1; i < 6; i++) {
                if (pesos[i] > pesos[indiceMaisPesado]) {
                    indiceMaisPesado = i;
                }
                if (alturas[i] > alturas[indiceMaisAlto]) {
                    indiceMaisAlto = i;
                }
            }

            System.out.println("Pessoa mais pesada: " + nomes[indiceMaisPesado] + " com " + pesos[indiceMaisPesado] + " kg");
            System.out.println("Pessoa mais alta: " + nomes[indiceMaisAlto] + " com " + alturas[indiceMaisAlto] + " metros");

            scanner.close();
        }
    }

