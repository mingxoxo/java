package swing;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class Sound {
	public static int a = 0;
	private JFrame frame;
	private JTextField txtJavaProject;
	ImageIcon image;

	public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Sound window = new Sound();
               window.frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }
   
   public Sound() {
      initialize();
   }

   private void initialize() {
      frame = new JFrame();
      frame.getContentPane().setBackground(SystemColor.windowBorder);
      frame.setSize(1155, 641);
      frame.getContentPane().setLayout(null);
      
      JPanel page_1 = new JPanel();
      page_1.setBounds(0, 0, 1137, 594);
      frame.getContentPane().add(page_1);
      page_1.setToolTipText("Group 3\r\n\r\nSound Quiz");
      page_1.setBackground(new Color(240, 240, 240));
      page_1.setLayout(null);
      
      txtJavaProject = new JTextField();
      txtJavaProject.setEditable(false);
      txtJavaProject.setBounds(397, 33, 405, 57);
      txtJavaProject.setHorizontalAlignment(SwingConstants.CENTER);
      txtJavaProject.setBackground(SystemColor.menu);
      txtJavaProject.setFont(new Font("Bookman Old Style", Font.BOLD, 32));
      txtJavaProject.setForeground(Color.DARK_GRAY);
      txtJavaProject.setText("java project");
      page_1.add(txtJavaProject);
      txtJavaProject.setColumns(10);
      
      JButton btnNewButton = new JButton("New button");
      image = new ImageIcon(getClass().getClassLoader().getResource("UK.jpg"));
      btnNewButton.setIcon(image);
      btnNewButton.setBounds(47, 180, 591, 386);
      page_1.add(btnNewButton);
      
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(Color.DARK_GRAY);
        panel_1.setBounds(459, 109, 642, 393);
        page_1.add(panel_1);
        panel_1.setLayout(null);
        
        JTextArea txtrGroupSound = new JTextArea();
        txtrGroupSound.setForeground(Color.WHITE);
        txtrGroupSound.setFont(new Font("Bookman Old Style", Font.PLAIN, 25));
        txtrGroupSound.setText("Group 3\r\n\r\nSound Quiz\r\n");
        txtrGroupSound.setWrapStyleWord(true);
        txtrGroupSound.setBackground(Color.DARK_GRAY);
        txtrGroupSound.setBounds(444, 277, 232, 116);
        panel_1.add(txtrGroupSound);
        
        JPanel page_2 = new JPanel();
        page_2.setBounds(0, 0, 1137, 594);
        frame.getContentPane().add(page_2);
        page_2.setBackground(SystemColor.menu);
        page_2.setLayout(null);
        
        JTextPane txtpnQuestion = new JTextPane();
        txtpnQuestion.setForeground(Color.LIGHT_GRAY);
        txtpnQuestion.setBackground(Color.DARK_GRAY);
        txtpnQuestion.setFont(new Font("DialogInput", Font.BOLD, 48));
        txtpnQuestion.setText("QUESTION");
        txtpnQuestion.setBounds(153, 59, 290, 68);
        page_2.add(txtpnQuestion);
        
        
        JButton score = new JButton(a + " / 10");
        score.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if (a < 10) {
        		a++;
        		score.setText(a + " / 10");
        		}
        	}
        });
        score.setForeground(Color.LIGHT_GRAY);
        score.setBounds(890, 500, 187, 65);
        page_2.add(score);
        score.setFont(new Font("Bookman Old Style", Font.BOLD, 34));
        score.setContentAreaFilled(false);
        score.setBorderPainted(false);
        score.setBackground(SystemColor.activeCaption);
        
        JTextArea txtrQuestion = new JTextArea();
        txtrQuestion.setRows(8);
        txtrQuestion.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 50));
        txtrQuestion.setBounds(28, 54, 541, 73);
        page_2.add(txtrQuestion);
        txtrQuestion.setBackground(Color.DARK_GRAY);
        
        JTextPane txtpnScore = new JTextPane();
        txtpnScore.setBounds(702, 486, 392, 68);
        page_2.add(txtpnScore);
        txtpnScore.setText("SCORE :");
        txtpnScore.setForeground(Color.LIGHT_GRAY);
        txtpnScore.setFont(new Font("DialogInput", Font.BOLD, 48));
        txtpnScore.setBackground(Color.DARK_GRAY);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBackground(Color.GRAY);
        panel_2.setBounds(71, 102, 974, 386);
        page_2.add(panel_2);
        panel_2.setLayout(null);
        
        JButton btn1 = new JButton("Q1");
        btn1.setFont(new Font("Comic Sans MS", Font.PLAIN, 34));
        btn1.setBackground(SystemColor.activeCaption);
        btn1.setContentAreaFilled(false);
        btn1.setBorderPainted(false);
        
        btn1.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent arg0) {
              Modal m=new Modal(frame);
           m.setVisible(true);
           }
        });
        
        btn1.setBounds(77, 99, 105, 65);
        panel_2.add(btn1);
        
        JButton btn2 = new JButton("Q2");
        btn2.setFont(new Font("Comic Sans MS", Font.PLAIN, 34));
        btn2.setBackground(SystemColor.activeCaption);
        btn2.setContentAreaFilled(false);
        btn2.setBorderPainted(false);
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
               Modal2 m=new Modal2(frame);
            m.setVisible(true);
            }
         });
        btn2.setBounds(259, 99, 105, 65);
        panel_2.add(btn2);
        
        JButton btn3 = new JButton("Q3");
        btn3.setFont(new Font("Comic Sans MS", Font.PLAIN, 34));
        btn3.setBackground(SystemColor.activeCaption);
        btn3.setContentAreaFilled(false);
        btn3.setBorderPainted(false);
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
               Modal3 m=new Modal3(frame);
            m.setVisible(true);
            }
         });
        btn3.setBounds(441, 99, 105, 65);
        panel_2.add(btn3);
        
        JButton btn4 = new JButton("Q4");
        btn4.setFont(new Font("Comic Sans MS", Font.PLAIN, 34));
        btn4.setBackground(SystemColor.activeCaption);
        btn4.setContentAreaFilled(false);
        btn4.setBorderPainted(false);
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
               Modal4 m=new Modal4(frame);
            m.setVisible(true);
            }
         });
        btn4.setBounds(623, 99, 105, 65);
        panel_2.add(btn4);
        
        JButton btn5 = new JButton("Q5");
        btn5.setFont(new Font("Comic Sans MS", Font.PLAIN, 34));
        btn5.setBackground(SystemColor.activeCaption);
        btn5.setContentAreaFilled(false);
        btn5.setBorderPainted(false);
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
               Modal5 m=new Modal5(frame);
            m.setVisible(true);
            }
         });
        btn5.setBounds(805, 99, 105, 65);
        panel_2.add(btn5);
        
        JButton btn6 = new JButton("Q6");
        btn6.setFont(new Font("Comic Sans MS", Font.PLAIN, 34));
        btn6.setBackground(SystemColor.activeCaption);
        btn6.setContentAreaFilled(false);
        btn6.setBorderPainted(false);
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
               Modal6 m=new Modal6(frame);
            m.setVisible(true);
            }
         });
        btn6.setBounds(77, 263, 105, 65);
        panel_2.add(btn6);
        
        JButton btn7 = new JButton("Q7");
        btn7.setFont(new Font("Comic Sans MS", Font.PLAIN, 34));
        btn7.setBackground(SystemColor.activeCaption);
        btn7.setContentAreaFilled(false);
        btn7.setBorderPainted(false);
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
               Modal7 m=new Modal7(frame);
            m.setVisible(true);
            }
         });
        btn7.setBounds(259, 263, 105, 65);
        panel_2.add(btn7);
        
        JButton btn8 = new JButton("Q8");
        btn8.setFont(new Font("Comic Sans MS", Font.PLAIN, 34));
        btn8.setBackground(SystemColor.activeCaption);
        btn8.setContentAreaFilled(false);
        btn8.setBorderPainted(false);
        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
               Modal8 m=new Modal8(frame);
            m.setVisible(true);
            }
         });
        btn8.setBounds(441, 263, 105, 65);
        panel_2.add(btn8);
        
        JButton btn9 = new JButton("Q9");
        btn9.setFont(new Font("Comic Sans MS", Font.PLAIN, 34));
        btn9.setBackground(SystemColor.activeCaption);
        btn9.setContentAreaFilled(false);
        btn9.setBorderPainted(false);
        btn9.setBounds(623, 263, 105, 65);
        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
               Modal9 m=new Modal9(frame);
            m.setVisible(true);
            }
         });
        panel_2.add(btn9);
        
        JButton btn10 = new JButton("Q10");
        btn10.setFont(new Font("Comic Sans MS", Font.PLAIN, 34));
        btn10.setBackground(SystemColor.activeCaption);
        btn10.setContentAreaFilled(false);
        btn10.setBorderPainted(false);
        btn10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
               Modal10 m=new Modal10(frame);
            m.setVisible(true);
            }
         });
        btn10.setBounds(805, 263, 105, 65);
        panel_2.add(btn10);
        
        JTextPane textPane = new JTextPane();
        textPane.setText("QUESTION");
        textPane.setForeground(Color.LIGHT_GRAY);
        textPane.setFont(new Font("DialogInput", Font.BOLD, 48));
        textPane.setBackground(Color.DARK_GRAY);
        textPane.setBounds(153, 59, 290, 68);
        page_2.add(textPane);
      //frame.setResizable(false);
      frame.setLocationRelativeTo(null);
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      btnNewButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent arg0) {
             page_2.setVisible(true);
             page_1.setVisible(false);
          }
       });
   }
}