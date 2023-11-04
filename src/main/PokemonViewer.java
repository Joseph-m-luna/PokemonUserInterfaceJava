package main;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import javax.swing.*;

public class PokemonViewer {
	String tabName;
	
	PokemonViewer(String name) throws FileNotFoundException, UnsupportedEncodingException {
		//we can use raw txt files to store the path to tab resources and other content
		//upon calling makeTab, we can return a tab with the desired content
		//create tab config file
		tabName = name;
		PrintWriter writer = new PrintWriter(tabName + ".txt", "UTF-8"); //TODO: Add proper try catch block rather than just throwing exceptions
		writer.print(tabName);
	}
	
	public JPanel getPanel() {
		JPanel jp = new JPanel();
		
		//create content
		JLabel example = new JLabel("here's some example content");
		
		///add to jpanel
		jp.add(example);
		
		return jp;
	}
	
	public String getName() {
		return tabName;
	}
}
