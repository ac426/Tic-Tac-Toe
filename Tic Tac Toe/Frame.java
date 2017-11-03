import javax.swing.*;
import java.awt.*;
//import com.edu4java.Game;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Frame extends TicTacToe implements ActionListener, WindowListener
{
	private int count = 0;
	private int winner = -1;
	Button one;
	private static int b1 = 0;
	Button two;
	private static int b2 = 0;
	Button three;
	private static int b3 = 0;
	Button four;
	private static int b4 = 0;
	Button five;
	private static int b5 = 0;
	Button six;
	private static int b6 = 0;
	Button seven;
	private static int b7 = 0;
	Button eight;
	private static int b8 = 0;
	Button nine;
	private static int b9 = 0;
	private JLabel all = new JLabel("");
	public Frame(){
        JPanel panel=new JPanel();
        setVisible(true);
        setLayout(null);
        getContentPane().add(panel);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        all = takeTurn();
        add(all);
        one = new Button("");
        one.setBounds(493, 170, 247, 247);
        one.setVisible(true);
        add(one);
        one.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent arg0){
        		if(count%2 == 0)
        		{
        			add(XO(one, 1));
        			b1 = 1;
        		}
        		else
        		{
        			add(XO(one, 2));
        			b1 = 2;
        		}
        		remove(one);
        		all.setVisible(false);
        		remove(all);
        		if(playGame() == 1||playGame() == 2)
        		{
        		add(findWinner(playGame()));
        		remove(one);
        		remove(two);
        		remove(three);
        		remove(four);
        		remove(five);
        		remove(six);
        		remove(seven);
        		remove(eight);
        		remove(nine);
        		}
        		count++;
        		all = takeTurn();
        		add(all);
        	}
       });
        
        two = new Button("");
        two.setBounds(746, 170, 245, 245);
        two.setVisible(true);
        add(two);
        two.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent arg0){
        		if(count%2 == 0)
        		{
        			add(XO(two, 1));
        			b2 = 1;
        		}
        		else
        		{
        			add(XO(two, 2));
        			b2 = 2;
        		}
        		remove(two);
        		all.setVisible(false);
        		remove(all);
        		if(playGame() == 1||playGame() == 2)
        		{
        		add(findWinner(playGame()));
        		remove(one);
        		remove(two);
        		remove(three);
        		remove(four);
        		remove(five);
        		remove(six);
        		remove(seven);
        		remove(eight);
        		remove(nine);
        		}
        		count++;
        		all = takeTurn();
        		add(all);
        	}
        });
        
        three = new Button("");
        three.setBounds(1000, 170, 245, 245);
        three.setVisible(true);
        add(three);
        three.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent arg0){
        		if(count%2 == 0)
        		{
        			add(XO(three, 1));
        			b3 = 1;
        		}
        		else
        		{
        			add(XO(three, 2));
        			b3 = 2;
        		}
        		remove(three);
        		all.setVisible(false);
        		remove(all);
        		if(playGame() == 1||playGame() == 2)
        		{
        		add(findWinner(playGame()));
        		remove(one);
        		remove(two);
        		remove(three);
        		remove(four);
        		remove(five);
        		remove(six);
        		remove(seven);
        		remove(eight);
        		remove(nine);
        		}
        		count++;
        		all = takeTurn();
        		add(all);
        	}
        });
        
       	four = new Button("");
        four.setBounds(493, 423, 245, 245);
        four.setVisible(true);
        add(four);
        four.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent arg0){
        		if(count%2 == 0)
        		{
        			add(XO(four, 1));
        			b4 = 1;
        		}
        		else
        		{
        			add(XO(four, 2));
        			b4 = 2;
        		}
        		remove(four);
        		all.setVisible(false);
        		remove(all);
        		if(playGame() == 1||playGame() == 2)
        		{
        		add(findWinner(playGame()));
        		remove(one);
        		remove(two);
        		remove(three);
        		remove(four);
        		remove(five);
        		remove(six);
        		remove(seven);
        		remove(eight);
        		remove(nine);
        		}
        		count++;
        		all = takeTurn();
        		add(all);
        	}
        });
        
        five = new Button("");
        five.setBounds(746, 423, 245, 245);
        five.setVisible(true);
        add(five);
        five.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent arg0){
        		if(count%2 == 0)
        		{
        			add(XO(five, 1));
        			b5 = 1;
        		}
        		else
        		{
        			add(XO(five, 2));
        			b5 = 2;
        		}
        		remove(five);
        		all.setVisible(false);
        		remove(all);
        		if(playGame() == 1||playGame() == 2)
        		{
        		add(findWinner(playGame()));
        		remove(one);
        		remove(two);
        		remove(three);
        		remove(four);
        		remove(five);
        		remove(six);
        		remove(seven);
        		remove(eight);
        		remove(nine);
        		}
        		count++;
        		all = takeTurn();
        		add(all);
        	}
        });
        
        six = new Button("");
        six.setBounds(996, 423, 245, 245);
        six.setVisible(true);
        add(six);
        six.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent arg0){
        		if(count%2 == 0)
        		{
        			add(XO(six, 1));
        			b6 = 1;
        		}
        		else
        		{
        			add(XO(six, 2));
        			b6 = 2;
        		}
        		remove(six);
        		all.setVisible(false);
        		remove(all);
        		if(playGame() == 1||playGame() == 2)
        		{
        		add(findWinner(playGame()));
        		remove(one);
        		remove(two);
        		remove(three);
        		remove(four);
        		remove(five);
        		remove(six);
        		remove(seven);
        		remove(eight);
        		remove(nine);
        		}
        		count++;
        		all = takeTurn();
        		add(all);
        	}
        });
        
        seven = new Button("");
        seven.setBounds(493, 673, 245, 245);
        seven.setVisible(true);
        add(seven);
        seven.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent arg0){
        		if(count%2 == 0)
        		{
        			add(XO(seven, 1));
        			b7 = 1;
        		}
        		else
        		{
        			add(XO(seven, 2));
        			b7 = 2;
        		}
        		remove(seven);
        		all.setVisible(false);
        		remove(all);
        		if(playGame() == 1||playGame() == 2)
        		{
        		add(findWinner(playGame()));
        		remove(one);
        		remove(two);
        		remove(three);
        		remove(four);
        		remove(five);
        		remove(six);
        		remove(seven);
        		remove(eight);
        		remove(nine);
        		}
        		count++;
        		all = takeTurn();
        		add(all);
        	}
        });
        
        eight = new Button("");
        eight.setBounds(746, 673, 245, 245);
        eight.setVisible(true);
        add(eight);
        eight.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent arg0){
        		if(count%2 == 0)
        		{
        			add(XO(eight, 1));
        			b8 = 1;
        		}
        		else
        		{
        			add(XO(eight, 2));
        			b8 = 2;
        		}
        		remove(eight);
        		all.setVisible(false);
        		remove(all);
        		if(playGame() == 1||playGame() == 2)
        		{
        		add(findWinner(playGame()));
        		remove(one);
        		remove(two);
        		remove(three);
        		remove(four);
        		remove(five);
        		remove(six);
        		remove(seven);
        		remove(eight);
        		remove(nine);
        		}
        		count++;
        		all = takeTurn();
        		add(all);
        	}
        });
        
        nine = new Button("");
        nine.setBounds(996, 673, 245, 245);
        nine.setVisible(true);
        add(nine);
        nine.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent arg0){
        		if(count%2 == 0)
        		{
        			add(XO(nine, 1));
        			b9 = 1;
        		}
        		else 
        		{
        			add(XO(nine, 2));
        			b9 = 2;
        		}
        		remove(nine);
        		all.setVisible(false);
        		remove(all);
        		if(playGame() == 1||playGame() == 2)
        		{
        		add(findWinner(playGame()));
        		remove(one);
        		remove(two);
        		remove(three);
        		remove(four);
        		remove(five);
        		remove(six);
        		remove(seven);
        		remove(eight);
        		remove(nine);
        		}
        		count++;
        		all = takeTurn();
        		add(all);
        	}
        });
    }
	
	public JLabel XO(Button e, int i)
	{
		if(i == 1)
		{
			   JLabel  x = new JLabel("X", SwingConstants.RIGHT);
	  		   x.setVerticalAlignment(SwingConstants.TOP);
	  		   x.setFont(new Font("X", Font.PLAIN,175));
	  		   x.setForeground(Color.RED);
	  		   x.setVisible(true);
	  		   x.setSize(200,200);
	  		   x.setLocation(e.getLocation());
	  		   return x;
		}
		else
		{
			   JLabel  o = new JLabel("O", SwingConstants.RIGHT);
	  		   o.setVerticalAlignment(SwingConstants.TOP);
	  		   o.setFont(new Font("O", Font.PLAIN,175));
	  		   o.setForeground(Color.BLUE);
	  		   o.setVisible(true);
	  		   o.setSize(200,200);
	  		   o.setLocation(e.getLocation());
	  		   return o;
		}
	}
	
	public JLabel takeTurn()
	{
		   if(count%2 == 1)
	  	   {
	  		  JLabel  player2 = new JLabel("Player 2's turn", SwingConstants.RIGHT);
	  		  player2.setVerticalAlignment(SwingConstants.TOP);
	  		  player2.setFont(new Font("Player 2's turn", Font.PLAIN,70));
	  		  player2.setForeground(Color.BLUE);
	  		  player2.setVisible(true);
	  		  player2.setSize(1095,100);
	  		  return player2;
	  	   }
	  	   else
	  	   {
	  		   JLabel  player1 = new JLabel("Player 1's turn", SwingConstants.RIGHT);
	  		   player1.setVerticalAlignment(SwingConstants.TOP);
	  		   player1.setFont(new Font("Player 1's turn", Font.PLAIN,70));
	  		   player1.setForeground(Color.RED);
	  		   player1.setVisible(true);
	  		   player1.setSize(1095,100);
	  		   return player1;
	  	   }
	}
    public void paint(Graphics g) 
    {
        super.paint(g); 
    }
    
    public static void main(String []args){
    		Frame s=new Frame();
    }
    public int playGame()
    {
    		if((b1 == 1 && b2 == 1 && b3 == 1) || (b6 == 1 && b4 == 1 && b5 == 1) || (b7 == 1 && b8 == 1 && b9 == 1) || (b1 == 1 && b4 == 1 && b7 == 1) || (b2 == 1 && b5 == 1 && b8 == 1) || (b3 == 1 && b6 == 1 && b9 == 1 ) || (b1 == 1 && b5 == 1 && b9 == 1) || (b3 == 1 && b5 == 1 && b7 == 1 ))
    		{
    			winner = 1;
    		}
    		else if((b1 == 1 && b2 == 1 && b3 == 2) || (b6 == 2 && b4 == 2 && b5 == 2) || (b7 == 2 && b8 == 2 && b9 == 2) || (b1 == 2 && b4 == 2 && b7 == 2) || (b2 == 2 && b5 == 2 && b8 == 2) || (b3 == 2 && b6 == 2 && b9 == 2 ) || (b1 == 2 && b5 == 2 && b9 == 2) || (b3 == 2 && b5 == 2 && b7 == 2 ))
    		{
    			winner = 2;
    		}
    		else if(count == 8)
    		{
    			winner = 0;
    		}
    		else
    		{
    		}
    	return winner;
    }
    public JLabel findWinner(int a)
    {
    	if(winner == 0)
        {
        	JLabel x = new JLabel("No One Wins!", SwingConstants.CENTER);
    		x.setFont(new Font("No One Wins!", Font.PLAIN, 70));
    		x.setVerticalAlignment(SwingConstants.CENTER);
    		x.setForeground(Color.BLACK);
    		x.setVisible(true);
    		x.setSize(500,600);
    		return x;
        }
        else if(winner == 1)
        {
        	JLabel x = new JLabel("Player 1 wins!", SwingConstants.CENTER);
    		x.setFont(new Font("Player 1 wins!", Font.PLAIN, 70));
    		x.setVerticalAlignment(SwingConstants.CENTER);
    		x.setForeground(Color.RED);
    		x.setVisible(true);
    		x.setSize(500,600);
    		return x;
        }
        else if(winner == 2)
        {
        	JLabel x = new JLabel("Player 2 Wins!", SwingConstants.CENTER);
    		x.setFont(new Font("Player 2 Wins!", Font.PLAIN, 70));
    		x.setVerticalAlignment(SwingConstants.CENTER);
    		x.setForeground(Color.BLUE);
    		x.setVisible(true);
    		x.setSize(500,600);
    		return x;
        }
        else
        {
        	JLabel x = new JLabel("", SwingConstants.CENTER);
    		x.setFont(new Font("", Font.PLAIN, 70));
    		x.setVerticalAlignment(SwingConstants.CENTER);
    		x.setForeground(Color.BLUE);
    		x.setVisible(true);
    		x.setSize(500,600);
    		return x;
        }
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void windowActivated(WindowEvent arg0) {}
	public void windowClosed(WindowEvent arg0) {}
	public void windowClosing(WindowEvent arg0) {}
	public void windowDeactivated(WindowEvent arg0) {}
	public void windowDeiconified(WindowEvent arg0) {}
	public void windowIconified(WindowEvent arg0) {}
	public void windowOpened(WindowEvent arg0) {}
	
}
