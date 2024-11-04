import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("Digite 10 números:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }

        while (true) {
            System.out.println("""
Escolha uma opção:
1 - Quantos números pares?
2 - Quantos números ímpares?
3 - Quantos negativos?
4 - Quantos positivos?
5 - Sair do programa
""");

            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Números pares: " + contarPares(numeros));
                    break;
                case 2:
                    System.out.println("Números ímpares: " + contarImpares(numeros));
                    break;
                case 3:
                    System.out.println("Números negativos: " + contarNegativos(numeros));
                    break;
                case 4:
                    System.out.println("Números positivos: " + contarPositivos(numeros));
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static int contarPares(int[] numeros) {
        int contador = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }

    public static int contarImpares(int[] numeros) {
        int contador = 0;
        for (int numero : numeros) {
            if (numero % 2 != 0) {
                contador++;
            }
        }
        return contador;
    }

    public static int contarNegativos(int[] numeros) {
        int contador = 0;
        for (int numero : numeros) {
            if (numero < 0) {
                contador++;
            }
        }
        return contador;
    }

    public static int contarPositivos(int[] numeros) {
        int contador = 0;
        for (int numero : numeros) {
            if (numero > 0) {
                contador++;
            }
        }
        return contador;
    }

}
