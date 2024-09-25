package br.com.loja.Assitec.controller;

import br.com.loja.Assitec.model.UsuarioModel;
import br.com.loja.Assitec.view.LoginView;

public class LoginController {

	private LoginView view;
	private UsuarioModel model;
	
	public LoginController(LoginView view) {
		this.view = view;
		this.model = new UsuarioModel();
		
		
		
		if(model.conexao !=null) {
			view.lblStatus.setText("conectado");
		}else {
			view.lblStatus.setText("conectado");
		}
		
		this.view.btnlogin.addActionListener(e -> logar());
		
	}
	
	  public void logar() {
	    	String login = view.txtUser.getText();
	    	String senha =  new String(view.txtSenha.getPassword());
	    	String perfil = model.autenticar(login, senha);
	  }
}
