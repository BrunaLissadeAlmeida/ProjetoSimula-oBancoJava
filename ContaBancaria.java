public class ContaBancaria {
    private String nomeCliente;
    private String numeroAgencia;
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String nomeCliente, String numeroAgencia, String numeroConta, double saldoInicial) {
        this.nomeCliente = nomeCliente;
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }
    public void exibirInformacoes() {
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Número da Agência: " + numeroAgencia);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Saldo: R$" + saldo);
    }
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Mario Andrade", "067-8", "1021", 237.48);

        conta.exibirInformacoes();

        conta.depositar(1000.0);

        conta.sacar(500.0);

        conta.exibirInformacoes();
    }
}
