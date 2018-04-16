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
	    					if(al != null && al.getEmail() != ""){
	    						System.out.println("========================");
	    						System.out.println("   Aluno encontrado!    ");
	    						System.out.println("========================");
	    						al.updatePes();
	    						al.updateAluno();
	    					}else{
	    						System.out.println("=============================");
	    						System.out.println(" ERRO: Aluno n�o encontrado! ");
	    						System.out.println("=============================");
	    					}
	    					break;
	    				case 99:
	    					break;
	    				default:
	    					System.out.println("============================");
	    			    	System.out.println("Op��o inv�lida");
	    			    	opcao_aluno = menuAluno();
	    			    	break;	    			    	
	    				}
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
	    						System.out.println("========================");
	    						System.out.println("   Professor encontrado!    ");
	    						System.out.println("========================");
	    						prof.updatePes();
	    						prof.updateProfessor();
	    					}else{
	    						System.out.println("=============================");
	    						System.out.println(" ERRO: Professor n�o encontrado! ");
	    						System.out.println("=============================");
	    					}
	    					break;
	    				case 99:
	    					break;
	    				default:
	    					System.out.println("============================");
	    					System.out.println("Op��o inv�lida");
	    					opcao_professor = menuProfessor();
	    					break;
	    				}
	    			}while(opcao_professor != 99);
	    			break;
	    		case 99:
	    			System.out.println("Tchau");
		    		System.exit(0);
	    			break;
		    	default:
		    		System.out.println("============================");
		    		System.out.println("Op��o inv�lida");
		    		break;
	    	}
    		opcao = menu();
    	}while(opcao != 99);
    }
    
    	//Menu Principal
		public static int menu(){
			int opcao = 0;
			try{  //Menu principal constru�do para que o usu�rio digite um n�mero.
				System.out.println("============================");
				System.out.println("            MENU            ");
				System.out.println("1 - Cadastro de alunos");
				System.out.println("2 - Cadastro de professores");
				System.out.println("99 - Sair");
				System.out.println("============================");
				System.out.println("Op��o: ");
				opcao = scan.nextInt();            //Leitura da op��o.
				scan.nextLine();                   //Para n�o imprimir na tela 2 linhas seguidas ignorando o que o usu�rio digitar na primeira.
			} catch(InputMismatchException err){   //Caso o usu�rio digite letras.
				System.out.println("ERRO: O valor deve ser um n�mero!");
				scan.nextLine();                   //Para n�o cair em loop infinito caso o usu�rio digite letras.
				opcao = menu();//Para n�o cair em default imprimindo "Op��o inv�lida", pois j� foi impressa a mensagem de erro. Assim, imprime o menu principal novamente.
			}
			return opcao;
		}
    
    	//Menu do Aluno
    	public static int menuAluno(){
    		int opcao_aluno = 0;
    		try{  //Menu do aluno constru�do para que o usu�rio digite um n�mero.
    			System.out.println("============================");
    			System.out.println("1 - Cadastrar aluno");
    			System.out.println("2 - Buscar aluno");
    			System.out.println("99 - Voltar");
    			System.out.println("============================");
    			System.out.println("Op��o: ");
    			opcao_aluno = scan.nextInt();  //Leitura da op��o do aluno.
    			scan.nextLine();               //Para n�o imprimir na tela 2 linhas seguidas ignorando o que o usu�rio digitar na primeira.
    		} catch(InputMismatchException err ){ //Caso o usu�rio digite letras.
    			System.out.println("ERRO: O valor deve ser um n�mero!");
    			scan.nextLine();               //Para n�o cair em loop infinito caso o usu�rio digite letras.
    			opcao_aluno = menuAluno();//Para n�o cair em default imprimindo "Op��o inv�lida", pois j� foi impressa a mensagem de erro. Assim, imprime o menu do aluno novamente.
    		}
    		return opcao_aluno;
    	}
    	
    	//Menu do Professor
    	public static int menuProfessor(){
    		int opcao_professor = 0;
    		try{  //Menu do professor constru�do para que o usu�rio digite um n�mero.
	    		System.out.println("============================");
	    		System.out.println("1 - Cadastrar professor");
	    		System.out.println("2 - Buscar professor");
	    		System.out.println("99 - Voltar");
	    		System.out.println("============================");
	    		System.out.println("Op��o: ");
	    		opcao_professor = scan.nextInt();  //Leitura da op��o do professor.
	    		scan.nextLine();                   //Para n�o imprimir na tela 2 linhas seguidas ignorando o que o usu�rio digitar na primeira.
    		} catch(InputMismatchException err){   //Caso o usu�rio digite letras.
    			System.out.println("ERRO: O valor deve ser um n�mero!");
    			scan.nextLine();                   //Para n�o cair em loop infinito caso o usu�rio digite letras.
    			opcao_professor = menuProfessor(); //Para n�o cair em default imprimindo "Op��o inv�lida", pois j� foi impressa a mensagem de erro. Assim, imprime o menu do professor novamente.
    		}
			return opcao_professor;
    	}
    	
    	//Cadastro do Aluno
    	public static void cadAluno(){
    		Aluno aluno = new Aluno();                       //Instanciando a classe Aluno.
    		if(aluno != null && aluno.getMatricula() != 0){  //Se o usu�rio digitar algo (se os campos n�o estiverem nulos).
    			aluno.save();                              //Salvar.
    			listaAlunos.add(aluno);
	    		System.out.println("============================");
	    		System.out.println("�xito na cria��o do aluno!");
	    		System.out.println("============================");
	    		aluno.mostraDados();   //Mostrar na tela o que foi digitado.
    		}else{
    			System.out.println("============================");
	    		System.out.println("Falha na cria��o do aluno!");
	    		System.out.println("============================");
    		}
    	}
    	
    	//Cadastro do Professor
    	public static void cadProfessor(){
    		Professor professor = new Professor();                      //Instanciando a classe Professor.
    		if(professor != null && professor.getCargaHoraria() != 0){ 	//Se o usu�rio digitar algo (se os campos n�o estiverem nulos).
    			professor.save();                                     //Salvar. 
    			System.out.println("================================");
	    		System.out.println("�xito na cria��o do professor!");
	    		System.out.println("================================");
    			professor.mostraDados();                                //Mostrar na tela o que foi digitado.
    		}else{
    			System.out.println("================================");
	    		System.out.println("Falha na cria��o do professor!");
	    		System.out.println("================================");
    		}
    	}
    	
    	public static Aluno buscaAluno(){
    		String pesquisa = "";
    		System.out.println("Email do aluno: ");
        	pesquisa = Escola.scan.nextLine();
        	for (Aluno al : listaAlunos) {
        		if (pesquisa.equals(al.getEmail())) {
        			al.setIndice(listaAlunos.indexOf(al));
        			return al;
        		}
        	}   	
        	return null;
    	}
    	
    	public static Professor buscaProfessor(){
    		String pesquisa = "";
    		System.out.println("Email do professor: ");
        	pesquisa = scan.nextLine();
        	for (Professor prof : listaProfessores) {
        		if (prof.getEmail() == pesquisa) {
        			prof.setIndice(listaProfessores.indexOf(prof));
        			return prof;
        		}
        	}
        	return null;
        }
}