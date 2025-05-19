package semana07.desafio.estacionamento;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean controllWhile = false;
        Estacionamento gerenciar = new Estacionamento();

        while (!controllWhile) {
            System.out.print("\n 1 - Criar Ticket\n " +
                    "2 - Ver seus Tickets\n" +
                    " 3 - Pagar Ticket\n" +
                    " 4 - Consultar Saldo\n" +
                    " 5 - Sair\n" +
                    "Sua escolha: ");

            int selecao = input.nextInt();
            input.nextLine();
            switch (selecao) {
                case 1:
                    Ticket ticket = new Ticket();
                    ticket.criarTicket();
                    gerenciar.listaDeTicket.add(ticket);
                    break;
                case 2:
                    gerenciar.listarTicket();
                    break;
                case 3:
                    System.out.println("Digite o número do ticket para ser pago.");
                    int indice = input.nextInt();
                    input.nextLine();
                    gerenciar.pagarTicket(indice);
                    break;
                case 4:
                    gerenciar.consultarSaldo();
                    break;
                case 5:
                    System.out.println("Obrigado por usar nossos serviços! ;)".toUpperCase());
                    controllWhile = true;
                    break;
                default:
                    System.out.println("!Opção Inválida!");
                    break;
            }
        }
        input.close();
    }
}