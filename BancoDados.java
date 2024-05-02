package java_da_massa;
import java.util.ArrayList;
import java.util.List;

public class BancoDados {
	
	List<Equipamentos> equipamentos = new ArrayList<>();
    List<FuncTecManut> tecnicos = new ArrayList<>();
    
    
    public void BancoDeDados() {
        inicializarEquipamentos();
        inicializarTecnicos();
    }


	void inicializarTecnicos() {
		tecnicos.add(new FuncTecManut("2501", "- mecanico"));
        tecnicos.add(new FuncTecManut("2502", "- mecanico"));
        tecnicos.add(new FuncTecManut("3501", " - eletricista"));
        tecnicos.add(new FuncTecManut("3502", "- eletricista"));
        tecnicos.add(new FuncTecManut("4501", " - encanador"));
        tecnicos.add(new FuncTecManut("4502", "- encanador"));
        tecnicos.add(new FuncTecManut("5501", " - marceneiro"));
        tecnicos.add(new FuncTecManut("5502", "- marceneiro"));
	}

	 void inicializarEquipamentos() {
		equipamentos.add(new Equipamentos("administrativo | ", "ar-codicionado | ", "ac01"));
        equipamentos.add(new Equipamentos("administrativo | ", "lampada | ", "lp01"));
        equipamentos.add(new Equipamentos("administrativo | ", "sifao | ", "sf01"));
        equipamentos.add(new Equipamentos("administrativo | ", "mesa", "ms01"));
        equipamentos.add(new Equipamentos("centro medico | ", "ar-condicionado | ", "ac02"));
        equipamentos.add(new Equipamentos("centro medico | ", "lampada | ", "lp02"));
        equipamentos.add(new Equipamentos("centro medico | ", "sifao | ", "sf02"));
        equipamentos.add(new Equipamentos("centro medico | ", "mesa | ", "ms02"));
        equipamentos.add(new Equipamentos("hospital | ", "ar-condicionado | ", "ac03"));
        equipamentos.add(new Equipamentos("hospital | ", "lampada | ", "lp03"));
        equipamentos.add(new Equipamentos("hospital | ", "sifao | ", "sf03"));
        equipamentos.add(new Equipamentos("hospital | ", "mesa | ", "ms03"));
	}
	
	
	
    public void visualizarMaquinasCadastradas() {
	for (Equipamentos equipamento : equipamentos) {
        System.out.println("Local: " + equipamento.getLocal() + " - Nome: " + equipamento.getNome() + " - Código: " + equipamento.getCodigo());
	}                  
    }
    public void visualizarTecnicosCadastradas() {
    	for (FuncTecManut tecnico : tecnicos) {
            System.out.println("Tecnico: " + tecnico.getUsuario() + " - Funcao: " + tecnico.getFuncao());
    	}                  
        }
    
}
