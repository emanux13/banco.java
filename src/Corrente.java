public class Corrente extends Conta {
    public double saldo=10000;
    public Corrente(double valorsaque, double deposito) {
        super(valorsaque, deposito);
    }

    @Override
    public double sacar() {
       
        return getValorsaque()- 2;
    }

    @Override
    public double sacar(double desconto) {
       
        return getValorsaque();
    }

    @Override
    public double depositar() {
       
        return getDeposito();
    }
}