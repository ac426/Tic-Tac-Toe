import java.awt.*; 
import java.awt.event.*;
import java.awt.geom.Line2D;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TicTacToe extends JFrame {
   public void init() {
      setBackground(Color.white);
      setForeground(Color.white);
   }
   public void paint(Graphics g) {
	  super.paint(g);
      Graphics2D g2 = (Graphics2D) g;
      g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      g2.setPaint(Color.BLACK);
      g2.draw(new Line2D.Double(500, 450, 1250, 450));//horizontal 1
      g2.draw(new Line2D.Double(500, 700, 1250, 700));//horizontal 2
      g2.draw(new Line2D.Double(750, 200, 750, 900));//Vertical 1
      g2.draw(new Line2D.Double(1000, 200, 1000, 900));//Vertical 2
      
   }
   public void painter(Graphics g)
   {
	   
   }

   public static void main(String s[]) {
      
      JFrame f = new JFrame("Tic Tac Toe");
      f.setExtendedState(JFrame.MAXIMIZED_BOTH);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.pack();
      f.setVisible(true);
      f.setLayout(null);

      
   }
}
