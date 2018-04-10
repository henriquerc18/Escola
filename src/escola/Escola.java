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
	    					//buscaAluno();
	    					break;
	    				case 99:
	    					break;
	    				default:
	    					System.out.println("============================");
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
	    					//buscaProfessor();
	    					break;
	    				case 99:
	    					break;
	    				default:
	    					System.out.println("============================");
	    					System.out.println("Opção inválida");
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
		    		System.out.println("Opção inválida");
		    		break;
	    	}
    		opcao = menu();
    	}while(opcao != 99);
    }
    
    	public static int menuAluno(){
    		int opcao_aluno = 0;
    		try{
    			System.out.println("============================");
    			System.out.println("1 - Cadastrar aluno");
    			System.out.println("2 - Buscar aluno");
    			System.out.println("99 - Voltar");
    			System.out.println("============================");
    			opcao_aluno = scan.nextInt();
    			scan.nextLine();
    		} catch(InputMismatchException err ){
    			System.out.println("ERRO: O valor deve ser um número!" );
    		}
			scan.nextLine();
    		return opcao_aluno;
    	}
    	
    	public static int menuProfessor(){
    		int opcao_professor;
    		try{
	    		System.out.println("============================");
	    		System.out.println("1 - Cadastrar professor");
	    		System.out.println("2 - Buscar professor");
	    		System.out.println("99 - Voltar");
	    		System.out.println("============================");
	    		opcao_professor = scan.nextInt();
	    		scan.nextLine();
    		} catch(InputMismatchException ime){
    			scan.nextLine();
    			return 0;
    		}
			return opcao_professor;
    	}
    	
    	public static void cadAluno(){
    		Aluno aluno = new Aluno();
    		Escola.scan.nextLine();
    		Escola.scan.next();
    		Escola.scan.nextLong();
    		aluno.mostraDados();
    		//aluno.save();
    	}
    	
    	public static void cadProfessor(){
    		Professor professor = new Professor();
    		Escola.scan.nextLine();
    		Escola.scan.next();
    		Escola.scan.nextInt();
    		Escola.scan.nextLine();
    		professor.mostraDados();
    		//professor.save();
    	}
    	
    	/*public static void buscaAluno(){
    		
    	}
    	
    	public static void buscaProfessor(){
    		
    	}*/
    	
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