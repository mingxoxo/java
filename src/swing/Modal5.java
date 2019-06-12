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

public class Modal5 extends JDialog{
	ImageIcon quiz, image, correct, wrong;
   public Modal5(Window parent) {
      
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
      txtrOst.setText("5. \uC774 ost\uAC00 \uB4E4\uC5B4\uAC04 \uB4DC\uB77C\uB9C8\uC758 \uB0A8\uC790\uC8FC\uC778\uACF5\uC740?");
      txtrOst.setFont(new Font("함초롬돋움", Font.PLAIN, 24));
      txtrOst.setBackground(Color.ORANGE);
      txtrOst.setBounds(192, 36, 509, 36);
      getContentPane().add(txtrOst);
      txtrOst.addMouseListener(new MouseAdapter() {
      	public void mouseClicked(MouseEvent arg0) {
      		txtrOst.setText("Song : With you - 린 (태양의 후예 OST)");
      	}
      });
      
      JTextPane txtpnEmmaStone = new JTextPane();
      txtpnEmmaStone.setFont(new Font("함초롬돋움", Font.PLAIN, 19));
      txtpnEmmaStone.setBackground(SystemColor.info);
      txtpnEmmaStone.setText("\uC774\uBCD1\uD5CC");
      txtpnEmmaStone.setBounds(109, 225, 71, 36);
      getContentPane().add(txtpnEmmaStone);
      
      JTextPane txtpnNumber = new JTextPane();
      txtpnNumber.setText("number 1");
      txtpnNumber.setFont(new Font("Adobe Fan Heiti Std B", Font.PLAIN, 19));
      txtpnNumber.setBackground(SystemColor.info);
      txtpnNumber.setBounds(94, 197, 98, 36);
      getContentPane().add(txtpnNumber);
      
      JTextPane txtpnNumber_1 = new JTextPane();
      txtpnNumber_1.setText("number 2");
      txtpnNumber_1.setFont(new Font("Adobe Fan Heiti Std B", Font.PLAIN, 19));
      txtpnNumber_1.setBackground(SystemColor.info);
      txtpnNumber_1.setBounds(287, 197, 98, 36);
      getContentPane().add(txtpnNumber_1);
      
      JTextPane txtpnNumber_2 = new JTextPane();
      txtpnNumber_2.setText("number 3");
      txtpnNumber_2.setFont(new Font("Adobe Fan Heiti Std B", Font.PLAIN, 19));
      txtpnNumber_2.setBackground(SystemColor.info);
      txtpnNumber_2.setBounds(483, 197, 98, 36);
      getContentPane().add(txtpnNumber_2);
      
      JTextPane txtpnNumber_3 = new JTextPane();
      txtpnNumber_3.setText("number 4");
      txtpnNumber_3.setFont(new Font("Adobe Fan Heiti Std B", Font.PLAIN, 19));
      txtpnNumber_3.setBackground(SystemColor.info);
      txtpnNumber_3.setBounds(681, 197, 98, 36);
      getContentPane().add(txtpnNumber_3);
      
      JTextArea txtrListenTo = new JTextArea();
      txtrListenTo.setText("(Who is the hero of this drama?)");
      txtrListenTo.setFont(new Font("함초롬돋움", Font.PLAIN, 18));
      txtrListenTo.setBackground(Color.ORANGE);
      txtrListenTo.setBounds(303, 66, 287, 36);
      getContentPane().add(txtrListenTo);
      
      JPanel panel = new JPanel();
      panel.setBackground(Color.ORANGE);
      panel.setBounds(83, 26, 727, 76);
      getContentPane().add(panel);
      
      JTextPane textPane = new JTextPane();
      textPane.setText("\uC1A1\uC911\uAE30");
      textPane.setFont(new Font("함초롬돋움", Font.PLAIN, 19));
      textPane.setBackground(SystemColor.info);
      textPane.setBounds(301, 225, 71, 36);
      getContentPane().add(textPane);
      
      JTextPane textPane_1 = new JTextPane();
      textPane_1.setText("\uC870\uC778\uC131");
      textPane_1.setFont(new Font("함초롬돋움", Font.PLAIN, 19));
      textPane_1.setBackground(SystemColor.info);
      textPane_1.setBounds(493, 225, 71, 36);
      getContentPane().add(textPane_1);
      
      JTextPane textPane_2 = new JTextPane();
      textPane_2.setText("\uAE40\uC218\uD604");
      textPane_2.setFont(new Font("함초롬돋움", Font.PLAIN, 19));
      textPane_2.setBackground(SystemColor.info);
      textPane_2.setBounds(685, 225, 71, 36);
      getContentPane().add(textPane_2);
      
      wrong = new ImageIcon(getClass().getClassLoader().getResource("incorrect.png"));
      correct = new ImageIcon(getClass().getClassLoader().getResource("correct.png"));
      
      JButton c1 = new JButton("");
      c1.setBounds(94, 325, 120, 146);
      image = new ImageIcon(getClass().getClassLoader().getResource("이병헌.jpg"));
      c1.setIcon(image);
      c1.setContentAreaFilled(false);
      c1.setBorderPainted(false);
      getContentPane().add(c1);
      c1.setPressedIcon(wrong);
      
      JButton c2 = new JButton("");
      c2.setBounds(268, 325, 120, 146);
      image = new ImageIcon(getClass().getClassLoader().getResource("송중기.jpg"));
      c2.setIcon(image);
      c2.setContentAreaFilled(false);
      c2.setBorderPainted(false);
      getContentPane().add(c2);
      
      c2.setPressedIcon(correct);
      
      JButton c3 = new JButton("");
      c3.setBounds(444, 325, 120, 146);
      image = new ImageIcon(getClass().getClassLoader().getResource("조인성.jpg"));
      c3.setIcon(image);
      c3.setContentAreaFilled(false);
      c3.setBorderPainted(false);
      getContentPane().add(c3);
      c3.setPressedIcon(wrong);
      
      JButton c4 = new JButton("");
      c4.setBounds(609, 325, 120, 146);
      image = new ImageIcon(getClass().getClassLoader().getResource("김수현.jpg"));
      c4.setIcon(image);
      c4.setContentAreaFilled(false);
      c4.setBorderPainted(false);
      getContentPane().add(c4);
      c4.setPressedIcon(wrong);
   }
}