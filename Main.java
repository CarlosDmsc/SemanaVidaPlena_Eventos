// Main

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciadorEventos g = new GerenciadorEventos();
        int opcao;

        do {
            System.out.println("\n==== MENU ====");
            System.out.println("1 - Cadastrar Evento");
            System.out.println("2 - Listar Eventos");
            System.out.println("3 - Cadastrar Participante e Inscrever");
            System.out.println("4 - Mostrar Evento mais Cheio");
            System.out.println("5 - Listar Eventos por Lotação");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            while (!sc.hasNextInt()) {
                System.out.print("Digite um número válido: ");
                sc.next();
            }
            opcao = sc.nextInt();
            sc.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();

                    // opções fixas de tipo
                    String tipo;
                    do {
                        System.out.print("Tipo (Palestra/Oficina/Show): ");
                        tipo = sc.nextLine();
                    } while (!tipo.equalsIgnoreCase("Palestra") &&
                             !tipo.equalsIgnoreCase("Oficina") &&
                             !tipo.equalsIgnoreCase("Show"));

                    System.out.print("Data (ex: 20/09/2024): ");
                    String data = sc.nextLine();

                    System.out.print("Capacidade: ");
                    int cap = sc.nextInt();
                    sc.nextLine();

                    g.adicionarEvento(new Evento(titulo, tipo, data, cap));
                    System.out.println("Evento cadastrado!");
                    break;

                case 2:
                    g.listarEventos();
                    break;

                case 3:
                    System.out.print("Nome do participante: ");
                    String nome = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    Participante p = new Participante(nome, email);

                    System.out.print("Título do evento para inscrição: ");
                    String tEvento = sc.nextLine();
                    Evento e = g.buscarEventoPorTitulo(tEvento);

                    if (e != null && e.inscrever(p)) {
                        System.out.println("Inscrição realizada!");
                    } else {
                        System.out.println("Evento não encontrado ou sem vagas/duplicado.");
                    }
                    break;

                case 4:
                    Evento cheio = g.eventoMaisCheio();
                    if (cheio != null) {
                        System.out.println("Evento mais cheio: " + cheio.getTitulo() +
                                           " (" + cheio.totalInscritos() + " inscritos)");
                    } else {
                        System.out.println("Nenhum evento cadastrado.");
                    }
                    break;

                case 5:
                    System.out.println("Eventos ordenados por número de inscritos:");
                    g.listarPorLotacao();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        sc.close();
    }
}
