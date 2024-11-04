import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalRespostas = 0;
        int contOtimo = 0;
        int contBom = 0;
        int contRuim = 0;

        while (true) {
            System.out.println("Digite sua opinião sobre o filme:");
            System.out.println("1 - Ótimo");
            System.out.println("2 - Bom");
            System.out.println("3 - Ruim");
            int resposta = scanner.nextInt();

            switch (resposta) {
                case 1:
                    contOtimo++;
                    break;
                case 2:
                    contBom++;
                    break;
                case 3:
                    contRuim++;
                    break;
                default:
                    System.out.println("Resposta inválida. Digite 1, 2 ou 3.");
                    continue;
            }

            totalRespostas++;

            System.out.print("Deseja continuar? (S/N): ");
            char continuar = scanner.next().charAt(0);
            if (continuar == 'N' || continuar == 'n') {
                break;
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Total de respostas: " + totalRespostas);
        if (totalRespostas > 0) {
            double porcentagemOtimo = (contOtimo / (double) totalRespostas) * 100;
            double porcentagemBom = (contBom / (double) totalRespostas) * 100;
            double porcentagemRuim = (contRuim / (double) totalRespostas) * 100;

            System.out.println("Ótimo: " + contOtimo + " (" + String.format("%.2f", porcentagemOtimo) + "%)");
            System.out.println("Bom: " + contBom + " (" + String.format("%.2f", porcentagemBom) + "%)");
            System.out.println("Ruim: " + contRuim + " (" + String.format("%.2f", porcentagemRuim) + "%)");

            double mediaNotas = (contOtimo * 1 + contBom * 2 + contRuim * 3) / (double) totalRespostas;
            System.out.println("Média das notas: " + String.format("%.2f", mediaNotas));
        } else {
            System.out.println("Nenhuma resposta foi registrada.");
        }
    }
}
