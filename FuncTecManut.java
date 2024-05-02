package java_da_massa;

import java.util.Iterator;
import java.util.List;

public class FuncTecManut extends Funcionario {
	private String funcao;
	
	
	public FuncTecManut(String usuario, String funcao) {
		super(usuario);
		this.funcao=funcao;
		// TODO Auto-generated constructor stub
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	
	@Override
	public void gerarOS(List<SolicitacaoServico> solicitacoes) {
		System.out.println("Ordens de Serviço:");
		System.out.println("##########################");
		for (SolicitacaoServico ss : solicitacoes) {
			System.out.println(ss.toString());
		    System.out.println("##########################");
		        }
		    }


	


	@Override
	public void encerrarOS(List<SolicitacaoServico> solicitacoes) {
		solicitacoes.remove(0);
		
	}


	
	
	


}

