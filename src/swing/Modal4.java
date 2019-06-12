package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Window;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JDialog;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
public class Modal4 extends JDialog{
	ImageIcon quiz, button, correct, wrong;
   public Modal4(Window parent) {
      
      super(parent, "Modal Practice",ModalityType.APPLICATION_MODAL);
      getContentPane().setBackground(SystemColor.info);
      setSize(911,574);
      setLocationRelativeTo(null);
      getContentPane().setLayout(null);
      
      JButton btnPlayMusic = new JButton("");
      btnPlayMusic.setForeground(SystemColor.info);
      btnPlayMusic.setBorderPainted(false);
      btnPlayMusic.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
         }
      });
      btnPlayMusic.setBackground(SystemColor.info);
      quiz = new ImageIcon(getClass().getClassLoader().getResource("sound_icon.png"));
      btnPlayMusic.setIcon(quiz);
      btnPlayMusic.setBounds(38, 128, 62, 57);
      getContentPane().add(btnPlayMusic);
      
      JTextArea txtrOst = new JTextArea();
      txtrOst.setText("4.\uB2E4\uC74C \uB178\uB798\uB97C \uBD80\uB978 \uAC00\uC218\uC758 \uBA64\uBC84\uC218\uB294 \uC5BC\uB9C8\uC785\uB2C8\uAE4C?");
      txtrOst.setFont(new Font("ÇÔÃÊ·Òµ¸¿ò", Font.PLAIN, 24));
      txtrOst.setBackground(Color.ORANGE);
      txtrOst.setBounds(192, 36, 509, 36);
      getContentPane().add(txtrOst);
      txtrOst.addMouseListener(new MouseAdapter() {
      	public void mouseClicked(MouseEvent arg0) {
      		txtrOst.setText("Song : ¿Àºü¾ß - ½ÅÇöÈñ¿Í ±è·çÆ®");
      	}
      });
      
      JTextPane txtpnEmmaStone = new JTextPane();
      txtpnEmmaStone.setFont(new Font("Adobe Fan Heiti Std B", Font.PLAIN, 19));
      txtpnEmmaStone.setBackground(SystemColor.info);
      txtpnEmmaStone.setText("2");
      txtpnEmmaStone.setBounds(83, 250, 120, 36);
      getContentPane().add(txtpnEmmaStone);
      
      JTextPane txtpnRyanGosling = new JTextPane();
      txtpnRyanGosling.setText("4");
      txtpnRyanGosling.setFont(new Font("Adobe Fan Heiti Std B", Font.PLAIN, 19));
      txtpnRyanGosling.setBackground(SystemColor.info);
      txtpnRyanGosling.setBounds(284, 250, 120, 36);
      getContentPane().add(txtpnRyanGosling);
      
      JTextPane txtpnJohnLegend = new JTextPane();
      txtpnJohnLegend.setText("6");
      txtpnJohnLegend.setFont(new Font("Adobe Fan Heiti Std B", Font.PLAIN, 19));
      txtpnJohnLegend.setBackground(SystemColor.info);
      txtpnJohnLegend.setBounds(486, 250, 120, 36);
      getContentPane().add(txtpnJohnLegend);
      
      JTextPane txtpnBradleyCooper = new JTextPane();
      txtpnBradleyCooper.setText("8");
      txtpnBradleyCooper.setFont(new Font("Adobe Fan Heiti Std B", Font.PLAIN, 19));
      txtpnBradleyCooper.setBackground(SystemColor.info);
      txtpnBradleyCooper.setBounds(687, 250, 120, 36);
      getContentPane().add(txtpnBradleyCooper);
      
      JButton c1 = new JButton("");
      button = new ImageIcon(getClass().getClassLoader().getResource("button.png"));
      wrong = new ImageIcon(getClass().getClassLoader().getResource("incorrect.png"));
      correct = new ImageIcon(getClass().getClassLoader().getResource("correct.png"));
      c1.setIcon(button);
      c1.setBorderPainted(false);
      c1.setContentAreaFilled(false);
      c1.setBounds(83, 292, 81, 76);
      getContentPane().add(c1);
      c1.setPressedIcon(correct);
     
      JButton c2 = new JButton("");
      c2.setIcon(button);
      c2.setContentAreaFilled(false);
      c2.setBorderPainted(false);
      c2.setBounds(277, 292, 81, 76);
      getContentPane().add(c2);
      c2.setPressedIcon(wrong);
      
      JButton c3 = new JButton("");
      c3.setIcon(button);
      c3.setContentAreaFilled(false);
      c3.setBorderPainted(false);
      c3.setBounds(471, 292, 81, 76);
      getContentPane().add(c3);
      c3.setPressedIcon(wrong);
      
      JButton c4 = new JButton("");
      c4.setIcon(button);
      c4.setContentAreaFilled(false);
      c4.setBorderPainted(false);
      c4.setBounds(665, 292, 81, 76);
      getContentPane().add(c4);
      c4.setPressedIcon(wrong);
      
      JTextPane txtpnNumber = new JTextPane();
      txtpnNumber.setText("number 1");
      txtpnNumber.setFont(new Font("Adobe Fan Heiti Std B", Font.PLAIN, 19));
      txtpnNumber.setBackground(SystemColor.info);
      txtpnNumber.setBounds(83, 214, 98, 36);
      getContentPane().add(txtpnNumber);
      
      JTextPane txtpnNumber_1 = new JTextPane();
      txtpnNumber_1.setText("number 2");
      txtpnNumber_1.setFont(new Font("Adobe Fan Heiti Std B", Font.PLAIN, 19));
      txtpnNumber_1.setBackground(SystemColor.info);
      txtpnNumber_1.setBounds(281, 214, 98, 36);
      getContentPane().add(txtpnNumber_1);
      
      JTextPane txtpnNumber_2 = new JTextPane();
      txtpnNumber_2.setText("number 3");
      txtpnNumber_2.setFont(new Font("Adobe Fan Heiti Std B", Font.PLAIN, 19));
      txtpnNumber_2.setBackground(SystemColor.info);
      txtpnNumber_2.setBounds(479, 214, 98, 36);
      getContentPane().add(txtpnNumber_2);
      
      JTextPane txtpnNumber_3 = new JTextPane();
      txtpnNumber_3.setText("number 4");
      txtpnNumber_3.setFont(new Font("Adobe Fan Heiti Std B", Font.PLAIN, 19));
      txtpnNumber_3.setBackground(SystemColor.info);
      txtpnNumber_3.setBounds(677, 214, 98, 36);
      getContentPane().add(txtpnNumber_3);
      
      JTextArea txtrListenTo = new JTextArea();
      txtrListenTo.setText("(how many members of singer who sing this song? )");
      txtrListenTo.setFont(new Font("ÇÔÃÊ·Òµ¸¿ò", Font.PLAIN, 18));
      txtrListenTo.setBackground(Color.ORANGE);
      txtrListenTo.setBounds(224, 66, 445, 36);
      getContentPane().add(txtrListenTo);
      
      JPanel panel = new JPanel();
      panel.setBackground(Color.ORANGE);
      panel.setBounds(83, 26, 727, 76);
      getContentPane().add(panel);
   }
}