import java.util.ArrayList;

public class Banco {
    private ArrayList<Conta> contas = new ArrayList<>();

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void removerConta(Conta conta) {
        contas.remove(conta);
    }

    public Conta buscarContaPorNumero(String numeroConta) throws Exception {
        for (Conta conta : contas) {
            if (conta.getNumero().equals(numeroConta)) {
                return conta;
            }
        }
        throw new Exception("ContaNaoEncontradaException");
    }

    public Conta buscarConta(Conta c) throws Exception {
        int index = contas.indexOf(c);
        if (index != -1) {
            return contas.get(index);
        }
        throw new Exception("ContaNaoEncontradaException");
    }
}
