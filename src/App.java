public class App {
    public static void main(String[] args) throws Exception {
        try{
          Pessoa p1 = new Pessoa("Anildo pinto", 7676728);
          Corrente corre = new Corrente(88, 0);
          
          
          if(corre.getValorsaque()>corre.saldo){

           throw new SaldoException("Error: saldo insuficiente");

          }else{
           corre.saldo = corre.saldo - corre.sacar(88);
          }
           System.out.println("nome"+ p1.nome);
           System.out.println("Saldo atual:"+corre.saldo);




        }catch(SaldoException e){
            e.getMessage();
        }


        // try {
        //     Poupanca guarda = new Poupanca(50);
        //     if(guarda.depositar()>0){
        //         guarda.saldo = guarda.saldo + guarda.depositar();
        //     }else{}
            
        // } catch(Exception e) {
            
        // }







    }
}
