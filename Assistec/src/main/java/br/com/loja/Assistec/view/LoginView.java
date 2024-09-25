package br.com.loja.Assistec.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

@SuppressWarnings("serial")
public class LoginView extends JFrame {
	public JTextField txtUsuario;
	public JPasswordField txtSenha;
	public JLabel lblStatus;
	public JButton btnLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView frame = new LoginView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginView() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);

		JLabel lblUsuario = new JLabel("Usuario");
		springLayout.putConstraint(SpringLayout.NORTH, lblUsuario, 80, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblUsuario, 94, SpringLayout.WEST, getContentPane());
		getContentPane().add(lblUsuario);

		JLabel lblSenha = new JLabel("Senha");
		springLayout.putConstraint(SpringLayout.NORTH, lblSenha, 17, SpringLayout.SOUTH, lblUsuario);
		springLayout.putConstraint(SpringLayout.WEST, lblSenha, 0, SpringLayout.WEST, lblUsuario);
		getContentPane().add(lblSenha);

		txtUsuario = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtUsuario, 0, SpringLayout.NORTH, lblUsuario);
		springLayout.putConstraint(SpringLayout.WEST, txtUsuario, 29, SpringLayout.EAST, lblUsuario);
		getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);

		btnLogin = new JButton("Login");
		springLayout.putConstraint(SpringLayout.NORTH, btnLogin, 71, SpringLayout.SOUTH, txtUsuario);
		springLayout.putConstraint(SpringLayout.EAST, btnLogin, 0, SpringLayout.EAST, txtUsuario);
		getContentPane().add(btnLogin);

		lblStatus = new JLabel("");
		springLayout.putConstraint(SpringLayout.NORTH, lblStatus, 19, SpringLayout.SOUTH, btnLogin);
		springLayout.putConstraint(SpringLayout.WEST, lblStatus, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblStatus, -25, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblStatus, 184, SpringLayout.WEST, lblUsuario);
		getContentPane().add(lblStatus);

		txtSenha = new JPasswordField();
		springLayout.putConstraint(SpringLayout.NORTH, txtSenha, 17, SpringLayout.SOUTH, txtUsuario);
		springLayout.putConstraint(SpringLayout.WEST, txtSenha, 0, SpringLayout.WEST, txtUsuario);
		springLayout.putConstraint(SpringLayout.EAST, txtSenha, 0, SpringLayout.EAST, txtUsuario);
		getContentPane().add(txtSenha);

	}
}
