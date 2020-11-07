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
		Minus.setFont(new Font("Tahoma", Font.PLAIN, 22));
		Minus.setBounds(250, 294, 60, 51);
		frame.getContentPane().add(btnMinus);
		
		JButton btnMpy = new JButton("*");
		Mpy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(null);
				operation="*";
			}
		});
		Mpy.setFont(new Font("Tahoma", Font.PLAIN, 22));
		Mpy.setBounds(250, 345, 60, 51);
		frame.getContentPane().add(btnMpy);
		
		JButton Divide = new JButton("/");
		Divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber=Double.parseDouble(textField.getText());
				textField.setText(null);
				operation="/";
			}
		});
		Divide.setFont(new Font("Tahoma", Font.PLAIN, 22));
		Divide.setBounds(250, 396, 60, 51);
		frame.getContentPane().add(Divide);
		
		JButton Pow = new JButton("x^y");
		Pow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber=Double.parseDouble(textField.getText());
				textField.setText(null);
				operation="x^y";

			}
		});
		Pow.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Pow.setBounds(10, 243, 60, 51);
		frame.getContentPane().add(btnPow);
		
		JButton Mod = new JButton("%");
		Mod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber=Double.parseDouble(textField.getText());
				textField.setText(null);
				operation="%";
			}
		});
	    Mod.setFont(new Font("Tahoma", Font.BOLD, 20));
		Mod.setBounds(70, 243, 60, 51);
		frame.getContentPane().add(Mod);
		
		JButton C = new JButton("C");
		C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		C.setFont(new Font("Tahoma", Font.BOLD, 22));
		C.setBounds(130, 243, 60, 51);
		frame.getContentPane().add(C);
		
		JButton Cube = new JButton("x^3");
		Cube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a= (Double.parseDouble(textField.getText()));
				a=a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		Cube.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Cube.setBounds(10, 294, 60, 51);
		frame.getContentPane().add(Cube);
		
		JButton Sqr = new JButton("x^2");
		Sqr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a= (Double.parseDouble(textField.getText()));
				a=a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
			
		});
		Sqr.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Sqr.setBounds(10, 345, 60, 51);
		frame.getContentPane().add(Sqr);
		
		JButton Cos = new JButton("cos");
		Cos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a= Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
	
	}
			
			
			
			
			

Cos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Cos.setBounds(190, 141, 60, 51);
		frame.getContentPane().add(Cos);
		
		JButton Tan = new JButton("tan");
		Tan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a= Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		Tan.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Tan.setBounds(250, 141, 60, 51);
		frame.getContentPane().add(Tan);
		
		JButton Tanh = new JButton("tanh");
		Tanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a= Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		Tanh.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Tanh.setBounds(250, 192, 60, 51);
		frame.getContentPane().add(Tanh);
		
		JButton Cosh = new JButton("cosh");
		Cosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a= Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		Cosh.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Cosh.setBounds(190, 192, 60, 51);
		frame.getContentPane().add(Cosh);
		
		JButton Sinh = new JButton("sinh");
		Sinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a= Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		Sinh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Sinh.setBounds(130, 192, 60, 51);
		frame.getContentPane().add(Sinh);
		
		JButton Log = new JButton("Log");
		Log.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a= Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		Log.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Log.setBounds(70, 192, 60, 51);
		frame.getContentPane().add(Log);
		
		JButton E = new JButton("e^x");
		E.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a= Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		E.setFont(new Font("Tahoma", Font.PLAIN, 15));
		E.setBounds(70, 141, 60, 51);
		frame.getContentPane().add(E);
		
		JRadioButton rdOn = new JRadioButton("On");
		rdOn.setSelected(true);
		rdOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btn0.setEnabled(true);
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				
				Equal.setEnabled(true);
				Sum.setEnabled(true);
				Minus.setEnabled(true);
				Mpy.setEnabled(true);
				Divide.setEnabled(true);
				Mod.setEnabled(true);
				
				Sin.setEnabled(true);
				Sinh.setEnabled(true);
				Cos.setEnabled(true);
				Cosh.setEnabled(true);
				Tan.setEnabled(true);
				Tanh.setEnabled(true);
				
				Log.setEnabled(true);
				btnE.setEnabled(true);
				btnB.setEnabled(true);
				btnC.setEnabled(true);
				Root.setEnabled(true);
				PM.setEnabled(true);
				Cube.setEnabled(true);
				Sqr.setEnabled(true);
				Pow.setEnabled(true);
				Rev.setEnabled(true);
				Fact.setEnabled(true);
				Dot.setEnabled(true);
			}
		});
		buttonGroup.add(rdOn);
		rdOn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdOn.setBounds(10, 114, 43, 21);
		frame.getContentPane().add(rdOn);
		
		JRadioButton rdOff = new JRadioButton("Off");
		rdOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn0.setEnabled(false);
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				
				Equal.setEnabled(false);
				Sum.setEnabled(false);
				Minus.setEnabled(false);
				Mpy.setEnabled(false);
				Divide.setEnabled(false);
				Mod.setEnabled(false);
				
				Sin.setEnabled(false);
				Sinh.setEnabled(false);
				Cos.setEnabled(false);
				Cosh.setEnabled(false);
				Tan.setEnabled(false);
				Tanh.setEnabled(false);
				
				Log.setEnabled(false);
				btnE.setEnabled(false);
				btnB.setEnabled(false);
				btnC.setEnabled(false);
				Root.setEnabled(false);
				PM.setEnabled(false);
				Cube.setEnabled(false);
				Sqr.setEnabled(false);
				Pow.setEnabled(false);
				Rev.setEnabled(false);
				Fact.setEnabled(false);
				Dot.setEnabled(false);
			}
		});
		buttonGroup.add(rdOff);
		rdOff.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdOff.setBounds(70, 114, 51, 21);
		frame.getContentPane().add(rdOff);
	}
}
