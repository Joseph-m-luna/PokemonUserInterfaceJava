package main;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		JPanel secondPokemonPanel = new JPanel(new GridLayout(0, 2));
		JPanel thirdPokemonPanel = new JPanel(new GridLayout(0, 2));

		// first pokemon panel
		// left side of first pokemon panel
		JPanel leftPanel1 = new JPanel(new BorderLayout());
		// image of pokemon
		ImageIcon pokeImg1 = new ImageIcon(getClass().getResource("camera icon.png"));
		JLabel pokeImg1Label = new JLabel(pokeImg1);
		// button for feeding pokemon
		JButton feed1 = new JButton("Feed");
		feed1.setEnabled(true);
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
		// left side of second pokemon panel
		JPanel leftPanel2 = new JPanel(new BorderLayout());
		// image of pokemon
		ImageIcon pokeImg2 = new ImageIcon(getClass().getResource("camera icon.png"));
		JLabel pokeImg2Label = new JLabel(pokeImg2);
		// button for feeding pokemon
		JButton feed2 = new JButton("Feed");
		feed2.setEnabled(true);
		// add both of these to left side panel
		leftPanel2.add(pokeImg2Label, BorderLayout.CENTER); // centers image
		leftPanel2.add(feed2, BorderLayout.SOUTH); // places button underneath image
		// add left side panel to the second pokemon panel
		secondPokemonPanel.add(leftPanel2);

		// right side of second pokemon panel
		JPanel rightPanel2 = new JPanel(new GridLayout(3, 0));
		// name of pokemon with font type, style, and size
		JLabel pokeName2 = new JLabel("Name", SwingConstants.LEFT);
		pokeName2.setForeground(Color.BLACK);
		pokeName2.setFont(new Font("MV Boli", Font.BOLD, 20));
		// pokemon info
		JLabel pokeInfo2 = new JLabel("<html>Pokédex No. ###"
				+ "<br>Species: "
				+ "<br>Type: "
				+ "<br>Height: "
				+ "<br>Weight: ");
		// hp panel for level and friendship progress bars
		JPanel hpPanel2 = new JPanel(new GridLayout(2, 3));
		JLabel level2 = new JLabel("Level: ", SwingConstants.RIGHT);
		JProgressBar levelBar2 = new JProgressBar();
		// add space for filler so progress bar is more centered
		JLabel space2 = new JLabel();
		JLabel friendship2 = new JLabel("Friendship: ", SwingConstants.RIGHT);
		JProgressBar friendshipBar2 = new JProgressBar();
		// add to hp panel
		hpPanel2.add(level2);
		hpPanel2.add(levelBar2);
		hpPanel2.add(space2);
		hpPanel2.add(friendship2);
		hpPanel2.add(friendshipBar2);
		// add name, info, and hp panel to right side panel
		rightPanel2.add(pokeName2);
		rightPanel2.add(pokeInfo2);
		rightPanel2.add(hpPanel2);
		// add right side panel to the second pokemon panel
		secondPokemonPanel.add(rightPanel2);
		// end of second pokemon panel

		// third pokemon panel
		// left side of third pokemon panel
		JPanel leftPanel3 = new JPanel(new BorderLayout());
		// image of pokemon
		ImageIcon pokeImg3 = new ImageIcon(getClass().getResource("camera icon.png"));
		JLabel pokeImg3Label = new JLabel(pokeImg3);
		// button for feeding pokemon
		JButton feed3 = new JButton("Feed");
		feed3.setEnabled(true);
		// add both of these to left side panel
		leftPanel3.add(pokeImg3Label, BorderLayout.CENTER); // centers image
		leftPanel3.add(feed3, BorderLayout.SOUTH); // places button underneath image
		// add left side panel to the third pokemon panel
		thirdPokemonPanel.add(leftPanel3);

		// right side of third pokemon panel
		JPanel rightPanel3 = new JPanel(new GridLayout(3, 0));
		// name of pokemon with font type, style, and size
		JLabel pokeName3 = new JLabel("Name", SwingConstants.LEFT);
		pokeName3.setForeground(Color.BLACK);
		pokeName3.setFont(new Font("MV Boli", Font.BOLD, 20));
		// pokemon info
		JLabel pokeInfo3 = new JLabel("<html>Pokédex No. ###"
				+ "<br>Species: "
				+ "<br>Type: "
				+ "<br>Height: "
				+ "<br>Weight: ");
		// hp panel for level and friendship progress bars
		JPanel hpPanel3 = new JPanel(new GridLayout(2, 3));
		JLabel level3 = new JLabel("Level: ", SwingConstants.RIGHT);
		JProgressBar levelBar3 = new JProgressBar();
		// add space for filler so progress bar is more centered
		JLabel space3 = new JLabel();
		JLabel friendship3 = new JLabel("Friendship: ", SwingConstants.RIGHT);
		JProgressBar friendshipBar3 = new JProgressBar();
		// add to hp panel
		hpPanel3.add(level3);
		hpPanel3.add(levelBar3);
		hpPanel3.add(space3);
		hpPanel3.add(friendship3);
		hpPanel3.add(friendshipBar3);
		// add name, info, and hp panel to right side panel
		rightPanel3.add(pokeName3);
		rightPanel3.add(pokeInfo3);
		rightPanel3.add(hpPanel3);
		// add right side panel to the third pokemon panel
		thirdPokemonPanel.add(rightPanel3);
		// end of third pokemon panel

		jp.add(firstPokemonPanel);
		jp.add(secondPokemonPanel);
		jp.add(thirdPokemonPanel);

		// adding actionListener for first friendship and level progress bars
		feed1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (friendshipBar1.getValue() < 100) {
					friendshipBar1.setValue(friendshipBar1.getValue() + 10);
				} else if (friendshipBar1.getValue() == 100) {
					feed1.setEnabled(false);
					levelBar1.setValue(levelBar1.getValue() + 10);
					level1.setText("Level: " + (levelBar1.getValue()/10));
					// reset friendship progress bar to 0 once filled
					friendshipBar1.setValue(0);
					feed1.setEnabled(true);
				}
			}
		});

		// adding actionListener for second friendship and level progress bars
		feed2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (friendshipBar2.getValue() < 100) {
					friendshipBar2.setValue(friendshipBar2.getValue() + 10);
				} else if (friendshipBar2.getValue() == 100) {
					feed2.setEnabled(false);
					levelBar2.setValue(levelBar2.getValue() + 10);
					level2.setText("Level: " + (levelBar2.getValue()/10));
					// reset friendship progress bar to 0 once filled
					friendshipBar2.setValue(0);
					feed2.setEnabled(true);
				}
			}
		});

		// adding actionListener for third friendship and level progress bars
		feed3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (friendshipBar3.getValue() < 100) {
					friendshipBar3.setValue(friendshipBar3.getValue() + 10);
				} else if (friendshipBar3.getValue() == 100) {
					feed3.setEnabled(false);
					levelBar3.setValue(levelBar3.getValue() + 10);
					level3.setText("Level: " + (levelBar3.getValue()/10));
					// reset friendship progress bar to 0 once filled
					friendshipBar3.setValue(0);
					feed3.setEnabled(true);
				}
			}
		});

		return jp;
	}

	public String getName() {
		return tabName;
	}
}
