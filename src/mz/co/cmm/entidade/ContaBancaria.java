package mz.co.cmm.entidade;


public class ContaBancaria {

	public int numeroConta;
	public	double saldo;
	public String titularDaConta;

		

	
	public ContaBancaria() {
		
	}
	
  public ContaBancaria(double saldo) {
	  
	  this.saldo = saldo;
	  
  }
 
  
  
	public String toString() {
		return "Dados da Conta: Conta numero "+numeroConta+", a "+titularDaConta+", saldo disponivel "+getSaldo();
		
	}
  
  public void depositar(double deposito) {
	  
	  saldo +=deposito;
  }
  
  public void levantar(double levantamento ) {
	  
	  saldo -=levantamento;
	  descontaTarifa();
  }
  
  
  
  public double getSaldo() {
	  return saldo;
	  
  }
  
  private void descontaTarifa() {
	
	  this.saldo -= 0.2;
}
  
  

}
