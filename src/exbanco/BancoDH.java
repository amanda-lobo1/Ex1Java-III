package exbanco;

public class BancoDH {
    public static void main(String[] args) {

        Executivos executivos = new Executivos();
        System.out.println("Cliente Executivo: ");
        executivos.depositar();
        executivos.transferir();
        executivos.transacaoOk();

        Basico basico = new Basico();
        System.out.println("\nCliente Basico: ");
        basico.consultarSaldo();
        basico.pagarServicos();
        basico.sacar();
        basico.transacaoNaoOk();

        Cobradores cobradores = new Cobradores();
        System.out.println("\nCliente Cobrador: ");
        cobradores.consultarSaldo();
        cobradores.sacar();
        cobradores.transacaoOk();
    }
}
