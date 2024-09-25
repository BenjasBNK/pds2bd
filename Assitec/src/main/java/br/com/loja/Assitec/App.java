package br.com.loja.Assitec;

import br.com.loja.Assitec.controller.LoginController;
import br.com.loja.Assitec.view.LoginView;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       LoginView view = new LoginView();
       LoginController controller = new LoginController(view);
       view.setVisible(true);
    }



}




