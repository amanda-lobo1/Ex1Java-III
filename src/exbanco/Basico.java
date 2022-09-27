package exbanco;

import java.sql.SQLOutput;

public class Basico implements ConsultaDeSaldo, PagamentoDeServicos, SaqueEmDinheiro{

    @Override
    public void consultarSaldo() {
        System.out.println("Processando Consulta de Saldo...");
    }

    @Override
    public void pagarServicos() {
        System.out.println("Processando pagamento...");
    }

    @Override
    public void sacar() {
        System.out.println("Processando Saque de Dinheiro ... ");
    }

    @Override
    public void transacaoOk() {
        System.out.println("Transação Aprovada!");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Transação Não Aprovada!");
    }
}
