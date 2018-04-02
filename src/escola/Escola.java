package escola;

import java.util.ArrayList;
import java.util.Scanner;
public class Escola {
	public static ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
	public static ArrayList<Professor> listaProfessores = new ArrayList<Professor>();
	public static Scanner scan = new Scanner(System.in);
    public static void main (String args[]){
    	int opcao = menu();
    	while(opcao != 99){
    		switch(opcao){
	    		case 1:
	    			System.out.println("--------------------------");
	    			System.out.println("Menu do Aluno");
	    			cadAluno();
	    			listaAlunos.add(aluno);
	    			break;
	    		case 2:
		    		System.out.println("--------------------------");
		    		System.out.println("Menu do Professor");
		    		cadProf();
		    		listaProf.add(professor);
		    		break;
		    	default:
		    		System.out.println("--------------------------");
		    		System.out.println("Opção inválida");
		    		System.exit(0);
		    		break;
	    	}
    	}
    	
    	public static void cadAluno{
    		Aluno aluno = new Aluno();
    		System.out.println("Êxito na criação do aluno");
    		aluno.mostraDados();
    	}
    	
    	public static void cadProfessor{
    		Professor professor = new Professor();
    		System.out.println("Êxito na criação do professor");
    		professor.mostraDados();
    	}
    	
    	int opcao = menu();
    	public static int menu(){
    		System.out.println("--------------------------");
			System.out.println("1 - Cadastro de alunos");
			System.out.println("2 - Cadastro de professores");
			System.out.println("99 - Sair");
			System.out.println("Opção: ");
		}
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

