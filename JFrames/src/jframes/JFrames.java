/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframes;
import java.awt.GraphicsConfiguration;
import javax.swing.JFrame;
/**
 *
 * @author but-anonju_sd2022
 */
public class JFrames {

    /**
     * @param args the command line arguments
     */
    static GraphicsConfiguration gc;

    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame= new JFrame(gc);	
		frame.setVisible(true);
    }
    
}
