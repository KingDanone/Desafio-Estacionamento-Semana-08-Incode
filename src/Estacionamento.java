package semana07.desafio.estacionamento;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
    List<Ticket> listaDeTicket;

    public Estacionamento() {
        listaDeTicket = new ArrayList<>();
    }

    public void listarTicket() {
        if (listaDeTicket.isEmpty()) {
            System.out.println("!Você não tem Tickets cadastrados!".toUpperCase());
            return;
        }
        for (Ticket ticket : listaDeTicket) {
            System.out.println("Ticket: " + ticket);
        }
    }

    public void pagarTicket(int indice) {
        if (listaDeTicket.isEmpty()) {
            System.out.println("!VOCÊ NÃO TEM TICKETS CADASTRADOS!");
            return;
        }
        if (indice >= 1 && indice <= listaDeTicket.size()) {
            listaDeTicket.get(indice - 1).setStatus(true);
            System.out.println("Pagamento efetuado com sucesso!");
        } else {
            System.out.println("Número inválido de ticket.");
        }
    }

    public void consultarSaldo() {
        double saldo = 0.0;
        for (Ticket t : listaDeTicket) {
            if (t.isStatus()) {
                saldo += t.getPrecoFixo();
            }
        }
        System.out.printf("Saldo atual: R$%.2f%n", saldo);
    }
}