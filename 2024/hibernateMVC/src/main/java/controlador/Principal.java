package controlador;

import modelo.Logica;
import modelo.Productos;
import vista.*;

public class Principal {

	public static void main(String[] args) {

		Principal miPrincipal = new Principal();
		miPrincipal.iniciar();

	}
	
	public void iniciar() {
		FormProducto miFormProducto = new FormProducto();
		Logica miLogica = new Logica();
		Coordinador miCoordinador = new Coordinador();
		Productos miProducto=new Productos();
		VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
		
		miFormProducto.setMiCoordinador(miCoordinador);
		miLogica.setMiCoordinador(miCoordinador);
		miVentanaPrincipal.setMiCoordinador(miCoordinador);
		
		miCoordinador.setMiFormProducto(miFormProducto);
		miCoordinador.setMiLogica(miLogica);
		miCoordinador.setMiVentanaPrincipal(miVentanaPrincipal);
		
		miVentanaPrincipal.setVisible(true);
		
	}

}
