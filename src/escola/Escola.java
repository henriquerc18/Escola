package escola;

import java.util.ArrayList;
import java.util.Scanner;
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
	    					//buscaAluno();
	    					break;
	    				case 99:
	    					break;
	    				default:
	    					System.out.println("============================");
	    			    	System.out.println("Opção inválida");
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
	    					//buscaProfessor();
	    					break;
	    				case 99:
	    					menu();
	    				default:
	    					System.out.println("============================");
	    					System.out.println("Opção inválida");
	    					break;
	    				}while(opcao_professor != 99);
	    					opcao_professor = menuProfessor();
	    			System.out.println("============================");
	    			System.out.println("||    Menu do Professor   ||");
		    		}while(opcao_professor != 99);
		    		break;
	    		case 99:
	    			System.out.println("Tchau");
		    		System.exit(0);
	    			break;
		    	default:
		    		System.out.println("============================");
		    		System.out.println("Opção inválida");
		    		break;
	    	}
    		opcao = menu();
    	}while(opcao != 99);
    }
    
    	public static int menuAluno(){
    		int opcao_aluno = 0;
    		System.out.println("============================");
    		System.out.println("1 - Cadastrar aluno");
    		System.out.println("2 - Buscar aluno");
    		System.out.println("99 - Voltar");
    		System.out.println("============================");
    		opcao_aluno = scan.nextInt();
    		scan.nextLine();
    		return opcao_aluno;
    	}
    	
    	public static int menuProfessor(){
    		int opcao_professor = 0;
    		System.out.println("============================");
    		System.out.println("1 - Cadastrar professor");
    		System.out.println("2 - Buscar professor");
    		System.out.println("99 - Voltar");
    		System.out.println("============================");
    		opcao_professor = scan.nextInt();
			scan.nextLine();
			return opcao_professor;
    	}
    	
    	public static void cadAluno(){
    		Aluno aluno = new Aluno();
    		Escola.scan.nextLine();
    		Escola.scan.next();
    		Escola.scan.nextLong();
    		aluno.mostraDados();
    	}
    	
    	public static void cadProfessor(){
    		Professor professor = new Professor();
    		Escola.scan.nextLine();
    		Escola.scan.next();
    		Escola.scan.nextInt();
    		professor.mostraDados();
    	}
    	
    	public static int menu(){
    		int opcao = 0;    		
    		System.out.println("============================");
    		System.out.println("            MENU            ");
			System.out.println("1 - Cadastro de alunos");
			System.out.println("2 - Cadastro de professores");
			System.out.println("99 - Sair");
			System.out.println("============================");
			System.out.println("Opção: ");
			opcao = scan.nextInt();
			scan.nextLine();
			return opcao;
		}
}    	
    	//Scanner scan = new Scanner(System.in);
    	//System.out.println("Informe um valor String");
    	//String valor = scan.next();
    	//System.out.println("Você informou:" +valor);
    	//System.out.println("Informe a sua idade");
    	//int idade = scan.nextInt();
    	//System.out.println("Idade: " +idade);
    	//System.out.println("Informe seu nome completo: ");
    	//String nomeCompleto = scan.nextLine();
    	//System.out.println("Nome completo: " +nomeCompleto);

