import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.UIManager;

public class Calculator {

	private JFrame myframe;
	private JTextField mytextField;

	double firstnumber;
	double secondnumber;
	double result;

	String operation;
	String answer;
	
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launching the application
	 */

	
	 public static void main(String[] args) 
	 {
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try
				{
					Calculator window = new Calculator();
					window.myframe.setVisible(true);
				} 
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Creating the application
	 */


	public Calculator()
	{
		initialize();
	}

	/**
	 * Initializing the contents of the frame
	 */


	private void initialize()
	{
		myframe = new JFrame();
		myframe.setBounds(200, 200, 370, 550);
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myframe.getContentPane().setLayout(null);

		JLabel lblCalculator = new JLabel("The Scientific Calculator");
		lblCalculator.setForeground(new Color(0, 0, 202));
		lblCalculator.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblCalculator.setBounds(20, 20, 400, 50);
		myframe.getContentPane().add(lblCalculator);

		mytextField = new JTextField();
		mytextField.setFont(new Font("Tahoma", Font.BOLD, 14));
		mytextField.setBounds(12, 59, 299, 53);
		myframe.getContentPane().add(mytextField);
		mytextField.setColumns(10);


		JButton Root = new JButton("\u221A");
		Root.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				double ans= Math.sqrt(Double.parseDouble(mytextField.getText()));
				mytextField.setText("");
				mytextField.setText(mytextField.getText()+ans);
			}
		});

		Root.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Root.setBounds(11, 142, 61, 52);
		myframe.getContentPane().add(Root);


		JButton Rev = new JButton("1/x");
		Rev.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				double ans= 1/(Double.parseDouble(mytextField.getText()));
				mytextField.setText("");
				mytextField.setText(mytextField.getText()+ans);
			}
		});

		Rev.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Rev.setBounds(11, 193, 61, 52);
		myframe.getContentPane().add(Rev);


		JButton Fact = new JButton("n!");
		Fact.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				double ans = Double.parseDouble(mytextField.getText());
				double fact=1;
				while(ans!=0)
				{
					fact=fact*ans;
					ans--;
				}
				mytextField.setText("");
				mytextField.setText(mytextField.getText()+fact);
			}
		});

		Fact.setFont(new Font("Tahoma", Font.PLAIN, 23));
		Fact.setBounds(11, 397, 61, 52);
		myframe.getContentPane().add(Fact);


		JButton PM = new JButton("+/-");
		PM.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				double ans = Double.parseDouble(String.valueOf(mytextField.getText()));
				ans=ans*(-1);
				mytextField.setText(String.valueOf(ans));
			}
		});

		PM.setFont(new Font("Tahoma", Font.PLAIN, 15));
		PM.setBounds(11, 448, 61, 52);
		myframe.getContentPane().add(PM);


		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				String number= mytextField.getText()+btn7.getText();
				mytextField.setText(number);
			}
		});

		btn7.setFont(new Font("Tahoma", Font.BOLD, 23));
		btn7.setBounds(71, 295, 61, 52);
		myframe.getContentPane().add(btn7);


		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String number= mytextField.getText()+btn4.getText();
				mytextField.setText(number);
			}
		});

		btn4.setFont(new Font("Tahoma", Font.BOLD, 23));
		btn4.setBounds(71, 346, 61, 52);
		myframe.getContentPane().add(btn4);


		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) {
				String number= mytextField.getText()+btn1.getText();
				mytextField.setText(number);
			}
		});

		btn1.setFont(new Font("Tahoma", Font.BOLD, 23));
		btn1.setBounds(71, 397, 61, 52);
		myframe.getContentPane().add(btn1);


		JButton Sin = new JButton("sin");
		Sin.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				double ans= Math.sin(Double.parseDouble(mytextField.getText()));
				mytextField.setText("");
				mytextField.setText(mytextField.getText()+ans);
			}
		});

		Sin.setFont(new Font("Tahoma", Font.PLAIN, 19));
		Sin.setBounds(131, 142, 61, 52);
		myframe.getContentPane().add(Sin);


		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String number= mytextField.getText()+btn8.getText();
				mytextField.setText(number);
			}

		});

		btn8.setFont(new Font("Tahoma", Font.BOLD, 23));
		btn8.setBounds(131, 295, 61, 52);
		myframe.getContentPane().add(btn8);


		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String number= mytextField.getText()+btn5.getText();
				mytextField.setText(number);
			}
		});

		btn5.setFont(new Font("Tahoma", Font.BOLD, 23));
		btn5.setBounds(131, 346, 61, 52);
		myframe.getContentPane().add(btn5);


		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String number= mytextField.getText()+btn2.getText();
				mytextField.setText(number);
			}
		});

		btn2.setFont(new Font("Tahoma", Font.BOLD, 23));
		btn2.setBounds(131, 397, 61, 52);
		myframe.getContentPane().add(btn2);


		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				String number= mytextField.getText()+btn0.getText();
				mytextField.setText(number);
			}
		});

		btn0.setFont(new Font("Tahoma", Font.BOLD, 23));
		btn0.setBounds(71, 448, 121, 52);
		myframe.getContentPane().add(btn0);


		JButton btnB = new JButton("\uF0E7");
		btnB.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String backSpace=null;
				if(mytextField.getText().length()>0)
				{
					StringBuilder st = new StringBuilder(mytextField.getText());
					st.deleteCharAt(mytextField.getText().length()-1);
					backSpace= st.toString();
					mytextField.setText(backSpace);
				}
			}
		});

		btnB.setFont(new Font("Wingdings", Font.PLAIN, 23));
		btnB.setBounds(191, 244, 61, 52);
		myframe.getContentPane().add(btnB);


		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String number= mytextField.getText()+btn9.getText();
				mytextField.setText(number);
			}
		});

		btn9.setFont(new Font("Tahoma", Font.BOLD, 23));
		btn9.setBounds(191, 295, 61, 52);
		myframe.getContentPane().add(btn9);


		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String number= mytextField.getText()+btn6.getText();
				mytextField.setText(number);
			}
		});

		btn6.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn6.setBounds(190, 345, 60, 51);
		myframe.getContentPane().add(btn6);


		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String number= mytextField.getText()+btn3.getText();
				mytextField.setText(number);
			}
		});

		btn3.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn3.setBounds(190, 396, 60, 51);
		myframe.getContentPane().add(btn3);


		JButton Dot = new JButton(".");
		Dot.setFont(new Font("Tahoma", Font.BOLD, 22));
		Dot.setBounds(190, 447, 60, 52);
        myframe.getContentPane().add(Dot);
    }
}

JButton Equal = new JButton("=");
		Equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second = Double.parseDouble(textField.getText());
				if(operation=="+")
				{
					result=firstnumber+secondnumber;
					answer= String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="-")
				{
					result=firstnumber-secondnumber;
					answer= String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*")
				{
					result=firstnumber*secondnumber;
					answer= String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/")
				{
					result=firstnumber/secondnumber;
					answer= String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="%")
				{
					result=firstnumber%secondnumber;
					answer= String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="x^y")
				{
					double result=1;
					for(int i=0;i<secondnumber;i++)
					{
						result=firstnumber*result;
					}
					answer= String.format("%.2f", result);
					textField.setText(answer);
					
				}
			
        
        

        Equal.setFont(new Font("Tahoma", Font.PLAIN, 22));
		Equal.setBounds(250, 447, 60, 51);
		frame.getContentPane().add(btnEqual);
		
		JButton Sum = new JButton("+");
		Sum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber=Double.parseDouble(textField.getText());
				textField.setText(null);
				operation="+";
			}
		});
		Sum.setFont(new Font("Tahoma", Font.PLAIN, 22));
		Sum.setBounds(250, 243, 60, 51);
		frame.getContentPane().add(Sum);
		
		JButton Minus = new JButton("-");
		Minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(null);
				operation="-";
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnMinus.setBounds(250, 294, 60, 51);
		frame.getContentPane().add(btnMinus);
		
		JButton btnMpy = new JButton("*");
		btnMpy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(null);
				operation="*";
			}
		});
		btnMpy.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnMpy.setBounds(250, 345, 60, 51);
		frame.getContentPane().add(btnMpy);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(null);
				operation="/";
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnDivide.setBounds(250, 396, 60, 51);
		frame.getContentPane().add(btnDivide);
		
		JButton btnPow = new JButton("x^y");
		btnPow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(null);
				operation="x^y";

			}
		});
		btnPow.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnPow.setBounds(10, 243, 60, 51);
		frame.getContentPane().add(btnPow);
		
		JButton btnMod = new JButton("%");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(null);
				operation="%";
			}
		});
		btnMod.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMod.setBounds(70, 243, 60, 51);
		frame.getContentPane().add(btnMod);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnC.setBounds(130, 243, 60, 51);
		frame.getContentPane().add(btnC);
		
		JButton btnCube = new JButton("x^3");
		btnCube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a= (Double.parseDouble(textField.getText()));
				a=a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCube.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCube.setBounds(10, 294, 60, 51);
		frame.getContentPane().add(btnCube);
		
		JButton btnSqr = new JButton("x^2");
		btnSqr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a= (Double.parseDouble(textField.getText()));
				a=a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
			
		});
		btnSqr.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSqr.setBounds(10, 345, 60, 51);
		frame.getContentPane().add(btnSqr);
		
		JButton btnCos = new JButton("cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a= Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
	
	}
		});
	
	}
}
