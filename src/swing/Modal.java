package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Window;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JDialog;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

public class Modal extends JDialog{
   ImageIcon quiz, image, wrong, correct;
   String music, musicOnOff;
   ButtonHandler bHandler = new ButtonHandler();
   Music mu = new Music();
   URL musicURL = null;

   public Modal(Window parent) {
      
      super(parent, "Modal Practice",ModalityType.APPLICATION_MODAL);
      getContentPane().setBackground(SystemColor.info);
      setSize(911,574);
      setLocationRelativeTo(null);
      
      JButton btnPlayMusic = new JButton("");
      btnPlayMusic.setBounds(38, 128, 62, 57);
      btnPlayMusic.setForeground(SystemColor.info);
      btnPlayMusic.setBorderPainted(false);
      btnPlayMusic.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
         }
      });
      getContentPane().setLayout(null);
      btnPlayMusic.setBackground(SystemColor.info);
      quiz = new ImageIcon(getClass().getClassLoader().getResource("sound_icon.png"));
      btnPlayMusic.setIcon(quiz);
      getContentPane().add(btnPlayMusic);
      btnPlayMusic.addActionListener(bHandler);
      btnPlayMusic.setActionCommand("musicB");
      //music = "music/1_lalaland.wav";
      musicURL = getClass().getClassLoader().getResource("1_lalaland.wav");
      musicOnOff = "off";

      
      JTextArea txtrOst = new JTextArea();
      txtrOst.addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent arg0) {
            txtrOst.setText("Song : City of stars - LaLa Land Ost");
         }
      });
      txtrOst.setBounds(112, 36, 668, 36);
      txtrOst.setFont(new Font("«‘√ ∑“µ∏øÚ", Font.PLAIN, 24));
      txtrOst.setBackground(Color.ORANGE);
      txtrOst.setText("1. \uC601\uD654 ost\uB97C \uB4E3\uACE0 \uC774 \uC601\uD654\uC5D0 \uCD9C\uD604\uD558\uC9C0 \uC54A\uC740 \uBC30\uC6B0\uB97C \uACE0\uB974\uC2DC\uC624.");
      getContentPane().add(txtrOst);
      
      JTextPane txtpnEmmaStone = new JTextPane();
      txtpnEmmaStone.setBounds(609, 250, 120, 36);
      txtpnEmmaStone.setFont(new Font("Adobe Fan Heiti Std B", Font.PLAIN, 19));
      txtpnEmmaStone.setBackground(SystemColor.info);
      txtpnEmmaStone.setText("Emma stone");
      getContentPane().add(txtpnEmmaStone);
      
      JTextPane txtpnRyanGosling = new JTextPane();
      txtpnRyanGosling.setBounds(268, 250, 120, 36);
      txtpnRyanGosling.setText("Ryan gosling");
      txtpnRyanGosling.setFont(new Font("Adobe Fan Heiti Std B", Font.PLAIN, 19));
      txtpnRyanGosling.setBackground(SystemColor.info);
      getContentPane().add(txtpnRyanGosling);
      
      JTextPane txtpnJohnLegend = new JTextPane();
      txtpnJohnLegend.setBounds(444, 250, 120, 36);
      txtpnJohnLegend.setText("John legend");
      txtpnJohnLegend.setFont(new Font("Adobe Fan Heiti Std B", Font.PLAIN, 19));
      txtpnJohnLegend.setBackground(SystemColor.info);
      getContentPane().add(txtpnJohnLegend);
      
      JTextPane txtpnBradleyCooper = new JTextPane();
      txtpnBradleyCooper.setBounds(83, 250, 154, 36);
      txtpnBradleyCooper.setText("Bradley cooper");
      txtpnBradleyCooper.setFont(new Font("Adobe Fan Heiti Std B", Font.PLAIN, 19));
      txtpnBradleyCooper.setBackground(SystemColor.info);
      getContentPane().add(txtpnBradleyCooper);
      
      JTextPane txtpnNumber = new JTextPane();
      txtpnNumber.setBounds(83, 214, 98, 36);
      txtpnNumber.setText("number 1");
      txtpnNumber.setFont(new Font("Adobe Fan Heiti Std B", Font.PLAIN, 19));
      txtpnNumber.setBackground(SystemColor.info);
      getContentPane().add(txtpnNumber);
      
      JTextPane txtpnNumber_1 = new JTextPane();
      txtpnNumber_1.setBounds(268, 214, 98, 36);
      txtpnNumber_1.setText("number 2");
      txtpnNumber_1.setFont(new Font("Adobe Fan Heiti Std B", Font.PLAIN, 19));
      txtpnNumber_1.setBackground(SystemColor.info);
      getContentPane().add(txtpnNumber_1);
      
      JTextPane txtpnNumber_2 = new JTextPane();
      txtpnNumber_2.setBounds(444, 214, 98, 36);
      txtpnNumber_2.setText("number 3");
      txtpnNumber_2.setFont(new Font("Adobe Fan Heiti Std B", Font.PLAIN, 19));
      txtpnNumber_2.setBackground(SystemColor.info);
      getContentPane().add(txtpnNumber_2);
      
      JTextPane txtpnNumber_3 = new JTextPane();
      txtpnNumber_3.setBounds(609, 214, 98, 36);
      txtpnNumber_3.setText("number 4");
      txtpnNumber_3.setFont(new Font("Adobe Fan Heiti Std B", Font.PLAIN, 19));
      txtpnNumber_3.setBackground(SystemColor.info);
      getContentPane().add(txtpnNumber_3);
      
      JButton submit = new JButton("submit");
      submit.setBackground(SystemColor.info);
     
      JTextArea txtrListenTo = new JTextArea();
      txtrListenTo.setBounds(108, 66, 677, 36);
      txtrListenTo.setText("(Listen to the movie ost and choose an actor who hasn't appeared in this movie.)");
      txtrListenTo.setFont(new Font("«‘√ ∑“µ∏øÚ", Font.PLAIN, 18));
      txtrListenTo.setBackground(Color.ORANGE);
      getContentPane().add(txtrListenTo);
      
      JPanel panel = new JPanel();
      panel.setBounds(83, 26, 727, 76);
      panel.setBackground(Color.ORANGE);
      getContentPane().add(panel);
      
      JButton c1 = new JButton("");
      
      c1.setBounds(94, 325, 120, 146);
      image = new ImageIcon(getClass().getClassLoader().getResource("bradley_cooper.jpg"));
      c1.setIcon(image);
      c1.setContentAreaFilled(false);
      c1.setBorderPainted(false);
      getContentPane().add(c1);
      correct = new ImageIcon(getClass().getClassLoader().getResource("correct.png"));
      c1.setPressedIcon(correct);
      
      JButton c2 = new JButton("");
      c2.setBounds(268, 325, 120, 146);
      image = new ImageIcon(getClass().getClassLoader().getResource("ryan_gosling.jpg"));
      c2.setIcon(image);
      c2.setContentAreaFilled(false);
      c2.setBorderPainted(false);
      getContentPane().add(c2);
      wrong = new ImageIcon(getClass().getClassLoader().getResource("incorrect.png"));
      c2.setPressedIcon(wrong);
      
      JButton c3 = new JButton("");
      c3.setBounds(444, 325, 120, 146);
      image = new ImageIcon(getClass().getClassLoader().getResource("john_legend.jpg"));
      c3.setIcon(image);
      c3.setContentAreaFilled(false);
      c3.setBorderPainted(false);
      getContentPane().add(c3);
      c3.setPressedIcon(wrong);
      
      JButton c4 = new JButton("");
      c4.setBounds(609, 325, 120, 146);
      image = new ImageIcon(getClass().getClassLoader().getResource("emma_stone.jpg"));
      c4.setIcon(image);
      c4.setContentAreaFilled(false);
      c4.setBorderPainted(false);
      getContentPane().add(c4);
      c4.setPressedIcon(wrong);
      
   }
   public class ButtonHandler implements ActionListener{
      public void actionPerformed(ActionEvent event) {
         String clickedButton = event.getActionCommand();
         
         switch(clickedButton) {
         case "musicB":
            if(musicOnOff.equals("off")) {
               mu.setURL(musicURL);
               mu.play();
               mu.loop();
               musicOnOff = "on";
            }
            else if(musicOnOff.equals("on")) {
               mu.stop();
               musicOnOff = "off";
            }
         }
      }
   }
   public class Music {
	      Clip clip;
	      public void setURL(URL soundFileName) {
	         try {
	            //File file = new File(soundFileName);
	            AudioInputStream sound = AudioSystem.getAudioInputStream(soundFileName);
	            clip = AudioSystem.getClip();
	            clip.open(sound);
	         }
	         catch(Exception e) {
	            
	         }
	      }
	      public void play() {
	         clip.setFramePosition(0);
	         clip.start();
	      }
	      public void loop() {
	         clip.loop(Clip.LOOP_CONTINUOUSLY);
	      }
	      public void stop() {
	         clip.stop();
	         clip.close();
	      }
	   }
}