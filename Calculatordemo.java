import java.io.*;
import javax.swing.*;  
import java.awt.event.*;  
public class Calculatordemo implements ActionListener{  
    JTextField t,tf2,tf3;
    Double a,b,result;
    int operator;  
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b11,b10,beq,bc,bmul,bdiv;  
    Calculatordemo(){  
        JFrame f= new JFrame(); 
        t=new JTextField();  
        t.setBounds(10,10,250,50);  
        tf2=new JTextField();  
        tf2.setBounds(10,33,150,30);  
        tf3=new JTextField();  
        tf3.setBounds(11,54,149,30);  
        tf3.setEditable(false);   
         b3=new JButton("1");  
        b3.setBounds(10,100,50,50); 
         b4=new JButton("2");  
        b4.setBounds(70,100,50,50); 
         b5=new JButton("3");  
        b5.setBounds(130,100,50,50); 
         b6=new JButton("4");  
        b6.setBounds(10,170,50,50); 
         b7=new JButton("5");  
        b7.setBounds(70,170,50,50); 
         b8=new JButton("6");  
        b8.setBounds(130,170,50,50); 
         b9=new JButton("7");  
        b9.setBounds(10,230,50,50); 
         b0=new JButton("8");  
        b0.setBounds(70,230,50,50); 
         b11=new JButton("9");  
        b11.setBounds(130,230,50,50);  
        b10=new JButton("0");  
        b10.setBounds(70,290,50,50); 
          b1=new JButton("+");  
        b1.setBounds(10,290,50,50);  
        b2=new JButton("-");  
        b2.setBounds(130,290,50,50);
        
        beq=new JButton("=");
        beq.setBounds(200,100,50,50);

        bmul = new JButton("X");
        bmul.setBounds(200,230,50,50);

        bdiv = new JButton("/");
        bdiv.setBounds(200,290,50,50);

        bc = new JButton("C");
        bc.setBounds(200,170,50,50);

        b1.addActionListener(this);  
        b2.addActionListener(this);  
        f.add(bmul);f.add(bdiv);f.add(bc);f.add(beq);f.add(t);f.add(b1);f.add(b2); f.add(b3); f.add(b4); f.add(b5); f.add(b6) ; f.add(b7) ;  f.add(b8) ;  f.add(b9) ;  f.add(b0);  f.add(b11); f.add(b10) ;     
        f.setSize(300,400);  
        f.setLayout(null);  
        f.setVisible(true);
        
        bc.addActionListener(this);
        b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
        b0.addActionListener(this);
        b11.addActionListener(this);
        b10.addActionListener(this);
        beq.addActionListener(this);
        bmul.addActionListener(this);
        bdiv.addActionListener(this);
    }         
    public void actionPerformed(ActionEvent e) {  
         
        if(e.getSource()==b3)
			t.setText(t.getText().concat("1"));
		
		if(e.getSource()==b4)
			t.setText(t.getText().concat("2"));
		
		if(e.getSource()==b5)
			t.setText(t.getText().concat("3"));
		
		if(e.getSource()==b6)
			t.setText(t.getText().concat("4"));
		
		if(e.getSource()==b7)
			t.setText(t.getText().concat("5"));
		
		if(e.getSource()==b8)
			t.setText(t.getText().concat("6"));
		
		if(e.getSource()==b9)
			t.setText(t.getText().concat("7"));
		
		if(e.getSource()==b0)
            t.setText(t.getText().concat("8"));

        if(e.getSource()==b11)
			t.setText(t.getText().concat("9"));
		
		if(e.getSource()==b10)
            t.setText(t.getText().concat("0"));

        if(e.getSource()==b1)
        {
            a=Double.parseDouble(t.getText());
			operator=1;
			t.setText("");
        }
            

        if(e.getSource()==b2)
        {
            a=Double.parseDouble(t.getText());
            operator=2;
            t.setText("");
        }
        if(e.getSource()==bmul)
        {
            a=Double.parseDouble(t.getText());
            operator=3;
            t.setText("");
        }
        if(e.getSource()==bdiv)
        {
            a=Double.parseDouble(t.getText());
            operator=4;
            t.setText("");
        }
        if(e.getSource()==bc)
        {
            t.setText("");
        }
        
        if(e.getSource()==beq)
		{
			b=Double.parseDouble(t.getText());
		
			switch(operator)
			{
				case 1: result=a+b;
					break;
		
				case 2: result=a-b;
					break;
		
				case 3: result=a*b;
					break;
		
				case 4: result=a/b;
					break;
		
				default: result=0.0;
			}
		
			t.setText(""+result);
		}
		
        
    }  
public static void main(String[] args) {  
    new Calculatordemo();  
} }