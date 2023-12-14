package ejercicio3B;

public class ascensor {
	private int  peso = 0;
	private int contador = 0;

	public synchronized void entrar(int peso) throws InterruptedException {
		while (contador >= 6 || this. peso + peso > 450) {
			wait();
		}
		this. peso += peso;
		contador++;
		System.out.println("-----");
		System.out.println("Entra una persona que pesa "+ peso);
		System.out.println("Peso total: "+ this.peso +" - " + " Personas totales:"+contador);
	}
		

	public synchronized void salir(int peso) {
		this. peso -= peso;
		contador--;
		System.out.println("-----");
		System.out.println("Sale una persona que pesa "+ peso);
		System.out.println("Peso total: "+ this.peso +" - " + " Personas totales:"+contador);
		notifyAll();
	}
}
