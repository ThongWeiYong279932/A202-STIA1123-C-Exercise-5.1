import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JLabel AnswerLabel;
	private JTextField textFieldAnswer;
	private JTextField textFieldNumber1;
	private JTextField textFieldNumber2;

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		AnswerLabel = new JLabel("Answer:");
		AnswerLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		AnswerLabel.setBounds(59, 177, 85, 28);
		frame.getContentPane().add(AnswerLabel);
		
		textFieldAnswer = new JTextField();
		textFieldAnswer.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldAnswer.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textFieldAnswer.setBounds(158, 177, 178, 28);
		frame.getContentPane().add(textFieldAnswer);
		textFieldAnswer.setColumns(10);
		
		textFieldNumber1 = new JTextField();
		textFieldNumber1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldNumber1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textFieldNumber1.setBounds(38, 43, 116, 28);
		frame.getContentPane().add(textFieldNumber1);
		textFieldNumber1.setColumns(10);
		
		textFieldNumber2 = new JTextField();
		textFieldNumber2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldNumber2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textFieldNumber2.setBounds(220, 43, 116, 28);
		frame.getContentPane().add(textFieldNumber2);
		textFieldNumber2.setColumns(10);
		
		JButton AddButton = new JButton("ADD");
		AddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int no1, no2, ans;
				try {
					no1 = Integer.parseInt(textFieldNumber1.getText());
					no2 = Integer.parseInt(textFieldNumber2.getText());
					ans = no1 + no2;
					textFieldAnswer.setText(Integer.toString(ans));
				} catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Wrong Input! Please enter integer only in the text field!");
				}
			}
		});
		AddButton.setBackground(Color.CYAN);
		AddButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		AddButton.setBounds(38, 114, 108, 28);
		frame.getContentPane().add(AddButton);
		
		JButton MinusButton = new JButton("MINUS");
		MinusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int no1, no2, ans;
				try {
					no1 = Integer.parseInt(textFieldNumber1.getText());
					no2 = Integer.parseInt(textFieldNumber2.getText());
					ans = no1 - no2;
					textFieldAnswer.setText(Integer.toString(ans));
				} catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Wrong Input! Please enter integer only in the text field!");
				}
			}
		});
		MinusButton.setBackground(Color.CYAN);
		MinusButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		MinusButton.setBounds(231, 114, 108, 28);
		frame.getContentPane().add(MinusButton);
		
		JLabel Integer1Label = new JLabel("Integer 1");
		Integer1Label.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		Integer1Label.setBounds(59, 10, 95, 23);
		frame.getContentPane().add(Integer1Label);
		
		JLabel Integer2Label = new JLabel("Integer 2");
		Integer2Label.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		Integer2Label.setBounds(242, 10, 95, 23);
		frame.getContentPane().add(Integer2Label);
	}
}
