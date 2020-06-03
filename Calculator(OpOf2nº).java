import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



@SuppressWarnings("serial")
public class Calculator extends JFrame implements ActionListener
{
	//Declare the objects.
	private JPanel myPanel; 
	String value1;
	String value2;
	String action;
	Double solution;
	String answer;
	
	public static void main(String[] args)
	{
		new Calculator();
	}

	public Calculator()
	{
		setSize(300,280);
		setTitle("CSCI 141");
		this.setResizable(false);

		
		//Create TextFields, buttons, and panels.
		myPanel = new JPanel(new BorderLayout());
		myPanel.setPreferredSize(new Dimension(500, 500));
		myPanel.setBackground(Color.BLACK);
		
		
		//Create the Panel for the text Calculator
		JPanel title = new JPanel(new BorderLayout());
		JLabel myTitle = new JLabel("      Calculator");
		title.add(myTitle);
		title.setBackground(Color.ORANGE);
		myTitle.setFont(new Font("TimesRoman", Font.BOLD, 40));
		myPanel.add(title, BorderLayout.NORTH);
		
		
		
		//Set the BoxText for the Result.
		JPanel resultPnl = new JPanel(new BorderLayout());
		JTextField resultado = new JTextField(20);
		resultPnl.add(resultado);
		resultPnl.setBackground(Color.ORANGE);
		resultado.setHorizontalAlignment(JTextField.RIGHT);
		resultado.setEditable(false);
		myPanel.add(resultPnl, BorderLayout.CENTER);
		
		//Create Panel for the Action and number Buttons
		JPanel toDoPnl = new JPanel(new BorderLayout());
		
		
		//Action Buttons
		JPanel pnlAction = new JPanel();		
		pnlAction.setLayout(new GridLayout(0,1));
		pnlAction.setBackground(Color.ORANGE);
		toDoPnl.add(pnlAction, BorderLayout.EAST);
		
		JButton btnMAS = new JButton("+");
		JButton btnMENOS = new JButton("-");
		JButton btnDIV = new JButton("/");
		JButton btnMULT = new JButton("*");
		JButton btnDEL = new JButton("C");
		
		pnlAction.add(btnMAS);
		pnlAction.add(btnMENOS);
		pnlAction.add(btnDIV);
		pnlAction.add(btnMULT);
		pnlAction.add(btnDEL);
		
		
		//Number Buttons
		JPanel pnlExp = new JPanel();
		pnlExp.setLayout(new GridLayout(4,3));
		pnlExp.setBackground(Color.ORANGE);
		toDoPnl.add(pnlExp, BorderLayout.WEST);
		
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");
		JButton btnP = new JButton(".");
		JButton btn0 = new JButton("0");
		JButton btnEqual = new JButton("=");
		
		pnlExp.add(btn1);
		pnlExp.add(btn2);
		pnlExp.add(btn3);
		pnlExp.add(btn4);
		pnlExp.add(btn5);
		pnlExp.add(btn6);
		pnlExp.add(btn7);
		pnlExp.add(btn8);
		pnlExp.add(btn9);
		pnlExp.add(btnP);
		pnlExp.add(btn0);
		pnlExp.add(btnEqual);
		
		myPanel.add(toDoPnl, BorderLayout.SOUTH);
		
	//Action Listener of the number buttons
		 btn0.addActionListener(new ActionListener() {
	    	 public void actionPerformed(ActionEvent e) {
	    		 resultado.setText(resultado.getText() + "0");
	    	 }
		 });
		 btn1.addActionListener(new ActionListener() {
	    	 public void actionPerformed(ActionEvent e) {
	    		 resultado.setText(resultado.getText() + "1");
	    	 }
		 });
		 btn2.addActionListener(new ActionListener() {
	    	 public void actionPerformed(ActionEvent e) {
	    		 resultado.setText(resultado.getText() + "2");
	    	 }
		 });
		 btn3.addActionListener(new ActionListener() {
	    	 public void actionPerformed(ActionEvent e) {
	    		 resultado.setText(resultado.getText() + "3");
	    	 }
		 });
		 btn4.addActionListener(new ActionListener() {
	    	 public void actionPerformed(ActionEvent e) {
	    		 resultado.setText(resultado.getText() + "4");
	    	 }
		 });
		 btn5.addActionListener(new ActionListener() {
	    	 public void actionPerformed(ActionEvent e) {
	    		 resultado.setText(resultado.getText() + "5");
	    	 }
		 });
		 btn6.addActionListener(new ActionListener() {
	    	 public void actionPerformed(ActionEvent e) {
	    		 resultado.setText(resultado.getText() + "6");
	    	 }
		 });
		 btn7.addActionListener(new ActionListener() {
	    	 public void actionPerformed(ActionEvent e) {
	    		 resultado.setText(resultado.getText() + "7");
	    	 }
		 });
		 btn8.addActionListener(new ActionListener() {
	    	 public void actionPerformed(ActionEvent e) {
	    		 resultado.setText(resultado.getText() + "8");
	    	 }
		 });
		 btn9.addActionListener(new ActionListener() {
	    	 public void actionPerformed(ActionEvent e) {
	    		 resultado.setText(resultado.getText() + "9");
	    	 }
		 });
		 
		 btnP.addActionListener(new ActionListener() {
	    	 public void actionPerformed(ActionEvent e) {
	    		 if(resultado.getText().equals("")) {
	    			 resultado.setText(resultado.getText()+ "0.");
	    		 }else {
	    			 resultado.setText(resultado.getText() +".");
	    		 }
	    		 
	    	 }
		 });
		 
		 
		 //Action Listener of the action buttons
		 btnMAS.addActionListener(new ActionListener() {
	    	 public void actionPerformed(ActionEvent e) {
	    		 if(!resultado.getText().equals(""));
	    		 value1 = resultado.getText();
	    		 action = "+";
	    		 resultado.setText("");
	    	 }
		 });
		 
		 btnMENOS.addActionListener(new ActionListener() {
	    	 public void actionPerformed(ActionEvent e) {
	    		 if(!resultado.getText().equals(""));
	    		 value1 = resultado.getText();
	    		 action = "-";
	    		 resultado.setText("");
	    	 }
		 });
		 
		 btnMULT.addActionListener(new ActionListener() {
	    	 public void actionPerformed(ActionEvent e) {
	    		 if(!resultado.getText().equals(""));
	    		 value1 = resultado.getText();
	    		 action = "*";
	    		 resultado.setText("");
	    	 }
		 });
		 
		 btnDIV.addActionListener(new ActionListener() {
	    	 public void actionPerformed(ActionEvent e) {
	    		 if(!resultado.getText().equals(""));
	    		 value1 = resultado.getText();
	    		 action = "/";
	    		 resultado.setText("");
	    	 
	    	 }
		 });
		 btnDEL.addActionListener(new ActionListener() {
	    	 public void actionPerformed(ActionEvent e) {
	    		 resultado.setText("");
	    	 
	    	 }
		 });
		 
		 btnEqual.addActionListener(new ActionListener() {
	    	 public void actionPerformed(ActionEvent e) {
	    		 if(!resultado.getText().equals(""));
	    		 value2 = resultado.getText();
	    		 if (action.equals("+")) {
	    			 solution = Double.parseDouble(value1)+Double.parseDouble(value2);
	    			 answer = solution.toString();
	    			 resultado.setText(answer);
	    			 resultado.setEditable(false);
	    			
	    		 }
	    		 else {
	    			 if(action.contentEquals("-")) {
	    				 solution = Double.parseDouble(value1)-Double.parseDouble(value2);
	    				 answer = solution.toString();
	    				 resultado.setText(answer);
	    				 resultado.setEditable(false);
	    				 
	    			 }else {
	    				 if(action.contentEquals("*")) {
	    					 solution = Double.parseDouble(value1)*Double.parseDouble(value2);
	    	   				 answer = solution.toString();
	    					 resultado.setText(answer);
	    					 resultado.setEditable(false);
	       			 }else {
	       				 if(action.contentEquals("/")) {
	    	    				 solution = Double.parseDouble(value1)/Double.parseDouble(value2);
	    	    				 answer = solution.toString();
	    	    				 resultado.setText(answer);
	    	    				 resultado.setEditable(false);
	       			 }
	       				 
	       		 }
	       			 
	    		 } 
	    		 
	    		 }
	    		 }
	    	
		 });
		 
        this.getContentPane().add(myPanel);
 		this.setVisible(true);
 		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	          
	
	

}
