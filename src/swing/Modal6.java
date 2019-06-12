package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Window;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JDialog;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
public class Modal6 extends JDialog{
	ImageIcon quiz, button, correct, wrong;
   public Modal6(Window parent) {
      
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
      txtrOst.setEditable(false);
      txtrOst.setText("6.\uB2E4\uC74C \uB3D9\uC694\uB97C \uB4E3\uACE0 \uB4A4\uC5D0 \uC774\uC5B4\uC9C8 \uB2E8\uC5B4\uB97C \uACE0\uB974\uC2DC\uC624.");
      txtrOst.setFont(new Font("ÇÔÃÊ·Òµ¸¿ò", Font.PLAIN, 24));
      txtrOst.setBackground(Color.ORANGE);
      txtrOst.setBounds(192, 36, 509, 36);
      getContentPane().add(txtrOst);
      txtrOst.addMouseListener(new MouseAdapter() {
      	public void mouseClicked(MouseEvent arg0) {
      		txtrOst.setText("Song : ½Ã³Á¹°Àº Á¹Á¹Á¹Á¹ ");
      	}
      });
      
      JTextPane txtpnEmmaStone = new JTextPane();
      txtpnEmmaStone.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.PLAIN, 19));
      txtpnEmmaStone.setBackground(SystemColor.info);
      txtpnEmmaStone.setText("\uC0B0\uB4E4\uC0B0\uB4E4");
      txtpnEmmaStone.setBounds(83, 296, 120, 36);
      getContentPane().add(txtpnEmmaStone);
      
      JTextPane txtpnRyanGosling = new JTextPane();
      txtpnRyanGosling.setText("\uD558\uB298\uD558\uB298");
      txtpnRyanGosling.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.PLAIN, 19));
      txtpnRyanGosling.setBackground(SystemColor.info);
      txtpnRyanGosling.setBounds(284, 296, 120, 36);
      getContentPane().add(txtpnRyanGosling);
      
      JTextPane txtpnJohnLegend = new JTextPane();
      txtpnJohnLegend.setText("\uD55C\uB4E4\uD55C\uB4E4");
      txtpnJohnLegend.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.PLAIN, 19));
      txtpnJohnLegend.setBackground(SystemColor.info);
      txtpnJohnLegend.setBounds(486, 296, 120, 36);
      getContentPane().add(txtpnJohnLegend);
      
      JTextPane txtpnBradleyCooper = new JTextPane();
      txtpnBradleyCooper.setText("\uBD80\uB4E4\uBD80\uB4E4");
      txtpnBradleyCooper.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.PLAIN, 19));
      txtpnBradleyCooper.setBackground(SystemColor.info);
      txtpnBradleyCooper.setBounds(687, 296, 120, 36);
      getContentPane().add(txtpnBradleyCooper);
      
      JButton c1 = new JButton("");
      button = new ImageIcon(getClass().getClassLoader().getResource("button.png"));
      wrong = new ImageIcon(getClass().getClassLoader().getResource("incorrect.png"));
      correct = new ImageIcon(getClass().getClassLoader().getResource("correct.png"));
      c1.setIcon(button);
      c1.setBorderPainted(false);
      c1.setContentAreaFilled(false);
      c1.setBounds(83, 338, 81, 76);
      getContentPane().add(c1);
      c1.setPressedIcon(wrong);
     
      JButton c2 = new JButton("");
      c2.setIcon(button);
      c2.setContentAreaFilled(false);
      c2.setBorderPainted(false);
      c2.setBounds(277, 338, 81, 76);
      getContentPane().add(c2);
      c2.setPressedIcon(wrong);
      
      JButton c3 = new JButton("");
      c3.setIcon(button);
      c3.setContentAreaFilled(false);
      c3.setBorderPainted(false);
      c3.setBounds(471, 338, 81, 76);
      getContentPane().add(c3);
      c3.setPressedIcon(correct);
      
      JButton c4 = new JButton("");
      c4.setIcon(button);
      c4.setContentAreaFilled(false);
      c4.setBorderPainted(false);
      c4.setBounds(665, 338, 81, 76);
      getContentPane().add(c4);
      c4.setPressedIcon(wrong);
      
      JTextPane txtpnNumber = new JTextPane();
      txtpnNumber.setText("number 1");
      txtpnNumber.setFont(new Font("Adobe Fan Heiti Std B", Font.PLAIN, 19));
      txtpnNumber.setBackground(SystemColor.info);
      txtpnNumber.setBounds(83, 260, 98, 36);
      getContentPane().add(txtpnNumber);
      
      JTextPane txtpnNumber_1 = new JTextPane();
      txtpnNumber_1.setText("number 2");
      txtpnNumber_1.setFont(new Font("Adobe Fan Heiti Std B", Font.PLAIN, 19));
      txtpnNumber_1.setBackground(SystemColor.info);
      txtpnNumber_1.setBounds(281, 260, 98, 36);
      getContentPane().add(txtpnNumber_1);
      
      JTextPane txtpnNumber_2 = new JTextPane();
      txtpnNumber_2.setText("number 3");
      txtpnNumber_2.setFont(new Font("Adobe Fan Heiti Std B", Font.PLAIN, 19));
      txtpnNumber_2.setBackground(SystemColor.info);
      txtpnNumber_2.setBounds(479, 260, 98, 36);
      getContentPane().add(txtpnNumber_2);
      
      JTextPane txtpnNumber_3 = new JTextPane();
      txtpnNumber_3.setText("number 4");
      txtpnNumber_3.setFont(new Font("Adobe Fan Heiti Std B", Font.PLAIN, 19));
      txtpnNumber_3.setBackground(SystemColor.info);
      txtpnNumber_3.setBounds(677, 260, 98, 36);
      getContentPane().add(txtpnNumber_3);
      
      JTextArea txtrListenTo = new JTextArea();
      txtrListenTo.setEditable(false);
      txtrListenTo.setText("(Listen to the song and find the next word)");
      txtrListenTo.setFont(new Font("ÇÔÃÊ·Òµ¸¿ò", Font.PLAIN, 18));
      txtrListenTo.setBackground(Color.ORANGE);
      txtrListenTo.setBounds(267, 66, 359, 36);
      getContentPane().add(txtrListenTo);
      
      JPanel panel = new JPanel();
      panel.setBackground(Color.ORANGE);
      panel.setBounds(83, 26, 727, 76);
      getContentPane().add(panel);
      
      JTextArea textArea_1 = new JTextArea();
      textArea_1.setText("½Ã³Á¹°Àº Á¹Á¹Á¹Á¹ °í±âµéÀº ¿Ô´Ù °¬´Ù");
      textArea_1.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.PLAIN, 22));
      textArea_1.setEditable(false);
      textArea_1.setBackground(SystemColor.info);
      textArea_1.setBounds(277, 114, 359, 36);
      getContentPane().add(textArea_1);
      
      JTextArea txtrOooo = new JTextArea();
      txtrOooo.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		txtrOooo.setText("¹öµé°¡Áö ÇÑµéÇÑµé ²Ò²¿¸®´Â ²Ò²Ã²Ò²Ã");
      	}
      });
      txtrOooo.setText("¹öµé °¡Áö OOOO ²Ò²¿¸®´Â ²Ò²Ã²Ò²Ã");
      txtrOooo.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.PLAIN, 22));
      txtrOooo.setEditable(false);
      txtrOooo.setBackground(SystemColor.info);
      txtrOooo.setBounds(277, 151, 359, 36);
      getContentPane().add(txtrOooo);
   }
}