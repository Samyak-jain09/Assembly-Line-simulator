package oop_project;
 
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

 class Myframe extends JFrame implements ActionListener{
    
    JButton button,button2,button3,button4,button5,button6;
    JComboBox<Integer> jComboBox1,jComboBox2,jComboBox3,jComboBox4,jComboBox5,jComboBox6;
      JTextField tf1,tf2,tf3,tf4,tf5,tf6;
      JLabel heading;
      int count;
      int assembly_lines;
      input i;
      public Myframe(input i){
    	  this.i=i;
    		this.getContentPane().setBackground(new Color(26, 24, 32));
    		super.setTitle("Assembly line program");
    	  count=0;
    	  assembly_lines=i.n;
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       int y=count+1;
       heading= new JLabel("Assembly Line "+y);
       heading.setForeground(Color.WHITE);
       
     
         heading.setBounds(399, 50, 200, 30);
         heading.setHorizontalAlignment(JLabel.CENTER);
        
         
         Integer[] frameToChoose = {1,2,3,4,5};
         Integer[] wheelsToChoose = {1,2,3};
         Integer[] engineToChoose = {1,2,3,4,5,6,7,8};
         Integer[] interiorToChoose = {1,2,3};
         Integer[] chasisToChoose = {1,2,3,4,5,6,7};
         Integer[] colorToChoose = {1,2,3,4,5,6,7,8,9,10,11,12};
        
        this.setLayout(null);     //edited 
        JLabel label1=new JLabel("Select the Frame type(1-5)");
        JLabel label2=new JLabel("Select the Wheel type(1-3)");
        JLabel label3=new JLabel("Select the Engine type(1-8)");
        JLabel label4=new JLabel("Select the Interior type(1-3)");
        JLabel label5=new JLabel("Select the Chasis type(1-7)");
        JLabel label6=new JLabel("Select the Color type(1-12)");
        label1.setForeground(Color.WHITE);
        label1.setBounds(100, 150, 500, 43);
        label2.setForeground(Color.WHITE);
        label2.setBounds(100, 250, 500, 43);
        label3.setForeground(Color.WHITE);
        label3.setBounds(100, 350, 500, 43);
        label4.setForeground(Color.WHITE);
        label4.setBounds(100, 450, 500, 43);
        label5.setForeground(Color.WHITE);
        label5.setBounds(100, 550, 500, 43);
        label6.setForeground(Color.WHITE);
        label6.setBounds(100, 650, 500, 43);
     
        jComboBox1 = new JComboBox<>(frameToChoose);
        jComboBox1.setBounds(300,150, 200,30); 
 
        jComboBox2 = new JComboBox<>(wheelsToChoose);
         jComboBox2.setBounds(300,250, 200,30); 

        

         jComboBox3 = new JComboBox<>(engineToChoose);
         jComboBox3.setBounds(300,350, 200,30); 
      
         jComboBox4 = new JComboBox<>(interiorToChoose);
         jComboBox4.setBounds(300,450, 200,30); 
     
         jComboBox5 = new JComboBox<>(chasisToChoose);
         jComboBox5.setBounds(300,550, 200,30);
        //tf5.setPreferredSize(new Dimension(250,40));
        
         
         jComboBox6 = new JComboBox<>(colorToChoose);
         jComboBox6.setBounds(300,650, 200,30);
         
         button=new JButton("SUBMIT");
         button.addActionListener(this);
         
//      
         button.setBounds(600, 350, 259, 74);
         button.setBackground(new Color(59, 165, 92));
         button.setForeground(Color.WHITE);
        
        this.add(heading);
        this.add(label1);
        this.add(label2);
        this.add(label3);
        this.add(label4);
        this.add(label5);
        this.add(label6);
        this.add(button);
        this.add(jComboBox1);
        this.add(jComboBox2);
        this.add(jComboBox3);
        this.add(jComboBox4);
        this.add(jComboBox5);
        this.add(jComboBox6);
//       
            
        this.pack();
        this.setBounds(0,0,1000,800);
        this.setResizable(false);
        this.setVisible(true);
      }
      @Override
      public void actionPerformed(ActionEvent e){
          if(e.getSource()==button){
//             
             i.callLine();
             count++;
             reset();
             if(count==i.n)
             {
            	 dispose();
            	 i.startLine();
             }
          }
      }
      public void reset() {
    	  int x=count+1;
    	  heading.setText("Assembly Line "+x);
    	  jComboBox1.setSelectedIndex(0);
    	  jComboBox2.setSelectedIndex(0);
    	  jComboBox3.setSelectedIndex(0);
    	  jComboBox4.setSelectedIndex(0);
    	  jComboBox5.setSelectedIndex(0);
    	  jComboBox6.setSelectedIndex(0);

      }
}



 class Launchpage extends JFrame implements ActionListener{
    JButton button;
    JTextField tf1;
    int assembly_lines;
    input i;
    private JLabel heading;
    private JPanel mainPanel;
    
    Launchpage(input i){
    	super.setTitle("Assembly line program");
    	
    	super.setSize(390, 300);
    	  super.setLocation(100, 150);
    	this.i=i;
    	this.getContentPane().setBackground(new Color(26, 24, 32));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       super.setDefaultLookAndFeelDecorated(true);
        this.setLayout(null);
        
       
        
       
        
        JLabel heading= new JLabel("Launch Page");
       heading.setForeground(Color.WHITE);
        heading.setBounds(399, 50, 200, 30);
        heading.setHorizontalAlignment(JLabel.CENTER);
 
        JLabel ipn = new JLabel("Enter the number of Assembly lines(1-1000)");   
        ipn.setForeground(Color.WHITE);
        ipn.setBounds(250, 152, 500, 43);
        ipn.setHorizontalAlignment(JLabel.CENTER);
      
//   
         button=new JButton("SUBMIT");
         button.addActionListener(this);
         
         button.setSize(75, 20);
         button.setLocation(200, 200);
        button.setBounds(370, 250, 259, 74);
        button.setBackground(new Color(59, 165, 92));
        button.setForeground(Color.WHITE);
         tf1=new JTextField();
         tf1.setBounds(399, 100, 200, 30);
         
        
         tf1.setColumns(10);
//       
       
         this.add(heading,BorderLayout.CENTER);
         
         this.add(ipn);
  this.add(button);
   this.add(tf1);
        
   
         this.pack();
         this.setBounds(0,0,1000,600);
         this.setResizable(false);
        this.setVisible(true);
     
    }
      @Override
      public void actionPerformed(ActionEvent e){
          if(e.getSource()==button && tf1.getText().length()!=0){
        	  {
        	  assembly_lines=Integer.parseInt(tf1.getText());
        	  global.totalNo=assembly_lines*(assembly_lines+1)/2 ;
        	  i.createframe2();
        	  dispose();
        	  }
          
             
             
          }
      }
        
    
    
    
}
