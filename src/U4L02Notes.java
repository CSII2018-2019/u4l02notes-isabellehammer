import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class U4L02Notes extends JFrame {
	
	public static final String FILE_NAME = "/Clemy.jpg";
	
	public U4L02Notes(){
		initGUI();
		setTitle("Meme");
		setResizable(true);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void initGUI(){
		//title Panel
		JPanel titlePanel = new JPanel();
		titlePanel.setBackground(Color.BLACK);
		JLabel titleLabel = new JLabel("girls taking Valentine's Day selfies with the gift their boo got them");
		titleLabel.setForeground(Color.WHITE);
		titlePanel.add(titleLabel);
		add(titlePanel, BorderLayout.PAGE_START);
		Font titleFont = new Font("Fish&Chips", Font.BOLD, 16);
		titleLabel.setFont(titleFont);
		ImagePanel imgPanel = new ImagePanel(FILE_NAME);
		add(imgPanel, BorderLayout.CENTER);

	}
	
	
	
	public static void main(String[] args) {
		try {
			String className = UIManager.getCrossPlatformLookAndFeelClassName();
			UIManager.setLookAndFeel(className);
		} catch (Exception e){}
		
		SwingUtilities.invokeLater(new Runnable (){
            @Override
            public void run() {
                new U4L02Notes();
            }   
        });

	}

}
