
public interface IConta {
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transfrerir(double valor, Conta contaDestino);

	void imprimirExtrato();
}
			
	
