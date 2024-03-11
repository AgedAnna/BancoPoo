public class Conta {
    private String numero;
    private double saldo;
    private String nomeCliente;

    public Conta(String numero, String nomeCliente, double saldoInicial) {
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
        }
    }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }
    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }
    public String getNomeCliente() { return nomeCliente; }
    public void setNomeCliente(String nomeCliente) { this.nomeCliente = nomeCliente; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Conta conta = (Conta) obj;
        return numero.equals(conta.numero);
    }
}
