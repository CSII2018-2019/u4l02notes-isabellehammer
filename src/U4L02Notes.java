import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class U4L02Notes extends JFrame {
	
	//ImagePanel rgbBluePanel = new ImagePanel(FILE_NAME);
	//ImagePanel grapeTintPanel = new ImagePanel(FILE_NAME);
	//ImagePanel antoniaPanel = new ImagePanel(FILE_NAME);
	//ImagePanel resetPanel = new ImagePanel(FILE_NAME);
	ImagePanel changedPanel = new ImagePanel(FILE_NAME);
	
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
		
		
		//image panel
		ImagePanel original = new ImagePanel(FILE_NAME);
		add(original, BorderLayout.LINE_START);
		
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(new Color(241, 169, 242));
		add(buttonPanel, BorderLayout.PAGE_END);
		
		add(changedPanel, BorderLayout.LINE_END);
		
		
		JButton blueButton = new JButton ("Blue Effect");
		blueButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				callBlue();
				//System.out.println("blue button works");
			}
		});
		buttonPanel.add(blueButton);
		//add(rgbBluePanel, BorderLayout.LINE_END);
		

		
		
		
		JButton grapeButton = new JButton ("Grape Tint");
		grapeButton.setBackground(Color.WHITE);
		grapeButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				callGrape();
				//System.out.println("grape button works");
			}
		});
		buttonPanel.add(grapeButton);
		//add(grapeTintPanel, BorderLayout.LINE_END);
		
	
		//add(antoniaPanel, BorderLayout.LINE_END);
		
		JButton antoniaButton = new JButton ("Antonia's Filter");
		antoniaButton.setBackground(Color.WHITE);
		antoniaButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				callAntonia();
				//System.out.println("antonia button works");
			}
		});
		buttonPanel.add(antoniaButton);
		
		
		//add(resetPanel, BorderLayout.LINE_END);
		
		JButton resetButton = new JButton ("reset");
		resetButton.setBackground(Color.WHITE);
		resetButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				callReset();
				//System.out.println("reset button works");
			}
		});
		buttonPanel.add(resetButton);
		
		
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
		

	}
	
	
	
	
	
	public void callBlue() {
		//System.out.println("call blue worked");
		changedPanel.rgbBlueEffect();
		
	}
	
	public void callGrape() {
		changedPanel.grapeTint();
	}
	
	public void callAntonia() {
		changedPanel.antoniaEffect();
	}
	
	public void callReset() {
		changedPanel.reset();
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
