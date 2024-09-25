package br.com.loja.Assitec.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class LoginView extends JFrame {
	
	public JLabel lblStatus;
	public JButton btnlogin;
	private JPanel contentPane;
	public JTextField txtUser;
	public JPasswordField txtSenha;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel lblStatus = new JLabel("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblStatus, 90, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblStatus, 120, SpringLayout.WEST, contentPane);
		
		JLabel lblUsuario = new JLabel("Usuario");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblUsuario, 75, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblUsuario, 108, SpringLayout.WEST, contentPane);
		contentPane.add(lblUsuario);
		
		JLabel lblSenha = new JLabel("senha");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblSenha, 26, SpringLayout.SOUTH, lblUsuario);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblSenha, 0, SpringLayout.WEST, lblUsuario);
		contentPane.add(lblSenha);
		
		txtUser = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtUser, 0, SpringLayout.NORTH, lblUsuario);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtUser, 13, SpringLayout.EAST, lblUsuario);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		txtSenha = new JPasswordField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtSenha, -3, SpringLayout.NORTH, lblSenha);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtSenha, 11, SpringLayout.EAST, lblSenha);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtSenha, 37, SpringLayout.SOUTH, txtUser);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtSenha, 0, SpringLayout.EAST, txtUser);
		contentPane.add(txtSenha);
		
		JButton btnlogin = new JButton("login");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnlogin, 41, SpringLayout.SOUTH, txtSenha);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnlogin, -245, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnlogin, 64, SpringLayout.SOUTH, txtSenha);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnlogin, 0, SpringLayout.EAST, txtUser);
		contentPane.add(btnlogin);
	}
}
