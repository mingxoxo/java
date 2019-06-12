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

public class Modal8 extends JDialog{
	ImageIcon quiz, image, correct, wrong;
   public Modal8(Window parent) {
      
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
      
      JTextPane txtpnEmmaStone = new JTextPane();
      txtpnEmmaStone.setFont(new Font("함초롬돋움", Font.PLAIN, 19));
      txtpnEmmaStone.setBackground(SystemColor.info);
      txtpnEmmaStone.setText("이순신");
      txtpnEmmaStone.setBounds(681, 259, 71, 36);
      getContentPane().add(txtpnEmmaStone);
      
      JTextPane txtpnNumber = new JTextPane();
      txtpnNumber.setText("number 1");
      txtpnNumber.setFont(new Font("Adobe Fan Heiti Std B", Font.PLAIN, 19));
      txtpnNumber.setBackground(SystemColor.info);
      txtpnNumber.setBounds(88, 221, 98, 36);
      getContentPane().add(txtpnNumber);
      
      JTextPane txtpnNumber_1 = new JTextPane();
      txtpnNumber_1.setText("number 2");
      txtpnNumber_1.setFont(new Font("Adobe Fan Heiti Std B", Font.PLAIN, 19));
      txtpnNumber_1.setBackground(SystemColor.info);
      txtpnNumber_1.setBounds(286, 221, 98, 36);
      getContentPane().add(txtpnNumber_1);
      
      JTextPane txtpnNumber_2 = new JTextPane();
      txtpnNumber_2.setText("number 3");
      txtpnNumber_2.setFont(new Font("Adobe Fan Heiti Std B", Font.PLAIN, 19));
      txtpnNumber_2.setBackground(SystemColor.info);
      txtpnNumber_2.setBounds(484, 221, 98, 36);
      getContentPane().add(txtpnNumber_2);
      
      JTextPane txtpnNumber_3 = new JTextPane();
      txtpnNumber_3.setText("number 4");
      txtpnNumber_3.setFont(new Font("Adobe Fan Heiti Std B", Font.PLAIN, 19));
      txtpnNumber_3.setBackground(SystemColor.info);
      txtpnNumber_3.setBounds(682, 221, 98, 36);
      getContentPane().add(txtpnNumber_3);
      
      JTextArea txtrListenTo = new JTextArea();
      txtrListenTo.setText("(Listen to the song and choose the picture of missing person)");
      txtrListenTo.setFont(new Font("함초롬돋움", Font.PLAIN, 18));
      txtrListenTo.setBackground(Color.ORANGE);
      txtrListenTo.setBounds(188, 66, 517, 36);
      getContentPane().add(txtrListenTo);
      
      JPanel panel = new JPanel();
      panel.setBackground(Color.ORANGE);
      panel.setBounds(83, 26, 727, 76);
      getContentPane().add(panel);
      
      JTextArea txtrOst = new JTextArea();
      panel.add(txtrOst);
      txtrOst.setText("8.다음 노래를 듣고 빈칸에 들어갈 인물의 사진을 고르시오.");
      txtrOst.setFont(new Font("함초롬돋움", Font.PLAIN, 24));
      txtrOst.setBackground(Color.ORANGE);
      txtrOst.addMouseListener(new MouseAdapter() {
      	public void mouseClicked(MouseEvent arg0) {
      		txtrOst.setText("Song : 한국을 빛낸 100명의 위인들");
      	}
      });
      
      JTextPane textPane = new JTextPane();
      textPane.setText("김유신");
      textPane.setFont(new Font("함초롬돋움", Font.PLAIN, 19));
      textPane.setBackground(SystemColor.info);
      textPane.setBounds(83, 259, 71, 36);
      getContentPane().add(textPane);
      
      JTextPane textPane_1 = new JTextPane();
      textPane_1.setText("광개토대왕");
      textPane_1.setFont(new Font("함초롬돋움", Font.PLAIN, 19));
      textPane_1.setBackground(SystemColor.info);
      textPane_1.setBounds(287, 259, 97, 36);
      getContentPane().add(textPane_1);
      
      JTextPane textPane_2 = new JTextPane();
      textPane_2.setText("권율");
      textPane_2.setFont(new Font("함초롬돋움", Font.PLAIN, 19));
      textPane_2.setBackground(SystemColor.info);
      textPane_2.setBounds(495, 259, 71, 36);
      getContentPane().add(textPane_2);
      
      wrong = new ImageIcon(getClass().getClassLoader().getResource("incorrect.png"));
      correct = new ImageIcon(getClass().getClassLoader().getResource("correct.png"));
      
      JButton c1 = new JButton("");
      c1.setBounds(82, 307, 120, 181);
      image = new ImageIcon(getClass().getClassLoader().getResource("김유신.PNG"));
      c1.setIcon(image);
      c1.setContentAreaFilled(false);
      c1.setBorderPainted(false);
      getContentPane().add(c1);
      c1.setPressedIcon(correct);
      
      JButton c2 = new JButton("");
      c2.setBounds(284, 307, 120, 181);
      image = new ImageIcon(getClass().getClassLoader().getResource("광개토대왕.PNG"));
      c2.setIcon(image);
      c2.setContentAreaFilled(false);
      c2.setBorderPainted(false);
      getContentPane().add(c2);
      c2.setPressedIcon(wrong);
 
      JButton c3 = new JButton("");
      c3.setBounds(486, 307, 120, 181);
      image = new ImageIcon(getClass().getClassLoader().getResource("권율.PNG"));
      c3.setIcon(image);
      c3.setContentAreaFilled(false);
      c3.setBorderPainted(false);
      getContentPane().add(c3);
      c3.setPressedIcon(wrong);
      
      JButton c4 = new JButton("");
      c4.setBounds(688, 307, 122, 181);
      image = new ImageIcon(getClass().getClassLoader().getResource("이순신.PNG"));
      c4.setIcon(image);
      c4.setContentAreaFilled(false);
      c4.setBorderPainted(false);
      getContentPane().add(c4);
      c4.setPressedIcon(wrong);
      
      JTextArea textArea_1 = new JTextArea();
      textArea_1.setText("원효대사 해골물 혜초 천축국");
      textArea_1.setFont(new Font("휴먼모음T", Font.PLAIN, 22));
      textArea_1.setEditable(false);
      textArea_1.setBackground(SystemColor.info);
      textArea_1.setBounds(286, 145, 359, 36);
      getContentPane().add(textArea_1);
      
      JTextArea txtrOooo = new JTextArea();
      txtrOooo.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		txtrOooo.setText("말목 자른 김유신 통일 문무왕 ");
      	}
      });
      txtrOooo.setText("말목 자른 OOO 통일 문무왕 ");
      txtrOooo.setFont(new Font("휴먼모음T", Font.PLAIN, 22));
      txtrOooo.setEditable(false);
      txtrOooo.setBackground(SystemColor.info);
      txtrOooo.setBounds(286, 114, 359, 36);
      getContentPane().add(txtrOooo);
   }
}