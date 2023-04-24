package janela;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import negocios.Calculadora;

public class Janela {

	private JFrame frame;
	private Calculadora calculadora = new Calculadora(null, null, null);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela window = new Janela();
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
	public Janela() {
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

		JLabel lblAtual = new JLabel("");
		lblAtual.setBounds(0, 55, 209, 14);
		frame.getContentPane().add(lblAtual);

		/*
		 * 
		 * Bottom 0
		 */

		JButton btnZero = new JButton("0");
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnZero) {

					if (calculadora.getNum1() == null && calculadora.getNum2() == null) {
						calculadora.setNum1(Double.parseDouble(btnZero.getText()));
						lblAtual.setText("" + calculadora.getNum1());

					}

					else if (calculadora.getNum1() != null) {
						calculadora.setNum2(Double.parseDouble(btnZero.getText()));
						lblAtual.setText(calculadora.getNum1() + "  " + calculadora.getNum2());

					}
				}
			}
		});
		btnZero.setBounds(0, 107, 106, 33);
		frame.getContentPane().add(btnZero);

		/*
		 * 
		 * Bottom 1
		 */

		JButton btnUm = new JButton("1");
		btnUm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == btnUm) {

					if (calculadora.getNum1() == null && calculadora.getNum2() == null) {
						calculadora.setNum1(Double.parseDouble(btnUm.getText()));
						lblAtual.setText("" + calculadora.getNum1());

					}

					else if (calculadora.getNum1() != null) {
						calculadora.setNum2(Double.parseDouble(btnUm.getText()));
						lblAtual.setText(calculadora.getNum1() + "  " + calculadora.getNum2());

					}
				}

			}
		});
		btnUm.setBounds(0, 138, 106, 33);
		frame.getContentPane().add(btnUm);

		/*
		 * 
		 * Bottom 2
		 */
		JButton btnDois = new JButton("2");
		btnDois.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == btnDois) {

					if (calculadora.getNum1() == null && calculadora.getNum2() == null) {
						calculadora.setNum1(Double.parseDouble(btnDois.getText()));
						lblAtual.setText("" + calculadora.getNum1());

					}

					else if (calculadora.getNum1() != null) {
						calculadora.setNum2(Double.parseDouble(btnDois.getText()));
						lblAtual.setText(calculadora.getNum1() + "  " + calculadora.getNum2());

					}
				}

			}
		});
		btnDois.setBounds(0, 169, 106, 33);
		frame.getContentPane().add(btnDois);
		/*
		 * 
		 * Bottom 3
		 */
		JButton btnTres = new JButton("3");
		btnTres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == btnTres) {

					if (calculadora.getNum1() == null && calculadora.getNum2() == null) {
						calculadora.setNum1(Double.parseDouble(btnTres.getText()));
						lblAtual.setText("" + calculadora.getNum1());

					}

					else if (calculadora.getNum1() != null) {
						calculadora.setNum2(Double.parseDouble(btnTres.getText()));
						lblAtual.setText(calculadora.getNum1() + "  " + calculadora.getNum2());

					}
				}
			}
		});
		btnTres.setBounds(0, 197, 106, 33);
		frame.getContentPane().add(btnTres);

		/*
		 * 
		 * Bottom 4
		 */
		JButton btnQuatro = new JButton("4");
		btnQuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == btnQuatro) {

					if (calculadora.getNum1() == null && calculadora.getNum2() == null) {
						calculadora.setNum1(Double.parseDouble(btnQuatro.getText()));
						lblAtual.setText("" + calculadora.getNum1());

					}

					else if (calculadora.getNum1() != null) {
						calculadora.setNum2(Double.parseDouble(btnQuatro.getText()));
						lblAtual.setText(calculadora.getNum1() + "  " + calculadora.getNum2());

					}
				}
			}
		});
		btnQuatro.setBounds(0, 228, 106, 33);
		frame.getContentPane().add(btnQuatro);

		/*
		 * 
		 * Bottom 5
		 */

		JButton btnCinco = new JButton("5");
		btnCinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == btnCinco) {

					if (calculadora.getNum1() == null && calculadora.getNum2() == null) {
						calculadora.setNum1(Double.parseDouble(btnCinco.getText()));
						lblAtual.setText("" + calculadora.getNum1());

					}

					else if (calculadora.getNum1() != null) {
						calculadora.setNum2(Double.parseDouble(btnCinco.getText()));
						lblAtual.setText(calculadora.getNum1() + "  " + calculadora.getNum2());
					}
				}
			}

		});
		btnCinco.setBounds(103, 107, 106, 33);
		frame.getContentPane().add(btnCinco);
		/*
		 *
		 * Bottom 6
		 */
		JButton btnSeis = new JButton("6");
		btnSeis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == btnSeis) {

					if (calculadora.getNum1() == null && calculadora.getNum2() == null) {
						calculadora.setNum1(Double.parseDouble(btnSeis.getText()));
						lblAtual.setText("" + calculadora.getNum1());

					}

					else if (calculadora.getNum1() != null) {
						calculadora.setNum2(Double.parseDouble(btnSeis.getText()));
						lblAtual.setText(calculadora.getNum1() + "  " + calculadora.getNum2());
					}
				}

			}
		});
		btnSeis.setBounds(103, 138, 106, 33);
		frame.getContentPane().add(btnSeis);
		/*
		 * Bottom 7
		 * 
		 */
		JButton btnSete = new JButton("7");
		btnSete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == btnSete) {

					if (calculadora.getNum1() == null && calculadora.getNum2() == null) {
						calculadora.setNum1(Double.parseDouble(btnSete.getText()));
						lblAtual.setText("" + calculadora.getNum1());

					}

					else if (calculadora.getNum1() != null) {
						calculadora.setNum2(Double.parseDouble(btnSete.getText()));
						lblAtual.setText(calculadora.getNum1() + "  " + calculadora.getNum2());
					}
				}

			}
		});
		btnSete.setBounds(103, 169, 106, 33);
		frame.getContentPane().add(btnSete);

		/*
		 * 
		 * Bottom 8
		 */
		JButton btnOito = new JButton("8");
		btnOito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == btnOito) {

					if (calculadora.getNum1() == null && calculadora.getNum2() == null) {
						calculadora.setNum1(Double.parseDouble(btnOito.getText()));
						lblAtual.setText("" + calculadora.getNum1());

					}

					else if (calculadora.getNum1() != null) {
						calculadora.setNum2(Double.parseDouble(btnOito.getText()));
						lblAtual.setText(calculadora.getNum1() + "  " + calculadora.getNum2());
					}
				}
			}
		});
		btnOito.setBounds(103, 197, 106, 33);
		frame.getContentPane().add(btnOito);

		/*
		 * 
		 * Bottom 9
		 */

		JButton btnNove = new JButton("9");
		btnNove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnNove) {

					if (calculadora.getNum1() == null && calculadora.getNum2() == null) {
						calculadora.setNum1(Double.parseDouble(btnNove.getText()));
						lblAtual.setText("" + calculadora.getNum1());

					}

					else if (calculadora.getNum1() != null) {
						calculadora.setNum2(Double.parseDouble(btnNove.getText()));
						lblAtual.setText(calculadora.getNum1() + "  " + calculadora.getNum2());
					}
				}
			}
		});
		btnNove.setBounds(103, 228, 106, 33);
		frame.getContentPane().add(btnNove);

		/*
		 * 
		 * Result
		 */

		JLabel lblExibeResultado = new JLabel("");
		lblExibeResultado.setBounds(362, 197, 46, 14);
		frame.getContentPane().add(lblExibeResultado);

		JButton btnResultado = new JButton("=");
		btnResultado.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == btnResultado) {

					if (calculadora.getNum1() != null && calculadora.getNum2() != null)
						switch (calculadora.getOp()) {

						case '+': {
							double soma = calculadora.soma(calculadora.getNum1(), calculadora.getNum2());
							lblAtual.setText(calculadora.getNum1() + " + " + calculadora.getNum2());
							lblExibeResultado.setText("" + soma);
							break;
						}

						case '-': {

							double sub = calculadora.sub(calculadora.getNum1(), calculadora.getNum2());
							lblExibeResultado.setText("" + sub);
							break;
						}

						case '/': {
							double div = calculadora.div(calculadora.getNum1(), calculadora.getNum2());
							lblExibeResultado.setText("" + div);
							break;
						}

						case '*': {
							double mult = calculadora.mult(calculadora.getNum1(), calculadora.getNum2());
							lblExibeResultado.setText("" + mult);
							break;
						}

						default:
							System.out.println("erro");
							break;

						}

				}
			}
		});
		btnResultado.setBounds(291, 107, 61, 154);
		frame.getContentPane().add(btnResultado);

		JLabel lblNewLabel = new JLabel("CALCULADORA");
		lblNewLabel.setBounds(178, 11, 102, 51);
		frame.getContentPane().add(lblNewLabel);

		JButton btnClear = new JButton("c");
		btnClear.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				calculadora.setNum1(null);
				calculadora.setNum2(null);
				lblAtual.setText("");
			}
		});
		btnClear.setBounds(0, 76, 209, 33);
		frame.getContentPane().add(btnClear);

		JLabel lblNewLabel_1 = new JLabel("RESULTADO :");
		lblNewLabel_1.setBounds(359, 157, 86, 14);
		frame.getContentPane().add(lblNewLabel_1);
		/*
		 * 
		 * OPERATIONS
		 */
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == btnSub) {
					
					
					calculadora.setOp('-');
				}

			}
		});
		btnSub.setBounds(219, 218, 61, 33);
		frame.getContentPane().add(btnSub);

		JButton btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == btnSoma) {
					lblAtual.setText(calculadora.getNum1()+ " + ");
					calculadora.setOp('+');
				}

			}
		});
		btnSoma.setBounds(220, 174, 61, 33);
		frame.getContentPane().add(btnSoma);

		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == btnMult) {

					calculadora.setOp('*');
				}
			}
		});
		btnMult.setBounds(220, 130, 61, 33);
		frame.getContentPane().add(btnMult);

		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == btnDiv) {

					calculadora.setOp('/');
				}
			}
		});
		btnDiv.setBounds(220, 73, 61, 36);
		frame.getContentPane().add(btnDiv);

	}
}
