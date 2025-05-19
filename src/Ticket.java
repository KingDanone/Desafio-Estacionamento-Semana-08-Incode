package semana07.desafio.estacionamento;

public class Ticket {
    private int numeroDoTicket;
    private double precoFixo;
    private boolean status;

    public Ticket() {
        this.precoFixo = 5.0;
        this.status = false;
    }

    private static int calcId = 1;

    public void criarTicket() {
        numeroDoTicket = calcId++;
        imprimirTicket();
    }

    private void imprimirTicket() {
        System.out.println("======================");
        System.out.println("Numero do ticket: " + numeroDoTicket);
        System.out.println("Valor do ticket: " + precoFixo);
        if (status) {
            System.out.println("[x] - PAGO");
        } else {
            System.out.println("[ ] - PENDENTE");
        }
        System.out.println("======================");
    }

    @Override
    public String toString() {
        String statusTexto = status ? "[X] Pago" : "[ ] Pendente";
        return String.format(
                "=== Ticket #%d ===%n" +
                        "Valor : R$ %.2f%n" +
                        "Status: %s%n",
                numeroDoTicket, precoFixo, statusTexto
        );
    }


    public int getNumeroDoTicket() {
        return numeroDoTicket;
    }

    public void setNumeroDoTicket(int numeroDoTicket) {
        this.numeroDoTicket = numeroDoTicket;
    }

    public double getPrecoFixo() {
        return precoFixo;
    }

    public void setPrecoFixo(double precoFixo) {
        this.precoFixo = precoFixo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}