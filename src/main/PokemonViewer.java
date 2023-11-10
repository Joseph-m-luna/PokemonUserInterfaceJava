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
		JPanel firstPokemonPanel = new JPanel(new GridLayout(0, 2));
		JPanel secondPokemonPanel = new JPanel();
		JPanel thirdPokemonPanel = new JPanel();

		// first pokemon panel
		// left side of first pokemon panel
		JPanel leftPanel1 = new JPanel(new BorderLayout());
		// image of pokemon
		ImageIcon pokeImg1 = new ImageIcon(getClass().getResource("camera icon.png"));
		JLabel pokeImg1Label = new JLabel(pokeImg1);
		// button for feeding pokemon
		JButton feed1 = new JButton("Feed");
		// add both of these to left side panel
		leftPanel1.add(pokeImg1Label, BorderLayout.CENTER); // centers image
		leftPanel1.add(feed1, BorderLayout.SOUTH); // places button underneath image
		// add left side panel to the first pokemon panel
		firstPokemonPanel.add(leftPanel1);

		// right side of first pokemon panel
		JPanel rightPanel1 = new JPanel(new GridLayout(3, 0));
		// name of pokemon with font type, style, and size
		JLabel pokeName1 = new JLabel("Name", SwingConstants.LEFT);
		pokeName1.setForeground(Color.BLACK);
		pokeName1.setFont(new Font("MV Boli", Font.BOLD, 20));
		// pokemon info
		JLabel pokeInfo1 = new JLabel("<html>Pokédex No. ###"
				+ "<br>Species: "
				+ "<br>Type: "
				+ "<br>Height: "
				+ "<br>Weight: ");
		// hp panel for level and friendship progress bars
		JPanel hpPanel1 = new JPanel(new GridLayout(2, 3));
		JLabel level1 = new JLabel("Level: ", SwingConstants.RIGHT);
		JProgressBar levelBar1 = new JProgressBar();
		// add space for filler so progress bar is more centered
		JLabel space1 = new JLabel();
		JLabel friendship1 = new JLabel("Friendship: ", SwingConstants.RIGHT);
		JProgressBar friendshipBar1 = new JProgressBar();
		// add to hp panel
		hpPanel1.add(level1);
		hpPanel1.add(levelBar1);
		hpPanel1.add(space1);
		hpPanel1.add(friendship1);
		hpPanel1.add(friendshipBar1);
		// add name, info, and hp panel to right side panel
		rightPanel1.add(pokeName1);
		rightPanel1.add(pokeInfo1);
		rightPanel1.add(hpPanel1);
		// add right side panel to the first pokemon panel
		firstPokemonPanel.add(rightPanel1);
		// end of first pokemon panel

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
