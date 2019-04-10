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
		setTitle("Picture (Meme)");
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
		JLabel titleLabel = new JLabel("girls taking Valentine's Day pictures with the gift their boo got them");
		titleLabel.setForeground(Color.WHITE);
		titlePanel.add(titleLabel);
		add(titlePanel, BorderLayout.PAGE_START);
		Font titleFont = new Font("Fish&Chips", Font.BOLD, 16);
		titleLabel.setFont(titleFont);
		ImagePanel imgPanel = new ImagePanel(FILE_NAME);
		add(imgPanel, BorderLayout.LINE_START);
		
		//grayscale image panel
		/*ImagePanel grayImgPanel = new ImagePanel(FILE_NAME);
		grayImgPanel.convertToGrayscale();
		add(grayImgPanel, BorderLayout.LINE_END);*/
		
		/*ImagePanel rgbRedPanel = new ImagePanel(FILE_NAME);
		rgbRedPanel.rgbRedEffect();
		add(rgbRedPanel, BorderLayout.LINE_END);*/
		
		
		/*ImagePanel rgbGreenPanel = new ImagePanel(FILE_NAME);
		rgbGreenPanel.rgbGreenEffect();
		add(rgbGreenPanel, BorderLayout.LINE_END);*/
		
		
		/*ImagePanel rgbBluePanel = new ImagePanel(FILE_NAME);
		rgbBluePanel.rgbBlueEffect();
		add(rgbBluePanel, BorderLayout.LINE_END);*/
		
		
		 /*ImagePanel underTheSeaPanel = new ImagePanel(FILE_NAME);
		 underTheSeaPanel.underTheSea();
		 add(underTheSeaPanel, BorderLayout.LINE_END);*/
		 
		 /*ImagePanel stPattyPanel = new ImagePanel(FILE_NAME);
		 stPattyPanel.stPatty();
		 add(stPattyPanel, BorderLayout.LINE_END);*/
		
		/*ImagePanel vDayPanel = new ImagePanel(FILE_NAME);
		vDayPanel.vDay();
		add(vDayPanel, BorderLayout.LINE_END);*/
		
		ImagePanel grapeTintPanel = new ImagePanel(FILE_NAME);
		grapeTintPanel.grapeTint();
		add(grapeTintPanel, BorderLayout.LINE_END);
		
		
		 

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
