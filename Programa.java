package java_da_massa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Programa {
	public static void main(String[] args)  {
		List<SolicitacaoServico> solicitacoes = new ArrayList<>();
		int i = 0;
		Scanner sc = new Scanner(System.in);
		BancoDados bancodados = new BancoDados();
		bancodados.inicializarTecnicos();
		bancodados.inicializarEquipamentos();
		
		while(i==0) {
		System.out.println("Bem vindo a manutenção computadorizada!");
		System.out.println("Informe o tipo de funcionario que voce e: ");
		System.out.println("Digite 1 p/ adminisrativo da manutencao - 2 p/ tecnico de manutencao");
		int opcao = sc.nextInt();
		sc.nextLine();
		
		
		switch(opcao) {
		case 1:
			System.out.println("Digite o nome de usuario: ");
			String usuario = sc.nextLine();
			sc.nextLine();
			FuncionarioManutAdm adm = new FuncionarioManutAdm(usuario);
			System.out.println("Abaixo estão suas opções de comando: ");
			System.out.println(" 1 - Abertura de solicitacao de servico");
			System.out.println(" 2 - Cadastrar equipamentos");
			System.out.println(" 3 - Cadastrar tecnicos de manutencao");
			System.out.println(" 4 - Gerar ordem de servico");
			System.out.println(" 5 - Encerar ordem de servico");
			
			System.out.println("Digite a opcao desejada");
			int op;
			op = sc.nextInt();
			if(op == 1) {
				
				adm.abrirSS();
				bancodados.visualizarMaquinasCadastradas();
				System.out.println("------------------------------------------------------------");
				bancodados.visualizarTecnicosCadastradas();
				sc.nextLine();
				SolicitacaoServico ss = adm.getSolicitacaoServico();
				solicitacoes.add(ss);
		        
		      }else if(op == 2) {
		    	  sc.nextLine();
		    	  adm.cadastrarEquipamentos();
		    	  Equipamentos equipamento = adm.getequipamentoCadastrado();
		    	  bancodados.equipamentos.add(equipamento);
		    	  
		      }else if(op == 3) {
		    	  sc.nextLine();
			      FuncTecManut tecnico = adm.gettecnicosCadastrados();
		    	  bancodados.tecnicos.add(tecnico);
			
		      }else if(op==4) {
		    	  adm.gerarOS(solicitacoes);
		    	  
		      }else if(op==5) {
		    	  adm.encerrarOS(solicitacoes);
		      }
			break;
		case 2:
			System.out.println("Digite o usuario: ");
			String usu = sc.nextLine();
			sc.nextLine();
			System.out.println("Digite sua funcao: ");
			String funcao = sc.nextLine();
			sc.nextLine();
			FuncTecManut tec = new FuncTecManut(usu, funcao);
			sc.nextLine();
			System.out.println("Abaixo estão suas opções de comando: ");
			System.out.println(" 1 - Gerar ordem de servico");
			System.out.println(" 2 - Encerar ordem de servico");
			sc.nextLine();
			int op1;
			op1 = sc.nextInt();
			if(op1 == 1) {
				tec.gerarOS(solicitacoes);
		        
		      }else if(op1 == 2) {
		    	  sc.nextLine();
		    	  tec.encerrarOS(solicitacoes);
		      }
			break;
	}
		System.out.println("pressione 0 para continuar e 9 para sair");
		opcao = sc.nextInt();
		sc.nextLine();
	}
}
}
