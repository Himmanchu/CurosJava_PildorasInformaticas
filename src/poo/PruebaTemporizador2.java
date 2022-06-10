package poo;

import javax.swing.*;

import java.awt.event.*;

import java.util.*;

import javax.swing.Timer;

import java.awt.Toolkit;


public class PruebaTemporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Reloj mireloj=new Reloj(3000, true);
		
		mireloj.enMarcha();
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar");
		
		System.exit(0);
		
		
	}

}


class Reloj{
	
	public Reloj(int intervalo, boolean sonido) {
		
		this.intervalo=intervalo;
		
		this.sonido=sonido;
		
		
	}
	
	public void enMarcha() {
		
		ActionListener oyente=new DameLaHora2();
		
		Timer mitemporizador=new Timer(intervalo, oyente);
		
		mitemporizador.start();
	}
	
	private int intervalo;
	
	private boolean sonido;
	
	
}

