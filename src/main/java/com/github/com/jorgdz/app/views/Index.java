package com.github.com.jorgdz.app.views;

import javax.swing.JFrame;

import org.springframework.stereotype.Component;

@Component
public class Index extends JFrame {
	
	private static final long serialVersionUID = 966112449667156929L;

	public Index ()
	{
		this.setLayout(null);
		this.setBounds(400, 250, 800, 540);
		this.setResizable(false);
		this.setTitle("INICIO");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
