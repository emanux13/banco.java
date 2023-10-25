public abstract class Conta implements Iconta{
    private double valorsaque, deposito;
    public Conta(double valorsaque, double deposito){
        this.valorsaque = valorsaque;
        this.deposito = deposito;
    }
    public Conta(double deposito){
        this.deposito = deposito;
    }
    public double getValorsaque(){
        return valorsaque;
    }
    public double getDeposito(){
       return deposito;
    }

 @Override
 public abstract double sacar();

 public abstract double sacar(double desconto);

 @Override
 public abstract double depositar();






}
