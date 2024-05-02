package java_da_massa;
import java.util.List;
import java.util.Scanner;

public class FuncionarioManutAdm extends Funcionario {
	private SolicitacaoServico solicitacaoServico;
	private Equipamentos equipamentoCadastrado;
	private FuncTecManut tecnicosCadastrados;

	public FuncionarioManutAdm(String usuario) {
		super(usuario);
	}
	
	
	public SolicitacaoServico getSolicitacaoServico() {
        return solicitacaoServico;
    }
	
	public Equipamentos getequipamentoCadastrado() {
		return equipamentoCadastrado;
	}
	
	public FuncTecManut gettecnicosCadastrados() {
		return tecnicosCadastrados;
	}
	
	Scanner sc = new Scanner(System.in);

	@Override
	public void abrirSS() {
		
		
		System.out.println("Para abrir ss digite algumas informacoes - Vai ser mostrado nosso banco de dados de funcionarios e maquinas: ");
		sc.nextLine();
		System.out.print("Digite o local do equipamento: ");
        String localEquipamento = sc.nextLine();
		System.out.print("Digite o nome do equipamento: ");
		String nomeEquipamento = sc.nextLine();
        System.out.print("Digite o código do equipamento: ");
        String codigoEquipamento = sc.nextLine();

        Equipamentos equipamento = new Equipamentos(localEquipamento, nomeEquipamento, codigoEquipamento);
       
        sc.nextLine();
        System.out.println("Digite nome do responsavel pela abertura da ss: ");
		String nome = sc.nextLine();
		
		sc.nextLine();
		
		System.out.print("Digite a funcao do tecnico que fica responsavel pela OS: ");
	    String funcao = sc.nextLine();
	    System.out.print("Digite o numero de matrícula dele: ");
	    String ramal = sc.nextLine();
	    
	    FuncTecManut tecnico = new FuncTecManut(funcao, ramal);
		
		
        SolicitacaoServico ss = new SolicitacaoServico(equipamento, nome, tecnico);
        this.solicitacaoServico=ss;
	}
	
	
	public void cadastrarEquipamentos() {
		
		System.out.println("Para acadastrar equipamentos digite algumas informacoes: ");
  	  	sc.nextLine();
  	  	System.out.print("Digite o local do equipamento: ");
	    String localEquipamento = sc.nextLine();
	    System.out.print("Digite o nome do equipamento: ");
	    String nomeEquipamento = sc.nextLine();
	    System.out.print("Digite o código do equipamento: ");
	    String codigoEquipamento = sc.nextLine();
	    
	    Equipamentos equipamento = new Equipamentos(localEquipamento, nomeEquipamento, codigoEquipamento);
	    this.equipamentoCadastrado = equipamento;
	}
	
	
	public void cadastrarTecnico() {
		System.out.println("Para acadastrar tecnicos de manutencao digite algumas informacoes: ");
  	  	System.out.print("Digite a funcao: ");
	    String funcao = sc.nextLine();
	    System.out.print("Digite o ramal: ");
	    String ramal = sc.nextLine();
	    
	    FuncTecManut tecnico = new FuncTecManut(funcao, ramal);
	    this.tecnicosCadastrados = tecnico;
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

	public void visualizarMaquinasCadastradas() {}
		
	
	 public void visualizarTecnicosCadastradas() {}



}
