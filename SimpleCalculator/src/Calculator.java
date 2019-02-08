import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField textScrean;
	
	String x = "";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 387, 617);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textScrean = new JTextField();
		textScrean.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		
		textScrean.setBounds(10, 11, 342, 89);
		frame.getContentPane().add(textScrean);
		textScrean.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(10, 123, 78, 59);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(98, 123, 78, 59);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(186, 123, 78, 59);
		frame.getContentPane().add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(10, 191, 78, 59);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(98, 191, 78, 59);
		frame.getContentPane().add(btn5);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
			   x +=	btn1.getText();
			   
			   textScrean.setText(x);
			}
		});
		btn1.setBounds(10, 261, 78, 59);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(98, 261, 78, 59);
		frame.getContentPane().add(btn2);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(186, 191, 78, 59);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(186, 261, 78, 59);
		frame.getContentPane().add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(10, 331, 162, 59);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.setBounds(186, 331, 78, 59);
		frame.getContentPane().add(btnDot);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEqual.setBounds(114, 410, 238, 59);
		frame.getContentPane().add(btnEqual);
		
		JButton btnMulti = new JButton("*");
		btnMulti.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnMulti.setToolTipText("");
		btnMulti.setBounds(274, 123, 78, 59);
		frame.getContentPane().add(btnMulti);
		
		JButton btnSub = new JButton("-");
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnSub.setBounds(274, 191, 78, 59);
		frame.getContentPane().add(btnSub);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAdd.setBounds(274, 261, 78, 59);
		frame.getContentPane().add(btnAdd);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDiv.setBounds(274, 331, 78, 59);
		frame.getContentPane().add(btnDiv);	
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{			   
				   x = "";				   
				   textScrean.setText(x);
			}		});
		btnClear.setBounds(10, 410, 94, 59);
		frame.getContentPane().add(btnClear);
		
		JLabel lblSampleCalculator = new JLabel("Sample Calculator");
		lblSampleCalculator.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblSampleCalculator.setBounds(10, 506, 266, 45);
		frame.getContentPane().add(lblSampleCalculator);
	}
}
