package es.studium.practicaT2;

public class TestBanco {
	public static void main(String[] args) {
		/* Antonio y Beatriz se hacen cliente del banco */
		Cliente antonio = new Cliente("123456789Z", "Antonio Alonso", "Av. Pueblo Saharaui, s/n");
		Cliente beatriz = new Cliente("987654321A", "Beatriz Benítez", "Calle Sol, 4");
 
		/* Por defecto, todas las cuentas nuevas tienen 100€ */
		Cuenta cuentaAntonio = new Cuenta(48151, 100, antonio);
		Cuenta cuentaBeatriz = new Cuenta(62342, 100, beatriz);
 
		/* Antonio y Beatriz consultan el saldo */
		muestra_saldo(cuentaAntonio);
		muestra_saldo(cuentaBeatriz);
 
		/* Beatriz transfiere 50€ a Antonio */
		transferencia(cuentaBeatriz, cuentaAntonio, 50);
 
		/* Antonio y Beatriz vuelven a consultar para comprobar que todo ha ido bien */
		muestra_saldo(cuentaAntonio);
		muestra_saldo(cuentaBeatriz);
 
		/* Antonio gana 100€ en una rifa y hace un ingreso en su cuenta */
		cambio_saldo(cuentaAntonio, 100);
 
		/* Beatriz tiene que pagar 30€ a hacienda y retira el dinero */
		cambio_saldo(cuentaBeatriz, -30);
 
		/* Antonio transfiere 50€ a Beatriz */
		transferencia(cuentaAntonio, cuentaBeatriz, 50);
	}

	private static void transferencia(Cuenta cuentaRetirar, Cuenta cuentaIngresar, int dinero) {
		cambio_saldo(cuentaRetirar, -dinero);
		cambio_saldo(cuentaIngresar, dinero);
	}

	private static void cambio_saldo(Cuenta cuenta, int dinero) {
		// TODO Auto-generated method stub
		cuenta.setSaldo(cuenta.getSaldo() + dinero);
		
	}

	private static void muestra_saldo(Cuenta cuenta) {
		System.out.println("La cuenta de " + (cuenta.getCliente().getNombre()) + " tiene " + cuenta.getSaldo() + " euros.");
	}
	
}