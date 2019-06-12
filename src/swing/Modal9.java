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
public class Modal9 extends JDialog{
	ImageIcon quiz, button, correct, wrong;
   public Modal9(Window parent) {
      
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
      txtrOst.setText("9.애국가를 듣고 빈칸에 들어갈 단어를 고르시오.");
      txtrOst.setFont(new Font("함초롬돋움", Font.PLAIN, 24));
      txtrOst.setBackground(Color.ORANGE);
      txtrOst.setBounds(192, 36, 509, 36);
      getContentPane().add(txtrOst);
      
      JTextPane txtpnEmmaStone = new JTextPane();
      txtpnEmmaStone.setFont(new Font("휴먼모음T", Font.PLAIN, 19));
      txtpnEmmaStone.setBackground(SystemColor.info);
      txtpnEmmaStone.setText("공허한데");
      txtpnEmmaStone.setBounds(75, 249, 166, 57);
      getContentPane().add(txtpnEmmaStone);
      
      JTextPane txtpnRyanGosling = new JTextPane();
      txtpnRyanGosling.setText("공화한데");
      txtpnRyanGosling.setFont(new Font("휴먼모음T", Font.PLAIN, 19));
      txtpnRyanGosling.setBackground(SystemColor.info);
      txtpnRyanGosling.setBounds(276, 249, 166, 57);
      getContentPane().add(txtpnRyanGosling);
      
      JTextPane txtpnJohnLegend = new JTextPane();
      txtpnJohnLegend.setText("공헌한데");
      txtpnJohnLegend.setFont(new Font("휴먼모음T", Font.PLAIN, 19));
      txtpnJohnLegend.setBackground(SystemColor.info);
      txtpnJohnLegend.setBounds(478, 249, 166, 57);
      getContentPane().add(txtpnJohnLegend);
      
      JTextPane txtpnBradleyCooper = new JTextPane();
      txtpnBradleyCooper.setText("공활한데");
      txtpnBradleyCooper.setFont(new Font("휴먼모음T", Font.PLAIN, 19));
      txtpnBradleyCooper.setBackground(SystemColor.info);
      txtpnBradleyCooper.setBounds(679, 249, 166, 57);
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
      c3.setPressedIcon(wrong);
      
      JButton c4 = new JButton("");
      c4.setIcon(button);
      c4.setContentAreaFilled(false);
      c4.setBorderPainted(false);
      c4.setBounds(665, 338, 81, 76);
      getContentPane().add(c4);
      c4.setPressedIcon(correct);
      
      JTextPane txtpnNumber = new JTextPane();
      txtpnNumber.setText("number 1");
      txtpnNumber.setFont(new Font("Adobe Fan Heiti Std B", Font.PLAIN, 19));
      txtpnNumber.setBackground(SystemColor.info);
      txtpnNumber.setBounds(75, 215, 98, 36);
      getContentPane().add(txtpnNumber);
      
      JTextPane txtpnNumber_1 = new JTextPane();
      txtpnNumber_1.setText("number 2");
      txtpnNumber_1.setFont(new Font("Adobe Fan Heiti Std B", Font.PLAIN, 19));
      txtpnNumber_1.setBackground(SystemColor.info);
      txtpnNumber_1.setBounds(276, 215, 98, 36);
      getContentPane().add(txtpnNumber_1);
      
      JTextPane txtpnNumber_2 = new JTextPane();
      txtpnNumber_2.setText("number 3");
      txtpnNumber_2.setFont(new Font("Adobe Fan Heiti Std B", Font.PLAIN, 19));
      txtpnNumber_2.setBackground(SystemColor.info);
      txtpnNumber_2.setBounds(479, 215, 98, 36);
      getContentPane().add(txtpnNumber_2);
      
      JTextPane txtpnNumber_3 = new JTextPane();
      txtpnNumber_3.setText("number 4");
      txtpnNumber_3.setFont(new Font("Adobe Fan Heiti Std B", Font.PLAIN, 19));
      txtpnNumber_3.setBackground(SystemColor.info);
      txtpnNumber_3.setBounds(677, 215, 98, 36);
      getContentPane().add(txtpnNumber_3);
      
      JTextArea txtrListenTo = new JTextArea();
      txtrListenTo.setEditable(false);
      txtrListenTo.setText("(Listen to the National anthem and choose the missing word)");
      txtrListenTo.setFont(new Font("함초롬돋움", Font.PLAIN, 18));
      txtrListenTo.setBackground(Color.ORANGE);
      txtrListenTo.setBounds(181, 66, 531, 36);
      getContentPane().add(txtrListenTo);
      
      JPanel panel = new JPanel();
      panel.setBackground(Color.ORANGE);
      panel.setBounds(83, 26, 727, 76);
      getContentPane().add(panel);
      
      JTextArea txtrOooo = new JTextArea();
      txtrOooo.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		txtrOooo.setText("가을 하늘 공활한데 높고 구름 없이");
      	}
      });
      txtrOooo.setText("가을 하늘 OOOO 높고 구름 없이");
      txtrOooo.setFont(new Font("휴먼모음T", Font.PLAIN, 22));
      txtrOooo.setEditable(false);
      txtrOooo.setBackground(SystemColor.info);
      txtrOooo.setBounds(303, 133, 359, 36);
      getContentPane().add(txtrOooo);
   }
}