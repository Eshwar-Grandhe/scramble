package sample;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

import java.awt.*;
class awt extends JFrame implements ActionListener,KeyListener
{
JTextField[][] t=new JTextField[15][15];
ArrayList<String> storage;
JScrollPane scroll;
JTextField Num;
JTextArea thelp; 
JLabel background;
JLabel l0,l1,l2,l3,l4,l5,l6,l7;
JLabel la,lb,lc,ld,le,lf,lg;
JLabel title;
JButton start,np,help,back,quit;
JFrame f1;
String x;
JPanel p;
int i1,j1,m,o;
int i,j,k,cell,points=0,g;
String a[][] =new String[15][15];
String old[][] =new String[15][15];
int c[]=new int[2];
int p2[]=new int[6];
String s;
int n=1;

awt()
{
thelp= new JTextArea();
thelp.setEditable(false);
thelp.setFont(new Font("Helvetica", Font.BOLD, 20));
thelp.setForeground(Color.WHITE);
thelp.setBackground(new Color(9, 49, 69));
thelp.setLineWrap(true);
//thelp.setCaretPosition(0);
scroll = new JScrollPane (thelp);
scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
back = new JButton("BACK");
back.setBounds(1200,25,130,25);
back.setOpaque(true);
back.setBackground(new Color(135,206,250));
back.setForeground(new Color(204,255,204));
back.setFont(new Font("Tahoma", Font.BOLD, 32));
back.setOpaque(true);
back.setContentAreaFilled(true);
back.setBorderPainted(false);
start = new JButton("START");
start.setBounds(600,250,140,25);
start.setOpaque(true);
start.setBackground(new Color(135,206,250));
start.setForeground(new Color(204,255,204));
start.setFont(new Font("Tahoma", Font.BOLD, 32));
start.setOpaque(true);
start.setContentAreaFilled(true);
start.setBorderPainted(false);
quit = new JButton("QUIT");
quit.setBounds(600,550,120,40);
quit.setOpaque(true);
quit.setBackground(new Color(135,206,250));
quit.setForeground(new Color(204,255,204));
quit.setFont(new Font("Tahoma", Font.BOLD, 32));
quit.setOpaque(true);
quit.setContentAreaFilled(true);
quit.setBorderPainted(false);
np = new JButton("NO.OF PLAYERS");
np.setBounds(515,350,300,25);
np.setOpaque(true);
np.setBackground(new Color(135,206,250));
np.setForeground(new Color(204,255,204));
np.setFont(new Font("Tahoma", Font.BOLD, 32));
np.setOpaque(true);
np.setContentAreaFilled(true);
np.setBorderPainted(false);
help = new JButton("INSTRUCTIONS");
help.setBounds(515,450,300,25);
help.setOpaque(true);
help.setBackground(new Color(135,206,250));
help.setForeground(new Color(204,255,204));
help.setFont(new Font("Tahoma", Font.BOLD, 32));
help.setOpaque(true);
help.setContentAreaFilled(true);
help.setBorderPainted(false);
Num=new JTextField();
Num.setBounds(850,350,25,25);
Num.setVisible(true);
f1 = new JFrame();
f1.setLocationRelativeTo(null);
f1.setDefaultCloseOperation(EXIT_ON_CLOSE);
f1.setResizable(false);
f1.setLayout(null);
/*JLabel background=new JLabel(new ImageIcon("C:\\\\Users\\\\SAHITH REDDY\\\\Downloads\\\\CB-3.png"));
background.setBounds(325, 0, 720, 894);
background.setSize(720,720);
f1.add(background);
OR
JLabel i=new JLabel();
ImageIcon i = new ImageIcon("f:/image.png")
*/
f1.setBounds(0,0,1440,1080);
f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
f1.add(start);f1.add(np);f1.add(help);f1.add(quit);f1.add(Num);
f1.getContentPane().setBackground(new Color(135,206,250));
f1.setVisible(true);
start.setVisible(true);
help.setVisible(true);
np.setVisible(true);
quit.setVisible(true);
title=new JLabel("WORD BUILDING");  
title.setBounds(450,0,600,200);
title.setForeground(new Color(0,51,153));
title.setFont(new Font("Algerian", Font.BOLD, 60));
f1.add(title);
l0=new JLabel("CPU");  
l0.setBounds(1050,50,200,200);
l1=new JLabel("A");  
l1.setBounds(975,50,200,200);  
l2=new JLabel("B");  
l2.setBounds(1050,50,200,200);
l3=new JLabel("C");  
l3.setBounds(1125,50,200,200);  
l4=new JLabel("D");  
l4.setBounds(1200,50,200,200); 
l5=new JLabel("E");  
l5.setBounds(1275,50,200,200);  
l6=new JLabel("F");  
l6.setBounds(1350,50,200,200);
l7=new JLabel();  
l7.setBounds(975,350,400,200);
l7.setForeground(Color.RED);
l7.setFont(new Font("Tahoma", Font.BOLD, 32));
l7.setText("");f1.add(l7);
l7.setVisible(true);
la=new JLabel();  
la.setBounds(975,150,100,100);  
lb=new JLabel();  
lb.setBounds(1050,150,100,100); 
lc=new JLabel();  
lc.setBounds(1125,150,100,100);  
ld=new JLabel();  
ld.setBounds(1200,150,100,100);
le=new JLabel();  
le.setBounds(1275,150,100,100);  
lf=new JLabel();  
lf.setBounds(1350,150,100,100);
lg=new JLabel();  
lg.setBounds(972,250,400,100);  
lg.setForeground(Color.BLACK);
lg.setFont(new Font("Tahoma", Font.BOLD, 32));
lg.setVisible(true);
start.addActionListener(this);
back.addActionListener(this);
quit.addActionListener(this);
np.addActionListener(this);
help.addActionListener(this);

}

public void actionPerformed(ActionEvent e)
{
	if((e.getSource())==quit)
	{
		System.exit(0);
	}
	
	if((e.getSource())==help)
	{
		back.setVisible(true);
		start.setVisible(false);
		help.setVisible(false);
		np.setVisible(false);
		quit.setVisible(false);
		title.setVisible(false);
		f1.getContentPane().setBackground(new Color(135,206,250));
		title=new JLabel("INSTRUCTIONS");  
		title.setBounds(450,50,600,200);
		title.setBackground(new Color(0,51,153));
		title.setFont(new Font("Algerian", Font.BOLD, 60));
		help.setBackground(new Color(135,206,250));
		thelp.setVisible(true);
		scroll.setVisible(true);
		thelp.setBounds(200,200,1000,400);
		scroll.setBounds(200,200,1000,400);
		f1.getContentPane().add(scroll);
		f1.add(back);
		f1.add(title);
	thelp.setText("When Playing Word Building, Anywhere From Two To Six Players Will Enjoy The Game. The Object When Playing Is To Score More Points Than Other Players. "+"\n"
				+ "As Letter Is Entered On The Game Board, Points Are Collected Based On The Maximum Length Of The Word Formed By Entered Letter And Previous Letters On Game Board "+"\n"
				+ "The Main Strategy Is To Enter Letter That Forms A Bigger Length Word. Default No.of Players Are Two, Press No.of Players Button For The Desired Number Of Players\n\n"
				+ "The Scrabble Board\n" +  
				  "A standard Scrabble board will consist of cells that are located in a large square grid. The board offers 15 cells high and 15 cells wide.\n "
				+ "The Player Should Enter His Letter Into Any Of His Desired Cell. \n\n"
				+ "Letters\n"
				+ "Only Any One Of The 26 English Alphabet Can Be Entered Into A Cell Others Are Invalid."
				+ "Player Cannot Enter Letter In More than One Cell At His Turn. Its Invalid" 
				+ "If Player Didn't Get Any Idea About A Word And Want To Pass His Chance, Then Just Press Enter Key In Any Cell Without Entering Any Letter.\n\n"
				+ "Starting the Game\n"
				+ "User Can Set Number Of Players From Two To Six By Clicking No.of Players Button. After Pressing Start, The Player Who Enters The First Letter Will Be Player A."
				+ "The Person Who Enters The Second Letter Will be Player B And The Same Goes On .\n\n"
				+ "The End of a Scrabble Game\n" + 
				  "Once all The Cells are Filled With Letters, the game will end and the player with the highest score wins.\n\n"
				+ "Accepted Scrabble Words\n" + 
				  "Any word that is found in a standard English dictionary can be used in the game of Scrabble. There are also Official Dictionaries that can be purchased for more word options.\n" + 
				  "There are some words that are allowed to be played and these include suffixes, prefixes and abbreviations. Any word that requires the use of a hyphen or apostrophe cannot be played in the game.\n"
			   + " Any word that required the use of a capital letter is also allowed.\n" + 
				  "When playing an English version of the game, foreign words are not allowed to be placed on the board. However, if the foreign word does appear in a standard English dictionary, it is allowed.\n "
			    + "The reason for this is due to the fact that the word is spoken enough and is considered part of the English language. Same  Word  Should Not Be Repeated");
		f1.setBounds(0,0,1440,1080);
		f1.setSize(1440,1080);
		f1.setLayout(null);
		f1.setVisible(true);
	}
	if((e.getSource())==back)
	{
		p.setVisible(false);
		lg.setVisible(false);
		title.setVisible(false);
		scroll.setVisible(false);
		title=new JLabel("WORD BUILDING");  
		title.setBounds(450,0,600,200);
		title.setBackground(new Color(0,51,153));
		title.setFont(new Font("Algerian", Font.BOLD, 60));
		f1.add(title);
		start.setVisible(true);
		help.setVisible(true);
		np.setVisible(true);
		quit.setVisible(true);
		back.setVisible(false);
		l0.setVisible(false);
		l1.setVisible(false);l2.setVisible(false);l3.setVisible(false);l4.setVisible(false);l5.setVisible(false);l6.setVisible(false);
	    la.setVisible(false);lb.setVisible(false);lc.setVisible(false);le.setVisible(false);lf.setVisible(false);l7.setVisible(false);
	}
		
	if((e.getSource())==np)
	{
		n=Integer.valueOf(Num.getText());

		if(n>6||n<1)
		{
			l7.setText("<html>Maximum No.of Players Are 6 <br>And Minimum is 1, Enter Again</html>");
			l7.setBounds(850,450,600,75);
			l7.setForeground(Color.RED);
			l7.setFont(new Font("Tahoma", Font.BOLD, 24));
			f1.add(l7);
			l7.setVisible(true);
			f1.setVisible(true);
		}
		else
			l7.setText("");
		
	}
	
	if((e.getSource())==start)
	{
		start.setVisible(false);
		help.setVisible(false);
		np.setVisible(false);
		quit.setVisible(false);
		title.setVisible(false);
		back.setVisible(true);
		lg.setVisible(true);
		l1.setVisible(true);l2.setVisible(true);l3.setVisible(true);l4.setVisible(true);l5.setVisible(true);l6.setVisible(true);
	    l1.setVisible(true);l2.setVisible(true);l3.setVisible(true);l4.setVisible(true);l5.setVisible(true);l6.setVisible(true);
		storage=new ArrayList<String>();
		thelp.setText("Words Formed:");
		thelp.setBounds(75,100,200,500);
		scroll.setBounds(75,100,200,500);
		thelp.setVisible(true);
		g=-1;
		f1.getContentPane().setBackground(new Color(135,206,250));
		f1.add(back);
		scroll.setVisible(true);
		f1.getContentPane().add(scroll);
	    p=new JPanel();
		p.setBackground(Color.BLUE);
		p.setBounds(350,75,600,600);
		if(g==-1)
		{
			l7.setText("<html>Press Enter Key<br> To Enter The Alphabet</html>");
			l7.setBounds(975,350,400,200);
	    	f1.add(l7);
	    	l7.setVisible(true);
		}
		for(i=0;i<15;i++)
		{
			if(i<6)
			{
				p2[i]=0;
				points=0;
			}
			for(j=0;j<15;j++)
			{
			old[i][j]="";
			a[i][j]="";
			t[i][j]=new JTextField();
			t[i][j].setDocument(new FixedSizeDocument(1));
			t[i][j].addKeyListener(this);
			t[i][j].setHorizontalAlignment(JTextField.CENTER);
			if((i+j)%2==0)
			{
				t[i][j].setBackground(Color.WHITE);
			t[i][j].setForeground(Color.BLACK);
			}
			else
			{
				t[i][j].setBackground(Color.BLACK);
			t[i][j].setForeground(Color.WHITE);
			}
			p.add(t[i][j]);
			}
		}
		p.setSize(550,550);
		p.setLayout(new GridLayout(15,15));
		p.setVisible(true);
		f1.add(p);
		f1.setBounds(0,0,1440,1080);
		f1.setSize(1440,1080);
		f1.setExtendedState(JFrame.MAXIMIZED_BOTH);
		f1.setLayout(null);
		f1.setVisible(true);
		turnpoints();
		if(n==1)
		{
		    f1.add(l1); f1.add(l0);
		    f1.add(la); f1.add(lb);
		    l1.setVisible(true);l0.setVisible(true);
		    la.setVisible(true);lb.setVisible(true);
		}
		if(n==2)
		{
		    f1.add(l1); f1.add(l2);
		    f1.add(la); f1.add(lb);
		    l1.setVisible(true);l2.setVisible(true);
		    la.setVisible(true);lb.setVisible(true);
		}
		if(n==3)
		{
		    f1.add(l1); f1.add(l2);f1.add(l3);
		    f1.add(la); f1.add(lb); f1.add(lc);
		    l1.setVisible(true);l2.setVisible(true);l3.setVisible(true);
		    la.setVisible(true);lb.setVisible(true);lc.setVisible(true);
		}
		if(n==4)
		{
		    f1.add(l1); f1.add(l2);f1.add(l3); f1.add(l4);
		    f1.add(la); f1.add(lb); f1.add(lc); f1.add(ld);
		    l1.setVisible(true);l2.setVisible(true);l3.setVisible(true);l4.setVisible(true);
		    la.setVisible(true);lb.setVisible(true);lc.setVisible(true);ld.setVisible(true);
		}
		if(n==5)
		{
		    f1.add(l1); f1.add(l2);f1.add(l3); f1.add(l4);f1.add(l5);
		    f1.add(la); f1.add(lb); f1.add(lc); f1.add(ld); f1.add(le);
		    l1.setVisible(true);l2.setVisible(true);l3.setVisible(true);l4.setVisible(true);l5.setVisible(true);
		    la.setVisible(true);lb.setVisible(true);lc.setVisible(true);ld.setVisible(true);le.setVisible(true);
		}
		if(n==6)
		{
		    f1.add(l1); f1.add(l2);f1.add(l3); f1.add(l4);f1.add(l5); f1.add(l6);
		    f1.add(la); f1.add(lb); f1.add(lc); f1.add(ld); f1.add(le); f1.add(lf);
		    l1.setVisible(true);l2.setVisible(true);l3.setVisible(true);l4.setVisible(true);l5.setVisible(true);l6.setVisible(true);
		    l1.setVisible(true);l2.setVisible(true);l3.setVisible(true);l4.setVisible(true);l5.setVisible(true);l6.setVisible(true);
		}
		
	}
	}
	
public void keyReleased(KeyEvent e)
{
}
public void keyTyped(KeyEvent e)
{
}
public void keyPressed(KeyEvent e)
{
	if((e.getKeyCode())==KeyEvent.VK_ENTER)
	{
		l7.setText("");
		for(i=0;i<15;i++)
		{
			for(j=0;j<15;j++)
			{
				a[i][j]=t[i][j].getText().toLowerCase();
				
		}
	}
        comparearray(); 
        i=c[0];j=c[1];
        if(a[i][j].equals("")||a[i][j].equals("a")||a[i][j].equals("b")||a[i][j].equals("c")||a[i][j].equals("d")||a[i][j].equals("e")||a[i][j].equals("f")||a[i][j].equals("g")||a[i][j].equals("h")||a[i][j].equals("i")||a[i][j].equals("j")||a[i][j].equals("k")||a[i][j].equals("l")||a[i][j].equals("m")||a[i][j].equals("n")||a[i][j].equals("o")||a[i][j].equals("p")||a[i][j].equals("q")||a[i][j].equals("r")||a[i][j].equals("s")||a[i][j].equals("t")||a[i][j].equals("u")||a[i][j].equals("v")||a[i][j].equals("w")||a[i][j].equals("x")||a[i][j].equals("y")||a[i][j].equals("z")) 	
        {
        	t[i][j].setFont(new Font("BREMAN BD BT", Font.BOLD, 18));
        	t[i][j].setText(a[i][j].toUpperCase());
        t[i][j].setEditable(false);
        if(a[i][j].equals(""))
        	t[i][j].setEditable(true);
        check(c[0],c[1]);
        }
        else
        {
        	g--;
        	a[i][j]="";
        	old[i][j]="";
        	l7.setText("Invalid Letter");
        	f1.add(l7);
        	l7.setVisible(true);
        }
	}		
}

public void turnpoints()
{
	if(n==1)
	{
		i=0;j=0;k=0;
		for(i=0;i<15;i++)
		{
			for(j=0;j<15;j++)
		{
			if(!a[i][j].isEmpty())
			{
				k++;
			}
		}
		}
		if(k!=225)
		{
	    String q[]=vscpu();
	    System.out.println("1");
	    la.setText(q[0]);lb.setText(q[1]);
	    la.setVisible(true);lb.setVisible(true);
		}
	    g++;
	}
	if(n==2)
	{
	    String q[]=point2();
	    la.setText(q[0]);lb.setText(q[1]);
	    la.setVisible(true);lb.setVisible(true);
	}
	if(n==3)
	{
	    String q[]=point3();
	    la.setText(q[0]);lb.setText(q[1]);lc.setText(q[2]);
	    la.setVisible(true);lb.setVisible(true);lc.setVisible(true);
	}
	if(n==4)
	{
	    String q[]=point4();
	    la.setText(q[0]);lb.setText(q[1]);lc.setText(q[2]);ld.setText(q[3]);
	    la.setVisible(true);lb.setVisible(true);lc.setVisible(true);ld.setVisible(true);
	}
	if(n==5)
	{
	    String q[]=point5();
	    la.setText(q[0]);lb.setText(q[1]);lc.setText(q[2]);ld.setText(q[3]); le.setText(q[4]);
	    la.setVisible(true);lb.setVisible(true);lc.setVisible(true);ld.setVisible(true);le.setVisible(true);
	}
	if(n==6)
	{
	    String q[]=point6();
	    la.setText(q[0]);lb.setText(q[1]);lc.setText(q[2]);ld.setText(q[3]); le.setText(q[4]); lf.setText(q[5]);
	    la.setVisible(true);lb.setVisible(true);lc.setVisible(true);ld.setVisible(true);le.setVisible(true);lf.setVisible(true);
	}
}

public int[] comparearray() 
{ 	
	cell=0;	
	for(i=0;i<15;i++)
	{
		for(j=0;j<15;j++)
		{
			if(!a[i][j].isEmpty())
			{
				k++;
				if(!a[i][j].equals(old[i][j]))
				{			
				c[0]=i;c[1]=j;	
				cell++;
				}
			}	
			old[i][j]=a[i][j];
			if(k==225)
			{
				int index=0,max=p2[0];
				for(int i = 1; i < n;i++)
				{
					if(p2[i] > max)
					{
						if(p2[i]==max)
						{
							index=7;
						}
						max = p2[i];
						index=i;
					}
				}
				if(index==7)
				{
					l7.setText("Its A Tie Game");
		        	f1.add(l7);
		        	l7.setVisible(true);
				}
				else
				{
				if(index==0)
				{
					l7.setText("Player A Won The Game");
		        	f1.add(l7);
		        	l7.setVisible(true);
				}
				else if(index==1)
				{
					if(n==1)
					{
						l7.setText("CPU Won The Game");
		        	f1.add(l7);
		        	l7.setVisible(true);	
					}
					else
					{
					l7.setText("Player B Won The Game");
		        	f1.add(l7);
		        	l7.setVisible(true);
					}		
				}
				else if(index==2)
				{
					l7.setText("Player C Won The Game");
		        	f1.add(l7);
		        	l7.setVisible(true);
				}
				else if(index==3)
				{
					l7.setText("Player D Won The Game");
		        	f1.add(l7);
		        	l7.setVisible(true);
				}
				else if(index==4)
				{
					l7.setText("Player E Won The Game");
		        	f1.add(l7);
		        	l7.setVisible(true);
				}
				else if(index==5)
				{
					l7.setText("Player F Won The Game");
		        	f1.add(l7);
		        	l7.setVisible(true);
				}
				
				}
			}
		}
	}
	if(cell>1)
	{
		i=c[0];j=c[1];
		g--;
    	a[i][j]="";
    	old[i][j]="";
    	l7.setText("Entering Multiples Is Not Allowed");
    	f1.add(l7);
    	l7.setVisible(true);
	}
	return c;
}

public void check(int row,int col)
{
	points=0;
	checkdiagonaldownright(row,col);
	checkdiagonalupleft(row,col);
	checkdiagonalupright(row,col);
	checkdiagonalleftdown(row,col);
	checkdown(row,col);
	checkup(row,col);
	checkleft(row,col);
	checkright(row,col);
	turnpoints();
	//for(String i : storage) {
		//System.out.println(i);
	//}
}

public void checkdiagonaldownright(int row ,int col)
{
	s="";
	j=col;
	        for(i=row;(i<15)&&(j<15)&&(!a[i][j].isEmpty());i++,j++)
			{
				s=s+a[i][j];
				Subcheck_Score(s);
				
			}
}

public void ddr(int row ,int col)
{
	s="";
	j1=col;
	 i1=row;
	 
	 while((i1<15)&&(j1<15)&&(!a[i1][j1].isEmpty()))
			{
				s=s+a[i1][j1];
				i1++;
				j1++;
			}
	 if(i+1<15&&j+1<15)
	 {
		 for(i=0;i<s.length();i++)
		 {
		 Subcheck_Score1(s.substring(s.length()-1-i, s.length()-1),i+1,j+1);
		 }
	 }
}
public void checkdiagonalupleft(int row ,int col)
{
	s="";
	i=row;
	j=col;
			while((i>=0)&&(j>=0))
			{
				if(!a[i][j].isEmpty())
				{
				s=s+a[i][j];
				Subcheck_Score(s);
				}
				i--;
				j--;
			}
}

public void checkdiagonalupright(int row ,int col)
{
	s="";
	i=row;
	j=col;
	while((i>=0)&&(j<15))
	{
			if(!a[i][j].isEmpty()) 
			{
				s=s+a[i][j];
				Subcheck_Score(s);
			}
			i--;
			j++;
	}
}

public void checkdiagonalleftdown(int row ,int col)
{
	s="";
	i=row;
	j=col;
	while((i<15)&&(j>=0))
	{
			if(!a[i][j].isEmpty()) 
			{
				s=s+a[i][j];
				Subcheck_Score(s);
			}
			i++;
			j--;
	}
}

public void checkdown(int row ,int col)
{
	s="";
	j=col;
	        for(i=row;i<54&&!a[i][j].isEmpty();i++)
			{
				s=s+a[i][j];
				Subcheck_Score(s);
			}
}

public void checkup(int row ,int col)
{
	s="";
	j=col;
	        for(i=row;i>=0&&!a[i][j].isEmpty();i--)
			{
				s=s+a[i][j];
				Subcheck_Score(s);
			}
}
			
public void checkleft(int row ,int col)
{
	s="";
	i=row;
	j=col;
	while(j>=0)
	{
			if(!a[i][j].isEmpty()) 
			{
				s=s+a[i][j];
				Subcheck_Score(s);
			}
			j--;
	}
}

public void checkright(int row ,int col)
{
	s="";
	i=row;
	j=col;
	while(j<14)
	{
			if(!a[i][j].isEmpty()) 
			{
				s=s+a[i][j];
				Subcheck_Score(s);
			}
			j++;
	}
}
public void Subcheck_Score1(String s,int c,int d)
{
	String z="";
	z=s;
	s=s+" ";
	s=search1(s);
	if(z!=s)
	{
		storage.add(s);
		thelp.setText("Words Formed:");
		for (String a : storage ) {
			thelp.append("\n"+a.toUpperCase());
	    }
		f1.add(scroll);
		if(s.length()>points)
		{
		points=s.length();
		m=c;
		o=d;
		System.out.println(m);
		System.out.println(o);
		
	}
	}
	/*s=new StringBuffer(s).reverse().toString();
	storage.add(s);
	thelp.setText("Words Formed:");
	for (String a : storage ) {
		thelp.append("\n"+a.toUpperCase());
    }
	x=s;
	s=s+" ";
	s=search1(s);
	if(x!=s)
	{
		storage.add(s);
		thelp.setText("Words Formed:");
		for (String a : storage ) {
			thelp.append("\n"+a.toUpperCase());
	    }
	f1.add(scroll);
	if(s.length()>points)
	{
	points=s.length();
	m=c;
	o=d;
	}
	}*/
	
}

public void Subcheck_Score(String s)
{
	if(!(storage.contains(s)))
	{
	if(search(s)) 
	{
		storage.add(s);
		thelp.setText("Words Formed:");
		for (String a : storage ) {
			thelp.append("\n"+a.toUpperCase());
	    }
		f1.add(scroll);
		if(s.length()>points)
		points=s.length();
	}
	}
	s=new StringBuffer(s).reverse().toString();
	if(!(storage.contains(s)))
	{
	if(search(s)) 
	{
		storage.add(s);
		thelp.setText("Words Formed:");
		for (String a : storage ) {
			thelp.append("\n"+a.toUpperCase());
	    }
		f1.add(scroll);
		if(s.length()>points)
		points=s.length();
	}
	}
  }

public String[] vscpu()
{
	if(g%2==0)
	{
		System.out.println("1");
		p2[0]=p2[0]+points;
		lg.setText("CPU Turn");
	    f1.add(lg);
	}
	else 
	{	
			for(i=0;i<15;i++)
			{
				for(j=0;j<15;j++)
				{
					if(!a[i][j].isEmpty())
					{	
						ddr(i,j);
						}
					}	
					
			}
			a[m][o]=String.valueOf(s.charAt(s.length()-1));
			t[i][j].setFont(new Font("BREMAN BD BT", Font.BOLD, 18));
        	t[i][j].setText(a[i][j].toUpperCase());
        t[i][j].setEditable(false);
        if(a[i][j].equals(""))
        	t[i][j].setEditable(true);

		p2[1]=p2[1]+points;
		lg.setText("Player A Turn");
	    f1.add(lg);
	    g++;
	    
	}
	return cast(p2);
	}

public String[] point2()
{
	if(g%2==0)
	{
		p2[0]=p2[0]+points;
		lg.setText("Player B Turn");
	    f1.add(lg);
	}
	else 
	{
		p2[1]=p2[1]+points;
		lg.setText("Player A Turn");
	    f1.add(lg);
	}
	return cast(p2);
	}

public String[] point3()
{
	if(g%3==0)
	{
		p2[0]=p2[0]+points;
		lg.setText("Player B Turn");
	    f1.add(lg);
	}
	else if(g%3==1)
	{
		p2[1]=p2[1]+points;
		lg.setText("Player C Turn");
	    f1.add(lg);
	}
	else 
	{
		p2[2]=p2[2]+points;
		lg.setText("Player A Turn");
	    f1.add(lg);
	}
	return cast(p2);
	}

public String[] point4()
{
	if(g%4==0)
	{
		p2[0]=p2[0]+points;
		lg.setText("Player B Turn");
	    f1.add(lg);
	}
	else if(g%4==1)
	{
		p2[1]=p2[1]+points;
		lg.setText("Player C Turn");
	    f1.add(lg);
	}
	else if(g%4==2)
	{
		p2[2]=p2[2]+points;
		lg.setText("Player D Turn");
	    f1.add(lg);
	}
	else 
	{
		p2[3]=p2[3]+points;
		lg.setText("Player A Turn");
	    f1.add(lg);
	}
	return cast(p2);
	}

public String[] point5()
{
	if(g%5==0)
	{
		p2[0]=p2[0]+points;
		lg.setText("Player B Turn");
	    f1.add(lg);
	}
	else if(g%5==1)
	{
		p2[1]=p2[1]+points;
		lg.setText("Player C Turn");
	    f1.add(lg);
	}
	else if(g%5==2)
	{
		p2[2]=p2[2]+points;
		lg.setText("Player D Turn");
	    f1.add(lg);
	}
	else if(g%5==3)
	{
		p2[3]=p2[3]+points;
		lg.setText("Player E Turn");
	    f1.add(lg);
	}
	else
	{
		p2[4]=p2[4]+points;
		lg.setText("Player A Turn");
	    f1.add(lg);
	}
	return cast(p2);
	}

public String[] point6()
{
	if(g%6==0)
	{
		p2[0]=p2[0]+points;
		lg.setText("Player B Turn");
	    f1.add(lg);
	}
	else if(g%6==1)
	{
		p2[1]=p2[1]+points;
		lg.setText("Player C Turn");
	    f1.add(lg);
	}
	else if(g%6==2)
	{
		p2[2]=p2[2]+points;
		lg.setText("Player D Turn");
	    f1.add(lg);
	}
	else if(g%6==3)
	{
		p2[3]=p2[3]+points;
		lg.setText("Player E Turn");
	    f1.add(lg);
	}
	else if(g%6==4)
	{
		p2[4]=p2[4]+points;
		lg.setText("Player F Turn");
	    f1.add(lg);
	}
	else 
	{
		p2[5]=p2[5]+points;
		lg.setText("Player A Turn");
	    f1.add(lg);
	}
	return cast(p2);
	}



public String[] cast(int poi[]) 
{
	String str[] = new String[poi.length];

	for (int i = 0; i < poi.length; i++)
		str[i] = String.valueOf(poi[i]);
	return str;
}
public boolean search(String s)
{
	if(s.charAt(0)=='a')
	{
		if(s.length()==2)
		{
		
			String a2[]= {"aa","ab","ad","ae","ag","ah","ai","al","am","an","ar","as","at","aw","ax","ay"};
			return binarySearch(a2,s);
		}
		else if(s.length()==3)
		{
			String a3[]= {"abc"};
			return binarySearch(a3,s);
		}
		else
			return false;
	  }		
	else
		return false;
	}
	
public String search1(String s)
{
	if(s.charAt(0)=='a')
	{
		if(s.length()==2)
		{
		
			s=s.substring(0,0);
			String a2[]= {"aa","ab","ad","ae","ag","ah","ai","al","am","an","ar","as","at","aw","ax","ay"};
			return binarySearch1(a2,s);
		}
		else if(s.length()==3)
		{
			String a3[]= {"abc"};
			return binarySearch1(a3,s);
		}
		else
			return s;
	  }		
	else
		return s;
	}

public String binarySearch1(String[] words,String x)
{
	for(i=0;i<words.length;i++)
	{
		if(x.toLowerCase().contains(words[i].toLowerCase().substring(0,x.length()-2)))
		{
			if(!(storage.contains(words[i])))
			{
				x=words[i];
				break;
			}
			
		}		
	}
	for(char r='a';r<='z';++r)
	{
		String y="";
				y=y+'r';
		y=new StringBuffer(y).reverse().toString();
		if(search(y))
		{
			if(!(storage.contains(y)))
			{
				if(y.length()>x.length())
				{
				x=y;
				return x;
				}
			}
		}
	}	
	return x;	
}

public boolean binarySearch(String[] words,String x)
{
	for(i=0;i<words.length;i++)
	{
		if(x.equalsIgnoreCase(words[i]))
			return true;
	}
	return false;
		
	
   /* int l = 0, r = words.length - 1; 
	        while (l <= r)
	        { 
	            int m = l + (r - l) / 2; 
	            int res = x.compareTo(words[m]); 
	  
	            // Check if x is present at mid 
	            if (res == 0) 
	                return true; 
	  
	            // If x greater, ignore left half 
	            if (res > 0) 
	                l = m + 1; 
	  
	            // If x is smaller, ignore right half 
	            else
	                r = m - 1; 
	        } 
	        return false; */
	
}
public class FixedSizeDocument extends PlainDocument
{
   private int max = 10;
   
   public FixedSizeDocument(int max) 
   { 
        this.max = max; 
   } 

   @Override
   public void insertString(int offs, String str, AttributeSet a)
      throws BadLocationException
   {
      // check string being inserted does not exceed max length
	   
      if (getLength()+str.length()>max)
      {
         // If it does, then truncate it
    	  
         str = str.substring(0, max - getLength());
      }
      super.insertString(offs, str, a);
   }
}
public static void main(String args[])
{
	new awt();
}
}




