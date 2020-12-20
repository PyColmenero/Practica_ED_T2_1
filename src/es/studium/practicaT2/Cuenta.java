package es.studium.practicaT2;

public class Cuenta {

	int saldo;
	Cliente cliente;
	
	
	public Cuenta(int i, int j, Cliente antonio) {
	
		this.cliente = antonio;
		
	}

	
	public Cliente getCliente() {
		return this.cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

}
