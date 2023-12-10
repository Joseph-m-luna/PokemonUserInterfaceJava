package main;

import main.PokemonViewer;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class RunApp {
	PokemonViewer firstViewer, secondViewer;

	RunApp() throws FileNotFoundException, UnsupportedEncodingException {
		// create jfrm
		JFrame jfrm = new JFrame("Pokemon Companions");
		jfrm.setSize(600, 800);
		jfrm.setResizable(false);
		jfrm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		// set up panels
		JTabbedPane jtpane = new JTabbedPane();

		// create panels factory
		firstViewer = new PokemonViewer("firstTab");
		secondViewer = new PokemonViewer("secondTab");

		// add to tabbed pane
		jtpane.addTab(firstViewer.getName(), null, firstViewer.getPanel(), "first panel of your pokemon");
		jtpane.addTab(secondViewer.getName(), null, secondViewer.getPanel(), "second panel of your pokemon");

		// add to content pane
		jfrm.add(jtpane);

		// make jfrm visible
		jfrm.setVisible(true);
		
		jfrm.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				exitProgram();
			}
		});
	}
	
	public void exitProgram() {
		firstViewer.saveData();
		secondViewer.saveData();
		System.exit(0);
	}

	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					new RunApp();
				} catch (FileNotFoundException | UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}
}