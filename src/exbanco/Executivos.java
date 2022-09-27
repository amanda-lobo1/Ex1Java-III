package exbanco;

public class Executivos implements Deposito, Transferencia{
    @Override
    public void depositar() {
        System.out.println("Processando Depósito...");
    }

    @Override
    public void transacaoOk() {
        System.out.println("Transação Aprovada!");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Transação Não Aprovada!");
    }

    @Override
    public void transferir() {
        System.out.println("Processando Transferência...");
    }
}
