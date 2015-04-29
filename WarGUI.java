/*Ethan J. Quinn
CS 110
Assignment #10 (Due: 04/29/15) - WAR!!! Card Game playing program
Description:  GUI for WAR card game*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WarGUI extends JFrame
{
   CardWARs warGame;
   
   private JPanel leftPanel, rightPanel, topPanel, bottomPanel, centerPanel;  // break up regions
   private JButton [][] buttons;    // grid of buttons
   private JLabel status, a, b, hands, titleC;  // game status
   private JLabel title;   // static title
   
   // build the GUI
   public WarGUI()
   {
   warGame = new CardWARs();
   // setup containers and components
      centerPanel = new JPanel();
      topPanel = new JPanel();
      leftPanel = new JPanel();
      rightPanel = new JPanel();
      bottomPanel = new JPanel();
          
      topPanel.setBackground(Color.yellow);
      leftPanel.setBackground(Color.yellow);
      rightPanel.setBackground(Color.yellow);
      bottomPanel.setBackground(Color.yellow);
      
      title = new JLabel("Ethan's Game of War");
      title.setFont(new Font("ARIEL",Font.ITALIC,40));
      topPanel.add(title);
      
      titleC = new JLabel("Vs.");
      titleC.setFont(new Font("ARIEL",Font.ITALIC,40));
      centerPanel.add(titleC);

      
      String com = warGame.getUpdateC();
      String pla = warGame.getUpdateP();
      
      hands = new JLabel("COMPUTERS CARD                        YOUR CARD");
      hands.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,18));
      bottomPanel.add(hands);

      a = new javax.swing.JLabel();
            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            a.setIcon(new javax.swing.ImageIcon("CardPics\\" + com + ".jpg"));  
            add(a, BorderLayout.LINE_START);//here i add it to the jlabel
            
      b = new javax.swing.JLabel();
            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            b.setIcon(new javax.swing.ImageIcon("CardPics\\" + pla + ".jpg")); 
            add(b, BorderLayout.LINE_END);//here i add it to the jlabel
      
      
      pack();
      setSize(450, 410);
      JButton NxtHnd = new JButton("Next Hand");
      add(topPanel, BorderLayout.NORTH);
      add(leftPanel, BorderLayout.WEST);
      add(rightPanel, BorderLayout.EAST);
      add(bottomPanel, BorderLayout.SOUTH);
      add(centerPanel, BorderLayout.CENTER);
      setVisible(true);
  
      }
   }