package java_da_massa;

import java.util.List;

public interface GestaoManut {
	
	public void gerarOS(List<SolicitacaoServico> solicitacoes);
	
	public void encerrarOS(List<SolicitacaoServico> solicitacoes);

	
}
