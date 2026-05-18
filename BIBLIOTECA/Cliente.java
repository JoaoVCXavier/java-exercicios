public class Cliente{
    int nome;
    int cpf;
    double saldo;
    static void sacar(double valorSaque,double saldo){
      saldo = saldo - valorSaque;
      System.out.print("seu saldo é de: "+ saldo);
}
  }