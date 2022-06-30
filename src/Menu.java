import java.awt.Dimension;
import javax.swing.*;

public class Menu {
  private static Dimension windowSize = new Dimension(600,480);
  
  public Menu(){
    JFrame windowMenu = new JFrame("Menu");
    windowMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    windowMenu.setSize(windowSize);
    windowMenu.setMinimumSize(windowSize);
    windowMenu.setLocationRelativeTo(null);
    windowMenu.setVisible(true);
  }
}
