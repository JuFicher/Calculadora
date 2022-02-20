package calculadoraST;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import joptionPane.Calculator;

public class Calculadora {
	
	private JFrame frmCalculadora;
	private JTextField textField;
	double num1, num2, resultado;
	String operacao, resposta;
	
	
	//	 Iniciando a aplicação
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Calculadora() {
		iniciar();
	}

	// método iniciar 
	
	private void iniciar() {
		frmCalculadora = new JFrame();
		frmCalculadora.getContentPane().setBackground(new Color(230, 230, 250));
		frmCalculadora.setTitle("CALCULADORA ST");
		frmCalculadora.setResizable(false);
		frmCalculadora.setBackground(SystemColor.menu);
		frmCalculadora.setBounds(100, 100, 295, 402);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 10, 262, 45);
		frmCalculadora.getContentPane().add(textField);
		textField.setColumns(10);
		
		// Primeira fileira de Botões
		
		// Botão Backspace
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Backspace = null;
				
				if(textField.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() -1);
					Backspace = strB.toString();
					textField.setText(Backspace);
				}
			}
		});
		btnBackspace.setFont(new Font("Wingdings", Font.BOLD,20));
		btnBackspace.setBounds(10,65,60,48);
		frmCalculadora.getContentPane().add(btnBackspace);
		
		JButton btnLimpar = new JButton("C");
		btnLimpar.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
			}
		});
		
		// Botão Limpar (C)
		btnLimpar.setFont( new Font("Tahoma", Font.BOLD, 20));
		btnLimpar.setBounds(78, 65, 58, 50);
		frmCalculadora.getContentPane().add(btnLimpar);
		
		JButton btnResto = new JButton("Resto");
		btnResto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operacao = "%";
			}
		});
		
		// Botão Resto 
		btnResto.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnResto.setBounds(146, 65, 58, 50);
		frmCalculadora.getContentPane().add(btnResto);
		
		// Botão Soma
		JButton btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operacao = "+";
			}
		});
		btnSoma.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSoma.setBounds(214, 65, 58, 50);
		frmCalculadora.getContentPane().add(btnSoma);
		
		// Segunda fileira de Botões 
		
		// Botão 7
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 125, 58, 50);
		frmCalculadora.getContentPane().add(btn7);
		
		// Botão 8
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(78, 125, 58, 50);
		frmCalculadora.getContentPane().add(btn8);
		
		// Botão
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(146, 125, 58, 50);
		frmCalculadora.getContentPane().add(btn9);
		
		// Botão Subtração
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operacao = "-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSub.setBounds(214, 125, 58, 50);
		frmCalculadora.getContentPane().add(btnSub);
		
		// Terceira fileira de Botões
		
		// Botão 4
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(10, 185, 58, 50);
		frmCalculadora.getContentPane().add(btn4);
		
		// Botão 5
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(78, 185, 58, 50);
		frmCalculadora.getContentPane().add(btn5);
		
		// Botão 6
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(146, 185, 58, 50);
		frmCalculadora.getContentPane().add(btn6);
		
		// Botão Divisão
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operacao = "/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDiv.setBounds(214, 185, 58, 50);
		frmCalculadora.getContentPane().add(btnDiv);
		
		// Quarta fileira de Botões
		
		// Botão 1
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
						
				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(10, 245, 58, 50);
		frmCalculadora.getContentPane().add(btn1);
		
		
		// Botão 2
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(78, 245, 58, 50);
		frmCalculadora.getContentPane().add(btn2);
				
		// Botão 3
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(146, 245, 58, 50);
		frmCalculadora.getContentPane().add(btn3);
		
		// Botão Multiplicação
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operacao = "*";
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMult.setBounds(214, 245, 58, 50);
		frmCalculadora.getContentPane().add(btnMult);
				
		// Quinta fileira de Botões
				
		// Botão 0
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				String EnterNumber = textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(10, 305, 58, 50);
		frmCalculadora.getContentPane().add(btn0);
				
		// Botão Ponto
		JButton btnPonto = new JButton(".");
		btnPonto.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPonto.setBounds(78, 305, 58, 50);
		frmCalculadora.getContentPane().add(btnPonto);
				
		// Botão para mudar valor positivo/negativo
		JButton btnMaisMenos = new JButton("+-");
		btnMaisMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(textField.getText());
				ops = ops * (-1);
				textField.setText(String.valueOf(ops));
			}
		});
		
		btnMaisMenos.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMaisMenos.setBounds(146, 305, 58, 50);
		frmCalculadora.getContentPane().add(btnMaisMenos);
				
		// Botão Igual
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				String resposta;
				num2 = Double.parseDouble(textField.getText());
				if (operacao == "+") {
					resultado = num1 + num2;
					resposta = String.format("%.2f", resultado);
					textField.setText(resposta);
				}
				else if (operacao == "-") {
					resultado = num1 - num2;
					resposta = String.format("%.2f", resultado);
					textField.setText(resposta);
				}
				else if (operacao == "*") {
					resultado = num1 * num2;
					resposta = String.format("%.2f", resultado);
					textField.setText(resposta);
				}
				else if (operacao == "/") {
					resultado = num1 / num2;
					resposta = String.format("%.2f", resultado);
					textField.setText(resposta);
				}
				else if (operacao == "%") {
					resultado = num1 % num2;
					resposta = String.format("%.2f", resultado);
					textField.setText(resposta);
				}
			}
		});
		btnIgual.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnIgual.setBounds(214, 305, 58, 50);
		frmCalculadora.getContentPane().add(btnIgual);
				
		}

}



