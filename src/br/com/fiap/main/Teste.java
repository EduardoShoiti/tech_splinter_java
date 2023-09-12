package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Acidente;
import br.com.fiap.beans.Avaliacao;
import br.com.fiap.beans.Chamado;
import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Historico;
import br.com.fiap.beans.Solucao;
import br.com.fiap.beans.Veiculo;
import br.com.fiap.excecoes.Excecao;

public class Teste {
	
	static String texto (String texto) {
		
		return JOptionPane.showInputDialog(texto);
	}
	
	static int inteiro (String inteiro) {
		 return Integer.parseInt(JOptionPane.showInputDialog(inteiro));
	}	
	
	static double real (String real) {
		return Double.parseDouble(JOptionPane.showInputDialog(real));
	}

	public static void main(String[] args) throws Excecao{
		//(String cliente, Veiculo veiculo, String cpf, String dataNascimento, String placa, Double pesoVeiculo,
				//String alturaVeiculo, Historico historico, Avaliacao avaliacao)
	
		//instanciar obj
		
		
		do { 
			
			try {
				
			
		
			Veiculo objVeiculo = new Veiculo(texto("informe o modelo do veiculo"),
					inteiro("informe o ano do veiculo"),
					texto("informe a marca do veiculo"),
					texto("O veiculo possui personalização?"),
					texto("Qual a placa do veículo?"),
					real("Qual a altura do veículo?"),
					real("Qual a largura do veiculo?"),
					real("Qual o comprimento do veículo?"),
					real("Qual o peso do veículo?"),
					real("Qual a carga extra do veículo?"));
			
			Historico objHistorico = new Historico(texto("Você ja fez outros chamados?"),
					texto("Qual a frequencia dos seus chamados ?"),
					inteiro("Quantidade de antigos problemas?"));
			
			Avaliacao objAvaliacao = new Avaliacao(texto("Deixe seu feedback de 1 a 10"),
					texto("Deixe um comentário"));
			
			Cliente objCliente = new Cliente (texto("Informe seu nome"),
					objVeiculo,
					texto("informe seu cpf"),
					texto("informe sua data de nascimento"), 
					texto("informe a placa"),
					real("Informe o peso do veiculo"),
					texto("Informe a altura do veiculo"),
					objHistorico,
					objAvaliacao);
			
			
			
			Acidente objAcidente = new Acidente(texto("Houve uma batida?"),
					texto("O problema está na bateria?"),
					texto("Problema nos pneus?"),
					texto("O carro está com mau funcionamento?"),
					texto("A roda está trabada?"),
					texto("O problema está na correia dos pneus?"),
					texto("O problema está no óleo e/ou combustível?"),
					texto("O problema está no sensor do fusivel?"),
					texto("O problema está no radiador?"),
					texto("A correia do motor está com problema?"));
			
			Solucao objSolucao = new Solucao(texto("Voce quer um guincho?"),
					texto("você quer uma moto?"));
			
			
			Chamado objChamado = new Chamado(texto("Qual a data do acidente?"),
					texto("Qual a hora do acidente"),
					inteiro("Qual o id do chamado?"));
		
				System.out.println("INFORMAÇÕES");
				System.out.println("Nome: "+ objCliente.getCliente() +
						"\nVeiculo: " + objCliente.getVeiculo() +
						"\nCpf: " + objCliente.getCpf() +
						"\nNascimento " + objCliente.getDataNascimento() +
						"Placa " + objCliente.getPlaca());
				System.out.println("VEICULO");
				System.out.println("Modelo: "+ objVeiculo.getModelo() + 
						"\nAno: " + objVeiculo.getAno() +
						"\nMarca: " + objVeiculo.getMarca()+
						"\nPeso:" + objCliente.getPesoVeiculo()+
						"\nAltura: " + objCliente.getAlturaVeiculo()+
						"\nPersonalização " + objVeiculo.getPersonalizacao());
			
				System.out.println("ACIDENTE");
				System.out.println("Batida: " + objAcidente.getBatida()+
						"\nBateria: " + objAcidente.getBateria()+
						"\nPneu: " + objAcidente.getPneus()+
						"Mau funcionamento :" + objAcidente.getMauFuncionamento());
				
				System.out.println("O QUE DESEJA");
				System.out.println("Guincho:" + objSolucao.getGuinchos() +
						"\nMoto: "+ objSolucao.getMotos());
			
				} catch (Exception e) {
					throw new Excecao(e);
				} finally {
					System.out.println("ok");
				}
				
			}while (JOptionPane.showConfirmDialog(null, "Deseja realizar mais um chamado?", "Central de chamados",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
			
	}

}