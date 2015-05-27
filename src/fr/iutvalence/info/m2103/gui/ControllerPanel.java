package fr.iutvalence.info.m2103.gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import fr.iutvalence.info.m2103.sokoban.Direction;

public class ControllerPanel extends JPanel{

	private JButtonDirection upButton;
	
	private JButtonDirection downButton;
	
	private JButtonDirection leftButton;
	
	private JButtonDirection rightButton;
	
	
	public ControllerPanel(ActionListener event){
		this.upButton = new JButtonDirection("U", Direction.UP);
		this.downButton = new JButtonDirection("D", Direction.DOWN);
		this.rightButton = new JButtonDirection("R", Direction.RIGHT);
		this.leftButton = new JButtonDirection("L", Direction.LEFT);
		
		this.upButton.addActionListener(event);
		this.downButton.addActionListener(event);
		this.leftButton.addActionListener(event);
		this.rightButton.addActionListener(event);
		
		this.setLayout(new GridBagLayout());
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		this.add(this.upButton, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		this.add(this.downButton, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 1;
		this.add(this.rightButton, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		this.add(this.leftButton, gbc);
		
	}


	public JButtonDirection getUpButton() {
		return this.upButton;
	}


	public JButtonDirection getDownButton() {
		return this.downButton;
	}


	public JButtonDirection getLeftButton() {
		return this.leftButton;
	}


	public JButtonDirection getRightButton() {
		return this.rightButton;
	}
	
}
