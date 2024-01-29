package controlador;

import modelo.*;
import vista.*;

public class Coordinador {
	private Logica miLogica;
	private FormProducto miFormProducto;
	private VentanaPrincipal miVentanaPrincipal;
	
	public VentanaPrincipal getMiVentanaPrincipal() {
		return miVentanaPrincipal;
	}
	public void setMiVentanaPrincipal(VentanaPrincipal miVentanaPrincipal) {
		this.miVentanaPrincipal = miVentanaPrincipal;
	}
	public Logica getMiLogica() {
		return miLogica;
	}
	public void setMiLogica(Logica miLogica) {
		this.miLogica = miLogica;
	}
	public FormProducto getMiFormProducto() {
		return miFormProducto;
	}
	public void setMiFormProducto(FormProducto miFormProducto) {
		this.miFormProducto = miFormProducto;
	} 
	
	public void mostrarFormulario() {
		miVentanaPrincipal.setVisible(true);
	}
	
	public void mostrarFormularioRegistro() {
		miFormProducto.setVisible(true);
	}
	
	public void registrarProducto(Productos miProducto) {
		
		
	}
	
}
