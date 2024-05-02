package java_da_massa;
import java_da_massa.Equipamentos;
import java_da_massa.SolicitacaoServico;

public abstract class Funcionario implements GestaoManut {
	private String usuario;
	
	
	public Funcionario(String usuario){
		this.usuario = usuario;
		
	}
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public void abrirSS() {}
	
	

}
