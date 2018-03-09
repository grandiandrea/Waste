import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class Maino{
  public static void main(String[] args){
    JFrame guiFrame = new JFrame();
    guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiFrame.setTitle("Finestra con pulsante");
		guiFrame.setSize(650,200);
		guiFrame.setLocationRelativeTo(null);
    JPanel pannello = new JPanel();
    JButton bottone1 = new JButton("Bottone1");
    JLabel etichetta1 = new JLabel("Etichetta");
    bottone1.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent event){
        etichetta1.setText("MA CAMBIA YOO");
      }
    });
    pannello.add(bottone1);
    pannello.add(etichetta1);
    guiFrame.add(pannello);
    guiFrame.setVisible(true);
  }
}
