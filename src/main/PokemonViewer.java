package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PokemonViewer {
	String tabName;
	
	//text info
	String[] names = new String[3];
	String[] pokemons = new String[3];
	String[] nums = new String[3];
	String[] types = new String[3];
	String[] heights = new String[3];
	String[] weights = new String[3];
	
	//counters
	int[] levels = new int[3];
	int[] friendships = new int[3];
	
	//progress bars
	JProgressBar levelBar1, levelBar2, levelBar3, friendshipBar1, friendshipBar2, friendshipBar3;

	PokemonViewer(String name) throws FileNotFoundException, UnsupportedEncodingException {
		// we can use raw txt files to store the path to tab resources and other content
		// upon calling makeTab, we can return a tab with the desired content
		// create tab config file
		String savedContents;
		tabName = name;
		
		try {
			savedContents = Files.readString(Paths.get(tabName + ".txt"));
			String lines[] = savedContents.split("\\r\\n");
			for (int j = 0; j < 3; j++) {
				int lineStart = j*8;
					names[j] = lines[lineStart];
					pokemons[j] = lines[lineStart+1];
					nums[j] = lines[lineStart+2];
					types[j] = lines[lineStart+3];
					heights[j] = lines[lineStart+4];
					weights[j] = lines[lineStart+5];
					
					//cast levels to int
					levels[j] = Integer.parseInt(lines[lineStart+6]);
					friendships[j] = Integer.parseInt(lines[lineStart+7]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
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
		ImageIcon pokeImg1 = new ImageIcon(getClass().getResource(pokemons[0] + ".png"));
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
		JLabel pokeName1 = new JLabel(names[0], SwingConstants.LEFT);
		pokeName1.setForeground(Color.BLACK);
		pokeName1.setFont(new Font("MV Boli", Font.BOLD, 20));
		// pokemon info
		JLabel pokeInfo1 = new JLabel("<html>Pokédex No. " + nums[0]
				+ "<br>Species: " + pokemons[0]
				+ "<br>Type: " + types[0]
				+ "<br>Height: " + heights[0]
				+ "<br>Weight: " + weights[0]);
		// hp panel for level and friendship progress bars
		JPanel hpPanel1 = new JPanel(new GridLayout(2, 3));
		JLabel level1 = new JLabel("Level: ", SwingConstants.RIGHT);
		levelBar1 = new JProgressBar();
		levelBar1.setValue(levels[0]);
		// add space for filler so progress bar is more centered
		JLabel space1 = new JLabel();
		JLabel friendship1 = new JLabel("Friendship: ", SwingConstants.RIGHT);
		friendshipBar1 = new JProgressBar();
		friendshipBar1.setValue(friendships[0]);
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
		ImageIcon pokeImg2 = new ImageIcon(getClass().getResource(pokemons[1] + ".png"));
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
		JLabel pokeName2 = new JLabel(names[1], SwingConstants.LEFT);
		pokeName2.setForeground(Color.BLACK);
		pokeName2.setFont(new Font("MV Boli", Font.BOLD, 20));
		// pokemon info
		JLabel pokeInfo2 = new JLabel("<html>Pokédex No. " + nums[1]
				+ "<br>Species: " + pokemons[1]
				+ "<br>Type: " + types[1]
				+ "<br>Height: " + heights[1]
				+ "<br>Weight: " + weights[1]); 
		// hp panel for level and friendship progress bars
		JPanel hpPanel2 = new JPanel(new GridLayout(2, 3));
		JLabel level2 = new JLabel("Level: ", SwingConstants.RIGHT);
		levelBar2 = new JProgressBar();
		levelBar2.setValue(levels[1]);
		// add space for filler so progress bar is more centered
		JLabel space2 = new JLabel();
		JLabel friendship2 = new JLabel("Friendship: ", SwingConstants.RIGHT);
		friendshipBar2 = new JProgressBar();
		friendshipBar2.setValue(friendships[1]);
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
		ImageIcon pokeImg3 = new ImageIcon(getClass().getResource(pokemons[2] + ".png"));
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
		JLabel pokeName3 = new JLabel(names[2], SwingConstants.LEFT);
		pokeName3.setForeground(Color.BLACK);
		pokeName3.setFont(new Font("MV Boli", Font.BOLD, 20));
		// pokemon info
		JLabel pokeInfo3 = new JLabel("<html>Pokédex No. " + nums[2]
				+ "<br>Species: " + pokemons[2]
				+ "<br>Type: " + types[2]
				+ "<br>Height: " + heights[2]
				+ "<br>Weight: " + weights[2]);
		// hp panel for level and friendship progress bars
		JPanel hpPanel3 = new JPanel(new GridLayout(2, 3));
		JLabel level3 = new JLabel("Level: ", SwingConstants.RIGHT);
		levelBar3 = new JProgressBar();
		levelBar3.setValue(levels[2]);
		// add space for filler so progress bar is more centered
		JLabel space3 = new JLabel();
		JLabel friendship3 = new JLabel("Friendship: ", SwingConstants.RIGHT);
		friendshipBar3 = new JProgressBar();
		friendshipBar3.setValue(friendships[2]);
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
					level1.setText("Level: " + (levelBar1.getValue() / 10));
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
					level2.setText("Level: " + (levelBar2.getValue() / 10));
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
					level3.setText("Level: " + (levelBar3.getValue() / 10));
					// reset friendship progress bar to 0 once filled
					friendshipBar3.setValue(0);
					feed3.setEnabled(true);
				}
			}
		});
		
		this.saveData();
		
		return jp;
	}
	public void saveData() {
		setData(7, Integer.toString(levelBar1.getValue()));
		setData(8, Integer.toString(friendshipBar1.getValue()));
		setData(15, Integer.toString(levelBar2.getValue()));
		setData(16, Integer.toString(friendshipBar2.getValue()));
		setData(23, Integer.toString(levelBar3.getValue()));
		setData(24, Integer.toString(friendshipBar3.getValue()));
	}
	
	public void setData(int lineNo, String newText) {

        try {
            File file = new File(tabName + ".txt");
            File tempFile = new File("temp" + tabName + ".txt");

            BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String currentLine;
            int currentLineNumber = 1;

            while ((currentLine = reader.readLine()) != null) {
                if (currentLineNumber == lineNo) {
                    writer.write(newText);
                } else {
                    writer.write(currentLine);
                }

                //if (currentLineNumber < lineNo) {
                    writer.newLine();
                //}

                currentLineNumber++;
            }

            reader.close();
            writer.close();

            // Rename the temporary file to the original file
            if (file.delete()) {
                tempFile.renameTo(file);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

	public String getName() {
		return tabName;
	}
}
