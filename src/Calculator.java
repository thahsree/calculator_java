import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class Calculator implements ActionListener {
	JFrame jf;
	
	char operator;
	
	JLabel displayLabel;
	
	
	JButton acButton ;
	JButton plusMinusButton;
	JButton modButton; 
	JButton divButton;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton XButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton minusButton;
	JButton plusButton;
	JButton zeroButton;
	JButton dotButton;
	JButton equalButton;
	
	
	Boolean isOperatorClicked= false;
	
	String oldValue;
	String newValue;
	int result;
	
	Color colorBg;
	Color color1;
	Color topButton;
	Color nums;
	

	
	Calculator(){
		
		colorBg = new Color(000000);
		color1 = new Color(255,149,0);
		topButton= new Color(13948114);
		nums= new Color(50,50,50);
		
		jf = new JFrame("Calculator");
		
		jf.setLayout(null);
		jf.setSize(500,730);
		jf.setLocation(350, 150);
		jf.getContentPane().setBackground(colorBg);
		jf.setResizable(false);
		
		
		
		displayLabel = new JLabel("0");
		displayLabel.setFont(new Font("Helvetica", Font.PLAIN, 50));
		displayLabel.setBounds(30,20,390,80);
		displayLabel.setBackground(colorBg);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.WHITE);
		jf.add(displayLabel); 
		
		
		plusMinusButton = new JButton("+/-");
		plusMinusButton.setBounds(130, 130, 80, 80);
		plusMinusButton.setFont(new Font("Helvetica", Font.PLAIN, 30));
		plusMinusButton.setBackground(topButton);
		plusMinusButton.setForeground(colorBg);
		plusMinusButton.addActionListener(this);
		jf.add(plusMinusButton);
		
		modButton = new JButton("%");
		modButton.setBounds(230, 130, 80, 80);
		modButton.setFont(new Font("Helvetica", Font.PLAIN, 30));
		modButton.setBackground(topButton);
		modButton.setForeground(colorBg);
		modButton.addActionListener(this);
		jf.add(modButton);
		
		divButton = new JButton("÷");
		divButton.setBounds(330, 130, 80, 80);
		divButton.setFont(new Font("Helvetica", Font.PLAIN, 30));
		divButton.setBackground(color1);
		divButton.setForeground(Color.white);
		divButton.addActionListener(this);
		jf.add(divButton);
		
		sevenButton = new JButton("7");
		//String ac = displayLabel.getText();
		//int acI = Integer.parseInt(ac);
		sevenButton.setBounds(30, 230, 80, 80);
		sevenButton.setFont(new Font("Helvetica", Font.PLAIN, 30));
		sevenButton.setBackground(nums);
		sevenButton.setForeground(Color.white);
		sevenButton.addActionListener(this);
		sevenButton.setFocusable(true);
		jf.add(sevenButton);
		
		eightButton = new JButton("8");
		eightButton.setBounds(130, 230, 80, 80);
		eightButton.setFont(new Font("Helvetica", Font.PLAIN, 30));
		eightButton.setBackground(nums);
		eightButton.setForeground(Color.white);
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		nineButton = new JButton("9");
		nineButton.setBounds(230, 230, 80, 80);
		nineButton.setFont(new Font("Helvetica", Font.PLAIN, 30));
		nineButton.setBackground(nums);
		nineButton.setForeground(Color.white);
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		
		XButton = new JButton("x");
		XButton.setBounds(330, 230, 80, 80);
		XButton.setFont(new Font("Helvetica", Font.PLAIN, 30));
		XButton.setBackground(color1);
		XButton.setForeground(Color.white);
		XButton.addActionListener(this);
		jf.add(XButton);
		
		fourButton = new JButton("4");
		fourButton.setBounds(30, 330, 80, 80);
		fourButton.setFont(new Font("Helvetica", Font.PLAIN, 30));
		fourButton.setBackground(nums);
		fourButton.setForeground(Color.white);
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		fiveButton = new JButton("5");
		fiveButton.setBounds(130, 330, 80, 80);
		fiveButton.setFont(new Font("Helvetica", Font.PLAIN, 30));
		fiveButton.setBackground(nums);
		fiveButton.setForeground(Color.white);
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		sixButton = new JButton("6");
		sixButton.setBounds(230, 330, 80, 80);
		sixButton.setFont(new Font("Helvetica", Font.PLAIN, 30));
		sixButton.setBackground(nums);
		sixButton.setForeground(Color.white);
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		minusButton = new JButton("-");
		minusButton.setBounds(330, 330, 80, 80);
		minusButton.setFont(new Font("Helvetica", Font.PLAIN, 30));
		minusButton.setBackground(color1);
		minusButton.setForeground(Color.white);
		minusButton.addActionListener(this);
		jf.add(minusButton);
		
		oneButton = new JButton("1");
		oneButton.setBounds(30, 430, 80, 80);
		oneButton.setFont(new Font("Helvetica", Font.PLAIN, 30));
		oneButton.setBackground(nums);
		oneButton.setForeground(Color.white);
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		twoButton = new JButton("2");
		twoButton.setBounds(130, 430, 80, 80);
		twoButton.setFont(new Font("Helvetica", Font.PLAIN, 30));
		twoButton.setBackground(nums);
		twoButton.setForeground(Color.white);
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		threeButton = new JButton("3");
	    threeButton.setBounds(230, 430, 80, 80);
	    threeButton.setFont(new Font("Helvetica", Font.PLAIN, 30));
	    threeButton.setBackground(nums);
		threeButton.setForeground(Color.white);
		threeButton.addActionListener(this);
	    jf.add(threeButton);
		
	    plusButton = new JButton("+");
		plusButton.setBounds(330, 430, 80, 80);
		plusButton.setFont(new Font("Helvetica", Font.PLAIN, 30));
		if(isOperatorClicked) {
			plusButton.setBackground(topButton);
			plusButton.setForeground(color1);
		}else {
			plusButton.setBackground(color1);
			plusButton.setForeground(Color.white);
		}
		plusButton.addActionListener(this);
		jf.add(plusButton);
		
		zeroButton = new JButton("0");
		zeroButton.setBounds(30, 530, 180, 80);
		zeroButton.setFont(new Font("Helvetica", Font.PLAIN, 30));
		zeroButton.setHorizontalAlignment(SwingConstants.LEFT);
		zeroButton.setBackground(nums);
		zeroButton.setForeground(Color.white);
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		dotButton = new JButton(".");
	    dotButton.setBounds(230, 530, 80, 80);
	    dotButton.setFont(new Font("Helvetica", Font.PLAIN, 30));
	    dotButton.setBackground(nums);
		dotButton.setForeground(Color.white);
		dotButton.addActionListener(this);
	    jf.add(dotButton);
		
		equalButton = new JButton("=");
		equalButton.setBounds(330, 530, 80, 80);
		equalButton.setFont(new Font("Helvetica", Font.PLAIN, 30));
		equalButton.setBackground(color1);
		equalButton.setForeground(Color.white);
		equalButton.addActionListener(this);
		jf.add(equalButton);
		
		acButton = new JButton("AC");
		acButton.setBounds(30, 130, 80, 80);
		acButton.setFont(new Font("Helvetica", Font.PLAIN, 30));
		acButton.setBackground(topButton);
		acButton.setForeground(colorBg);
		acButton.addActionListener(this);
		jf.add(acButton);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		 new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sevenButton) {
			try {
				String labelText = displayLabel.getText();					//Value of Label Text added to setZeroI;
				int labelTextI = Integer.parseInt(labelText);
				if(isOperatorClicked) {
					displayLabel.setText("7");
					isOperatorClicked=false;	
				}else if(labelTextI==0){
					displayLabel.setText("7");
				}else if(labelText=="0") {
					displayLabel.setText("7");
				}else {
					displayLabel.setText(labelText+"7");
				}
			}catch(NumberFormatException ex) {
				try {
					String labelText = displayLabel.getText();
					double labelTextI = Double.parseDouble(labelText);
					if(isOperatorClicked) {
						displayLabel.setText("7");
						isOperatorClicked=false;	
					}else if(labelText.equals("0.")){
						displayLabel.setText(labelText+"7");
					}else if(labelText=="0.") {
						displayLabel.setText("0.7");
					}else {
						displayLabel.setText(labelText+"7");
					}
				}catch(Exception exc) {
					System.out.println("Something Went Wrong");
				}
			}
			
		}else if(e.getSource()==eightButton) {
			try {
				String labelText = displayLabel.getText();					//Value of Label Text added to setZeroI;
				int labelTextI = Integer.parseInt(labelText);
				if(isOperatorClicked) {
					displayLabel.setText("8");
					isOperatorClicked=false;	
				}else if(labelTextI==0){
					displayLabel.setText("8");
				}else if(labelText=="0") {
					displayLabel.setText("8");
				}else {
					displayLabel.setText(labelText+"8");
				}
			}catch(NumberFormatException ex) {
				try {
					String labelText = displayLabel.getText();
					double labelTextI = Double.parseDouble(labelText);
					if(isOperatorClicked) {
						displayLabel.setText("8");
						isOperatorClicked=false;	
					}else if(labelText.equals("0.")){
						displayLabel.setText(labelText+"8");
					}else if(labelText=="0.") {
						displayLabel.setText("0.8");
					}else {
						displayLabel.setText(labelText+"8");
					}
				}catch(Exception exc) {
					System.out.println("Something Went Wrong");
				}
			}
			
		}else if(e.getSource()==nineButton) {
			try {
				String labelText = displayLabel.getText();					//Value of Label Text added to setZeroI;
				int labelTextI = Integer.parseInt(labelText);
				if(isOperatorClicked) {
					displayLabel.setText("9");
					isOperatorClicked=false;	
				}else if(labelTextI==0){
					displayLabel.setText("9");
				}else if(labelText=="0") {
					displayLabel.setText("9");
				}else {
					displayLabel.setText(labelText+"9");
				}
			}catch(NumberFormatException ex) {
				try {
					String labelText = displayLabel.getText();
					double labelTextI = Double.parseDouble(labelText);
					if(isOperatorClicked) {
						displayLabel.setText("9");
						isOperatorClicked=false;	
					}else if(labelText.equals("0.")){
						displayLabel.setText(labelText+"9");
					}else if(labelText=="0.") {
						displayLabel.setText("0.9");
					}else {
						displayLabel.setText(labelText+"9");
					}
				}catch(Exception exc) {
					System.out.println("Something Went Wrong");
				}
			}
			
		}else if(e.getSource()==fiveButton) {
			try {
				String labelText = displayLabel.getText();					//Value of Label Text added to setZeroI;
				int labelTextI = Integer.parseInt(labelText);
				if(isOperatorClicked) {
					displayLabel.setText("5");
					isOperatorClicked=false;	
				}else if(labelTextI==0){
					displayLabel.setText("5");
				}else if(labelText=="0") {
					displayLabel.setText("5");
				}else {
					displayLabel.setText(labelText+"5");
				}
			}catch(NumberFormatException ex) {
				try {
					String labelText = displayLabel.getText();
					double labelTextI = Double.parseDouble(labelText);
					if(isOperatorClicked) {
						displayLabel.setText("5");
						isOperatorClicked=false;	
					}else if(labelText.equals("0.")){
						displayLabel.setText(labelText+"5");
					}else if(labelText=="0.") {
						displayLabel.setText("0.5");
					}else {
						displayLabel.setText(labelText+"5");
					}
				}catch(Exception exc) {
					System.out.println("Something Went Wrong");
				}
			}
			
		}else if(e.getSource()==fourButton) {
			try {
				String labelText = displayLabel.getText();					//Value of Label Text added to setZeroI;
				int labelTextI = Integer.parseInt(labelText);
				if(isOperatorClicked) {
					displayLabel.setText("4");
					isOperatorClicked=false;	
				}else if(labelTextI==0){
					displayLabel.setText("4");
				}else if(labelText=="0") {
					displayLabel.setText("4");
				}else {
					displayLabel.setText(labelText+"4");
				}
			}catch(NumberFormatException ex) {
				try {
					String labelText = displayLabel.getText();
					double labelTextI = Double.parseDouble(labelText);
					if(isOperatorClicked) {
						displayLabel.setText("4");
						isOperatorClicked=false;	
					}else if(labelText.equals("0.")){
						displayLabel.setText(labelText+"4");
					}else if(labelText=="0.") {
						displayLabel.setText("0.4");
					}else {
						displayLabel.setText(labelText+"4");
					}
				}catch(Exception exc) {
					System.out.println("Something Went Wrong");
				}
			}
			
			
		}else if(e.getSource()==sixButton) {
			try {
				String labelText = displayLabel.getText();					//Value of Label Text added to setZeroI;
				int labelTextI = Integer.parseInt(labelText);
				if(isOperatorClicked) {
					displayLabel.setText("6");
					isOperatorClicked=false;	
				}else if(labelTextI==0){
					displayLabel.setText("6");
				}else if(labelText=="0") {
					displayLabel.setText("6");
				}else {
					displayLabel.setText(labelText+"6");
				}
			}catch(NumberFormatException ex) {
				try {
					String labelText = displayLabel.getText();
					double labelTextI = Double.parseDouble(labelText);
					if(isOperatorClicked) {
						displayLabel.setText("6");
						isOperatorClicked=false;	
					}else if(labelText.equals("0.")){
						displayLabel.setText(labelText+"6");
					}else if(labelText=="0.") {
						displayLabel.setText("0.6");
					}else {
						displayLabel.setText(labelText+"6");
					}
				}catch(Exception exc) {
					System.out.println("Something Went Wrong");
				}
			}
			
		}else if(e.getSource()==threeButton) {
			try {
				String labelText = displayLabel.getText();					//Value of Label Text added to setZeroI;
				int labelTextI = Integer.parseInt(labelText);
				if(isOperatorClicked) {
					displayLabel.setText("3");
					isOperatorClicked=false;	
				}else if(labelTextI==0){
					displayLabel.setText("3");
				}else if(labelText=="0") {
					displayLabel.setText("3");
				}else {
					displayLabel.setText(labelText+"3");
				}
			}catch(NumberFormatException ex) {
				try {
					String labelText = displayLabel.getText();
					double labelTextI = Double.parseDouble(labelText);
					if(isOperatorClicked) {
						displayLabel.setText("3");
						isOperatorClicked=false;	
					}else if(labelText.equals("0.")){
						displayLabel.setText(labelText+"3");
					}else if(labelText=="0.") {
						displayLabel.setText("0.3");
					}else {
						displayLabel.setText(labelText+"3");
					}
				}catch(Exception exc) {
					System.out.println("Something Went Wrong");
				}
			}
		}else if(e.getSource()==twoButton) {
			try {
				String labelText = displayLabel.getText();					//Value of Label Text added to setZeroI;
				int labelTextI = Integer.parseInt(labelText);
				if(isOperatorClicked) {
					displayLabel.setText("2");
					isOperatorClicked=false;	
				}else if(labelTextI==0){
					displayLabel.setText("2");
				}else if(labelText=="0") {
					displayLabel.setText("2");
				}else {
					displayLabel.setText(labelText+"2");
				}
			}catch(NumberFormatException ex) {
				try {
					String labelText = displayLabel.getText();
					double labelTextI = Double.parseDouble(labelText);
					if(isOperatorClicked) {
						displayLabel.setText("2");
						isOperatorClicked=false;	
					}else if(labelText.equals("0.")){
						displayLabel.setText(labelText+"2");
					}else if(labelText=="0.") {
						displayLabel.setText("0.2");
					}else {
						displayLabel.setText(labelText+"2");
					}
				}catch(Exception exc) {
					System.out.println("Something Went Wrong");
				}
			}
			
		}else if(e.getSource()==oneButton) {
			try {
				String labelText = displayLabel.getText();					//Value of Label Text added to setZeroI;
				int labelTextI = Integer.parseInt(labelText);
				if(isOperatorClicked) {
					displayLabel.setText("1");
					isOperatorClicked=false;	
				}else if(labelTextI==0){
					displayLabel.setText("1");
				}else if(labelText=="0") {
					displayLabel.setText("1");
				}else {
					displayLabel.setText(labelText+"1");
				}
			}catch(NumberFormatException ex) {
				try {
					String labelText = displayLabel.getText();
					double labelTextI = Double.parseDouble(labelText);
					if(isOperatorClicked) {
						displayLabel.setText("1");
						isOperatorClicked=false;	
					}else if(labelText.equals("0.")){
						displayLabel.setText(labelText+"1");
					}else if(labelText=="0.") {
						displayLabel.setText("0.1");
					}else {
						displayLabel.setText(labelText+"1");
					}
				}catch(Exception exc) {
					System.out.println("Something Went Wrong");
				}
			}
		}else if(e.getSource()==zeroButton) {
			if(isOperatorClicked) {
				displayLabel.setText("0");
				isOperatorClicked=false;
			}else {
				String labelText = displayLabel.getText();
				if("0".equals(labelText)) {
					displayLabel.setText("0");
				}else{
					displayLabel.setText(labelText+"0");
				}
			}
		}else if(e.getSource()==dotButton) {
			String labelText = displayLabel.getText();
			if(isOperatorClicked) {
				displayLabel.setText("0.");
				isOperatorClicked=false;
		}else if(labelText.contains(".")){
				displayLabel.setText("0.");
			}
			else {
				displayLabel.setText(labelText+".");
			}
		}else if(e.getSource()==acButton) {
			displayLabel.setText("0");
			isOperatorClicked=false;
		}else if(e.getSource()==plusButton) {
				isOperatorClicked=true;
				operator = '+';
				oldValue= displayLabel.getText();
		}else if(e.getSource()==minusButton) {
			isOperatorClicked=true;
			operator='-';
			oldValue= displayLabel.getText();
		}else if(e.getSource()==divButton) {
			isOperatorClicked=true;
			operator='/';
			oldValue=displayLabel.getText();
		}else if(e.getSource()==XButton) {
			isOperatorClicked =true;
			operator = 'X';
			oldValue=displayLabel.getText();
		}else if(e.getSource()==modButton) {
			Double oldValue= Double.parseDouble(displayLabel.getText());
			Double result= oldValue/100;
			displayLabel.setText(result+"");
		} else  if(e.getSource()==equalButton) {
			String newValue = displayLabel.getText();
			switch(operator) { 
			case '+':
				try {
					int oldValueI = Integer.parseInt(oldValue);
					int newValueI = Integer.parseInt(newValue);
					int result= oldValueI+newValueI;
					displayLabel.setText(result+"");
				}catch(NumberFormatException ex) {
					try {
						Float oldValueF = Float.parseFloat(oldValue);
						Float newValueF = Float.parseFloat(newValue);
						Float result= oldValueF+newValueF;
						displayLabel.setText(result+"");
					}catch(Exception exc) {		
					}
				}
				break;
			case '-':
				try {
					 int oldValueI = Integer.parseInt(oldValue);
					 int newValueI = Integer.parseInt(newValue);
					 
					 int result = oldValueI-newValueI;
					 displayLabel.setText(result+"");
				}catch(NumberFormatException ex) {
					try {
						Float oldValueI = Float.parseFloat(oldValue);
						 Float newValueI = Float.parseFloat(newValue);
						 
						 Float result = oldValueI-newValueI;
						 
						 displayLabel.setText(result+"");
						
					}catch(Exception exc) {	
					}
				}
				 break;
			case '/': 	
				float oldValueF =Float.parseFloat(oldValue);
				float newValueF = Float.parseFloat(newValue);
					
					if(newValueF==0) {
						displayLabel.setText("Error");
					}else {
						float resultf = oldValueF/newValueF;
						String resultS = Float.toString(resultf);
						if(resultS.endsWith(".0")) {
							int resultI = (int) resultf;
							displayLabel.setText(resultI+"");
							
						}else {
							displayLabel.setText(resultf+"");
						}
					}
				break;
			case 'X':
				try {
					int oldValueI = Integer.parseInt(oldValue);
					int newValueI = Integer.parseInt(newValue);
					int result = oldValueI*newValueI;
					displayLabel.setText(result+"");
				}catch(NumberFormatException ex) {
					try {
						Float oldValueI = Float.parseFloat(oldValue);
						Float newValueI = Float.parseFloat(newValue);
						Float result = oldValueI*newValueI;
						displayLabel.setText(result+"");
					}catch(Exception exc) {}
				}
			}
		}else if(e.getSource()==plusMinusButton) {
			try {
				String newValue = displayLabel.getText();
				
				int newValuec = Integer.parseInt(newValue);
				
				if(newValuec<0) {
					result = newValuec*-1;
					displayLabel.setText(result+"");
				}else if(newValuec==-0){
					displayLabel.setText("0");
				}else {
					displayLabel.setText("-"+newValuec);
				}
			}catch(NumberFormatException ex) {
				try {
					String newValue = displayLabel.getText();
					
					Double newValuec = Double.parseDouble(newValue);
					
					if(newValuec<0) {
						Double result = newValuec*-1;
						displayLabel.setText(result+"");
					}else if(newValuec==-0){
						displayLabel.setText("0");
					}else {
						displayLabel.setText("-"+newValuec);
					}
				}catch(Exception exc) {}
			}
		}
		
		
	}
	
	
}
