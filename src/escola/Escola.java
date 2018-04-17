package escola;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Escola {
	
	public static ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
	public static ArrayList<Professor> listaProfessores = new ArrayList<Professor>();
	public static Scanner scan = new Scanner(System.in);
	
    public static void main (String args[]){
    	int opcao = menu();
    	do{
    		switch(opcao){
	    		case 1:
	    			int opcao_aluno = menuAluno();
	    			do {
	    				switch(opcao_aluno){
	    				case 1:
	    					cadAluno();
	    					break;
	    				case 2:
	    					Aluno al = buscaAluno();
	    					if(al != null){
	    						al.updateAluno();
	    						al.updatePes();
	    					}else{
	    						System.out.println("=================================");
	    						System.out.println("ERRO: Aluno não encontrado!");
	    						System.out.println("=================================");
	    					}
	    					break;
	    				case 3:
	    					listaAlunos();
	    				case 99:
	    					break;
	    				default:
	    					System.out.println("=================================");
	    			    	System.out.println("Opção inválida");
	    			    	break;	    			    	
	    				}
	    				opcao_aluno = menuAluno();
	    			}while(opcao_aluno != 99);
	    			break;
	    		case 2:
	    			int opcao_professor = menuProfessor();
	    			do {
	    				switch(opcao_professor){
	    				case 1:
	    					cadProfessor();
	    					break;
	    				case 2:
	    					Professor prof = buscaProfessor();
	    					if(prof != null){
	    						prof.updateProfessor();
	    						prof.updatePes();
	    					}else{
	    						System.out.println("=================================");
	    						System.out.println("ERRO: Professor não encontrado!");
	    						System.out.println("=================================");
	    					}
	    					break;
	    				case 3:
	    					listaProfessores();
	    				case 99:
	    					break;
	    				default:
	    					System.out.println("=================================");
	    					System.out.println("Opção inválida");
	    					break;
	    				}
	    				opcao_professor = menuProfessor();
	    			}while(opcao_professor != 99);
	    			break;
	    		case 99:
	    			System.out.println("Tchau");
		    		System.exit(0);
	    			break;
		    	default:
		    		System.out.println("=================================");
		    		System.out.println("Opção inválida");
		    		System.exit(0);
		    		break;
	    	}
    		opcao = menu();
    	}while(opcao != 99);
    }
    
    	//Menu Principal
		public static int menu(){
			int opcao = 0;
			try{  //Menu principal construído para que o usuário digite um número.
				System.out.println("=================================");
				System.out.println("            MENU            ");
				System.out.println("1 - Cadastro de alunos");
				System.out.println("2 - Cadastro de professores");
				System.out.println("99 - Sair");
				System.out.println("=================================");
				System.out.println("Opção: ");
				opcao = scan.nextInt();            //Leitura da opção.
				scan.nextLine();                   //Para não imprimir na tela 2 linhas seguidas ignorando o que o usuário digitar na primeira.
			} catch(InputMismatchException err){   //Caso o usuário digite letras.
				System.out.println("=================================");
				System.out.println("ERRO: O valor deve ser um número!");
				scan.nextLine();                   //Para não cair em loop infinito caso o usuário digite letras.
				opcao = menu();//Para não cair em default imprimindo "Opção inválida", pois já foi impressa a mensagem de erro. Assim, imprime o menu principal novamente.
			}
			return opcao;
		}
    
    	//Menu do Aluno
    	public static int menuAluno(){
    		int opcao_aluno = 0;
    		try{  //Menu do aluno construído para que o usuário digite um número.
    			System.out.println("=================================");
    			System.out.println("1 - Cadastrar aluno");
    			System.out.println("2 - Buscar aluno");
    			System.out.println("3 - Lista de alunos");
    			System.out.println("99 - Voltar");
    			System.out.println("=================================");
    			System.out.println("Opção: ");
    			opcao_aluno = scan.nextInt();  //Leitura da opção do aluno.
    			scan.nextLine();               //Para não imprimir na tela 2 linhas seguidas ignorando o que o usuário digitar na primeira.
    		} catch(InputMismatchException err ){ //Caso o usuário digite letras.
    			System.out.println("=================================");
    			System.out.println("ERRO: O valor deve ser um número!");
    			scan.nextLine();               //Para não cair em loop infinito caso o usuário digite letras.
    			opcao_aluno = menuAluno();//Para não cair em default imprimindo "Opção inválida", pois já foi impressa a mensagem de erro. Assim, imprime o menu do aluno novamente.
    		}
    		return opcao_aluno;
    	}
    	
    	//Menu do Professor
    	public static int menuProfessor(){
    		int opcao_professor = 0;
    		try{  //Menu do professor construído para que o usuário digite um número.
	    		System.out.println("=================================");
	    		System.out.println("1 - Cadastrar professor");
	    		System.out.println("2 - Buscar professor");
	    		System.out.println("3 - Lista de professores");
	    		System.out.println("99 - Voltar");
	    		System.out.println("=================================");
	    		System.out.println("Opção: ");
	    		opcao_professor = scan.nextInt();  //Leitura da opção do professor.
	    		scan.nextLine();                   //Para não imprimir na tela 2 linhas seguidas ignorando o que o usuário digitar na primeira.
    		} catch(InputMismatchException err){   //Caso o usuário digite letras.
    			System.out.println("=================================");
    			System.out.println("ERRO: O valor deve ser um número!");
    			scan.nextLine();                   //Para não cair em loop infinito caso o usuário digite letras.
    			opcao_professor = menuProfessor(); //Para não cair em default imprimindo "Opção inválida", pois já foi impressa a mensagem de erro. Assim, imprime o menu do professor novamente.
    		}
			return opcao_professor;
    	}
    	
    	//Cadastro do Aluno
    	public static void cadAluno(){
    		Aluno aluno = new Aluno();                       //Instanciando a classe Aluno.
    		if(aluno != null && aluno.getMatricula() != 0){  //Se o usuário digitar algo (se os campos não estiverem nulos).
    			aluno.save();                              //Salvar.
	    		System.out.println("=================================");
	    		System.out.println("Êxito na criação do aluno!");
	    		System.out.println("=================================");
	    		aluno.mostraDados();   //Mostrar na tela o que foi digitado.
    		}else{
    			System.out.println("=================================");
	    		System.out.println("Falha na criação do aluno!");
	    		System.out.println("=================================");
    		}
    	}
    	
    	//Cadastro do Professor
    	public static void cadProfessor(){
    		Professor professor = new Professor();                      //Instanciando a classe Professor.
    		if(professor != null && professor.getCargaHoraria() != 0){ 	//Se o usuário digitar algo (se os campos não estiverem nulos).
    			professor.save();                                       //Salvar. 
    			System.out.println("================================");
	    		System.out.println("Êxito na criação do professor!");
	    		System.out.println("================================");
    			professor.mostraDados();                                //Mostrar na tela o que foi digitado.
    		}else{
    			System.out.println("================================");
	    		System.out.println(" Falha na criação do professor! ");
	    		System.out.println("================================");
    		}
    	}
    	
    	//Busca do Aluno
    	public static Aluno buscaAluno(){
    		String pesquisa = "";
    		System.out.println("Email do aluno: ");
        	pesquisa = scan.nextLine();                             //"pesquisa" recebe o email que o usuário digitou.
        	System.out.println("================================");
			System.out.println("Aluno encontrado!");
			System.out.println("================================");
        	for (Aluno al : listaAlunos) {
        		if (pesquisa.equals(al.getEmail())) {               //Se o email digitado na busca for igual ao cadastrado anteriormente...
        			al.setIndice(listaAlunos.indexOf(al));          //Adiciona na posição da listaProfessores.
        			return al;
        		}
        	}   	
        	return null;
    	}
    	
    	//Busca do Professor
    	public static Professor buscaProfessor(){
    		String pesquisa = "";
    		System.out.println("Email do professor: ");
        	pesquisa = scan.nextLine();                             //"pesquisa" recebe o email que o usuário digitou.
        	System.out.println("================================");
			System.out.println("Professor encontrado!");
			System.out.println("================================");
        	for (Professor prof : listaProfessores) {               
        		if (pesquisa.equals(prof.getEmail())) {             //Se o email digitado na busca for igual ao cadastrado anteriormente...
        			prof.setIndice(listaProfessores.indexOf(prof)); //Adiciona na posição da listaProfessores.
        			return prof;
        		}
        	}
        	return null;
        }
    	
    	//Lista de Alunos
    	public static void listaAlunos(){
    		System.out.println("Dados dos Alunos:");
    		System.out.println("================================");
    		int pos = 0;
    		for (Aluno aluno : listaAlunos){
    			pos += 1;
    			System.out.println("Número: "+ pos);
    			aluno.mostraDados();
    			System.out.println("================================");
    		
    		}
    	}
    	
    	//Lista de Professores
    	public static void listaProfessores(){
    		System.out.println("Dados dos Profesores:");
    		System.out.println("================================");
    		int pos = 0;
    		for (Professor professor : listaProfessores){
    			pos += 1;
    			System.out.println("Número: "+ pos);
    			professor.mostraDados();
    			System.out.println("================================");
    		
    		}
    	}
}