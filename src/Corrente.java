public class Corrente extends Conta {
    public Corrente(double valorsaque, double deposito) {
        super(valorsaque, deposito);
    }

    @Override
    public double sacar() {
       
        return getValorsaque();
    }

    @Override
    public double sacar(double desconto) {
       
        return getValorsaque() * (1 - desconto);
    }

    @Override
    public double depositar() {
       
        return getDeposito();
    }
}