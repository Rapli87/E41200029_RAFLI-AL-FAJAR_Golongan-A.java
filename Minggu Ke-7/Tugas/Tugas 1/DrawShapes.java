package Tugas1_BKPM;
/**
 *
 * @author ACER
 */
import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
public class DrawShapes extends Applet {
    Font font;
    Color redColor;
    Color blueColor;
    Color backgroundColor;
    
    @Override
    public void init() {
        // set font 18 arial
        font = new Font("Arial", Font.ITALIC, 18);
        
        // set color dengan class color
        redColor = Color.RED;
        backgroundColor = Color.orange;
        
        // Membuat warna dengan RGB
        blueColor = new Color(0,0,112);
        
        // mengatur background dengan applet color
        setBackground(backgroundColor);   
    }
    
    @Override
    public void stop() {
    }
    
    /*
        membuat bentuk
    */
    
    public void paint(Graphics g) {
        // set font
        g.setFont(font);

        // membuat judul
        g.drawString("Draw shapes", 90, 20);
        
        // mengatur warna shape (1)
        g.setColor(blueColor);
        
        // membuat persegi menggunakan drawRect
        g.drawRect(120, 120, 120, 120);
        
        // mengisi persegi
        g.fillRect(115, 115, 90, 90);
        
        // mengatur warna untuk bentuk selanjutnya
        g.setColor(redColor);
        
        // membuat lingkaran drawArc
        g.drawArc(110, 110, 50, 50, 0, 360);
        
        // mengatur warna bentuk selanjutnya
        g.setColor(Color.CYAN);
        
        // membuat bentuk selanjutnya
        g.drawRect(50, 50, 50, 50);
        
        // meengisi persegi
        g.fillRect(50, 50, 60, 60);
    }
}
