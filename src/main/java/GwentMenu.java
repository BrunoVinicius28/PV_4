import java.util.ArrayList;
import java.util.Scanner;

public class GwentMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Carta> deck = new ArrayList<>();

        int opcao = 0;
        do {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Adicionar uma carta ao deck");
            System.out.println("2 - Mostrar as informações do deck e suas cartas");
            System.out.println("3 - Mostrar o poder total do deck e sua média aritmética");
            System.out.println("4 - Calcular quantos soldados, arqueiros e pesados há no deck");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();
            sc.nextLine(); // consome a quebra de linha pendente

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome da carta: ");
                    String nomeCarta = sc.nextLine();
                    System.out.print("Digite o tipo da carta (1 - Soldado, 2 - Arqueiro, 3 - Pesado): ");
                    int tipoCarta = sc.nextInt();
                    System.out.print("Digite o poder da carta: ");
                    int poderCarta = sc.nextInt();
                    sc.nextLine(); // consome a quebra de linha pendente
                    deck.add(new Carta(nomeCarta, tipoCarta, poderCarta));
                    System.out.println("Carta adicionada ao deck!");
                    break;

                case 2:
                    System.out.println("Deck atual:");
                    for (Carta carta : deck) {
                        System.out.println(carta);
                    }
                    break;

                case 3:
                    int poderTotal = 0;
                    for (Carta carta : deck) {
                        poderTotal += carta.getPoder();
                    }
                    double mediaAritmetica = (double) poderTotal / deck.size();
                    System.out.printf("Poder total do deck: %d\n", poderTotal);
                    System.out.printf("Média aritmética do poder do deck: %.2f\n", mediaAritmetica);
                    break;

                case 4:
                    int numSoldados = 0;
                    int numArqueiros = 0;
                    int numPesados = 0;
                    for (Carta carta : deck) {
                        switch (carta.getTipo()) {
                            case 1:
                                numSoldados++;
                                break;
                            case 2:
                                numArqueiros++;
                                break;
                            case 3:
                                numPesados++;
                                break;
                        }
                    }
                    System.out.printf("Quantidade de soldados no deck: %d\n", numSoldados);
                    System.out.printf("Quantidade de arqueiros no deck: %d\n", numArqueiros);
                    System.out.printf("Quantidade de pesados no deck: %d\n", numPesados);
                    break;

                case 0:
                    System.out.println("Encerrando programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);

        sc.close();
    }
}