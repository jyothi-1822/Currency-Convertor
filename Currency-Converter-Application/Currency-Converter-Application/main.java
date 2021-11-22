import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import javax.swing.*;

class main extends JFrame{
  static JFrame f;
  static JLabel l; 
  public static void main(String[] args){
   f = new JFrame("Rupees");
  l = new JLabel(); 
 JPanel p = new JPanel(); 
  p.add(l);
  f.add(p);
  f.setSize(300, 300); 
  f.show(); 
  
  }




}
