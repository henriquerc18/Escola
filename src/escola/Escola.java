package escola;

import java.util.ArrayList;
import java.util.Scanner;
public class Escola {
	public static void ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
	public static void ArrayList<Professor> listaProfessores = new ArrayList<Professor>();
	public static Scanner scan = new Scanner(System.in);
    public static void main (String args[]){
    	int opcao = menu();
    	switch(opcao){
    	
    	case 1:
    		System.out.println("1º Menu");
    		Aluno al = new Aluno();
    		listaAlunos.add(al);
    		break;
    	
    	case 2:
    		System.out.println("2º Menu");
    		Professor pr = new Professor();
    		listaProf.add(pr);
    		break;

    	default:
    		System.out.println("Opção invalida");
    		System.exit(0);
    		break;
    		
    	}
    		System.out.println("========================");
    		System.out.println("MENU");
    		System.out.println("Digite:");
    		public static int menu(){
    			System.out.println("1: Cadastro de alunos");
    			System.out.println("2: Cadastro de professores");
    			System.out.println("Opção: ");
    			System.out.println("99: Sair");
    		}
    }
}
    	//Scanner scan = new Scanner(System.in);
    	//System.out.println("Informe um valor String");
    	//String valor = scan.next();
    	//System.out.println("VocÃª informou:" +valor);
    	//System.out.println("Informe a sua idade");
    	//int idade = scan.nextInt();
    	//System.out.println("Idade: " +idade);
    	//System.out.println("Informe seu nome completo: ");
    	//String nomeCompleto = scan.nextLine();
    	//System.out.println("Nome completo: " +nomeCompleto);

