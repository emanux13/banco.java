public class Poupanca extends Conta {
  public double saldo=10000;
        public Poupanca(double deposito) {
            super(deposito);
            //TODO Auto-generated constructor stub
        }
    
        @Override
        public double sacar() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'sacar'");
        }
    
        @Override
        public double sacar(double desconto) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'sacar'");
        }
    
        @Override
        public double depositar() {
            return getDeposito() + saldo;
         
        }
        
    }

