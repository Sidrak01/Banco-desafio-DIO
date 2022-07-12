
public abstract class Conta implements IConta {
	
	private static final int ANGENCIA_PADRAO = 1;
	
	private static int SEQUENCIAL = 1;
	

	protected int conta;
	protected int numero;
	protected double saldo;

	public Object agencia;

	public Object imprimirInfoComum;

	public Conta() {
	this.agencia = Conta.ANGENCIA_PADRAO;
	this.numero = SEQUENCIAL++;
	}

	
	public void sacar(){
	
}
	
	public void depositar() {
		
	}
	
	public void transfrerir() {
		
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
		
	}

	@Override
	public void transfrerir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}


	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		
	}


	protected abstract void imprimirInfoComum();
}


