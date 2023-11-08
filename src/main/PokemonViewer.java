package main;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import javax.swing.*;
import java.awt.*;

public class PokemonViewer {
	String tabName;

	PokemonViewer(String name) throws FileNotFoundException, UnsupportedEncodingException {
		// we can use raw txt files to store the path to tab resources and other content
		// upon calling makeTab, we can return a tab with the desired content
		// create tab config file
		tabName = name;
		PrintWriter writer = new PrintWriter(tabName + ".txt", "UTF-8"); // TODO: Add proper try catch block rather than
																								// just throwing exceptions
		writer.print(tabName);
	}

	public JPanel getPanel() {
		JPanel jp = new JPanel(new GridLayout(3, 0));

		// create sub panels
		JPanel firstPokemonPanel = new JPanel();
		JPanel secondPokemonPanel = new JPanel();
		JPanel thirdPokemonPanel = new JPanel();

		// first pokemon panel
		ImageIcon pokeImg1 = new ImageIcon(getClass().getResource("camera icon.png"));
		JLabel pokeInfo1 = new JLabel("<html>Pokédex No. ###"
				+ "<br>Species: "
				+ "<br>Type: "
				+ "<br>Height: "
				+ "<br>Weight: ", pokeImg1, SwingConstants.CENTER);

		JLabel pokeName1 = new JLabel("Name", SwingConstants.CENTER);
		pokeName1.setVerticalTextPosition(SwingConstants.BOTTOM);

		firstPokemonPanel.add(pokeInfo1);
		firstPokemonPanel.add(pokeName1);

		// second pokemon panel
		ImageIcon pokeImg2 = new ImageIcon(getClass().getResource("camera icon.png"));
		JLabel pokeInfo2 = new JLabel("<html>Pokédex No. ###"
				+ "<br>Species: "
				+ "<br>Type: "
				+ "<br>Height: "
				+ "<br>Weight: ", pokeImg2, SwingConstants.CENTER);
		
		JLabel pokeName2 = new JLabel("Name", SwingConstants.CENTER);
		pokeName2.setVerticalTextPosition(SwingConstants.BOTTOM);

		secondPokemonPanel.add(pokeInfo2);
		secondPokemonPanel.add(pokeName2);

		// third pokemon panel
		ImageIcon pokeImg3 = new ImageIcon(getClass().getResource("camera icon.png"));
		JLabel pokeInfo3 = new JLabel("<html>Pokédex No. ###"
				+ "<br>Species: "
				+ "<br>Type: "
				+ "<br>Height: "
				+ "<br>Weight: ", pokeImg3, SwingConstants.CENTER);

		JLabel pokeName3 = new JLabel("Name", SwingConstants.CENTER);
		pokeName3.setVerticalTextPosition(SwingConstants.BOTTOM);

		thirdPokemonPanel.add(pokeInfo3);
		thirdPokemonPanel.add(pokeName3);

		/// add to jpanel
		jp.add(firstPokemonPanel);
		jp.add(secondPokemonPanel);
		jp.add(thirdPokemonPanel);

		return jp;
	}

	public String getName() {
		return tabName;
	}
}
