package java_da_massa;
import java_da_massa.Equipamentos;
import java.util.Date;

public class SolicitacaoServico {
	private Equipamentos maquinas;
	private String nomefunc;
	private FuncTecManut tecnico;
	
	public SolicitacaoServico(Equipamentos maquinas, String nomefunc, FuncTecManut tecnico){
		this.maquinas = maquinas;
		this.nomefunc = nomefunc;
		this.tecnico=tecnico;
	}


	public Equipamentos getMaquinas() {
		return maquinas;
	}

	public void setMaquinas(Equipamentos maquinas) {
		this.maquinas = maquinas;
	}



	public FuncTecManut getTecnico() {
		return tecnico;
	}


	public void setTecnico(FuncTecManut tecnico) {
		this.tecnico = tecnico;
	}


	public String getNomefunc() {
		return nomefunc;
	}

	public void setNomefunc(String nomefunc) {
		this.nomefunc = nomefunc;
	}
	@Override
    public String toString() {
        return "Local do Equipamento: " + maquinas.getLocal() + "\n" +
               "Nome do Equipamento: " + maquinas.getNome() + "\n" +
               "Código do Equipamento: " + maquinas.getCodigo() + "\n" +
               "Nome do Responsável: " + nomefunc + "\n" +
               "Técnico Responsável: " + tecnico.getFuncao() + "\n"
                + tecnico.getUsuario() + "\n";
    }
}

