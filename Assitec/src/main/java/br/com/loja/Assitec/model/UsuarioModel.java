package br.com.loja.Assitec.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import br.com.loja.Assitec.dal.ModuloConexao;

public class UsuarioModel {
	public Connection conexao = null;
	private PreparedStatement pst = null;
	private ResultSet rs = null;
		
	public UsuarioModel() {
		conexao = ModuloConexao.connector();
	}

	public String autenticar (String login, String senha) {
		String sql = "Select * FROM usuarios WHERE login=? AND senha=?";
	try {
		pst = conexao.prepareStatement(sql);
		pst.setString(1, login);
		pst.setString(2, senha);
		
		rs = pst.executeQuery();
		
		if(rs.next()) {
			String perfil = rs.getString("pefil");
			return perfil;
		}else {
			return null;
		}
	}catch(Exception e) {
		JOptionPane.showConfirmDialog(null, e);
	}
	 return null;
	}
}
