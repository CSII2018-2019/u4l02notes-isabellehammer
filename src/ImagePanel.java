import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ImagePanel extends JPanel {
	
	private int width;
	private int height;
	
	BufferedImage image = null;
	
	public ImagePanel(String fn){
		image = readImageFile(this, fn);
		width = image.getWidth();
		height = image.getHeight();
	}
	
	public static BufferedImage readImageFile(Object requestor, String fileName){
		BufferedImage image = null;
		try {
			InputStream input = requestor.getClass().getResourceAsStream(fileName);
			image = ImageIO.read(input);
		} catch (IOException e){
			String message = "The image file " + fileName + " could not be opened.";
			JOptionPane.showMessageDialog(null, message);
		}
		return image;
	}
	
	public Dimension getPreferredSize() {
		Dimension size = new Dimension(width, height);
		return size;
	}
	
	public void convertToGrayscale() {
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				//get value for 1 pixel
				int p = image.getRGB(x, y);
				
				int a = (p>>24) & 0xff;
				int r = (p>>16) & 0xff;
				int g = (p>>8) & 0xff;
				int b = (p>>0) & 0xff;
				
				//calculate average
				int avg = (r + g + b)/3;
				
				//reset our pixel
				p = (a<<24) | (avg<<16) | (avg<<8) | (avg<<0);
				image.setRGB(x, y, p);
			}
		}
	}
	
	public void underTheSea() {
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				//get value for 1 pixel
				int p = image.getRGB(x, y);
				
				int a = (p>>24) & 0xff;
				int r = (p>>0) & 0xff;
				int g = (p>>8) & 0xff;
				int b = (p>>16) & 0xff;
				
				//reset our pixel
				p = (a<<24) | (r<<16) | (g<<8) | (b<<0);
				image.setRGB(x, y, p);
			}
		}
	}
	
	public void stPatty() {
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				//get value for 1 pixel
				int p = image.getRGB(x, y);
				
				int a = (p>>24) & 0xff;
				int r = (p>>8) & 0xff;
				int g = (p>>16) & 0xff;
				int b = (p>>0) & 0xff;
				
				//reset our pixel
				p = (a<<24) | (r<<16) | (g<<8) | (b<<0);
				image.setRGB(x, y, p);
			}
		}
	}
	
	public void vDay() {
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				//get value for 1 pixel
				int p = image.getRGB(x, y);
				
				int a = (p>>24) & 0xff;
				int r = (p>>16) & 0xff;
				int g = (p>>0) & 0xff;
				int b = (p>>8) & 0xff;
				
				//reset our pixel
				p = (a<<24) | (r<<16) | (g<<8) | (b<<0);
				image.setRGB(x, y, p);
			}
		}
	}
	
	
	
	public void rgbRedEffect() {
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				
				int p = image.getRGB(x, y);
				
				int a = (p>>24) & 0xff;
				int r = (p>>16) & 0xff;
				int g = 0;
				int b = 0;
				
				//int avg = (r + g + b)/3;
				
				p = (a<<24) | (r<<16) | (g<<8) | (b<<0);
				image.setRGB(x, y, p);
				
			}
				
			}
	}
	
	public void rgbGreenEffect() {
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				
				int p = image.getRGB(x, y);
				
				int a = (p>>24) & 0xff;
				int r = 0;
				int g = (p>>8) & 0xff;
				int b = 0;
				
				//int avg = (r + g + b)/3;
				
				p = (a<<24) | (r<<16) | (g<<8) | (b<<0);
				image.setRGB(x, y, p);
				
			}
				
			}
	}
	
	public void rgbBlueEffect() {
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				
				int p = image.getRGB(x, y);
				
				int a = (p>>24) & 0xff;
				int r = 0;
				int g = 0;
				int b = (p>>0) & 0xff;
				
				p = (a<<24) | (r<<16) | (g<<8) | (b<<0);
				image.setRGB(x, y, p);
				
			}
				
			}
	}
	
	public void grapeTint() {
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				//get value for 1 pixel
				int p = image.getRGB(x, y);
				
				int a = (p>>24) & 0xff;
				int r = (p>>8) & 0xff;
				int g = (p>>0) & 0xff;
				int b = (p>>16) & 0xff;
				
				//reset our pixel
				p = (a<<24) | (r<<16) | (g<<8) | (b<<0);
				image.setRGB(x, y, p);
			}
		}
	}
	
	
	
	public void paintComponent(Graphics g) {
		g.drawImage(image, 0, 0, null);
		//g.drawString("girls on valentines day", 100, 100);
	}

}
