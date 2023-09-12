package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.beans.Cliente;
import br.com.fiap.conexoes.ConexaoFactory;

public class ClienteDAO {
	
	public Connection minhaConexao;
	
	public ClienteDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().conexao();
	}
	
	// Inserir 
	public String inserir (Cliente Cliente) throws SQLException {
		
		PreparedStatement stmt = minhaConexao.prepareStatement
				(" insert into T_CPS_CLIENTE values (?,?,?,?,?,?)");
		stmt.setString(1, Cliente.getCliente());
		stmt.setString(2, Cliente.getCpf());
		stmt.setString(3, Cliente.getDataNascimento());
		stmt.setString(4, Cliente.getPlaca());
		stmt.setDouble(5, Cliente.getPesoVeiculo());
		stmt.setString(6, Cliente.getAlturaVeiculo());
		stmt.execute();
		stmt.close();
		
		return "Cadastrado com Sucesso";
		
	}

}
