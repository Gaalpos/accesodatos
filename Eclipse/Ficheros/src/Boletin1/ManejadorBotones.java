package Boletin1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ManejadorBotones implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
	JButton boton=(JButton) e.getSource();
	if(boton.getName().equals("saludar")) {
		
	}
		
	}

}
