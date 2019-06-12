package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
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

public class Modal7 extends JDialog{
   ImageIcon button, quiz, image, wrong, correct, playButton;
      String musicOnOff;
      ButtonHandler bHandler = new ButtonHandler();
      Quiz qu = new Quiz();
      Music mu = new Music();
      URL quizURL, answerURL;
   public Modal7(Window parent) {
      
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
      btnPlayMusic.addActionListener(bHandler);
      btnPlayMusic.setActionCommand("quiz");
      quizURL = getClass().getClassLoader().getResource("우산_문제.wav");
      
      JTextArea txtrOst = new JTextArea();
      txtrOst.setEditable(false);
      txtrOst.setText("7.다음 동요를 듣고 빈 부분에 들어갈 단어들을 고르시오.");
      txtrOst.setFont(new Font("함초롬돋움", Font.PLAIN, 24));
      txtrOst.setBackground(Color.ORANGE);
      txtrOst.setBounds(155, 36, 583, 36);
      getContentPane().add(txtrOst);
      txtrOst.addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent arg0) {
            txtrOst.setText("Song : 우산");
         }
      });
      
      JTextPane txtpnEmmaStone = new JTextPane();
      txtpnEmmaStone.setFont(new Font("휴먼모음T", Font.PLAIN, 19));
      txtpnEmmaStone.setBackground(SystemColor.info);
      txtpnEmmaStone.setText("파란우산 깜장우산 찢어진우산");
      txtpnEmmaStone.setBounds(70, 248, 166, 57);
      getContentPane().add(txtpnEmmaStone);
      
      JTextPane txtpnRyanGosling = new JTextPane();
      txtpnRyanGosling.setText("파란우산 빨강우산 찢어진우산");
      txtpnRyanGosling.setFont(new Font("휴먼모음T", Font.PLAIN, 19));
      txtpnRyanGosling.setBackground(SystemColor.info);
      txtpnRyanGosling.setBounds(271, 248, 166, 57);
      getContentPane().add(txtpnRyanGosling);
      
      JTextPane txtpnJohnLegend = new JTextPane();
      txtpnJohnLegend.setText("빨간우산 파랑우산 찢어진우산");
      txtpnJohnLegend.setFont(new Font("휴먼모음T", Font.PLAIN, 19));
      txtpnJohnLegend.setBackground(SystemColor.info);
      txtpnJohnLegend.setBounds(473, 248, 166, 57);
      getContentPane().add(txtpnJohnLegend);
      
      JTextPane txtpnBradleyCooper = new JTextPane();
      txtpnBradleyCooper.setText("빨간우산 깜장우산 찢어진우산");
      txtpnBradleyCooper.setFont(new Font("휴먼모음T", Font.PLAIN, 19));
      txtpnBradleyCooper.setBackground(SystemColor.info);
      txtpnBradleyCooper.setBounds(674, 248, 166, 57);
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
      c1.setPressedIcon(correct);
     
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
      c4.setPressedIcon(wrong);
      
      JTextPane txtpnNumber = new JTextPane();
      txtpnNumber.setText("number 1");
      txtpnNumber.setFont(new Font("Adobe Fan Heiti Std B", Font.PLAIN, 19));
      txtpnNumber.setBackground(SystemColor.info);
      txtpnNumber.setBounds(83, 215, 98, 36);
      getContentPane().add(txtpnNumber);
      
      JTextPane txtpnNumber_1 = new JTextPane();
      txtpnNumber_1.setText("number 2");
      txtpnNumber_1.setFont(new Font("Adobe Fan Heiti Std B", Font.PLAIN, 19));
      txtpnNumber_1.setBackground(SystemColor.info);
      txtpnNumber_1.setBounds(281, 215, 98, 36);
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
      txtrListenTo.setText("(Listen to the song and find the missing words)");
      txtrListenTo.setFont(new Font("함초롬돋움", Font.PLAIN, 18));
      txtrListenTo.setBackground(Color.ORANGE);
      txtrListenTo.setBounds(244, 66, 405, 36);
      getContentPane().add(txtrListenTo);
      
      JPanel panel = new JPanel();
      panel.setBackground(Color.ORANGE);
      panel.setBounds(83, 26, 727, 76);
      getContentPane().add(panel);
      
      JTextArea txtrOooo = new JTextArea();
      txtrOooo.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            txtrOooo.setText("파란우산 깜장우산 찢어진우산");
         }
      });
      txtrOooo.setText("OO우산 OO우산 OOO우산");
      txtrOooo.setFont(new Font("휴먼모음T", Font.PLAIN, 22));
      txtrOooo.setEditable(false);
      txtrOooo.setBackground(SystemColor.info);
      txtrOooo.setBounds(305, 167, 260, 36);
      getContentPane().add(txtrOooo);
      
      JTextArea textArea_1 = new JTextArea();
      textArea_1.setText("\uC774\uC2AC\uBE44 \uB0B4\uB9AC\uB294 \uC774\uB978\uC544\uCE68\uC5D0 \r\n\uC6B0\uC0B0 \uC14B\uC774 \uB098\uB780\uD788 \uAC78\uC5B4 \uAC11\uB2C8\uB2E4");
      textArea_1.setFont(new Font("휴먼모음T", Font.PLAIN, 22));
      textArea_1.setEditable(false);
      textArea_1.setBackground(SystemColor.info);
      textArea_1.setBounds(305, 114, 282, 71);
      getContentPane().add(textArea_1);
      
      JButton button_1 = new JButton("");
      button_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      button_1.setForeground(SystemColor.info);
      button_1.setBorderPainted(false);
      button_1.setBackground(SystemColor.info);
      button_1.setBounds(778, 128, 62, 57);
      getContentPane().add(button_1);
      playButton = new ImageIcon(getClass().getClassLoader().getResource("play.png"));
      button_1.setIcon(playButton);
      button_1.addActionListener(bHandler);      
      button_1.setActionCommand("answer");
      answerURL = getClass().getClassLoader().getResource("우산_정답.wav");
      musicOnOff = "off";
   }
   public class Quiz {
         Clip clip;
         public void setURL(URL soundFileName) {
            try {
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
      }
      
      public class Music {
         Clip clip;
         public void setURL(URL soundFileName) {
            try {
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
         public void stop() {
            clip.stop();
            clip.close();
         }
      }
      
      public class ButtonHandler implements ActionListener{
         public void actionPerformed(ActionEvent event) {
            String clickedButton = event.getActionCommand();
            
            switch(clickedButton) {
            case "quiz":
               qu.setURL(quizURL);
               qu.play();
               break;
            case "answer":
               if(musicOnOff.equals("off")) {
                    mu.setURL(answerURL);
                    mu.play();
                    musicOnOff = "on";
                 }
                 else if(musicOnOff.equals("on")) {
                    mu.stop();
                    musicOnOff = "off";
                 }
            }
            
               
         }
      }
}