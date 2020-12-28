package es.studium.practicaT2;

/**
 * 
 * @author PyColmenero
 *
 */
public class TestBanco {
	public static void main(String[] args) {
		/* Antonio y Beatriz se hacen cliente del banco */
		Cliente antonio = new Cliente("123456789Z", "Antonio Alonso", "Av. Pueblo Saharaui, s/n");
		Cliente beatriz = new Cliente("987654321A", "Beatriz Benítez", "Calle Sol, 4");
 
		/* Por defecto, todas las cuentas nuevas tienen 100€ */
		Cuenta cuentaAntonio = new Cuenta(48151, 100, antonio);
		Cuenta cuentaBeatriz = new Cuenta(62342, 100, beatriz);
 
		/* Antonio y Beatriz consultan el saldo */
		muestra_dinero_cuenta(cuentaAntonio);
		muestra_dinero_cuenta(cuentaBeatriz);
 
		/* Beatriz transfiere 50€ a Antonio */
		transferencia(cuentaBeatriz, cuentaAntonio, 50);
 
		/* Antonio y Beatriz vuelven a consultar para comprobar que todo ha ido bien */
		muestra_dinero_cuenta(cuentaAntonio);
		muestra_dinero_cuenta(cuentaBeatriz);
 
		/* Antonio gana 100€ en una rifa y hace un ingreso en su cuenta */
		cambio_saldo(cuentaAntonio, 100);
 
		/* Beatriz tiene que pagar 30€ a hacienda y retira el dinero */
		cambio_saldo(cuentaBeatriz, -30);
 
		/* Antonio transfiere 50€ a Beatriz */
		transferencia(cuentaAntonio, cuentaBeatriz, 50);
	}


	/**
	 * quita dinero a una cuenta, y le suma a otra
	 * @param cuentaRetirar => cuenta que hace la transaccion
	 * @param cuentaIngresar => cuenta a la que le llega el dinero
	 * @param dinero => total a transferir
	 */
	private static void transferencia(Cuenta cuentaRetirar, Cuenta cuentaIngresar, int dinero) {
		cambio_saldo(cuentaRetirar, -dinero);
		cambio_saldo(cuentaIngresar, dinero);
	}

	/**
	 * para retirar o añadir dinero a la ceutna
	 * @param cuenta => cuenta a la que efectuar el cambio
	 * @param dinero => cantidad de dinero, ya sea positivo para ingresar o negativo para quitar
	 */
	private static void cambio_saldo(Cuenta cuenta, int dinero) {
		// TODO Auto-generated method stub
		cuenta.setSaldo(cuenta.getSaldo() + dinero);
	}

	/**
	 * mostrar por consola la cantidad de dinero de una cuenta
	 * @param cuenta => cuenta de la que enseñar el dinero
	 */
	private static void muestra_dinero_cuenta(Cuenta cuenta) {
		System.out.println("La cuenta de " + (cuenta.getCliente().getNombre()) + " tiene " + cuenta.getSaldo() + " euros.");
	}
	
}