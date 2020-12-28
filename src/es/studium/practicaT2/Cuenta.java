package es.studium.practicaT2;

public class Cuenta {

	// instancio variables de la clase
	private int id;
	private int saldo;
	private Cliente cliente;
	
	// creo los constructores
	public Cuenta(int id, int saldo, Cliente cliente) {
		this.id = id;
		this.saldo = saldo;
		this.cliente = cliente;
	}
	public Cuenta() {
		this.id = 0;
		this.saldo = 0;
		this.cliente = new Cliente();
	}
	
	
	// creo los "getters y setters" por cada variable
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}

